package com.example.examen_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class menu4 extends AppCompatActivity {

    TextView t1;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu4);
        t1=(TextView) findViewById(R.id.tx1);
        b1=(Button) findViewById(R.id.btn1);
        b2=(Button) findViewById(R.id.btn2);

        String dato = getIntent().getStringExtra("dato");
        t1.setText("Hola estimado usuario has seleccionado el producto "+dato);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(menu4.this, menu5.class));

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(menu4.this, menu1.class));

            }
        });
    }
}