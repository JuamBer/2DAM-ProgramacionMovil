package com.example.controles.Ejercicio5_1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.controles.R;

public class Ejercicio5_1_3 extends AppCompatActivity {
    private TextView ejercicio5_1_3_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio5_1_3);

        this.ejercicio5_1_3_tv = findViewById(R.id.ejercicio5_1_3_tv);
        this.ejercicio5_1_3_tv.append("\nTexto añadido con append desde Java");
    }
}

