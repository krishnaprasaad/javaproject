package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegisterBtnClick(android.view.View view) {
        TextView firstnameout = findViewById(R.id.myfirstnameout);
        TextView lastnameout = findViewById(R.id.mylastnameout);
        TextView emailout = findViewById(R.id.myemailout);

        EditText firstnamein = findViewById(R.id.myfirstnamein);
        EditText lastnamein = findViewById(R.id.mylastnamein);
        EditText emailin = findViewById(R.id.myemailin);

        firstnameout.setText("First name: " + firstnamein.getText().toString());
        lastnameout.setText("Last name: " + lastnamein.getText().toString());
        emailout.setText("Email id: " + emailin.getText().toString());
    }
}