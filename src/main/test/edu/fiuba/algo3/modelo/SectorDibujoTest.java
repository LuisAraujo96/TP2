package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SectorDibujoTest {

    @Test
    public void test01AlCrearseElSectorDibujoLaPosicionInicialDelPersonajeEsLaPosicionCeroCero(){

        Posicion posicionInicial = new Posicion(0, 0);
        SectorDibujo sectorDibujo = new SectorDibujo();

        Posicion posicionOrigen = sectorDibujo.obtenerPosicionDelPersonaje();

        assertEquals(posicionInicial, posicionOrigen);
    }

    @Test
    public void test02MoverAlPersonajeDesdeLaPosicionCeroCeroHaciaArribaLoDejaEnLaPosicionCeroUno(){

        Posicion posicionFinal = new Posicion(0, 1);
        SectorDibujo sectorDibujo = new SectorDibujo();
        Direccion arriba = new DireccionArriba();

        sectorDibujo.cambiarPosicionDePersonajeHacia(arriba);
        Posicion posicionDestino = sectorDibujo.obtenerPosicionDelPersonaje();

        assertEquals(posicionFinal, posicionDestino);
    }

    @Test
    public void test03MoverAlPersonajeDesdeLaPosicionCeroCeroHaciaAbajoLoDejaEnLaPosicionCeroMenosUno(){
        Posicion posicionFinal = new Posicion(0, -1);
        SectorDibujo sectorDibujo = new SectorDibujo();
        Direccion abajo = new DireccionAbajo();

        sectorDibujo.cambiarPosicionDePersonajeHacia(abajo);
        Posicion posicionDestino = sectorDibujo.obtenerPosicionDelPersonaje();

        assertEquals(posicionFinal, posicionDestino);
    }

    @Test
    public void test04MoverAlPersonajeDesdeLaPosicionCeroCeroAIzquierdaLoDejaEnLaPosicionMenosUnoCero(){
        Posicion posicionFinal = new Posicion(-1, 0);
        SectorDibujo sectorDibujo = new SectorDibujo();
        Direccion izquierda = new DireccionIzquierda();

        sectorDibujo.cambiarPosicionDePersonajeHacia(izquierda);
        Posicion posicionDestino = sectorDibujo.obtenerPosicionDelPersonaje();

        assertEquals(posicionFinal, posicionDestino);
    }

    @Test
    public void test05MoverAlPersonajeDesdeLaPosicionCeroCeroADerechaLoDejaEnLaPosicionUnoCero(){
        Posicion posicionFinal = new Posicion(1, 0);
        SectorDibujo sectorDibujo = new SectorDibujo();
        Direccion derecha = new DireccionDerecha();

        sectorDibujo.cambiarPosicionDePersonajeHacia(derecha);
        Posicion posicionDestino = sectorDibujo.obtenerPosicionDelPersonaje();

        assertEquals(posicionFinal, posicionDestino);
    }

    @Test
    public void test06MoverAlPersonajeDesdeLaPosicion10Y0ADerechaLoDejaEnLaPosicion10NegativoY0(){
        Posicion posicionFinal = new Posicion(-10, 0);
        Personaje personaje = new Personaje(new Lapiz());
        //LLega a (10,0) y luego se mueve una ves mas a la derecha
        BloqueRepetidor bloqueRepetidor = new BloqueRepetidor(11);
        bloqueRepetidor.agregarBloque(new BloqueDerecha());
        bloqueRepetidor.ejecutarSobre(personaje);

        assertEquals(posicionFinal, personaje.obtenerPosicion());
    }

    @Test
    public void test07MoverAlPersonajeDesdeLaPosicion0Y10ArribaLoDejaEnLaPosicion0Y10Negativo(){
        Posicion posicionFinal = new Posicion(0, -10);
        Personaje personaje = new Personaje(new Lapiz());
        //LLega a (0,10) y luego se mueve una ves mas arriba
        BloqueRepetidor bloqueRepetidor = new BloqueRepetidor(11);
        bloqueRepetidor.agregarBloque(new BloqueArriba());
        bloqueRepetidor.ejecutarSobre(personaje);

        assertEquals(posicionFinal, personaje.obtenerPosicion());
    }

    @Test
    public void test08MoverAlPersonajeDesdeLaPosicion10NegativoY0ALaIzquierdaLoDejaEnLaPosicion10Y0(){
        Posicion posicionFinal = new Posicion(10, 0);
        Personaje personaje = new Personaje(new Lapiz());
        //LLega a (-10,0) y luego se mueve una ves mas a la izquierda
        BloqueRepetidor bloqueRepetidor = new BloqueRepetidor(10);
        bloqueRepetidor.agregarBloque(new BloqueIzquierda());
        bloqueRepetidor.ejecutarSobre(personaje);
        BloqueIzquierda bloqueIzquierda = new BloqueIzquierda();
        bloqueIzquierda.ejecutarSobre(personaje);

        assertEquals(posicionFinal, personaje.obtenerPosicion());
    }

}