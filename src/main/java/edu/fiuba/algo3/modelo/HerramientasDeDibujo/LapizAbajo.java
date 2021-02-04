package edu.fiuba.algo3.modelo.HerramientasDeDibujo;

import edu.fiuba.algo3.modelo.Posiciones.Posicion;

public class LapizAbajo implements LapizEstado {

    @Override
    public int utilizarSobre(Posicion posicion) {
        posicion.dibujar();
        return posicion.representar();
    }
}