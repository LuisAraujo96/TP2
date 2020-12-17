package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BloqueArribaTest {

    @Test
    public void test01PersonajeEjecutaBloqueArribaYSuPosicionEsLaCorrecta(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueArriba bloque = new BloqueArriba();
        Posicion posicion = new Posicion(0,1);

        bloque.ejecutarSobre(personaje);

        assertTrue(personaje.obtenerPosicion().compararPosiciones(posicion));
    }

    @Test
    public void test02EjecutarBloqueArribaYBloqueAbajoSobreUnPersonajeLoDejaEnLaPosicionInicial(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueArriba bloqueArriba = new BloqueArriba();
        BloqueAbajo bloqueAbajo = new BloqueAbajo();
        Posicion posicion = new Posicion(0,0);

        bloqueArriba.ejecutarSobre(personaje);
        bloqueAbajo.ejecutarSobre(personaje);


        assertTrue(personaje.obtenerPosicion().compararPosiciones(posicion));
    }

    @Test
    public void test03EjecutarCincoVecesBloqueArribaDejaAlPersonajeEnLaPosicionCeroYCinco(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueArriba bloque = new BloqueArriba();

        Posicion posicionFinal = new Posicion(0,5);

        bloque.ejecutarSobre(personaje);
        bloque.ejecutarSobre(personaje);
        bloque.ejecutarSobre(personaje);
        bloque.ejecutarSobre(personaje);
        bloque.ejecutarSobre(personaje);

        assertTrue(personaje.obtenerPosicion().compararPosiciones(posicionFinal));
    }
}