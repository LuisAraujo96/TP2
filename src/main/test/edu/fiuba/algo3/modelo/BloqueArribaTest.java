package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BloqueArribaTest {

    @Test
    public void test01PersonajeEjecutaBloqueArribaYSuPosicionEsLaCorrecta(){
        Personaje personaje = new Personaje();
        BloqueArriba bloque = new BloqueArriba();
        Posicion posicion = new Posicion(0,1);

        bloque.ejecutar(personaje);

        assertTrue(personaje.obtenerPosicion().compararPosiciones(posicion));
    }

    @Test
    public void test02EjecutarBloqueArribaYBloqueAbajoSobreUnPersonajeLoDejaEnLaPosicionInicial(){
        Personaje personaje = new Personaje();
        BloqueArriba bloqueArriba = new BloqueArriba();
        BloqueAbajo bloqueAbajo = new BloqueAbajo();
        Posicion posicion = new Posicion(0,0);

        bloqueArriba.ejecutar(personaje);
        bloqueAbajo.ejecutar(personaje);


        assertTrue(personaje.obtenerPosicion().compararPosiciones(posicion));
    }
}