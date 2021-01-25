package edu.fiuba.algo3.modelo.HerramientaDeDibujo;

import edu.fiuba.algo3.modelo.Posicion.Posicion;

public class LapizAbajo implements LapizEstado {

    @Override
    public int utilizarSobre(Posicion posicion) {
        posicion.dibujar();
        return posicion.representar();
    }
}