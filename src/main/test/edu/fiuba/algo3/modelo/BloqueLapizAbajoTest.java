package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloqueLapizAbajoTest {

    @Test
    public void test01CreoUnPersonajeConElLapizArribaYBajoSuLapizUsandoElBloqueLapizAbajo(){

        Personaje personaje = new Personaje();
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();

        bloqueLapizAbajo.ejecutar(personaje);

        //Falta corregir estos asserts para hacer buenas pruebas del bloque
        //no se me ocurrio que asserts colocar (pueden completarlos para que queden bien).
    }
}