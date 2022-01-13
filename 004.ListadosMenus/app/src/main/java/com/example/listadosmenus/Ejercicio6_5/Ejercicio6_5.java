package com.example.listadosmenus.Ejercicio6_5;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listadosmenus.R;

import java.util.ArrayList;

public class Ejercicio6_5 extends AppCompatActivity {

    private ListView lista;
    private TextView texto;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio6_5);

        lista = findViewById(R.id.ejercicio6_5_lv);
        texto = findViewById(R.id.ejercicio6_5_tv);

        ArrayList<Encapsulador> datos = new ArrayList<Encapsulador>();

        datos.add(new Encapsulador(R.drawable.ima1, "DONUTS", "El 15 de septiembre de 2009, fue lanzado el SDK de Android 1.6 Donut, basado en el núcleo Linux 2.6.29. En la actualización se incluyen numerosas características nuevas.", true));
        datos.add(new Encapsulador(R.drawable.ima2, "FROYO", "El 20 de mayo de 2010, El SDK de Android 2.2 Froyo (Yogur helado) fue lanzado, basado en el núcleo Linux 2.6.32.", false));
        datos.add(new Encapsulador(R.drawable.ima3, "GINGERBREAD", "El 6 de diciembre de 2010, el SDK de Android 2.3 Gingerbread (Pan de Jengibre) fue lanzado, basado en el núcleo Linux 2.6.35.", false));
        datos.add(new Encapsulador(R.drawable.ima4, "HONEYCOMB", "El 22 de febrero de 2011, sale el SDK de Android 3.0 Honeycomb (Panal de Miel). Fue la primera actualización exclusiva para TV y tableta, lo que quiere decir que sólo es apta para TV y tabletas y no para teléfonos Android.", false));
        datos.add(new Encapsulador(R.drawable.ima5, "ICE CREAM", "El SDK para Android 4.0.0 Ice Cream Sandwich (Sándwich de Helado), basado en el núcleo de Linux 3.0.1, fue lanzado públicamente el 12 de octubre de 2011.", false));
        datos.add(new Encapsulador(R.drawable.ima6, "JELLY BEAN", "Google anunció Android 4.1 Jelly Bean (Gomita Confitada o Gominola) en la conferencia del 30 de junio de 2012. Basado en el núcleo de linux 3.0.31, Bean fue una actualización incremental con el enfoque primario de mejorar la funcionalidad y el rendimiento de la interfaz de usuario.", false));
        datos.add(new Encapsulador(R.drawable.ima7, "KITKAT", "Su nombre se debe a la chocolatina KitKat, de la empresa internacional Nestlé. Posibilidad de impresión mediante WIFI. WebViews basadas en el motor de Chromium.", false));
        datos.add(new Encapsulador(R.drawable.ima8, "LOLLIPOP", "Incluye Material Design, un diseño intrépido, colorido, y sensible interfaz de usuario para las experiencias coherentes e intuitivos en todos los dispositivos. Movimiento de respuesta natural, iluminación y sombras realistas y familiares elementos visuales hacen que sea más fácil de navegar su dispositivo.", false));

        lista.setAdapter(new Adaptador(datos,R.layout.ejercicio6_5_entrada, this) {
            @Override
            public void onEntrada(Object entrada, View view) {
                TextView texto_superior_entrada = (TextView) view.findViewById(R.id.texto_titulo);
                TextView texto_inferior_entrada = (TextView) view.findViewById(R.id.texto_datos);
                ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imagen);
                RadioButton miRadio = (RadioButton) view.findViewById(R.id.boton);

                texto_superior_entrada.setText(((Encapsulador) entrada).getTitulo());
                texto_inferior_entrada.setText(((Encapsulador) entrada).getTexto());
                imagen_entrada.setImageResource(((Encapsulador) entrada).getImg());

                miRadio.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        if(radioButton != null) radioButton.setChecked(false);
                        radioButton = (RadioButton) view;
                        texto.setText("MARCADA UNA OPCION");
                    }
                });

                lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Encapsulador element = (Encapsulador) adapterView.getItemAtPosition(i);
                        CharSequence textoElegido = "Seleccionado: " + element.getTitulo();
                        texto.setText(element.getTexto());
                        Log.i("onItemClick: ",element.getTexto());
                    }
                });
            }
        });
    }


}