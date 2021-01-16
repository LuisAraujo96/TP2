package edu.fiuba.algo3.modelo;

import java.util.Objects;

public class Posicion {
    private int x;
    private int y;
    private int representacion;

    public Posicion(int unaCoordenada, int otraCoordenada){
        this.x = unaCoordenada;
        this.y = otraCoordenada;
        this.representacion = 0;
    }

    public void dibujar(){ this.representacion = 1; }

    public int representar(){ return this.representacion; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posicion posicion = (Posicion) o;
        return x == posicion.x && y == posicion.y && representacion == posicion.representacion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, representacion);
    }
}
