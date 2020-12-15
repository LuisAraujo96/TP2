package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BloqueAbajoTest {
    @Test
    public void test01PersonajeEjecutaBloqueAbajoYSuPosicionEsLaCorrecta(){
        Personaje personaje = new Personaje();
        BloqueAbajo bloque = new BloqueAbajo();
        Posicion posicion = new Posicion(0,-1);

        personaje.ejecutarBloque(bloque);

        assertTrue(personaje.obtenerPosicion().compararPosiciones(posicion));
    }
}
