package com.example.controles.Ejercicio5_6;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.controles.R;

public class Ejercicio5_6 extends AppCompatActivity {

    private TextView ejercicio5_6_tv;
    private RadioGroup ejercicio5_6_rdg;
    private RadioButton ejercicio5_6_rb_1;
    private RadioButton ejercicio5_6_rb_2;
    private RadioButton ejercicio5_6_rb_3;
    private RadioButton ejercicio5_6_rb_4;
    private RadioButton ejercicio5_6_rb_5;
    private RadioButton ejercicio5_6_rb_6;
    private RadioButton ejercicio5_6_rb_7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio5_6);

        this.ejercicio5_6_tv = findViewById(R.id.ejercicio5_6_tv);
        this.ejercicio5_6_rdg = findViewById(R.id.ejercicio5_6_rdg);
        this.ejercicio5_6_rb_1 = findViewById(R.id.ejercicio5_6_rb_1);
        this.ejercicio5_6_rb_2 = findViewById(R.id.ejercicio5_6_rb_2);
        this.ejercicio5_6_rb_2 = findViewById(R.id.ejercicio5_6_rb_3);
        this.ejercicio5_6_rb_2 = findViewById(R.id.ejercicio5_6_rb_4);
        this.ejercicio5_6_rb_2 = findViewById(R.id.ejercicio5_6_rb_5);
        this.ejercicio5_6_rb_2 = findViewById(R.id.ejercicio5_6_rb_6);
        this.ejercicio5_6_rb_2 = findViewById(R.id.ejercicio5_6_rb_7);

        ejercicio5_6_rdg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                RadioButton checkedRadioButton = (RadioButton) findViewById(checkedId);
                String text = checkedRadioButton.getText().toString();
                ejercicio5_6_tv.setText("PULSADO: "+text);
            }
        });

    }
}