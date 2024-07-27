package com.example.tod;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class Topic extends Activity {
    private String title;
    private ArrayList<String> dares = new ArrayList<String>();
    private ArrayList<String> truths = new ArrayList<String>();

    public static int visuals = 0;

    public void setTopicTitle(String title) {
        this.title = title;
    }

    public String getTopicTitle() {
        return title;
    }

    public void addDare(String dare) {
        this.dares.add(dare);
    }

    public ArrayList<String> getDares() {
        return (ArrayList<String>) this.dares;
    }

    public void addTruth(String truth) {
        this.truths.add(truth);
    }

    public ArrayList<String> getTruths() {
        return (ArrayList<String>) this.truths;
    }
}
