package com.example.boxertime;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    TextView times;
    Handler hnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        times = findViewById(R.id.time);
        final Button start = findViewById(R.id.start);

        hnd = new Handler() {
            public void handleMessage(Message msg) {
                // обновляем TextView
                times.setText(String.valueOf(msg.what));
            }
        };

        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.start:
                        start.setEnabled(false);
                        Thread th = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                int i = 0;
                                while (true) {
                                    hnd.sendEmptyMessage(startTimer(i));
                                    System.out.println(i);
                                    i++;
                                }
                            }
                        });
                        th.start();
                        break;
                }
            }
        };
        start.setOnClickListener(listener);
    }

    public void  runSettings(View v){
        Intent intents = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(intents);
    }

    public int startTimer(int j) {
        int i = j;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i++;
        return i;

    }
}
