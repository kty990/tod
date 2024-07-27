package com.example.tod;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button s;
    private Button start;
    private LinearLayout packs;
    private State state = State.WAITING;
    private String selectedPack;

    private Topic adult = new Topic();
    private String adult_dares = "Make eye contact with someone of the opposite sex and moan for 10 seconds@Pass your phone to another player and let them post a sexual status to your ig/fb. *Must stay on for at least 5 hours*@Drop an ice cube in your pants@Google the dirtiest thing you can think of and show the person next to you@Only answer yes for an hour@Remove a piece of clothing from another player without using your hands@Fake an orgasm, while simulating a sexual position@Remove four items of clothing@Update your relationship status to 'engaged' on Facebook@Post a random baby scan on Facebook@Go skinny dipping@Put on a timer and act out as many sexual positions as you can with your clothes on@Initiate a roleplay scenario and make the group guess what your character is" +
            "@";

    private ArrayAdapter<String> getAdapter(Context ctx, Topic topic, int playLayout) {
        /* Define the main part */
        ArrayList<String> concat = new ArrayList<String>();
        concat.addAll(topic.getDares());
        concat.addAll(topic.getTruths());

        // Create the adapter using the ArrayList and a default layout
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.play, concat.toArray(new String[0]));

        // Optional: Set the layout for the dropdown menu items
        adapter.setDropDownViewResource(R.layout.play);

        // Set the adapter to the spinner
        return adapter;

    }

    private void runPlay() {
        View s = findViewById(R.id.select);
        View start = findViewById(R.id.start);
        LinearLayout packs = findViewById(R.id.packs);
        TextView debug = findViewById(R.id.debug);

        String[] dares = adult_dares.split("@");
        int dareCount = 0;
        for (String dare : dares) {
            adult.addDare(dare);
            Log.d("Spinner", "Added Dare: " + dare);
            dareCount++;
        }

//        debug.setText("Dares: " + Integer.toString(dareCount));

        Spinner visual = new Spinner(getBaseContext());
        visual.setAdapter(getAdapter(getBaseContext(), adult, R.layout.play));
        packs.addView(visual);

        // Now you can use submitButton, for example:
        start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Start if pack selected, else display error message
                if (selectedPack != null) {
                    state = State.STARTED;
                }
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Display different packs
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        runPlay();
    }
}