package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SectorDibujoTest {

    @Test
    void test01DosTrazosVaciosSonIguales(){
        SectorDibujo primerDibujo = new SectorDibujo();
        SectorDibujo segundoDibujo = new SectorDibujo();

        assertEquals(primerDibujo, segundoDibujo);
    }

    @Test
    void test02TrazoConUnaLineaEsDiferenteAUnTrazoVacio(){
        SectorDibujo primerDibujo = new SectorDibujo();
        SectorDibujo segundoDibujo = new SectorDibujo();

        primerDibujo.agregarTrazo(new Posicion(0,0), new Posicion(0,1));

        assertNotEquals(primerDibujo, segundoDibujo);
    }

    @Test
    void test03DosTrazosConLaMismaLineaSonIgualesIndependientementeDeLaDireccionDeLaMisma(){
        SectorDibujo primerDibujo = new SectorDibujo();
        SectorDibujo segundoDibujo = new SectorDibujo();

        primerDibujo.agregarTrazo(new Posicion(0,0), new Posicion(0,1));
        segundoDibujo.agregarTrazo(new Posicion(0,1), new Posicion(0,0));

        assertEquals(primerDibujo, segundoDibujo);
    }

    @Test
    void test03DosTrazosConLasMismaLineasSonIgualesIndependientementeDeLaDireccionYOrdenDeLasMismas(){
        SectorDibujo primerDibujo = new SectorDibujo();
        SectorDibujo segundoDibujo = new SectorDibujo();

        primerDibujo.agregarTrazo(new Posicion(0,0), new Posicion(0,1));
        primerDibujo.agregarTrazo(new Posicion(0,1), new Posicion(1,1));
        primerDibujo.agregarTrazo(new Posicion(1,1), new Posicion(1,0));
        primerDibujo.agregarTrazo(new Posicion(1,0), new Posicion(0,0));

        segundoDibujo.agregarTrazo(new Posicion(0,1), new Posicion(0,0));
        segundoDibujo.agregarTrazo(new Posicion(1,1), new Posicion(1,0));
        segundoDibujo.agregarTrazo(new Posicion(1,1), new Posicion(0,1));
        segundoDibujo.agregarTrazo(new Posicion(0,0), new Posicion(1,0));

        assertEquals(primerDibujo, segundoDibujo);
    }

    @Test
    void test04DosTrazosConLineasNoConectadasSonIguales(){
        SectorDibujo primerDibujo = new SectorDibujo();
        SectorDibujo segundoDibujo = new SectorDibujo();

        primerDibujo.agregarTrazo(new Posicion(0,0), new Posicion(0,1));
        primerDibujo.agregarTrazo(new Posicion(1,0), new Posicion(1,1));
        primerDibujo.agregarTrazo(new Posicion(2,0), new Posicion(2,1));
        primerDibujo.agregarTrazo(new Posicion(3,0), new Posicion(3,1));

        segundoDibujo.agregarTrazo(new Posicion(2,1), new Posicion(2,0));
        segundoDibujo.agregarTrazo(new Posicion(3,1), new Posicion(3,0));
        segundoDibujo.agregarTrazo(new Posicion(1,1), new Posicion(1,0));
        segundoDibujo.agregarTrazo(new Posicion(0,1), new Posicion(0,0));

        assertEquals(primerDibujo, segundoDibujo);
    }
}