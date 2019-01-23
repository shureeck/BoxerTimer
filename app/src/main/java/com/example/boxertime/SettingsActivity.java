package com.example.boxertime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        //Initialization of text edit
        final EditText hourTimer = findViewById(R.id.hourTxtEdit);
        final EditText minTimer = findViewById(R.id.minTxtEdit);
        final EditText secTimer = findViewById(R.id.secTxtEdit);

        final EditText hourRest = findViewById(R.id.hourRestTxtEdit);
        final EditText minRest = findViewById(R.id.minRestTxtEdit);
        final EditText secRest = findViewById(R.id.secRestTxtEdit);

        final EditText hourLeft = findViewById(R.id.hourLeftTxtEdit);
        final EditText minLeft = findViewById(R.id.minLeftTxtEdit);
        final EditText secLeft = findViewById(R.id.secLeftTxtEdit);

        final EditText hourSignal = findViewById(R.id.hourSignalTxtEdit);
        final EditText minSignal = findViewById(R.id.minSignalTxtEdit);
        final EditText secSignal = findViewById(R.id.secSignalTxtEdit);

        final EditText hourStart = findViewById(R.id.hourStartTxtEdit);
        final EditText minStart = findViewById(R.id.minSatrtTxtEdit);
        final EditText secStart = findViewById(R.id.secStartTxtEdit);

        final EditText rounds = findViewById(R.id.roundTxtEdit);

        //Set min and max values
        hourTimer.setFilters(new InputFilter[]{new InputCharFilter("0", "99")});
        minTimer.setFilters(new InputFilter[]{new InputCharFilter("0", "60")});
        secTimer.setFilters(new InputFilter[]{new InputCharFilter("0", "60")});

        hourRest.setFilters(new InputFilter[]{new InputCharFilter("0", "99")});
        minRest.setFilters(new InputFilter[]{new InputCharFilter("0", "60")});
        secRest.setFilters(new InputFilter[]{new InputCharFilter("0", "60")});

        hourLeft.setFilters(new InputFilter[]{new InputCharFilter("0", "99")});
        minLeft.setFilters(new InputFilter[]{new InputCharFilter("0", "60")});
        secLeft.setFilters(new InputFilter[]{new InputCharFilter("0", "60")});

        hourSignal.setFilters(new InputFilter[]{new InputCharFilter("0", "99")});
        minSignal.setFilters(new InputFilter[]{new InputCharFilter("0", "60")});
        secSignal.setFilters(new InputFilter[]{new InputCharFilter("0", "60")});

        hourStart.setFilters(new InputFilter[]{new InputCharFilter("0", "99")});
        minStart.setFilters(new InputFilter[]{new InputCharFilter("0", "60")});
        secStart.setFilters(new InputFilter[]{new InputCharFilter("0", "60")});

        rounds.setFilters(new InputFilter[]{new InputCharFilter("0", "99")});
    }
}
