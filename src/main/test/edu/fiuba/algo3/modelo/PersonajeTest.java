package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
