package com.example.controles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // EJERCICIO 5_1
    // Layout 5_2
    // private TextView tv5_2;

    // Layout 5_3
    //private TextView tv5_3;

    //EJERCICIO 5_2
    //private TextView ejercicio5_2_tv;
    //private Button ejercicio5_2_btn;

    //EJERCICIO 5_3
    private Button ejercicio5_3_btn1;
    private Button ejercicio5_3_btn2;
    private ImageView ejercicio5_3_img;
    private TextView ejercicio5_3_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Layout activity_main setContentView(R.layout.activity_main);

        //EJERCICIO 5_1
        // Layout 5_2
        // setContentView(R.layout.layout5_2);
        // Layout 5_2
        // this.tv5_2 = findViewById(R.id.tv5_3);
        // Layout 5_2
        // this.tv5_2.setText("Texto Contruido desde Java \nTamaño 20dp, Itálic y color Blue");

        //Layout 5_3
        //setContentView(R.layout.layout5_3);
        //Layout 5_3
        //this.tv5_3 = findViewById(R.id.tv5_3);
        //Layout 5_3
        //this.tv5_3.append("\nTexto añadido con append desde Java");


        //EJERCICIO 5_2
        //setContentView(R.layout.ejercicio5_2);
        //this.ejercicio5_2_tv = findViewById(R.id.ejercicio5_2_tv);
        //this.ejercicio5_2_btn = findViewById(R.id.ejercicio5_2_btn);
        //ejercicio5_2_btn.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        activarAnimacion1();
        //    }
        //});

        //EJERCICIO 5_2
        setContentView(R.layout.ejercicio5_2);
        this.ejercicio5_3_btn1 = findViewById(R.id.ejercicio5_3_btn1);
        this.ejercicio5_3_btn2 = findViewById(R.id.ejercicio5_3_btn2);
        this.ejercicio5_3_img = findViewById(R.id.ejercicio5_3_img);
        this.ejercicio5_3_tv = findViewById(R.id.ejercicio5_3_tv);

        ejercicio5_3_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activarListener("Listener Click");
            }
        });


        ejercicio5_3_btn2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                activarListener("Listener Long Click");
                return true;
            }
        });

    }

    //protected void activarAnimacion1(){
    //    Animation miAnimacion = AnimationUtils.loadAnimation(this, R.anim.animacion1);
    //    miAnimacion.setRepeatMode(Animation.RESTART);
    //    miAnimacion.setRepeatCount(1);
    //    ejercicio5_2_tv.startAnimation(miAnimacion);
    //}

    protected void activarListener(String val){
        ejercicio5_3_tv.setText(val);
    }
}