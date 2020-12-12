package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonajeTest {

    @Test
    public void test01CreoUnPersonajePorDefectoConElLapizArriba(){

        Personaje personaje = new Personaje();

        assertEquals(LapizArriba.class,personaje.direccionLapiz().getClass());
    }

}