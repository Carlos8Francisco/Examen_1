package com.example.examen_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class menu4 extends AppCompatActivity {

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu4);
        t1=(TextView) findViewById(R.id.tx1);

        String dato = getIntent().getStringExtra("dato");
        t1.setText("Hola estimado usuario has seleccionado el producto "+dato);
    }
}