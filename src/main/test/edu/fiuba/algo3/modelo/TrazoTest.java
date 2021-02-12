package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Posiciones.Posicion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrazoTest {

    @Test
    void testAgregarLinea() {
        Trazo trazo1 = new Trazo();
        Trazo trazo2 = new Trazo();

        trazo1.agregarLinea(new Posicion(0,0), new Posicion(0,1));

        trazo2.agregarLinea(new Posicion(0,1), new Posicion(0,0));

        assertEquals(trazo1, trazo2);
    }
}