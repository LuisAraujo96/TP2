package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Posiciones.Posicion;
import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.Direccion;

public interface FormaDeMoverse {
    Posicion moverHacia(Posicion unaPosicion, Direccion unaDireccion);
}
