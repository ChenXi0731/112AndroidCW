package com.example.edittextproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send_button(View view){
        EditText getNum = (EditText) findViewById(R.id.editTextNumber);
        double tmp = Double.parseDouble(getNum.getText().toString());
        double result = (9.0*tmp)/5.0+32.0;

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("華氏溫度是： " + result);
    }
}