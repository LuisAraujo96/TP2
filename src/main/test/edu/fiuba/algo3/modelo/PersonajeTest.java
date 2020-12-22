package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonajeTest {

    @Test
    public void test01CreoUnPersonajePorDefectoConElLapizArriba() {

        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        assertEquals(LapizArriba.class, personaje.lapiz().getClass());
    }

    @Test
    public void test02CreoUnPersonajeYBajoSuLapiz() {

        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        personaje.bajarLapiz();

        assertEquals(LapizAbajo.class, personaje.lapiz().getClass());
    }

    @Test
    public void test03CreoUnPresonajeBajoSuLapizYLoVuelvoASubir() {

        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        personaje.bajarLapiz();
        personaje.subirLapiz();

        assertEquals(LapizArriba.class, personaje.lapiz().getClass());
    }

    @Test
    public void test04CreoUnPesonajeNuevoYConsultoSiEstaEnElOrigen(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Posicion posicionOrigen = new Posicion(0, 0);

        assertEquals(personaje.obtenerPosicion(), posicionOrigen);
    }
    @Test
    public void test05CreoUnPersonajeLoMuevoALaDerechaYCalculoSuPosicion(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Posicion posicionDestino = new Posicion(1, 0);
        personaje.moverseHaciaDerecha();

        assertEquals(personaje.obtenerPosicion(), posicionDestino);
    }

    @Test
    public void test06CreoUnPersonajeLoMuevoALaIzquierdaYCalculoSuPosicion(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Posicion posicionDestino = new Posicion(-1, 0);
        personaje.moverseHaciaIzquierda();

        assertEquals(personaje.obtenerPosicion(), posicionDestino);
    }

    @Test
    public void test07CreoUnPersonajeLoMuevoALaArribaYCalculoSuPosicion(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Posicion posicionDestino = new Posicion(0, 1);
        personaje.moverseHaciaArriba();

        assertEquals(personaje.obtenerPosicion(), posicionDestino);
    }

    @Test
    public void test08CreoUnPersonajeLoMuevoALaAbajoYCalculoSuPosicion(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Posicion posicionDestino = new Posicion(0, -1);
        personaje.moverseHaciaAbajo();

        assertEquals(personaje.obtenerPosicion(), posicionDestino);
    }

    @Test
    public void test09MuevoElPersonajeHaciaArribaConElLapizArribaYNoDibujaNada(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        int resultado = personaje.moverseHaciaArriba();

        assertEquals(0, resultado);
    }

    @Test
    public void test10MuevoElPersonajeHaciaAbajoConElLapizArribaYNoDibujaNada(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        int resultado = personaje.moverseHaciaAbajo();

        assertEquals(0, resultado);
    }

    @Test
    public void test11MuevoElPersonajeHaciaArribaConElLapizAbajoYSiDibuja(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        personaje.bajarLapiz();
        int resultado = personaje.moverseHaciaArriba();

        assertEquals(1, resultado);
    }

    @Test
    public void test12MuevoElPersonajeHaciaAbajoConElLapizAbajoYSiDibuja(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);

        personaje.bajarLapiz();
        int resultado = personaje.moverseHaciaAbajo();

        assertEquals(1, resultado);
    }
}
