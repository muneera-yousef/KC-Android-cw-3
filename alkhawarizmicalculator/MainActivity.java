package com.example.alkhawarizmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Text =findViewById(R.id.Text);
        TextView textView=findViewById(R.id.textView);
        EditText editTextTextPersonName=findViewById(R.id.editTextTextPersonName);
        EditText editTextTextPersoName2=findViewById(R.id.editTextTextPersonName2);
        Button button=findViewById(R.id.button);
}