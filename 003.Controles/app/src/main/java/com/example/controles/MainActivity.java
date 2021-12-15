package com.example.controles;

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
    private Button activity_main_btn_4_1;
    private Button activity_main_btn_4_2;
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
        this.activity_main_btn_1_1 = findViewById(R.id.activity_main_btn_1_1);
        this.activity_main_btn_1_2 = findViewById(R.id.activity_main_btn_1_2);
        this.activity_main_btn_1_3 = findViewById(R.id.activity_main_btn_1_3);
        this.activity_main_btn_1_4 = findViewById(R.id.activity_main_btn_1_4);

        activity_main_btn_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.controles.Ejercicio5_1.Ejercicio5_1_1");
            }
        });
        activity_main_btn_1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.controles.Ejercicio5_1.Ejercicio5_1_2");
            }
        });
        activity_main_btn_1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.controles.Ejercicio5_1.Ejercicio5_1_3");
            }
        });
        activity_main_btn_1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.controles.Ejercicio5_1.Ejercicio5_1_4");
            }
        });


        //EJERCICIO 2
        this.activity_main_btn_2 = findViewById(R.id.activity_main_btn_2);

        activity_main_btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.controles.Ejercicio5_2.Ejercicio5_2");
            }
        });


        //EJERCICIO 3
        this.activity_main_btn_3 = findViewById(R.id.activity_main_btn_3);

        activity_main_btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.controles.Ejercicio5_3.Ejercicio5_3");
            }
        });

        //EJERCICIO 4
        this.activity_main_btn_4_1 = findViewById(R.id.activity_main_btn_4_1);
        this.activity_main_btn_4_2 = findViewById(R.id.activity_main_btn_4_2);

        activity_main_btn_4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.controles.Ejercicio5_4.Ejercicio5_4_1");
            }
        });
        activity_main_btn_4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.controles.Ejercicio5_4.Ejercicio5_4_2");
            }
        });

        //EJERCICIO 5
        this.activity_main_btn_5 = findViewById(R.id.activity_main_btn_5);

        activity_main_btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.controles.Ejercicio5_5.Ejercicio5_5");
            }
        });

        //EJERCICIO 6
        this.activity_main_btn_6 = findViewById(R.id.activity_main_btn_6);

        activity_main_btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.controles.Ejercicio5_6.Ejercicio5_6");
            }
        });

        //EJERCICIO 7
        this.activity_main_btn_7 = findViewById(R.id.activity_main_btn_7);

        activity_main_btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity("com.example.controles.Ejercicio5_7.Ejercicio5_7");
            }
        });
    }
}