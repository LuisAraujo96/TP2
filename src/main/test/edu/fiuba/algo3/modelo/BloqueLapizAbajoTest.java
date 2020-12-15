package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloqueLapizAbajoTest {

    @Test
    public void test01CreoUnPersonajeConElLapizArribaYBajoSuLapizUsandoElBloqueLapizAbajo(){

        Personaje personaje = new Personaje();
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();

        bloqueLapizAbajo.ejecutar(personaje);

        assertEquals(LapizAbajo.class,personaje.direccionLapiz().getClass());
    }

    @Test
    public void test02CreoUnPersonajeBajoSuLapizLoSuboYLoVuelvoABajarConBloques(){

        Personaje personaje = new Personaje();
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();
        BloqueLapizArriba bloqueLapizArriba = new BloqueLapizArriba();

        bloqueLapizAbajo.ejecutar(personaje);
        bloqueLapizArriba.ejecutar(personaje);
        bloqueLapizAbajo.ejecutar(personaje);

        assertEquals(LapizAbajo.class,personaje.direccionLapiz().getClass());
    }

    @Test
    public void test03CreoUnPersonajeYLeOrdenoBajarElLapizDosVeces() {

        Personaje personaje = new Personaje();
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();

        bloqueLapizAbajo.ejecutar(personaje);
        bloqueLapizAbajo.ejecutar(personaje);

        assertEquals(LapizAbajo.class, personaje.direccionLapiz().getClass());
    }

    @Test
    public void test04CreoUnPersonajeYLeOrdenoSubirElLapizDosVecesConDosBloquesDistintos() {

        Personaje personaje = new Personaje();
        BloqueLapizAbajo bloqueLapizAbajoUno = new BloqueLapizAbajo();
        BloqueLapizAbajo bloqueLapizAbajoDos = new BloqueLapizAbajo();

        bloqueLapizAbajoUno.ejecutar(personaje);
        bloqueLapizAbajoDos.ejecutar(personaje);

        assertEquals(LapizAbajo.class, personaje.direccionLapiz().getClass());
    }
}