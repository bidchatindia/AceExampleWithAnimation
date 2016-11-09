package com.rahulverlekar.animations;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;

import java.util.List;


public class SimpleListAdapter extends BaseAdapter {

    private List<String> notifications;
    Activity activity;
    public SimpleListAdapter(List<String> notifications, Activity activity) {
        this.notifications = notifications;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return notifications.size();
    }

    @Override
    public String getItem(int i) {
        return notifications.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        FakeR fakeR = new FakeR(activity);
        View v = LayoutInflater.from(activity).inflate(fakeR.getId("layout", "item"),null,false);
        TextView t = (TextView)v.findViewWithTag("txtItem");
        t.setText(notifications.get(i));
        return v;
    }
}
