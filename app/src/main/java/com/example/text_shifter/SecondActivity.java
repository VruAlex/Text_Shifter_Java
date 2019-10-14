package com.example.text_shifter;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public final static  String Key = "Message";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //get message
        Intent intent = getIntent();
        String message = intent.getStringExtra(Key);
        //Show message
        ((TextView) findViewById(R.id.Second_Activity_Text)).setText(message);

    }

    static protected Intent newStartIntent(Context context, String message){
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra(Key, message);
        return intent;
    }


}
