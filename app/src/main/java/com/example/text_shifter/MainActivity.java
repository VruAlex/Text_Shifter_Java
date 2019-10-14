package com.example.text_shifter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.Text);
        editText = findViewById(R.id.TypeYourName);

        //set listener to button
        findViewById(R.id.Change_Text_Button).setOnClickListener(this);
        findViewById(R.id.Change_Text_in_other_Activity).setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        //Get text from text View
        final String string = editText.getText().toString();
        final int changeTextButton = R.id.Change_Text_Button;
        final int changeTextInOtherActivity = R.id.Change_Text_in_other_Activity;

        if (view.getId() == changeTextButton){
            //changing text in same main Activity
            textView.setText(string);
        }else if (view.getId() == changeTextInOtherActivity){
            Intent intent = SecondActivity.newStartIntent(this, string);
            startActivity(intent);
        }
    }


}
