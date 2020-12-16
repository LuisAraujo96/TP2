package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloqueDerechaTest {

    @Test
    public void test01PersonajeEjecutaBloqueDerechaYSuPosicionEsLaCorrecta(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueDerecha bloque = new BloqueDerecha();
        Posicion posicion = new Posicion(1,0);

        bloque.ejecutarSobre(personaje);

        assertTrue(personaje.obtenerPosicion().compararPosiciones(posicion));
    }

    @Test
    public void test02PersonajeEjecutaBloqueDerechaLuegoBloqueIzquierdaYSuPosicionDebeSer00(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueDerecha bloqueDer = new BloqueDerecha();
        BloqueIzquierda bloqueIzq = new BloqueIzquierda();
        Posicion posicion = new Posicion(0,0);

        bloqueDer.ejecutarSobre(personaje);
        bloqueIzq.ejecutarSobre(personaje);

        assertTrue(personaje.obtenerPosicion().compararPosiciones(posicion));
    }
}