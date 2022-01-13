package com.example.listadosmenus.Ejercicio6_5;

public class Encapsulador {
    private int img;
    private String titulo;
    private String texto;
    private boolean dato1;

    public Encapsulador(int img, String titulo, String texto, boolean dato1){
        this.img = img;
        this.titulo = titulo;
        this.texto = texto;
        this.dato1 = dato1;
    }

    public int getImg(){
        return this.img;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getTexto(){
        return this.texto;
    }
    public boolean getDato1(){
        return this.dato1;
    }

}
