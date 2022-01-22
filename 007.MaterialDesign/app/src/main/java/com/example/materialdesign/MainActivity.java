package com.example.materialdesign;

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
                cargarActivity("com.example.materialdesign.Ejercicio8_1.Ejercicio8_1");
            }
        });

        //EJERCICIO 2
        this.activity_main_btn_2 = findViewById(R.id.activity_main_btn_2);

        activity_main_btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.materialdesign.Ejercicio8_2.Ejercicio8_2");
            }
        });

        //EJERCICIO 3
        this.activity_main_btn_3 = findViewById(R.id.activity_main_btn_3);

        activity_main_btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.materialdesign.Ejercicio8_3.Ejercicio8_3");
            }
        });

        cargarActivity("com.example.materialdesign.Ejercicio8_1.Ejercicio8_1");
    }
}