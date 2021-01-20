package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloqueLapizAbajoTest {

    @Test
    public void test01CreoUnPersonajeConElLapizArribaYBajoSuLapizUsandoElBloqueLapizAbajo(){

        Lapiz lapiz = new Lapiz();
        Personaje personaje = new Personaje(lapiz);
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();

        bloqueLapizAbajo.ejecutarSobre(personaje);
        int resultado = personaje.dibujar();

        assertEquals(1, resultado);
    }

    @Test
    public void test02CreoUnPersonajeBajoSuLapizLoSuboYLoVuelvoABajarConBloques(){

        Lapiz lapiz = new Lapiz();
        Personaje personaje = new Personaje(lapiz);
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();
        BloqueLapizArriba bloqueLapizArriba = new BloqueLapizArriba();

        bloqueLapizAbajo.ejecutarSobre(personaje);
        bloqueLapizArriba.ejecutarSobre(personaje);
        bloqueLapizAbajo.ejecutarSobre(personaje);
        int resultado = personaje.dibujar();

        assertEquals(1, resultado);
    }

    @Test
    public void test03CreoUnPersonajeYLeOrdenoBajarElLapizDosVeces() {

        Lapiz lapiz = new Lapiz();
        Personaje personaje = new Personaje(lapiz);
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();

        bloqueLapizAbajo.ejecutarSobre(personaje);
        bloqueLapizAbajo.ejecutarSobre(personaje);
        int resultado = personaje.dibujar();

        assertEquals(1, resultado);
    }

    @Test
    public void test04CreoUnPersonajeYLeOrdenoBajarElLapizDosVecesConDosBloquesDistintos() {

        Lapiz lapiz = new Lapiz();
        Personaje personaje = new Personaje(lapiz);
        BloqueLapizAbajo bloqueLapizAbajoUno = new BloqueLapizAbajo();
        BloqueLapizAbajo bloqueLapizAbajoDos = new BloqueLapizAbajo();

        bloqueLapizAbajoUno.ejecutarSobre(personaje);
        bloqueLapizAbajoDos.ejecutarSobre(personaje);
        int resultado = personaje.dibujar();

        assertEquals(1, resultado);
    }
}