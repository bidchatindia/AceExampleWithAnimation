package com.rahulverlekar.animations;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by RahulV on 02-11-2016.
 */

public class BidchatMessageList {
    List<String> lstMessages;
    Activity activity;
    String callback;

    /*ListView components*/
    private SimpleListAdapter adapter;
    private boolean isScrollableToBottom = true;

    // code to get the context
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

    public BidchatMessageList(Activity activity, String jsonData) {
        this.activity = activity;
        try {
            JSONObject array = new JSONObject(jsonData);
            callback = array.getString("callback");
            lstMessages = new ArrayList<String>();
            for (int i = 0; i < array.getJSONArray("data").length(); i++) {
                lstMessages.add(array.getJSONArray("data").get(i).toString());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
//        String data[] = new String[lstMessages.size()];
//        data = lstMessages.toArray(data);
        adapter = new SimpleListAdapter(lstMessages, activity);
        showListView();
    }

    private View findView(String tag)
    {
        return activity.getWindow().getDecorView().findViewWithTag(tag);
    }

    public void showListView()
    {
        ListView listView = (ListView) findView("lv_anim_table");
        listView.setAdapter(adapter);
        /*listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView absListView, int i) {
            }

            @Override
            public void onScroll(AbsListView absListView, int i, int i1, int i2) {
                isScrollableToBottom = false;
                cancelAllScheduledThreadAndStartNew();
            }
        });*/
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                try {
                    final CordovaWebView webView = (CordovaWebView) appViewField.get(activity);
                    Handler mainHandler = new Handler(activity.getMainLooper());
                    final Looper myLooper = Looper.myLooper();
                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            // Finally do whatever you want with 'appView', for example:
                            webView.clearCache();
                            new Handler(myLooper).post(new Runnable() {
                                @Override
                                public void run() {
                                    String item = lstMessages.get(position);
                                    webView.sendJavascript(callback + "('" + item + "');");
                                }
                            });
                        }
                    });

                } catch (Throwable e) {
//                    callbackContext.error(e.getMessage());
                }
            }
        });
    }

    public void addNewString(String data)
    {
        lstMessages.add(data);
        adapter.notifyDataSetChanged();
        if (isScrollableToBottom)
        {
            ListView listView = (ListView) findView("lv_anim_table");
            listView.smoothScrollToPosition(adapter.getCount());
        }
    }

    private ScheduledExecutorService worker =
            Executors.newSingleThreadScheduledExecutor();
    public void cancelAllScheduledThreadAndStartNew()
    {
        //worker.shutdownNow(); //shut down the old tasks if any
        //worker = Executors.newSingleThreadScheduledExecutor();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                isScrollableToBottom = true;
            }
        };
        worker.schedule(task, 5, TimeUnit.SECONDS);
    }


}