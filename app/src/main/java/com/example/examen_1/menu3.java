package com.example.examen_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class menu3 extends AppCompatActivity {

    CheckBox ch1,ch2,ch3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu3);
        ch1=(CheckBox) findViewById(R.id.c1);
        ch2=(CheckBox) findViewById(R.id.c2);
        ch3=(CheckBox) findViewById(R.id.c3);
    }


}