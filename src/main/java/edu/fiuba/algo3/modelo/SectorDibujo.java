package edu.fiuba.algo3.modelo;

import java.util.*;

public class SectorDibujo {

    private final HashMap<Posicion, HashSet<Posicion>> trazos;

    public SectorDibujo(){
        trazos = new HashMap<>();
    }

    public void agregarTrazo (Posicion inicio, Posicion fin){
        trazos.putIfAbsent(inicio, new HashSet<>());
        trazos.putIfAbsent(fin, new HashSet<>());

        trazos.get(inicio).add(fin);
        trazos.get(fin).add(inicio);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SectorDibujo that = (SectorDibujo) o;
        return Objects.equals(trazos, that.trazos);
    }

}
