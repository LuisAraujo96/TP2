package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BloqueAbajoTest {

    @Test
    public void test01PersonajeEjecutaBloqueAbajoYSuPosicionEsLaCorrecta(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueAbajo bloque = new BloqueAbajo();
        Posicion posicion = new Posicion(0,-1);

        bloque.ejecutarSobre(personaje);

        assertTrue(personaje.obtenerPosicion().compararPosiciones(posicion));
    }
    @Test
    public void test02PersonajeEjecutaBloqueAbajoYBloqueArribaYSuPosicionEsLaCorrecta(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueAbajo bloque = new BloqueAbajo();
        BloqueArriba bloque2 = new BloqueArriba();
        Posicion origen = new Posicion(0,0);

        bloque.ejecutarSobre(personaje);
        bloque2.ejecutarSobre(personaje);

        assertTrue(personaje.obtenerPosicion().compararPosiciones(origen));
    }

    @Test
    public void test03EjecutarCincoVecesBloqueAbajoDejaAlPersonajeEnLaPosicionCeroYMenosCinco(){
        LapizArriba lapiz = new LapizArriba();
        Personaje personaje = new Personaje(lapiz);
        BloqueAbajo bloque = new BloqueAbajo();

        Posicion posicionFinal = new Posicion(0,-5);

        bloque.ejecutarSobre(personaje);
        bloque.ejecutarSobre(personaje);
        bloque.ejecutarSobre(personaje);
        bloque.ejecutarSobre(personaje);
        bloque.ejecutarSobre(personaje);

        assertTrue(personaje.obtenerPosicion().compararPosiciones(posicionFinal));
    }
    
}
    