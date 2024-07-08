package com.example.tod;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyStringAdapter extends BaseAdapter {

    private ArrayList<String> dares;
    private Context ctx;

    public MyStringAdapter(Context ctx, ArrayList<String> dares) {
        this.dares = dares;
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return dares.size();
    }

    @Override
    public String getItem(int position) {
        return dares.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}