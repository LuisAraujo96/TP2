package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloqueLapizArribaTest {

    @Test
    public void test01CreoUnPersonajeConElLapizArribaYLeOrdenoSubirloIgualmente() {

        Lapiz lapiz = new Lapiz();
        Personaje personaje = new Personaje(lapiz);
        BloqueLapizArriba bloqueLapizArriba = new BloqueLapizArriba();

        bloqueLapizArriba.ejecutarSobre(personaje);
        int resultado = personaje.dibujar();

        assertEquals(0, resultado);
    }

    @Test
    public void test02CreoUnPersonajeConElLapizArribaBajoYSuboSuLapizUsandoBloques() {

        Lapiz lapiz = new Lapiz();
        Personaje personaje = new Personaje(lapiz);
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();
        BloqueLapizArriba bloqueLapizArriba = new BloqueLapizArriba();

        bloqueLapizAbajo.ejecutarSobre(personaje);
        bloqueLapizArriba.ejecutarSobre(personaje);
        int resultado = personaje.dibujar();

        assertEquals(0, resultado);
    }

    @Test
    public void test03CreoUnPersonajeYLeOrdenoSubirElLapizDosVeces() {

        Lapiz lapiz = new Lapiz();
        Personaje personaje = new Personaje(lapiz);
        BloqueLapizArriba bloqueLapizArriba = new BloqueLapizArriba();

        bloqueLapizArriba.ejecutarSobre(personaje);
        bloqueLapizArriba.ejecutarSobre(personaje);
        int resultado = personaje.dibujar();

        assertEquals(0, resultado);
    }

    @Test
    public void test04CreoUnPersonajeYLeOrdenoSubirElLapizDosVecesConDosBloquesDistintos() {

        Lapiz lapiz = new Lapiz();
        Personaje personaje = new Personaje(lapiz);
        BloqueLapizArriba bloqueLapizArribaUno = new BloqueLapizArriba();
        BloqueLapizArriba bloqueLapizArribaDos = new BloqueLapizArriba();

        bloqueLapizArribaUno.ejecutarSobre(personaje);
        bloqueLapizArribaDos.ejecutarSobre(personaje);
        int resultado = personaje.dibujar();

        assertEquals(0, resultado);
    }
}