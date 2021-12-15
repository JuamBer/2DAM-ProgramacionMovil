package com.example.controles;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PointF;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Ejercicio5_4_1 extends AppCompatActivity {

    private TextView ejercicio5_4_1_tv;
    private Button ejercicio5_4_1_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
               setContentView(R.layout.ejercicio5_4_1);

               this.ejercicio5_4_1_tv = findViewById(R.id.ejercicio5_2_tv);
               this.ejercicio5_4_1_btn = findViewById(R.id.ejercicio5_2_btn);

               ejercicio5_4_1_btn.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       activarAnimacion();
           }
        });
    }


    protected void activarAnimacion(){

    }
}