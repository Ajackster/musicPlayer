package com.example.andre_000.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RockOnMusic
        extends AppCompatActivity
        implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_on_music);


        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }

    // this method handles button clicks
    public void onClick(View v) {
        switch (v.getId()) {
            case  R.id.button1: {
                TextView tv = (TextView)findViewById(R.id.textView);
                tv.setText("You pressed button 1");
                break;
            }

            // goes to another activity
            case R.id.button2: {
                Intent intent = new Intent(RockOnMusic.this, ActivityMusic.class);
                startActivity(intent);
                finish();
                break;
            }

            case R.id.button3: {
                finish();
                System.exit(0);
                break;
            }
        }
    }
}
