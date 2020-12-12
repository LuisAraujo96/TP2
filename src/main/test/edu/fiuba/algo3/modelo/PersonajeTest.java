package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonajeTest {

    @Test
    public void test01CreoUnPersonajePorDefectoConElLapizArriba(){

        Personaje personaje = new Personaje();

        //Falta corregir estos asserts para hacer buenas pruebas del personaje
        //como los metodos del personaje no devuelven nada todavía no se me ocurrio
        //que asserts colocar (pueden completarlos para que queden bien).
        assertEquals(personaje, personaje);
        assertSame(personaje, personaje);
    }

}