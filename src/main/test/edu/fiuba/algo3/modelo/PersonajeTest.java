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
        Posicion origen = new Posicion(0, 0);

        assertTrue((personaje.obtenerPosicion()).compararPosiciones(origen));
    }
    @Test
    public void test05CreoUnPersonajeLoMuevoALaDerechaYCalculoSuPosicion(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Posicion derecha = new Posicion(1, 0);
        personaje.moverseHaciaDerecha();

        assertTrue((personaje.obtenerPosicion()).compararPosiciones(derecha));
    }

    @Test
    public void test06CreoUnPersonajeLoMuevoALaIzquierdaYCalculoSuPosicion(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Posicion izquierda = new Posicion(-1, 0);
        personaje.moverseHaciaIzquierda();

        assertTrue((personaje.obtenerPosicion()).compararPosiciones(izquierda));
    }

    @Test
    public void test07CreoUnPersonajeLoMuevoALaArribaYCalculoSuPosicion(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Posicion arriba = new Posicion(0, 1);
        personaje.moverseHaciaArriba();

        assertTrue((personaje.obtenerPosicion()).compararPosiciones(arriba));
    }

    @Test
    public void test08CreoUnPersonajeLoMuevoALaAbajoYCalculoSuPosicion(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        Posicion abajo = new Posicion(0, -1);
        personaje.moverseHaciaAbajo();

        assertTrue((personaje.obtenerPosicion()).compararPosiciones(abajo));
    }
}
