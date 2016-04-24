package com.example.art.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
    Button mainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        mainButton = (Button) findViewById(R.id.button);

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(getString(R.string.log_tag), "FirstActivity Button clicked");

                someLongWork(10000L);
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);

                FirstActivity.this.startActivity(intent);
            }
        });
    }

    /**
     * Function which simulate some payload. Just spams to logs.
     *
     * @param counter - payload amount
     */
    public void someLongWork(long counter) {
        int res = 1;
        for(int i = 0; i < counter; i++) {
            res = res * i ^ i;
            Log.v(getString(R.string.log_tag), "Value evaluated " + String.valueOf(res));
        }
    }
}
