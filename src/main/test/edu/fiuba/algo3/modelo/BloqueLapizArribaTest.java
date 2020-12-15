package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloqueLapizArribaTest {

    @Test
    public void test01CreoUnPersonajeConElLapizArribaYLeOrdenoSubirloIgualmente() {

        Personaje personaje = new Personaje();
        BloqueLapizArriba bloqueLapizArriba = new BloqueLapizArriba();

        bloqueLapizArriba.ejecutar(personaje);

        assertEquals(LapizArriba.class, personaje.direccionLapiz().getClass());
    }

    @Test
    public void test02CreoUnPersonajeConElLapizArribaBajoYSuboSuLapizUsandoBloques() {

        Personaje personaje = new Personaje();
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();
        BloqueLapizArriba bloqueLapizArriba = new BloqueLapizArriba();

        bloqueLapizAbajo.ejecutar(personaje);
        bloqueLapizArriba.ejecutar(personaje);

        assertEquals(LapizArriba.class, personaje.direccionLapiz().getClass());
    }

    @Test
    public void test03CreoUnPersonajeYLeOrdenoSubirElLapizDosVeces() {

        Personaje personaje = new Personaje();
        BloqueLapizArriba bloqueLapizArriba = new BloqueLapizArriba();

        bloqueLapizArriba.ejecutar(personaje);
        bloqueLapizArriba.ejecutar(personaje);

        assertEquals(LapizArriba.class, personaje.direccionLapiz().getClass());
    }

    @Test
    public void test04CreoUnPersonajeYLeOrdenoSubirElLapizDosVecesConDosBloquesDistintos() {

        Personaje personaje = new Personaje();
        BloqueLapizArriba bloqueLapizArribaUno = new BloqueLapizArriba();
        BloqueLapizArriba bloqueLapizArribaDos = new BloqueLapizArriba();

        bloqueLapizArribaUno.ejecutar(personaje);
        bloqueLapizArribaDos.ejecutar(personaje);

        assertEquals(LapizArriba.class, personaje.direccionLapiz().getClass());
    }
}