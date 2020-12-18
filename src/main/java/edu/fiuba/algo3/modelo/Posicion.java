package edu.fiuba.algo3.modelo;

import java.util.Objects;

public class Posicion {
    private int x;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posicion posicion = (Posicion) o;
        return x == posicion.x && y == posicion.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    private int y;

    public Posicion(int unaPosicion, int otraPosicion){ this.x = unaPosicion; this.y = otraPosicion;}

    public void moverseHaciaArriba() { y++; }

    public void moverseHaciaAbajo() { y--; }

    public void moverseHaciaDerecha() { x++; }

    public void moverseHaciaIzquierda() { x--; }

    public boolean compararPosiciones(Posicion otraPosicion){

        return (this.x == otraPosicion.x && this.y == otraPosicion.y);
    }
}
