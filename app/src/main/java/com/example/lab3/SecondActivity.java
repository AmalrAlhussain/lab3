package com.example.lab3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView receivedMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        receivedMsg = findViewById(R.id.received_value_id);

        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");

        receivedMsg.setText("hello, "+str);
    }
}