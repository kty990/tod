package com.example.tod;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class Play extends Activity {

    private Button s;
    private Button start;
    private LinearLayout packs;
    private State state = State.WAITING;
    private String selectedPack;

    private Topic adult = new Topic();
    private String adult_dares = "Make eye contact with someone of the opposite sex and moan for 10 seconds@Pass your phone to another player and let them post a sexual status to your ig/fb. *Must stay on for at least 5 hours*@Drop an ice cube in your pants@Google the dirtiest thing you can think of and show the person next to you@Only answer yes for an hour@Remove a piece of clothing from another player without using your hands@Fake an orgasm, while simulating a sexual position@Remove four items of clothing@Update your relationship status to 'engaged' on Facebook@Post a random baby scan on Facebook@Go skinny dipping@Put on a timer and act out as many sexual positions as you can with your clothes on@Initiate a roleplay scenario and make the group guess what your character is" +
            "@";

    public void runPlay(View s, View start, LinearLayout packs, TextView debug) {
        String[] dares = adult_dares.split("@");
        int dareCount = 0;
        for (String dare : dares) {
            adult.addDare(dare);
            Log.d("Spinner", "Added Dare: " + dare);
            dareCount++;
        }

        debug.setText("Dares: " + Integer.toString(dareCount));

//        Spinner visual = new Spinner(getBaseContext());
//        visual.setAdapter(getAdapter(getBaseContext(),R.layout.play));
//        packs.addView(visual);

        // Now you can use submitButton, for example:
//        start.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Start if pack selected, else display error message
//                if (selectedPack != null) {
//                    state = State.STARTED;
//                }
//            }
//        });
//
//        s.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Display different packs
//            }
//        });
    }


}