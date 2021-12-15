package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //EJERCICIO 1
    private Button activity_main_btn_1_1;
    private Button activity_main_btn_1_2;
    private Button activity_main_btn_1_3;
    private Button activity_main_btn_1_4;
    //EJERCICIO 2
    private Button activity_main_btn_2;
    //EJERCICIO 3
    private Button activity_main_btn_3;
    //EJERCICIO 4
    private Button activity_main_btn_4;
    //EJERCICIO 5
    private Button activity_main_btn_5;

    protected void cargarActivity(String activity) {
        try {
            Intent intent = new Intent(this, Class.forName(activity));
            startActivity(intent);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //EJERCICIO 1
        this.activity_main_btn_1_1 = findViewById(R.id.activity_main_btn_1_1);
        this.activity_main_btn_1_2 = findViewById(R.id.activity_main_btn_1_2);
        this.activity_main_btn_1_3 = findViewById(R.id.activity_main_btn_1_3);
        this.activity_main_btn_1_4 = findViewById(R.id.activity_main_btn_1_4);

        activity_main_btn_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.layouts.Ejercicio1.Ejercicio1_1");
            }
        });
        activity_main_btn_1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.layouts.Ejercicio1.Ejercicio1_2");
            }
        });
        activity_main_btn_1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.layouts.Ejercicio1.Ejercicio1_3");
            }
        });
        activity_main_btn_1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.layouts.Ejercicio1.Ejercicio1_4");
            }
        });


        //EJERCICIO 2
        this.activity_main_btn_2 = findViewById(R.id.activity_main_btn_2);

        activity_main_btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.layouts.Ejercicio2.Ejercicio2");
            }
        });


        //EJERCICIO 3
        this.activity_main_btn_3 = findViewById(R.id.activity_main_btn_3);

        activity_main_btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.layouts.Ejercicio3.Ejercicio3");
            }
        });

        //EJERCICIO 4
        this.activity_main_btn_4 = findViewById(R.id.activity_main_btn_4);
        activity_main_btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.layouts.Ejercicio4.Ejercicio4");
            }
        });

        //EJERCICIO 5
        this.activity_main_btn_5 = findViewById(R.id.activity_main_btn_5);

        activity_main_btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.layouts.Ejercicio5.Ejercicio5");
            }
        });
    }
}