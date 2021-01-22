package edu.fiuba.algo3.modelo;

public class LapizAbajo implements LapizEstado {

    @Override
    public int utilizarSobre(Posicion posicion) {
        posicion.dibujar();
        return posicion.representar();
    }
}