package com.example.examen_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class menu2 extends AppCompatActivity {

    CheckBox ch1,ch2,ch3;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        ch1=(CheckBox) findViewById(R.id.c1);
        ch2=(CheckBox) findViewById(R.id.c2);
        ch3=(CheckBox) findViewById(R.id.c3);
        b1=(Button) findViewById(R.id.btn2);
        b2=(Button) findViewById(R.id.btn1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //startActivity(new Intent(MainActivity.this, menu1.class));

                if (ch1.isChecked()==true && ch2.isChecked()==true && ch3.isChecked()==true){
                    Intent i = new Intent(menu2.this, menu4.class);

                    i.putExtra("dato", "Peperoni, Atún y Hawaiana con un total de $600");
                    startActivity(i);
                }else
                if (ch1.isChecked()==true && ch2.isChecked()==true && ch3.isChecked()==false){
                    Intent i = new Intent(menu2.this, menu4.class);

                    i.putExtra("dato", "Peperoni, Atún con un total de $300");
                    startActivity(i);
                }else
                if (ch1.isChecked()==false && ch2.isChecked()==true && ch3.isChecked()==true){
                    Intent i = new Intent(menu2.this, menu4.class);

                    i.putExtra("dato", "Atún y Hawaiana con un total de $500");
                    startActivity(i);
                }else
                if (ch1.isChecked()==true && ch2.isChecked()==false && ch3.isChecked()==true){
                    Intent i = new Intent(menu2.this, menu4.class);

                    i.putExtra("dato", "Peperoni y Hawaiana con un total de $400");
                    startActivity(i);
                }else
                if (ch1.isChecked()==true && ch2.isChecked()==false && ch3.isChecked()==false){
                    Intent i = new Intent(menu2.this, menu4.class);

                    i.putExtra("dato", "Peperoni con un total de $100");
                    startActivity(i);
                }else
                if (ch1.isChecked()==false && ch2.isChecked()==true && ch3.isChecked()==false){
                    Intent i = new Intent(menu2.this, menu4.class);

                    i.putExtra("dato", "Atún con un total de $200");
                    startActivity(i);
                }
                else
                if (ch1.isChecked()==false && ch2.isChecked()==false && ch3.isChecked()==true){
                    Intent i = new Intent(menu2.this, menu4.class);

                    i.putExtra("dato", "Hawaiana con un total de $300");
                    startActivity(i);
                }
                /*if (ch2.isChecked()==true){
                    Intent i = new Intent(menu2.this, menu4.class);

                    i.putExtra("dato", "Atún con un total de $200");
                    startActivity(i);
                }*/
                /*if (ch3.isChecked()==true){
                    Intent i = new Intent(menu2.this, menu4.class);

                    i.putExtra("dato", "hawaiana con un total de $300");
                    startActivity(i);
                }*/
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(new Intent(menu2.this, menu3.class));



            }
        });

    }
}