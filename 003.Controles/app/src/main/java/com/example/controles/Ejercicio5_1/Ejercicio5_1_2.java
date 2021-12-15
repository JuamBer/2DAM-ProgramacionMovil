package com.example.controles.Ejercicio5_1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.controles.R;

public class Ejercicio5_1_2 extends AppCompatActivity {

    private TextView ejercicio5_1_2_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio5_1_2);

        this.ejercicio5_1_2_tv = findViewById(R.id.ejercicio5_1_3_tv);
        this.ejercicio5_1_2_tv.setText("Texto Contruido desde Java \nTamaño 20dp, Itálic y color Blue");
    }
}
