package com.example.controles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Layout 5_2 private TextView tv5_2;
    // Layout 5_3 private TextView tv5_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Layout activity_main setContentView(R.layout.activity_main);

        // Layout 5_2 setContentView(R.layout.layout5_2);
        // Layout 5_2 this.tv5_2 = findViewById(R.id.tv5_3);
        // Layout 5_2 this.tv5_2.setText("Texto Contruido desde Java \nTamaño 20dp, Itálic y color Blue");

        // Layout 5_3 setContentView(R.layout.layout5_3);
        // Layout 5_3 this.tv5_3 = findViewById(R.id.tv5_3);
        // Layout 5_3 this.tv5_3.append("\nTexto añadido con append desde Java");
    }
}