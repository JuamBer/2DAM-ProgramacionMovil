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

public class MainActivity extends AppCompatActivity {

    // EJERCICIO 5_1
        //EJERCICIO 5_2_1

        //EJERCICIO 5_2_2
        /*
        private TextView ejercicio5_1_2_tv;
        */

        //EJERCICIO 5_2_3
        /*
        private TextView ejercicio5_1_3_tv;
        */

        //EJERCICIO 5_2_4

    //EJERCICIO 5_2
        /*
        private TextView ejercicio5_2_tv;
        private Button ejercicio5_2_btn;
        */


    //EJERCICIO 5_3
        /*
        private Button ejercicio5_3_btn1;
        private Button ejercicio5_3_btn2;
        private ImageView ejercicio5_3_img;
        private TextView ejercicio5_3_tv;
        */

    //EJERCICIO 5_4

    //EJERCICIO 5_5

    //EJERCICIO 5_6

    //EJERCICIO 5_7

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //EJERCICIO 5_1
            //EJERCICIO 5_2_1
                /*
                setContentView(R.layout.ejercicio5_1_1);
                */

            //EJERCICIO 5_2_2
                /*
                setContentView(R.layout.ejercicio5_1_2);
                this.ejercicio5_1_2_tv = findViewById(R.id.ejercicio5_1_2_tv);
                this.ejercicio5_1_2_tv.setText("Texto Contruido desde Java \nTamaño 20dp, Itálic y color Blue");
                */

            //EJERCICIO 5_2_3
                /*
                setContentView(R.layout.ejercicio5_1_3);
                this.ejercicio5_1_3_tv = findViewById(R.id.ejercicio5_1_3_tv);
                this.ejercicio5_1_3_tv.append("\nTexto añadido con append desde Java");
                */

            //EJERCICIO 5_2_4
                /*
                setContentView(R.layout.ejercicio5_1_4);
                 */

        //EJERCICIO 5_2
            /*
            setContentView(R.layout.ejercicio5_2);
            this.ejercicio5_2_tv = findViewById(R.id.ejercicio5_2_tv);
            this.ejercicio5_2_btn = findViewById(R.id.ejercicio5_2_btn);
            ejercicio5_2_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    activarAnimacion();
                }
            });
            */

        //EJERCICIO 5_3
            /*
            setContentView(R.layout.ejercicio5_3);
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

            ejercicio5_3_img.setOnTouchListener(new View.OnTouchListener(){
                @Override
                public boolean onTouch(View view, MotionEvent event) {
                    float x_inicial = 0;
                    float x_final = 0;
                    float res;

                    switch (event.getAction()){
                        case MotionEvent.ACTION_DOWN:
                            x_inicial = event.getX();
                            break;
                        case MotionEvent.ACTION_MOVE:
                            x_final = event.getX();
                            res = x_final-x_inicial;
                            ejercicio5_3_img.setX(ejercicio5_3_img.getX()+res);
                            break;
                    }

                    return true;
                }
            });
            */

        //EJERCICIO 5_4

        //EJERCICIO 5_5

        //EJERCICIO 5_6

        //EJERCICIO 5_7
    }
    //EJERCICIO 5_2
    /*
    protected void activarAnimacion(){
        Animation miAnimacion = AnimationUtils.loadAnimation(this, R.anim.animacion1);
        miAnimacion.setRepeatMode(Animation.RESTART);
        miAnimacion.setRepeatCount(1);
        ejercicio5_2_tv.startAnimation(miAnimacion);
    }
    */
    //EJERCICIO 5_3
    /*
    protected void activarListener(String val){
        ejercicio5_3_tv.setText(val);
    }
    */
}