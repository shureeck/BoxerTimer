package com.example.boxertime;

import android.text.InputFilter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class Timer implements CompoundButton.OnCheckedChangeListener {
    private EditText hour;
    private EditText min;
    private EditText sec;
    private Switch swtch = null;
    private boolean isEabled = true;

    public Timer(EditText hour, EditText min, EditText sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;

        hour.setFilters(new InputFilter[]{new InputCharFilter("0", "99")});
        min.setFilters(new InputFilter[]{new InputCharFilter("0", "60")});
        sec.setFilters(new InputFilter[]{new InputCharFilter("0", "60")});
    }

    public Timer(EditText hour, EditText min, EditText sec, Switch swtch) {
        //Init variables
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        this.swtch = swtch;
        this.swtch.setOnCheckedChangeListener(this);
        this.isEabled = swtch.isChecked();
        // Set Enabled/disabled
        onCheckedChanged(swtch, isEabled);
        // Set min/max value in text field
        hour.setFilters(new InputFilter[]{new InputCharFilter("0", "99")});
        min.setFilters(new InputFilter[]{new InputCharFilter("0", "60")});
        sec.setFilters(new InputFilter[]{new InputCharFilter("0", "60")});


    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        hour.setEnabled(isChecked);
        min.setEnabled(isChecked);
        sec.setEnabled(isChecked);
    }
}
