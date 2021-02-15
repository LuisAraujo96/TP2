package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrazoTest {

    @Test
    void test01DosTrazosVaciosSonIguales(){
        Trazo primerTrazo = new Trazo();
        Trazo segundoTrazo = new Trazo();

        assertEquals(primerTrazo, segundoTrazo);
    }

    @Test
    void test02TrazoConUnaLineaEsDiferenteAUnTrazoVacio(){
        Trazo primerTrazo = new Trazo();
        Trazo segundoTrazo = new Trazo();

        primerTrazo.agregarLinea(new Posicion(0,0), new Posicion(0,1));

        assertNotEquals(primerTrazo, segundoTrazo);
    }

    @Test
    void test03DosTrazosConLaMismaLineaSonIgualesIndependientementeDeLaDireccionDeLaMisma(){
        Trazo primerTrazo = new Trazo();
        Trazo segundoTrazo = new Trazo();

        primerTrazo.agregarLinea(new Posicion(0,0), new Posicion(0,1));
        segundoTrazo.agregarLinea(new Posicion(0,1), new Posicion(0,0));

        assertEquals(primerTrazo, segundoTrazo);
    }

    @Test
    void test03DosTrazosConLasMismaLineasSonIgualesIndependientementeDeLaDireccionYOrdenDeLasMismas(){
        Trazo primerTrazo = new Trazo();
        Trazo segundoTrazo = new Trazo();

        primerTrazo.agregarLinea(new Posicion(0,0), new Posicion(0,1));
        primerTrazo.agregarLinea(new Posicion(0,1), new Posicion(1,1));
        primerTrazo.agregarLinea(new Posicion(1,1), new Posicion(1,0));
        primerTrazo.agregarLinea(new Posicion(1,0), new Posicion(0,0));

        segundoTrazo.agregarLinea(new Posicion(0,1), new Posicion(0,0));
        segundoTrazo.agregarLinea(new Posicion(1,1), new Posicion(1,0));
        segundoTrazo.agregarLinea(new Posicion(1,1), new Posicion(0,1));
        segundoTrazo.agregarLinea(new Posicion(0,0), new Posicion(1,0));

        assertEquals(primerTrazo, segundoTrazo);
    }

    @Test
    void test04DosTrazosConLineasNoConectadasSonIguales(){
        Trazo primerTrazo = new Trazo();
        Trazo segundoTrazo = new Trazo();

        primerTrazo.agregarLinea(new Posicion(0,0), new Posicion(0,1));
        primerTrazo.agregarLinea(new Posicion(1,0), new Posicion(1,1));
        primerTrazo.agregarLinea(new Posicion(2,0), new Posicion(2,1));
        primerTrazo.agregarLinea(new Posicion(3,0), new Posicion(3,1));

        segundoTrazo.agregarLinea(new Posicion(2,1), new Posicion(2,0));
        segundoTrazo.agregarLinea(new Posicion(3,1), new Posicion(3,0));
        segundoTrazo.agregarLinea(new Posicion(1,1), new Posicion(1,0));
        segundoTrazo.agregarLinea(new Posicion(0,1), new Posicion(0,0));

        assertEquals(primerTrazo, segundoTrazo);
    }
}