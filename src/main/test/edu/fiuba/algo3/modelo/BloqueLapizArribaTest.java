package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloqueLapizArribaTest {

    @Test
    public void test01CreoUnPersonajeConElLapizArribaYLeOrdenoSubirloIgualmente() {

        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueLapizArriba bloqueLapizArriba = new BloqueLapizArriba();

        bloqueLapizArriba.ejecutarSobre(personaje);

        assertEquals(LapizArriba.class, personaje.direccionLapiz().getClass());
    }

    @Test
    public void test02CreoUnPersonajeConElLapizArribaBajoYSuboSuLapizUsandoBloques() {

        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();
        BloqueLapizArriba bloqueLapizArriba = new BloqueLapizArriba();

        bloqueLapizAbajo.ejecutarSobre(personaje);
        bloqueLapizArriba.ejecutarSobre(personaje);

        assertEquals(LapizArriba.class, personaje.direccionLapiz().getClass());
    }

    @Test
    public void test03CreoUnPersonajeYLeOrdenoSubirElLapizDosVeces() {

        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueLapizArriba bloqueLapizArriba = new BloqueLapizArriba();

        bloqueLapizArriba.ejecutarSobre(personaje);
        bloqueLapizArriba.ejecutarSobre(personaje);

        assertEquals(LapizArriba.class, personaje.direccionLapiz().getClass());
    }

    @Test
    public void test04CreoUnPersonajeYLeOrdenoSubirElLapizDosVecesConDosBloquesDistintos() {

        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueLapizArriba bloqueLapizArribaUno = new BloqueLapizArriba();
        BloqueLapizArriba bloqueLapizArribaDos = new BloqueLapizArriba();

        bloqueLapizArribaUno.ejecutarSobre(personaje);
        bloqueLapizArribaDos.ejecutarSobre(personaje);

        assertEquals(LapizArriba.class, personaje.direccionLapiz().getClass());
    }
}