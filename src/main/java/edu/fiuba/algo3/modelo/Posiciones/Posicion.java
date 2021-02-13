package edu.fiuba.algo3.modelo.Posiciones;

import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.Direccion;

import java.util.Objects;

public class Posicion {
    private int x;
    private int y;

    public Posicion(int unaCoordenada, int otraCoordenada){
        this.x = unaCoordenada;
        this.y = otraCoordenada;
    }

    public Posicion obtenerPosicionHacia(Direccion unaDireccion){
        int nuevaX = this.x + unaDireccion.obtenerColumnaDelPersonaje();
        int nuevaY = this.y + unaDireccion.obtenerFilaDelPersonaje();

        return new Posicion(nuevaX, nuevaY);
    }

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
}
