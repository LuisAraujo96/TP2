package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BloqueAbajoTest {

    @Test
        public void test01MoverAlPersonajeAbajoLoDejaEnLaPosicionCeroYMenosUno(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueAbajo bloqueAbajo = new BloqueAbajo();
        Posicion posicionDestino = new Posicion(0,-1);

        bloqueAbajo.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), posicionDestino);
    }

    @Test
    public void test02MoverAlPersonajeAbajoYArribaLoDejaEnLaPosicionCeroYCero(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueAbajo bloqueAbajo = new BloqueAbajo();
        BloqueArriba bloqueArriba = new BloqueArriba();
        Posicion posicionOrigen = new Posicion(0,0);

        bloqueAbajo.ejecutarSobre(personaje);
        bloqueArriba.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), posicionOrigen);
    }

    @Test
    public void test03MoverAlPersonajeAbajoCincoVecesLoDejaEnLaPosicionCeroYMenosCinco(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueAbajo bloqueAbajo = new BloqueAbajo();

        Posicion posicionDestino = new Posicion(0,-5);

        bloqueAbajo.ejecutarSobre(personaje);
        bloqueAbajo.ejecutarSobre(personaje);
        bloqueAbajo.ejecutarSobre(personaje);
        bloqueAbajo.ejecutarSobre(personaje);
        bloqueAbajo.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), posicionDestino);
    }
}