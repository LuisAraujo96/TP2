package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BloqueAbajoTest {
    @Test
    public void test01PersonajeEjecutaBloqueAbajoYSuPosicionEsLaCorrecta(){
        Personaje personaje = new Personaje();
        BloqueAbajo bloque = new BloqueAbajo();
        Posicion posicion = new Posicion(0,-1);

        bloque.ejecutar(personaje);

        assertTrue(personaje.obtenerPosicion().compararPosiciones(posicion));
    }
    @Test
    public void test02PersonajeEjecutaBloqueAbajoYBloqueArribaYSuPosicionEsLaCorrecta(){
        Personaje personaje = new Personaje();
        BloqueAbajo bloque = new BloqueAbajo();
        BloqueArriba bloque2 = new BloqueArriba();
        Posicion origen = new Posicion(0,0);

        bloque.ejecutar(personaje);
        bloque2.ejecutar(personaje);

        assertTrue(personaje.obtenerPosicion().compararPosiciones(origen));
    }
    
}
    