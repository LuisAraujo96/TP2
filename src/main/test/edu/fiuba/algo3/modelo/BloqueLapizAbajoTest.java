package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloqueLapizAbajoTest {

    @Test
    public void test01CreoUnPersonajeConElLapizArribaYBajoSuLapizUsandoElBloqueLapizAbajo(){

        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();

        bloqueLapizAbajo.ejecutarSobre(personaje);

        assertEquals(LapizAbajo.class,personaje.direccionLapiz().getClass());
    }

    @Test
    public void test02CreoUnPersonajeBajoSuLapizLoSuboYLoVuelvoABajarConBloques(){

        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();
        BloqueLapizArriba bloqueLapizArriba = new BloqueLapizArriba();

        bloqueLapizAbajo.ejecutarSobre(personaje);
        bloqueLapizArriba.ejecutarSobre(personaje);
        bloqueLapizAbajo.ejecutarSobre(personaje);

        assertEquals(LapizAbajo.class,personaje.direccionLapiz().getClass());
    }

    @Test
    public void test03CreoUnPersonajeYLeOrdenoBajarElLapizDosVeces() {

        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();

        bloqueLapizAbajo.ejecutarSobre(personaje);
        bloqueLapizAbajo.ejecutarSobre(personaje);

        assertEquals(LapizAbajo.class, personaje.direccionLapiz().getClass());
    }

    @Test
    public void test04CreoUnPersonajeYLeOrdenoBajarElLapizDosVecesConDosBloquesDistintos() {

        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueLapizAbajo bloqueLapizAbajoUno = new BloqueLapizAbajo();
        BloqueLapizAbajo bloqueLapizAbajoDos = new BloqueLapizAbajo();

        bloqueLapizAbajoUno.ejecutarSobre(personaje);
        bloqueLapizAbajoDos.ejecutarSobre(personaje);

        assertEquals(LapizAbajo.class, personaje.direccionLapiz().getClass());
    }
}