package com.example.examen_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Ingresar, borrar;
    String nombre;
    EditText user, pass;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ingresar=(Button)findViewById(R.id.ing1);
        user=(EditText)findViewById(R.id.edit1);
        pass=(EditText)findViewById(R.id.edit2);
        img1=(ImageView) findViewById(R.id.img1);
        borrar=(Button)findViewById(R.id.limp1);


        Ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //startActivity(new Intent(MainActivity.this, menu1.class));


                nombre=user.getText().toString();
                if (nombre.length() == 0){
                    Toast.makeText(MainActivity.this, "Debes ingresar un nombre", Toast.LENGTH_SHORT).show();
                }
                if (pass.length() == 0){
                    Toast.makeText(MainActivity.this, "Debes ingresar una contraseña", Toast.LENGTH_SHORT).show();
                }
                if (nombre.length() != 0 && pass.length() != 0){
                    Intent i = new Intent(MainActivity.this, menu1.class);
                    i.putExtra("dato", user.getText().toString());
                    Toast.makeText(getApplicationContext(), "Hola "+nombre+" BIENVENIDO", Toast.LENGTH_SHORT).show();
                    startActivity(i);

                }




            }
        });

        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //startActivity(new Intent(MainActivity.this, menu1.class));



                clear();




            }
        });



    }

    private void clear(){
        user.setText("");
        pass.setText("");

    }
}