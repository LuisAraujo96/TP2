package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloqueDerechaTest {

    @Test
    public void test01MoverAlPersonajeADerechaLoDejaEnLaPosicionUnoYCero(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        BloqueDerecha bloqueDerecha = new BloqueDerecha();
        Posicion posicionDestino = new Posicion(1,0);

        bloqueDerecha.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), posicionDestino);
    }

    @Test
    public void test02MoverAlPersonajeADerechaYAIzquierdaLoDejaEnLaPosicionCeroYCero(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        BloqueDerecha bloqueDerecha = new BloqueDerecha();
        BloqueIzquierda bloqueIzquierda = new BloqueIzquierda();
        Posicion posicionOrigen = new Posicion(0,0);

        bloqueDerecha.ejecutarSobre(personaje);
        bloqueIzquierda.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), posicionOrigen);
    }

    @Test
    public void test03MoverAlPersonajeADerechaCincoVecesLoDejaEnLaPosicionCincoYCero(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        BloqueDerecha bloqueDerecha = new BloqueDerecha();

        Posicion posicionDestino = new Posicion(5,0);

        bloqueDerecha.ejecutarSobre(personaje);
        bloqueDerecha.ejecutarSobre(personaje);
        bloqueDerecha.ejecutarSobre(personaje);
        bloqueDerecha.ejecutarSobre(personaje);
        bloqueDerecha.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), posicionDestino);
    }
}