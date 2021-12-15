package com.example.controles.Ejercicio5_3;


import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.controles.R;

public class Ejercicio5_3 extends AppCompatActivity {

    private Button ejercicio5_3_btn1;
    private Button ejercicio5_3_btn2;
    private ImageView ejercicio5_3_img;
    private TextView ejercicio5_3_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
    }

    protected void activarListener(String val){
        ejercicio5_3_tv.setText(val);
    }

}

