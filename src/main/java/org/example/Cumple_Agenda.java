package org.example;

public class Cumple_Agenda {

    private String nombre;
    private int dia;
    private int mes;

    public Cumple_Agenda(String nombre, int dia, int mes) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }
}
