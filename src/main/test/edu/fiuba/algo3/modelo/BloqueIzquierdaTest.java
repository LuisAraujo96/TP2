package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BloqueIzquierdaTest {

    @Test
    public void test01MoverAlPersonajeAIzquierdaLoDejaEnLaPosicionMenosUnoYCero(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueIzquierda bloqueIzquierda = new BloqueIzquierda();
        Posicion posicionDestino = new Posicion(-1,0);

        bloqueIzquierda.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), posicionDestino);
    }

    @Test
    public void test02MoverAlPersonajeAIzquierdaYADerechaLoDejaEnLaPosicionCeroYCero(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueIzquierda bloqueIzquierda = new BloqueIzquierda();
        BloqueDerecha bloqueDerecha = new BloqueDerecha();
        Posicion posicionOrigen = new Posicion(0,0);

        bloqueIzquierda.ejecutarSobre(personaje);
        bloqueDerecha.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), posicionOrigen);
    }

    @Test
    public void test03MoverAlPersonajeAIzquierdaCincoVecesLoDejaEnLaPosicionMenosCincoYCero(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueIzquierda bloqueIzquierda = new BloqueIzquierda();

        Posicion posicionDestino = new Posicion(-5,0);

        bloqueIzquierda.ejecutarSobre(personaje);
        bloqueIzquierda.ejecutarSobre(personaje);
        bloqueIzquierda.ejecutarSobre(personaje);
        bloqueIzquierda.ejecutarSobre(personaje);
        bloqueIzquierda.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), posicionDestino);
    }
}