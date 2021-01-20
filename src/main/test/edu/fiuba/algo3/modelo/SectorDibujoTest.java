package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SectorDibujoTest {

    @Test
    public void test01AlCrearseElSectorDibujoLaPosicionInicialDelPersonajeEsLaPosicionCeroCero(){

        Posicion posicionInicial = new Posicion(0, 0);
        SectorDibujo sectorDibujo = new SectorDibujo();

        Posicion posicionOrigen = sectorDibujo.obtenerPosicionDelPersonaje();

        assertEquals(posicionInicial, posicionOrigen);
    }

    @Test
    public void test02MoverAlPersonajeDesdeLaPosicionCeroCeroHaciaArribaLoDejaEnLaPosicionCeroUno(){

        Posicion posicionFinal = new Posicion(0, 1);
        SectorDibujo sectorDibujo = new SectorDibujo();
        Direccion arriba = new DireccionArriba();

        sectorDibujo.cambiarPosicionDePersonajeHacia(arriba);
        Posicion posicionDestino = sectorDibujo.obtenerPosicionDelPersonaje();

        assertEquals(posicionFinal, posicionDestino);
    }

    @Test
    public void test03MoverAlPersonajeDesdeLaPosicionCeroCeroHaciaAbajoLoDejaEnLaPosicionCeroMenosUno(){
        Posicion posicionFinal = new Posicion(0, -1);
        SectorDibujo sectorDibujo = new SectorDibujo();
        Direccion abajo = new DireccionAbajo();

        sectorDibujo.cambiarPosicionDePersonajeHacia(abajo);
        Posicion posicionDestino = sectorDibujo.obtenerPosicionDelPersonaje();

        assertEquals(posicionFinal, posicionDestino);
    }

    @Test
    public void test04MoverAlPersonajeDesdeLaPosicionCeroCeroAIzquierdaLoDejaEnLaPosicionMenosUnoCero(){
        Posicion posicionFinal = new Posicion(-1, 0);
        SectorDibujo sectorDibujo = new SectorDibujo();
        Direccion izquierda = new DireccionIzquierda();

        sectorDibujo.cambiarPosicionDePersonajeHacia(izquierda);
        Posicion posicionDestino = sectorDibujo.obtenerPosicionDelPersonaje();

        assertEquals(posicionFinal, posicionDestino);
    }

    @Test
    public void test05MoverAlPersonajeDesdeLaPosicionCeroCeroADerechaLoDejaEnLaPosicionUnoCero(){
        Posicion posicionFinal = new Posicion(1, 0);
        SectorDibujo sectorDibujo = new SectorDibujo();
        Direccion derecha = new DireccionDerecha();

        sectorDibujo.cambiarPosicionDePersonajeHacia(derecha);
        Posicion posicionDestino = sectorDibujo.obtenerPosicionDelPersonaje();

        assertEquals(posicionFinal, posicionDestino);
    }
}