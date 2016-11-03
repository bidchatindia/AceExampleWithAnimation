package com.rahulverlekar.animations;

import android.app.Activity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by RahulV on 02-11-2016.
 */

public class BidchatMessageList {
    List<String> lstMessages;
    Activity activity;

    /*ListView components*/
    private ArrayAdapter<String> adapter;
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
        adapter = new ArrayAdapter<String>(activity, new FakeR(activity).getId("layout", "item"), lstMessages);
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
    }

    public void addNewString(String data)
    {
        lstMessages.add(0, data);
        adapter.notifyDataSetChanged();
    }


}
