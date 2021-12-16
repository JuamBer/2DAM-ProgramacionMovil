package com.example.controles.Ejercicio5_7;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.controles.R;

public class Ejercicio5_7 extends AppCompatActivity {

    private TextView ejercicio5_7_tv_1;
    private SeekBar ejercicio5_7_skb_1;
    private TextView ejercicio5_7_tv_2;
    private SeekBar ejercicio5_7_skbd_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio5_7);

        this.ejercicio5_7_tv_1 = findViewById(R.id.ejercicio5_7_tv_1);
        this.ejercicio5_7_skb_1 = findViewById(R.id.ejercicio5_7_skb_1);
        this.ejercicio5_7_tv_2 = findViewById(R.id.ejercicio5_7_tv_2);
        this.ejercicio5_7_skbd_1 = findViewById(R.id.ejercicio5_7_skbd_1);


        ejercicio5_7_skb_1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                ejercicio5_7_tv_1.setText("VALOR: " + String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ejercicio5_7_skbd_1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                ejercicio5_7_tv_2.setText("VALOR: " + String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}