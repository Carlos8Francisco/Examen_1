package com.example.examen_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class menu3 extends AppCompatActivity {

    CheckBox ch1,ch2,ch3;
    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu3);
        ch1=(CheckBox) findViewById(R.id.c1);
        ch2=(CheckBox) findViewById(R.id.c2);
        ch3=(CheckBox) findViewById(R.id.c3);
        b1=(Button) findViewById(R.id.btn2);
        b2=(Button) findViewById(R.id.btn1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //startActivity(new Intent(MainActivity.this, menu1.class));



                if (ch1.isChecked()==true){
                    Intent i = new Intent(menu3.this, menu4.class);

                    i.putExtra("dato", "beer con un total de $50");
                    startActivity(i);
                }
                if (ch2.isChecked()==true){
                    Intent i = new Intent(menu3.this, menu4.class);

                    i.putExtra("dato", "7Up con un total de $30");
                    startActivity(i);
                }
                if (ch3.isChecked()==true){
                    Intent i = new Intent(menu3.this, menu4.class);

                    i.putExtra("dato", "CocaCola con un total de $10");
                    startActivity(i);
                }





            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(new Intent(menu3.this, menu2.class));



            }
        });

    }
}
    }


}