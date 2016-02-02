package com.example.art.testapp;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.StringBufferInputStream;

public class Main2Activity extends AppCompatActivity {
    private static int counter = 1;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("123", " Started " + this.getClass().getName());
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        textView = (TextView) findViewById(R.id.textView2);

        textView.setText(String.valueOf(counter++));
    }
}
