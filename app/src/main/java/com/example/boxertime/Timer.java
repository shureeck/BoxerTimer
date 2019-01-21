package com.example.boxertime;

import android.widget.TextView;

public class Timer implements Runnable {
    private TextView textView;
    Timer(TextView textView){
        this.textView=textView;
    }
    public int delay (int j) {
        int i = j;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i++;
        return i;

    }

    @Override
    public void run() {
        int i=0;
        while (true) {
            String s = String.valueOf(delay(i));
            textView.setText(s);
            System.out.println(s);
            i++;
        }
    }
}
