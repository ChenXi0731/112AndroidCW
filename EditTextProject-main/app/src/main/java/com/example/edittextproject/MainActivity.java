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
        EditText editText = (EditText) findViewById(R.id.editTextText);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        String name = editText.getText().toString();
        textView2.setText("你的名字是： " + name);
    }
}