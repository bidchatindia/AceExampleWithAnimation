package com.rahulverlekar.nativelist;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.paginate.Paginate;
import com.rahulverlekar.nativelist.Model.Broadcast;
import com.rahulverlekar.nativelist.adapter.BroadcastAdapter;

import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaWebView;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by abhik on 06-12-2016.
 */

public class AceBroadcast implements Paginate.Callbacks {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    List<Broadcast> broadcasts;
    public static int LIMIT = 10, OFFSET = 0;
    Context context;

    public Retrofit retrofit;
    public OkHttpClient okHttpClient;
    public BidchatRestInterface APIService;

    /* COrdova webview instance
     */

    private static Field appViewField;
    static {
        try {
            Class<?> cdvActivityClass = CordovaActivity.class;
            Field wvField = cdvActivityClass.getDeclaredField("appView");
            wvField.setAccessible(true);
            appViewField = wvField;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public void setAPIAdapter()
    {

        okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(1, TimeUnit.MINUTES)
                .readTimeout(1, TimeUnit.MINUTES)
                .build();
        retrofit = new Retrofit.Builder()
                .baseUrl(getBaseURL())
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        APIService = retrofit.create(BidchatRestInterface.class);
    }

    public String getBaseURL()
    {
        return "https://admin.bidchat.io/appcalls/";
    }

    public void initViews(Context context, String jsonData)
    {
        this.context = context;
        saveCallbackData(jsonData);
        setAPIAdapter();
        mRecyclerView = (RecyclerView) findViewByTag("broadcastList");
        changeRecyclerMargin();
        fetchAllBroadcast();
    }

    String callback;
    int top, bottom, right, left;
    public void saveCallbackData(String payload)
    {
        try {
            JSONObject object = new JSONObject(payload);
            callback = object.getString("callback");
            left = object.getJSONObject("data").getInt("left");
            top = object.getJSONObject("data").getInt("top");
            right = object.getJSONObject("data").getInt("right");
            bottom = object.getJSONObject("data").getInt("bottom");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void changeRecyclerMargin()
    {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mRecyclerView.getLayoutParams();
        layoutParams.setMargins(left, top, right, bottom);
        mRecyclerView.setLayoutParams(layoutParams);
    }

    public View findViewByTag(String tag)
    {
        return ((Activity)context).getWindow().getDecorView().findViewWithTag(tag);
    }

    public void fetchAllBroadcast() {

        Call<HashMap<String, JsonElement>> fetchBroadcast = APIService.listBroadcast(LIMIT, OFFSET);
//        showProgressBar("Please wait");
        fetchBroadcast.enqueue(new Callback<HashMap<String, JsonElement>>() {
            @Override
            public void onResponse(Call<HashMap<String, JsonElement>> call, Response<HashMap<String, JsonElement>> response) {
//                hideProgressBar();
                Gson gson = new GsonBuilder()
                        .disableHtmlEscaping()
                        .setPrettyPrinting()
                        .serializeNulls()
                        .create();
                List<Broadcast> list = (List<Broadcast>) gson.fromJson(response.body().get("data"), new TypeToken<List<Broadcast>>(){}.getType());
                setDataToAdapter(list);
            }

            @Override
            public void onFailure(Call<HashMap<String, JsonElement>> call, Throwable t) {
//                hideProgressBar();
//                showInDailog("Error while making the calls", "Error");
            }
        });
    }

    LinearLayoutManager linearLayoutManager;
    BroadcastAdapter adapter;
    public void setDataToAdapter(List<Broadcast> broadcasts)
    {
        linearLayoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        adapter = new BroadcastAdapter(context, broadcasts, new BroadcastAdapter.BroadcastiewHolderListener() {
            @Override
            public void onChildClicked(Broadcast broadcast) {
                Toast.makeText(context, "CLicked on " + broadcast.getUsername(), Toast.LENGTH_SHORT).show();
                try {
                    final CordovaWebView webView = (CordovaWebView) appViewField.get(context);
                    webView.sendJavascript(callback + "('" + broadcast.toString() + "');");
                } catch (Throwable e) {
//                    callbackContext.error(e.getMessage());
                }
            }

            @Override
            public void onFavoriteClicked(Broadcast broadcast) {
                Toast.makeText(context, "Favorite Clicked " + broadcast.getUsername(), Toast.LENGTH_SHORT).show();
            }
        });
        mRecyclerView.setAdapter(adapter);
        addLoadMoreListener();
    }

    public void addLoadMoreListener()
    {
        Paginate.with(mRecyclerView, this)
                .setLoadingTriggerThreshold(0)
                .addLoadingListItem(true)
                .build();
    }

    @Override
    public void onLoadMore() {
        loading = true;
        OFFSET += LIMIT;
        Call<HashMap<String, JsonElement>> fetchBroadcast = APIService.listBroadcast(LIMIT, OFFSET);
        fetchBroadcast.enqueue(new Callback<HashMap<String, JsonElement>>() {
            @Override
            public void onResponse(Call<HashMap<String, JsonElement>> call, Response<HashMap<String, JsonElement>> response) {
                Gson gson = new Gson();
                List<Broadcast> list = (List<Broadcast>) gson.fromJson(response.body().get("data"), new TypeToken<List<Broadcast>>(){}.getType());
                adapter.addMoreItems(list);
                adapter.notifyDataSetChanged();
                loading = false;
            }

            @Override
            public void onFailure(Call<HashMap<String, JsonElement>> call, Throwable t) {

            }
        });
    }

    boolean loading = false;
    @Override
    public boolean isLoading() {
        return loading;
    }
    @Override
    public boolean hasLoadedAllItems() {
        return false;
    }
}
