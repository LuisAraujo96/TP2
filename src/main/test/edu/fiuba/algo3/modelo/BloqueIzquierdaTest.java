package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BloqueIzquierdaTest {

    @Test
    public void test01PersonajeEjecutaBloqueIzquierdaYSuPosicionEsLaCorrecta(){
        Personaje personaje = new Personaje();
        BloqueIzquierda bloque = new BloqueIzquierda();
        Posicion posicion = new Posicion(-1,0);

        bloque.ejecutar(personaje);

        assertTrue(personaje.obtenerPosicion().compararPosiciones(posicion));
    }

    @Test
    public void test02PersonajeEjecutaBloqueIzquierdaLuegoBloqueDerechaYSuPosicionDebeSer00(){
        Personaje personaje = new Personaje();
        BloqueIzquierda bloqueIzq = new BloqueIzquierda();
        BloqueDerecha bloqueDer = new BloqueDerecha();
        Posicion posicion = new Posicion(0,0);

        bloqueIzq.ejecutar(personaje);
        bloqueDer.ejecutar(personaje);

        assertTrue(personaje.obtenerPosicion().compararPosiciones(posicion));
    }
}
