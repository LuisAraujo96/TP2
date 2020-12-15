package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BloqueArribaTest {

    @Test
    public void test01PersonajeEjecutaBloqueYSuPosicionEsLaCorrecta(){
        Personaje personaje = new Personaje();
        BloqueArriba bloque = new BloqueArriba();
        Posicion posicion = new Posicion(0,1);

        personaje.ejecutarBloque(bloque);

        assertTrue(personaje.obtenerPosicion().compararPosiciones(posicion));
    }
}