package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BloqueIzquierdaTest {

    @Test
    public void test01PersonajeEjecutaBloqueIzquierdaYSuPosicionEsLaCorrecta(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueIzquierda bloque = new BloqueIzquierda();
        Posicion posicion = new Posicion(-1,0);

        bloque.ejecutarSobre(personaje);

        assertTrue(personaje.obtenerPosicion().compararPosiciones(posicion));
    }

    @Test
    public void test02PersonajeEjecutaBloqueIzquierdaLuegoBloqueDerechaYSuPosicionDebeSer00(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueIzquierda bloqueIzq = new BloqueIzquierda();
        BloqueDerecha bloqueDer = new BloqueDerecha();
        Posicion posicion = new Posicion(0,0);

        bloqueIzq.ejecutarSobre(personaje);
        bloqueDer.ejecutarSobre(personaje);

        assertTrue(personaje.obtenerPosicion().compararPosiciones(posicion));
    }

    @Test
    public void test03EjecutarCincoVecesBloqueIzquierdaDejaAlPersonajeEnLaPosicionMenosCincoYCero(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueIzquierda bloqueIzq = new BloqueIzquierda();

        Posicion posicionFinal = new Posicion(-5,0);

        bloqueIzq.ejecutarSobre(personaje);
        bloqueIzq.ejecutarSobre(personaje);
        bloqueIzq.ejecutarSobre(personaje);
        bloqueIzq.ejecutarSobre(personaje);
        bloqueIzq.ejecutarSobre(personaje);

        assertTrue(personaje.obtenerPosicion().compararPosiciones(posicionFinal));
    }
}
