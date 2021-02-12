package edu.fiuba.algo3.modelo.Posiciones;

import java.util.Objects;

public class Posicion {
    private int x;
    private int y;
    private Representacion representacion;

    public Posicion(int unaCoordenada, int otraCoordenada){
        this.x = unaCoordenada;
        this.y = otraCoordenada;
        this.representacion = new SinDibujar();
    }

    public void dibujar(){ this.representacion = new Dibujada(); }

    public int representar(){ return this.representacion.representar(); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posicion posicion = (Posicion) o;
        return x == posicion.x && y == posicion.y && representacion.representar() == posicion.representacion.representar();
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
