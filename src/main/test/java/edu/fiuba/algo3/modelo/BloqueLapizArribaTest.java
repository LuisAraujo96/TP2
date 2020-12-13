package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloqueLapizArribaTest {

    @Test
    public void test01CreoUnPersonajeConElLapizArribaBajoYSuboSuLapizUsandoBloques() {

        Personaje personaje = new Personaje();
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();
        BloqueLapizArriba bloqueLapizArriba = new BloqueLapizArriba();

        bloqueLapizArriba.ejecutar(personaje);
        bloqueLapizAbajo.ejecutar(personaje);


        assertEquals(LapizAbajo.class,personaje.direccionLapiz().getClass());
    }
}