package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosicionTest {

    @Test
    public void test01CreoDosPosicionesIgualesYLasComparo(){

        Posicion primerPosicion = new Posicion(0, 0);
        Posicion segundaPosicion = new Posicion(0, 0);

        assertTrue(primerPosicion.compararPosiciones(segundaPosicion));
    }
}