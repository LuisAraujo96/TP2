package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BloqueIzquierdaTest {

    @Test
    public void test01PersonajeEjecutaBloqueIzquierdaYSuPosicionEsLaCorrecta(){
        Personaje personaje = new Personaje();
        BloqueIzquierda bloque = new BloqueIzquierda();
        Posicion posicion = new Posicion(-1,0);

        personaje.ejecutarBloque(bloque);

        assertTrue(personaje.obtenerPosicion().compararPosiciones(posicion));
    }
}
