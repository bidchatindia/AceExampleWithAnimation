package com.rahulverlekar.animations;

import android.app.Activity;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import org.json.JSONArray;
import org.json.JSONException;

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

    /*ListView components*/
    private SimpleListAdapter adapter;
    private boolean isScrollableToBottom = true;
    public BidchatMessageList(Activity activity, String jsonData) {
        this.activity = activity;
        try {
            JSONArray array = new JSONArray(jsonData);
            lstMessages = new ArrayList<String>();
            for (int i = 0; i < array.length(); i++) {
                lstMessages.add(array.get(i).toString());
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
        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView absListView, int i) {
            }

            @Override
            public void onScroll(AbsListView absListView, int i, int i1, int i2) {
                isScrollableToBottom = false;
                cancelAllScheduledThreadAndStartNew();
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