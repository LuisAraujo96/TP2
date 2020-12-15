package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonajeTest {

    @Test
    public void test01CreoUnPersonajePorDefectoConElLapizArriba() {

        Personaje personaje = new Personaje();

        assertEquals(LapizArriba.class, personaje.direccionLapiz().getClass());
    }

    @Test
    public void test02CreoUnPersonajeYBajoSuLapiz() {

        Personaje personaje = new Personaje();

        personaje.bajarLapiz();

        assertEquals(LapizAbajo.class, personaje.direccionLapiz().getClass());
    }

    @Test
    public void test03CreoUnPresonajeBajoSuLapizYLoVuelvoASubir() {

        Personaje personaje = new Personaje();

        personaje.bajarLapiz();
        personaje.subirLapiz();

        assertEquals(LapizArriba.class, personaje.direccionLapiz().getClass());
    }

    @Test
    public void test04CreoUnPesonajeNuevoYConsultoSiEstaEnElOrigen(){
        Personaje personaje = new Personaje();
        Posicion origen = new Posicion(0, 0);

        assertTrue((personaje.obtenerPosicion()).compararPosiciones(origen));
    }
    @Test
    public void test05CreoUnPersonajeLoMuevoALaDerechaYCalculoSuPosicion(){
        Personaje personaje = new Personaje();
        Posicion derecha = new Posicion(1, 0);
        personaje.moverseHaciaDerecha();

        assertTrue((personaje.obtenerPosicion()).compararPosiciones(derecha));
    }

    @Test
    public void test06CreoUnPersonajeLoMuevoALaIzquierdaYCalculoSuPosicion(){
        Personaje personaje = new Personaje();
        Posicion izquierda = new Posicion(-1, 0);
        personaje.moverseHaciaIzquierda();

        assertTrue((personaje.obtenerPosicion()).compararPosiciones(izquierda));
    }

    @Test
    public void test07CreoUnPersonajeLoMuevoALaArribaYCalculoSuPosicion(){
        Personaje personaje = new Personaje();
        Posicion arriba = new Posicion(0, 1);
        personaje.moverseHaciaArriba();

        assertTrue((personaje.obtenerPosicion()).compararPosiciones(arriba));
    }

    @Test
    public void test08CreoUnPersonajeLoMuevoALaAbajoYCalculoSuPosicion(){
        Personaje personaje = new Personaje();
        Posicion abajo = new Posicion(0, -1);
        personaje.moverseHaciaAbajo();

        assertTrue((personaje.obtenerPosicion()).compararPosiciones(abajo));
    }

    /*@Test
    public void test04ConsultoLaPosicionInicialDeUnPersonaje() {

        Personaje personaje = new Personaje();

        assertEquals(Centro.class, personaje.consultarPosicion().getClass());
    }

    @Test
    public void test05HagoQueUnPersonajeSeMuevaHaciaArriba() {

        Personaje personaje = new Personaje();

        personaje.moverseHaciaArriba();

        assertEquals(Arriba.class, personaje.consultarPosicion().getClass());
    }

    @Test
    public void test06HagoQueUnPersonajeSeMuevaHaciaAbajo() {

        Personaje personaje = new Personaje();

        personaje.moverseHaciaAbajo();

        assertEquals(Abajo.class, personaje.consultarPosicion().getClass());
    }

    @Test
    public void test07HagoQueUnPersonajeSeMuevaHaciaDerecha() {

        Personaje personaje = new Personaje();

        personaje.moverseHaciaDerecha();

        assertEquals(Derecha.class, personaje.consultarPosicion().getClass());
    }

    @Test
    public void test08HagoQueUnPersonajeSeMuevaHaciaIzquierda() {

        Personaje personaje = new Personaje();

        personaje.moverseHaciaIzquierda();

        assertEquals(Izquierda.class, personaje.consultarPosicion().getClass());
    }*/
}
