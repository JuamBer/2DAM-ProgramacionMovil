package com.example.listadosmenus.Ejercicio6_2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listadosmenus.R;

public class Ejercicio6_2 extends AppCompatActivity {

    private ListView ejercicio6_2_lv;
    private TextView ejercicio6_2_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio6_2);

        ejercicio6_2_lv = (ListView) findViewById(R.id.ejercicio6_2_lv);
        ejercicio6_2_tv = (TextView) findViewById(R.id.ejercicio6_2_tv);

        final String[] datos = new String[] {"España", "Suiza", "Argentia", "Japón", "Rusia", "Canada","Marruecos","Egipto","Noruega","Cuba"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, datos);
        ejercicio6_2_lv.setAdapter(adaptador);

        ejercicio6_2_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int posicion, long id){
                String elemento = (String) parent.getItemAtPosition(posicion);
                ejercicio6_2_tv.setText(elemento);
            }
        });

    }


}