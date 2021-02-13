package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.Direccion;
import edu.fiuba.algo3.modelo.Posiciones.Posicion;

public class MoverseSinDibujar implements FormaDeMoverse{

    @Override
    public Posicion moverHacia(Posicion unaPosicion, Direccion unaDireccion) {
        return unaPosicion.obtenerPosicionHacia(unaDireccion);
    }
}
