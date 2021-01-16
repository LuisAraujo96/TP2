package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonajeTest {

    @Test
    public void test01UnPersonajeDibujaConElLapizArribaYComoResultadoDevuelve0(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        int resultado = personaje.dibujar();

        assertEquals(0, resultado);
    }

    @Test
    public void test02UnPersonajeSubeSuLapizDibujaConElYComoResultadoDevuelve0(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        personaje.subirLapiz();
        int resultado = personaje.dibujar();

        assertEquals(0, resultado);
    }

    @Test
    public void test03UnPersonajeBajaSuLapizDibujaConElYComoResultadoDevuelve1(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        personaje.bajarLapiz();
        int resultado = personaje.dibujar();

        assertEquals(1, resultado);
    }

    @Test
    public void test04UnPersonajeSubeYBajaSuLapizDibujaConElYComoResultadoDevuelve1(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        personaje.subirLapiz();
        personaje.bajarLapiz();
        int resultado = personaje.dibujar();

        assertEquals(1, resultado);
    }

    @Test
    public void test05UnPersonajeBajaYSubeSuLapizDibujaConElYComoResultadoDevuelve0(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        personaje.bajarLapiz();
        personaje.subirLapiz();
        int resultado = personaje.dibujar();

        assertEquals(0, resultado);
    }

    @Test
    public void test06UnPersonajeSubeBajaYSubeSuLapizDibujaConElYComoResultadoDevuelve0(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        personaje.subirLapiz();
        personaje.bajarLapiz();
        personaje.subirLapiz();
        int resultado = personaje.dibujar();

        assertEquals(0, resultado);
    }

    @Test
    public void test07UnPersonajeBajaSubeYBajaSuLapizDibujaConElYComoResultadoDevuelve1(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        personaje.bajarLapiz();
        personaje.subirLapiz();
        personaje.bajarLapiz();
        int resultado = personaje.dibujar();

        assertEquals(1, resultado);
    }

    @Test
    public void test08LaPosicionObtenidaDeUnPersonajeRecienCreadoEsLaPosicionCeroCero(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        Posicion posicionOrigen = new Posicion(0,0);

        assertEquals(posicionOrigen, personaje.obtenerPosicion());
    }

    @Test
    public void test09LaPosicionObtenidaDelPersonajeLuegoDeDibujarseConUnLapizArribaSeRepresentaConUn0(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        personaje.dibujar();
        Posicion posicionOrigen = personaje.obtenerPosicion();

        assertEquals(0, posicionOrigen.representar());
    }

    @Test
    public void test10LaPosicionObtenidaDelPersonajeLuegoDeSubirElLapizYDibujarlaSeRepresentaConUn0(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        personaje.subirLapiz();
        personaje.dibujar();
        Posicion posicionOrigen = personaje.obtenerPosicion();

        assertEquals(0, posicionOrigen.representar());
    }

    @Test
    public void test11LaPosicionObtenidaDelPersonajeLuegoDeBajarElLapizYDibujarlaSeRepresentaConUn1(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        personaje.bajarLapiz();
        personaje.dibujar();
        Posicion posicionOrigen = personaje.obtenerPosicion();

        assertEquals(1, posicionOrigen.representar());
    }

    @Test
    public void test12LaPosicionObtenidaDeUnPersonajeQueSeMueveHaciaArribaEsLaPosicionCeroUno(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Posicion posicionDestino = new Posicion(0, 1);

        personaje.moverseHaciaArriba();

        assertEquals(posicionDestino, personaje.obtenerPosicion());
    }

    @Test
    public void test13LaPosicionObtenidaDeUnPersonajeQueSeMueveHaciaAbajoEsLaPosicionCeroMenosUno(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Posicion posicionDestino = new Posicion(0, -1);

        personaje.moverseHaciaAbajo();

        assertEquals(posicionDestino, personaje.obtenerPosicion());
    }

    @Test
    public void test14LaPosicionObtenidaDeUnPersonajeQueSeMueveHaciaIzquierdaEsLaPosicionMenosUnoCero(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Posicion posicionDestino = new Posicion(-1, 0);

        personaje.moverseHaciaIzquierda();

        assertEquals(posicionDestino, personaje.obtenerPosicion());
    }

    @Test
    public void test15LaPosicionObtenidaDeUnPersonajeQueSeMueveHaciaDerechaEsLaPosicionUnoCero(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Posicion posicionDestino = new Posicion(1, 0);

        personaje.moverseHaciaDerecha();

        assertEquals(posicionDestino, personaje.obtenerPosicion());
    }

    @Test
    public void test16MuevoElPersonajeHaciaArribaConElLapizArribaYNoDibujaNada(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        int resultado = personaje.moverseHaciaArriba();

        assertEquals(0, resultado);
    }

    @Test
    public void test17MuevoElPersonajeHaciaAbajoConElLapizArribaYNoDibujaNada(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        int resultado = personaje.moverseHaciaAbajo();

        assertEquals(0, resultado);
    }

    @Test
    public void test18MuevoElPersonajeHaciaIzquierdaConElLapizArribaYNoDibujaNada(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        int resultado = personaje.moverseHaciaIzquierda();

        assertEquals(0, resultado);
    }

    @Test
    public void test19MuevoElPersonajeHaciaDerechaConElLapizArribaYNoDibujaNada(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        int resultado = personaje.moverseHaciaDerecha();

        assertEquals(0, resultado);
    }

    @Test
    public void test20MuevoElPersonajeHaciaArribaConElLapizAbajoYSiDibuja(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        personaje.bajarLapiz();
        int resultado = personaje.moverseHaciaArriba();

        assertEquals(1, resultado);
    }

    @Test
    public void test21MuevoElPersonajeHaciaAbajoConElLapizAbajoYSiDibuja(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        personaje.bajarLapiz();
        int resultado = personaje.moverseHaciaAbajo();

        assertEquals(1, resultado);
    }

    @Test
    public void test22MuevoElPersonajeHaciaIzquierdaConElLapizAbajoYSiDibuja(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        personaje.bajarLapiz();
        int resultado = personaje.moverseHaciaIzquierda();

        assertEquals(1, resultado);
    }

    @Test
    public void test23MuevoElPersonajeHaciaDerechaConElLapizAbajoYSiDibuja(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        personaje.bajarLapiz();
        int resultado = personaje.moverseHaciaDerecha();

        assertEquals(1, resultado);
    }
}