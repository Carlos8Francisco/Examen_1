package com.example.examen_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class menu1 extends AppCompatActivity {

    TextView tv1;
    ImageButton b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
        tv1=(TextView) findViewById(R.id.txt1);
        b1=(ImageButton) findViewById(R.id.imb1);
        b2=(ImageButton) findViewById(R.id.imb2);

        String dato = getIntent().getStringExtra("dato");
        tv1.setText("Hola estimado "+dato+" ¿qué te podemos llevar hasta tu casa este día? Por favor selecciona: ");

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(new Intent(menu1.this, menu2.class));
                //Intent i = new Intent(menu1.this, menu2.class);
                //i.putExtra("dato", user.getText().toString());
                //nombre=user.getText().toString();
                //String dato = getIntent().getStringExtra("dato");
                Toast.makeText(getApplicationContext(), "Escoge tus pizzas", Toast.LENGTH_SHORT).show();
                //startActivity(i);



            }
        });
    }


}