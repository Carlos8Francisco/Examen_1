package com.example.examen_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Ingresar;
    String nombre;
    EditText user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ingresar=(Button)findViewById(R.id.ing1);
        user=(EditText)findViewById(R.id.edit1);

        Ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //startActivity(new Intent(MainActivity.this, menu1.class));
                Intent i = new Intent(MainActivity.this, menu1.class);
                i.putExtra("dato", user.getText().toString());
                nombre=user.getText().toString();
                Toast.makeText(getApplicationContext(), "Hola "+nombre+" BIENVENIDO", Toast.LENGTH_SHORT).show();
                startActivity(i);



            }
        });


    }
}