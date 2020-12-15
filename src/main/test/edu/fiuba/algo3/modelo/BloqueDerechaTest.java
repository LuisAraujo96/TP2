package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloqueDerechaTest {

    @Test
    public void test01PersonajeEjecutaBloqueDerechaYSuPosicionEsLaCorrecta(){
        Personaje personaje = new Personaje();
        BloqueDerecha bloque = new BloqueDerecha();
        Posicion posicion = new Posicion(1,0);

        personaje.ejecutarBloque(bloque);

        assertTrue(personaje.obtenerPosicion().compararPosiciones(posicion));
    }

    @Test
    public void test02PersonajeEjecutaBloqueDerechaLuegoBloqueIzquierdaYSuPosicionDebeSer00(){
        Personaje personaje = new Personaje();
        BloqueDerecha bloqueDer = new BloqueDerecha();
        BloqueIzquierda bloqueIzq = new BloqueIzquierda();
        Posicion posicion = new Posicion(0,0);

        personaje.ejecutarBloque(bloqueDer);
        personaje.ejecutarBloque(bloqueIzq);

        assertTrue(personaje.obtenerPosicion().compararPosiciones(posicion));
    }
}