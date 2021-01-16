package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosicionTest {

    @Test
    public void test01CreoDosPosicionesIgualesYLasComparo(){

        Posicion primerPosicion = new Posicion(0, 0);
        Posicion segundaPosicion = new Posicion(0, 0);

        assertEquals(primerPosicion, segundaPosicion);
    }

    @Test
    public void test02MoverPosicionCeroYCeroALaDerechaLaDejaEnPosicionUnoYCero(){
        Posicion PosicionInicial = new Posicion(0, 0);
        Posicion PosicionFinal = new Posicion(1, 0);

        PosicionInicial.moverseHaciaDerecha();

        assertEquals(PosicionInicial, PosicionFinal);
    }

    @Test
    public void test03MoverPosicionCeroYCeroALaIzquierdaLaDejaEnPosicionMenosUnoYCero(){
        Posicion PosicionInicial = new Posicion(0, 0);
        Posicion PosicionFinal = new Posicion(-1, 0);

        PosicionInicial.moverseHaciaIzquierda();

        assertEquals(PosicionInicial, PosicionFinal);
    }

    @Test
    public void test04MoverPosicionCeroYCeroHaciaArribaLaDejaEnPosicionCeroYUno(){
        Posicion PosicionInicial = new Posicion(0, 0);
        Posicion PosicionFinal = new Posicion(0, 1);

        PosicionInicial.moverseHaciaArriba();

        assertEquals(PosicionInicial, PosicionFinal);
    }

    @Test
    public void test05MoverPosicionCeroYCeroHaciaAbajoLaDejaEnPosicionCeroYMenosUno(){
        Posicion PosicionInicial = new Posicion(0, 0);
        Posicion PosicionFinal = new Posicion(0, -1);

        PosicionInicial.moverseHaciaAbajo();

        assertEquals(PosicionInicial, PosicionFinal);
    }

    @Test
    public void test06PosicionCeroYCeroSeMueveTresVecesHaciaLaDerechaYDosVecesArribaYTerminaEnLaPosicionTresYDos(){
        Posicion PosicionInicial = new Posicion(0, 0);
        Posicion PosicionFinal = new Posicion(3, 2);

        PosicionInicial.moverseHaciaDerecha();
        PosicionInicial.moverseHaciaDerecha();
        PosicionInicial.moverseHaciaDerecha();
        PosicionInicial.moverseHaciaArriba();
        PosicionInicial.moverseHaciaArriba();

        assertEquals(PosicionInicial, PosicionFinal);
    }

    @Test
    public void test07PosicionCuatroYUnoSeMueveCuatroVecesHaciaLaIzquierdaYUnaVezHaciaAbajoYTerminaEnLaPosicionCeroYCero(){
        Posicion PosicionInicial = new Posicion(4, 1);
        Posicion PosicionFinal = new Posicion(0, 0);

        PosicionInicial.moverseHaciaIzquierda();
        PosicionInicial.moverseHaciaIzquierda();
        PosicionInicial.moverseHaciaIzquierda();
        PosicionInicial.moverseHaciaIzquierda();
        PosicionInicial.moverseHaciaAbajo();

        assertEquals(PosicionInicial, PosicionFinal);
    }
}