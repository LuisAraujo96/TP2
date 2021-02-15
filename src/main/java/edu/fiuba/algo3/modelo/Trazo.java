package edu.fiuba.algo3.modelo;

import java.util.HashMap;
import java.util.HashSet;

public class Trazo {
    private HashMap<Posicion, HashSet> lineas;

    public Trazo(){
        lineas = new HashMap<>();
    }

    public void agregarLinea (Posicion inicio, Posicion fin){
        lineas.putIfAbsent(inicio, new HashSet<Posicion>());
        lineas.putIfAbsent(fin, new HashSet<Posicion>());

        lineas.get(inicio).add(fin);
        lineas.get(fin).add(inicio);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trazo otroTrazo = (Trazo) o;
        return lineas.equals(otroTrazo.lineas);
    }

    @Override
    public int hashCode() {
        return lineas.hashCode();
    }
}
