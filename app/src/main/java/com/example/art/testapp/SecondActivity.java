package com.example.art.testapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private static int counter = 1;

    private TextView instanceNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        counter++;
        Log.e(getString(R.string.log_tag), " SecondActivity stated. Instance №: " + counter);

        //Visual
        setContentView(R.layout.activity_second);
        instanceNumber = (TextView) findViewById(R.id.appDescription);

        //Set data
        instanceNumber.setText(String.valueOf(counter));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
