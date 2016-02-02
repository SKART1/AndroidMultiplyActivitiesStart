package com.example.art.testapp;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("123", " Clicked");

                someShittyStuff(10000L);
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                MainActivity.this.startActivity(intent);
            }
        });
    }



    public static void someShittyStuff(long counter) {
        int res = 1;
        for(int i = 0; i < counter; i++) {
            res = res * i ^ i;
            Log.v("SHIT", String.valueOf(res));
        }
    }
}
