package com.example.listadosmenus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //EJERCICIO 1
    private Button activity_main_btn_1;
    //EJERCICIO 2
    private Button activity_main_btn_2;
    //EJERCICIO 3
    private Button activity_main_btn_3;
    //EJERCICIO 4
    private Button activity_main_btn_4;
    //EJERCICIO 5
    private Button activity_main_btn_5;
    //EJERCICIO 6
    private Button activity_main_btn_6;
    //EJERCICIO 7
    private Button activity_main_btn_7;

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
        this.activity_main_btn_1 = findViewById(R.id.activity_main_btn_1);

        activity_main_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.listadosmenus.Ejercicio6_1.Ejercicio6_1");
            }
        });

        //EJERCICIO 2
        this.activity_main_btn_2 = findViewById(R.id.activity_main_btn_2);

        activity_main_btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.listadosmenus.Ejercicio6_2.Ejercicio6_2");
            }
        });

        //EJERCICIO 3
        this.activity_main_btn_3 = findViewById(R.id.activity_main_btn_3);

        activity_main_btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.listadosmenus.Ejercicio6_3.Ejercicio6_3");
            }
        });

        //EJERCICIO 4
        this.activity_main_btn_4 = findViewById(R.id.activity_main_btn_4);

        activity_main_btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.listadosmenus.Ejercicio6_4.Ejercicio6_4");
            }
        });

        //EJERCICIO 5
        this.activity_main_btn_5 = findViewById(R.id.activity_main_btn_5);

        activity_main_btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.listadosmenus.Ejercicio6_5.Ejercicio6_5");
            }
        });

        //EJERCICIO 6
        this.activity_main_btn_6 = findViewById(R.id.activity_main_btn_6);

        activity_main_btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.listadosmenus.Ejercicio6_6.Ejercicio6_6");
            }
        });

    }
}