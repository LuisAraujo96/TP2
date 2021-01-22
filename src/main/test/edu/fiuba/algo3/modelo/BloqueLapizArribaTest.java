package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloqueLapizArribaTest {

    @Test
    public void test01CreoUnPersonajeConElLapizArribaYLeOrdenoSubirloIgualmente() {
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        BloqueLapizArriba bloqueLapizArriba = new BloqueLapizArriba();

        bloqueLapizArriba.ejecutarSobre(personaje);
        int resultado = personaje.dibujar();

        assertEquals(0, resultado);
    }

    @Test
    public void test02CreoUnPersonajeConElLapizArribaBajoYSuboSuLapizUsandoBloques() {
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();
        BloqueLapizArriba bloqueLapizArriba = new BloqueLapizArriba();

        bloqueLapizAbajo.ejecutarSobre(personaje);
        bloqueLapizArriba.ejecutarSobre(personaje);
        int resultado = personaje.dibujar();

        assertEquals(0, resultado);
    }

    @Test
    public void test03CreoUnPersonajeYLeOrdenoSubirElLapizDosVeces() {
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        BloqueLapizArriba bloqueLapizArriba = new BloqueLapizArriba();

        bloqueLapizArriba.ejecutarSobre(personaje);
        bloqueLapizArriba.ejecutarSobre(personaje);
        int resultado = personaje.dibujar();

        assertEquals(0, resultado);
    }

    @Test
    public void test04CreoUnPersonajeYLeOrdenoSubirElLapizDosVecesConDosBloquesDistintos() {
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        BloqueLapizArriba bloqueLapizArribaUno = new BloqueLapizArriba();
        BloqueLapizArriba bloqueLapizArribaDos = new BloqueLapizArriba();

        bloqueLapizArribaUno.ejecutarSobre(personaje);
        bloqueLapizArribaDos.ejecutarSobre(personaje);
        int resultado = personaje.dibujar();

        assertEquals(0, resultado);
    }
}