package org.example;

import java.util.ArrayList;
import java.util.List;

public class Repo_File {

    private List<Cumple_Agenda> Lista = new ArrayList<>();

    public List<Cumple_Agenda> get_lista() {
        return Lista;
    }

    public void add_cumple(Cumple_Agenda c) {
        Lista.add(c);
    }

    public Cumple_Agenda buscarNombre(String nombre) {
        for (Cumple_Agenda c : Lista) {
            if (c.getNombre().equalsIgnoreCase(nombre)) return c;
        }
        return null;
    }

    public List<Cumple_Agenda> buscarDia(int dia) {
        List<Cumple_Agenda> resultado = new ArrayList<>();
        for (Cumple_Agenda c : Lista) {
            if (c.getDia() == dia) resultado.add(c);
        }
        return resultado;
    }

    public boolean eliminarNombre(String nombre) {
        Cumple_Agenda encontrado = buscarNombre(nombre);
        if (encontrado != null) {
            Lista.remove(encontrado);
            return true;
        }
        return false;
    }
}
