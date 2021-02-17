package edu.fiuba.algo3.modelo;

import java.util.HashMap;
import java.util.HashSet;

public class Trazo {
    private final HashMap<Posicion, HashSet<Posicion>> lineas;

    public Trazo(){
        lineas = new HashMap<>();
    }

    public void agregarLinea (Posicion inicio, Posicion fin){
        lineas.putIfAbsent(inicio, new HashSet<>());
        lineas.putIfAbsent(fin, new HashSet<>());

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
