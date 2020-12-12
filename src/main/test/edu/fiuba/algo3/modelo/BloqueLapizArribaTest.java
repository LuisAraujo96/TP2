package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloqueLapizArribaTest {

    @Test
    public void test01CreoUnPersonajeConElLapizArribaBajoYSuboSuLapizUsandoBloques(){

        Personaje personaje = new Personaje();
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();
        BloqueLapizArriba bloqueLapizArriba = new BloqueLapizArriba();

        bloqueLapizAbajo.ejecutar(personaje);
        bloqueLapizArriba.ejecutar(personaje);

        //Falta corregir estos asserts para hacer buenas pruebas del bloque
        //no se me ocurrio que asserts colocar (pueden completarlos para que queden bien).
}