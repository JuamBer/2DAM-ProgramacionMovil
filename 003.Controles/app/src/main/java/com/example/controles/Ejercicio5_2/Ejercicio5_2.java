package com.example.controles.Ejercicio5_2;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.controles.R;

public class Ejercicio5_2 extends AppCompatActivity {

    private TextView ejercicio5_2_tv;
    private Button ejercicio5_2_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio5_2);


        this.ejercicio5_2_tv = findViewById(R.id.ejercicio5_2_tv);
        this.ejercicio5_2_btn = findViewById(R.id.ejercicio5_2_btn);
        ejercicio5_2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activarAnimacion();
            }
        });

    }

    protected void activarAnimacion(){
        Animation miAnimacion = AnimationUtils.loadAnimation(this, R.anim.animacion1);
        miAnimacion.setRepeatMode(Animation.RESTART);
        miAnimacion.setRepeatCount(1);
        ejercicio5_2_tv.startAnimation(miAnimacion);
    }

}