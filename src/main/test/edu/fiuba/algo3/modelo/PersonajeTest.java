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
        Direccion arriba = new DireccionArriba();

        personaje.moverseHacia(arriba);

        assertEquals(posicionDestino, personaje.obtenerPosicion());
    }

    @Test
    public void test13LaPosicionObtenidaDeUnPersonajeQueSeMueveHaciaAbajoEsLaPosicionCeroMenosUno(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Posicion posicionDestino = new Posicion(0, -1);
        Direccion abajo = new DireccionAbajo();

        personaje.moverseHacia(abajo);

        assertEquals(posicionDestino, personaje.obtenerPosicion());
    }

    @Test
    public void test14LaPosicionObtenidaDeUnPersonajeQueSeMueveHaciaIzquierdaEsLaPosicionMenosUnoCero(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Posicion posicionDestino = new Posicion(-1, 0);
        Direccion izquierda = new DireccionIzquierda();

        personaje.moverseHacia(izquierda);

        assertEquals(posicionDestino, personaje.obtenerPosicion());
    }

    @Test
    public void test15LaPosicionObtenidaDeUnPersonajeQueSeMueveHaciaDerechaEsLaPosicionUnoCero(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Posicion posicionDestino = new Posicion(1, 0);
        Direccion derecha = new DireccionDerecha();

        personaje.moverseHacia(derecha);

        assertEquals(posicionDestino, personaje.obtenerPosicion());
    }

    @Test
    public void test16MuevoElPersonajeHaciaArribaConElLapizArribaYNoDibujaNada(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Direccion arriba = new DireccionArriba();

        int resultado = personaje.moverseHacia(arriba);

        assertEquals(0, resultado);
    }

    @Test
    public void test17MuevoElPersonajeHaciaAbajoConElLapizArribaYNoDibujaNada(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Direccion abajo = new DireccionAbajo();

        int resultado = personaje.moverseHacia(abajo);

        assertEquals(0, resultado);
    }

    @Test
    public void test18MuevoElPersonajeHaciaIzquierdaConElLapizArribaYNoDibujaNada(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Direccion izquierda = new DireccionIzquierda();

        int resultado = personaje.moverseHacia(izquierda);

        assertEquals(0, resultado);
    }

    @Test
    public void test19MuevoElPersonajeHaciaDerechaConElLapizArribaYNoDibujaNada(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Direccion derecha = new DireccionDerecha();

        int resultado = personaje.moverseHacia(derecha);

        assertEquals(0, resultado);
    }

    @Test
    public void test20MuevoElPersonajeHaciaArribaConElLapizAbajoYSiDibuja(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Direccion arriba = new DireccionArriba();

        personaje.bajarLapiz();
        int resultado = personaje.moverseHacia(arriba);

        assertEquals(1, resultado);
    }

    @Test
    public void test21MuevoElPersonajeHaciaAbajoConElLapizAbajoYSiDibuja(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Direccion abajo = new DireccionAbajo();

        personaje.bajarLapiz();
        int resultado = personaje.moverseHacia(abajo);

        assertEquals(1, resultado);
    }

    @Test
    public void test22MuevoElPersonajeHaciaIzquierdaConElLapizAbajoYSiDibuja(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Direccion izquierda = new DireccionIzquierda();

        personaje.bajarLapiz();
        int resultado = personaje.moverseHacia(izquierda);

        assertEquals(1, resultado);
    }

    @Test
    public void test23MuevoElPersonajeHaciaDerechaConElLapizAbajoYSiDibuja(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Direccion derecha = new DireccionDerecha();

        personaje.bajarLapiz();
        int resultado = personaje.moverseHacia(derecha);

        assertEquals(1, resultado);
    }
}