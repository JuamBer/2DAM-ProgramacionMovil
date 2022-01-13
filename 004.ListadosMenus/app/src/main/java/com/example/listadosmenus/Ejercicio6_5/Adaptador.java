package com.example.listadosmenus.Ejercicio6_5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public abstract class Adaptador extends BaseAdapter {

    private ArrayList<?> entradas;
    private int R_layout_IdView;
    private Context context;

    public Adaptador(ArrayList<?> entradas, int R_layout_IdView, Context context){
        this.entradas = entradas;
        this.R_layout_IdView = R_layout_IdView;
        this.context = context;
    }
    public abstract void onEntrada(Object entrada, View view);

    @Override
    public int getCount() {
        return this.entradas.size();
    }

    @Override
    public Object getItem(int i) {
        return this.entradas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null){
            LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = vi.inflate(this.R_layout_IdView,null);
        }
        onEntrada(this.entradas.get(i), view);
        return view;
    }
}
