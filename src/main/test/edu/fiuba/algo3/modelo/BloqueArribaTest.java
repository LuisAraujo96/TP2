package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Bloques.BloqueAbajo;
import edu.fiuba.algo3.modelo.Bloques.BloqueArriba;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.Lapiz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BloqueArribaTest {

    @Test
    public void test01MoverAlPersonajeArribaLoDejaEnLaPosicionCeroYUno(){
        Personaje personaje = new Personaje(new Lapiz(new SectorDibujo()));
        BloqueArriba bloqueArriba = new BloqueArriba();
        Posicion posicionDestino = new Posicion(0,1);

        bloqueArriba.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), posicionDestino);
    }

    @Test
    public void test02MoverAlPersonajeArribaYAbajoLoDejaEnLaPosicionCeroYCero(){
        Personaje personaje = new Personaje(new Lapiz(new SectorDibujo()));
        BloqueArriba bloqueArriba = new BloqueArriba();
        BloqueAbajo bloqueAbajo = new BloqueAbajo();
        Posicion posicionOrigen = new Posicion(0,0);

        bloqueArriba.ejecutarSobre(personaje);
        bloqueAbajo.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), posicionOrigen);
    }

    @Test
    public void test03MoverAlPersonajeArribaCincoVecesLoDejaEnLaPosicionCeroYCinco(){
        Personaje personaje = new Personaje(new Lapiz(new SectorDibujo()));
        BloqueArriba bloqueArriba = new BloqueArriba();

        Posicion posicionDestino = new Posicion(0,5);

        bloqueArriba.ejecutarSobre(personaje);
        bloqueArriba.ejecutarSobre(personaje);
        bloqueArriba.ejecutarSobre(personaje);
        bloqueArriba.ejecutarSobre(personaje);
        bloqueArriba.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), posicionDestino);
    }
}