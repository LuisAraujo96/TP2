package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosicionTest {

    @Test
    public void test01CreoDosPosicionesIgualesYLasComparo(){

        Posicion primerPosicion = new Posicion(0, 0);
        Posicion segundaPosicion = new Posicion(0, 0);

        assertTrue(primerPosicion.compararPosiciones(segundaPosicion));
    }

    @Test
    public void test02MoverPosicionCeroYCeroALaDerechaLaDejaEnPosicionUnoYCero(){
        Posicion PosicionInicial = new Posicion(0, 0);
        Posicion PosicionFinal = new Posicion(1, 0);

        PosicionInicial.moverseHaciaDerecha();

        assertTrue(PosicionInicial.compararPosiciones(PosicionFinal));
    }

    @Test
    public void test03MoverPosicionCeroYCeroALaIzquierdaLaDejaEnPosicionMenosUnoYCero(){
        Posicion PosicionInicial = new Posicion(0, 0);
        Posicion PosicionFinal = new Posicion(-1, 0);

        PosicionInicial.moverseHaciaIzquierda();

        assertTrue(PosicionInicial.compararPosiciones(PosicionFinal));
    }

    @Test
    public void test04MoverPosicionCeroYCeroHaciaArribaLaDejaEnPosicionCeroYUno(){
        Posicion PosicionInicial = new Posicion(0, 0);
        Posicion PosicionFinal = new Posicion(0, 1);

        PosicionInicial.moverseHaciaArriba();

        assertTrue(PosicionInicial.compararPosiciones(PosicionFinal));
    }

    @Test
    public void test05MoverPosicionCeroYCeroHaciaAbajoLaDejaEnPosicionCeroYMenosUno(){
        Posicion PosicionInicial = new Posicion(0, 0);
        Posicion PosicionFinal = new Posicion(0, -1);

        PosicionInicial.moverseHaciaAbajo();

        assertTrue(PosicionInicial.compararPosiciones(PosicionFinal));
    }
}