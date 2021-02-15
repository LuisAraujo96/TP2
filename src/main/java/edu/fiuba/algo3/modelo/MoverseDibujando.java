package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.Direccion;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.HerramientaDeDibujo;
import edu.fiuba.algo3.modelo.Posiciones.Posicion;

public class MoverseDibujando implements FormaDeMoverse{
    private HerramientaDeDibujo herramienta;

    public MoverseDibujando(HerramientaDeDibujo unaHerramienta){
        this.herramienta = unaHerramienta;
    }

    @Override
    public Posicion moverHacia(Posicion unaPosicion, Direccion unaDireccion) {
        Posicion nuevaPosicion = unaPosicion.obtenerPosicionHacia(unaDireccion);
        this.herramienta.dibujarLinea(unaPosicion, nuevaPosicion);
        return nuevaPosicion;
    }
}
