package com.example.boxertime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        //Initialization of text edit

        final EditText hourTimer = findViewById(R.id.hourTxtEdit);
        final EditText minTimer = findViewById(R.id.minTxtEdit);
        final EditText secTimer = findViewById(R.id.secTxtEdit);

        Timer timer = new Timer(hourTimer, minTimer, secTimer);

        final Switch restSwitch = findViewById(R.id.RestSwtch);
        final EditText hourRest = findViewById(R.id.hourRestTxtEdit);
        final EditText minRest = findViewById(R.id.minRestTxtEdit);
        final EditText secRest = findViewById(R.id.secRestTxtEdit);

        Timer restTimer = new Timer(hourRest, minRest, secRest,restSwitch);

        final Switch leftSwitch = findViewById(R.id.LeftSwtch);
        final EditText hourLeft = findViewById(R.id.hourLeftTxtEdit);
        final EditText minLeft = findViewById(R.id.minLeftTxtEdit);
        final EditText secLeft = findViewById(R.id.secLeftTxtEdit);

        Timer leftTimer = new Timer(hourLeft, minLeft, secLeft,leftSwitch);

        final Switch signalSwitch = findViewById(R.id.SignalSwtch);
        final EditText hourSignal = findViewById(R.id.hourSignalTxtEdit);
        final EditText minSignal = findViewById(R.id.minSignalTxtEdit);
        final EditText secSignal = findViewById(R.id.secSignalTxtEdit);

        Timer signalTimer = new Timer(hourSignal, minSignal, secSignal,signalSwitch);

        final Switch startSwitch = findViewById(R.id.StartSwtch);
        final EditText hourStart = findViewById(R.id.hourStartTxtEdit);
        final EditText minStart = findViewById(R.id.minSatrtTxtEdit);
        final EditText secStart = findViewById(R.id.secStartTxtEdit);

        Timer startTimer = new Timer(hourStart, minStart, secStart,startSwitch);

        final EditText rounds = findViewById(R.id.roundTxtEdit);

        rounds.setFilters(new InputFilter[]{new InputCharFilter("0", "99")});
    }
}
