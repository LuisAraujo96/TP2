package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Posiciones.Posicion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosicionTest {

    @Test
    public void test01UnaPosicionConLasCoordenadasCeroCeroEsIgualAOtraPosicionConLasCoordenadasCeroCero(){
        Posicion unaPosicion = new Posicion(0, 0);
        Posicion otraPosicion = new Posicion(0, 0);

        assertEquals(unaPosicion, otraPosicion);
    }
/*
    @Test
    public void test02UnaPosicionPintadaYOtraSinPintarConLasMismasCoordenadasNoSonIguales(){
        Posicion unaPosicion = new Posicion(0, 0);
        Posicion otraPosicion = new Posicion(0, 0);

        unaPosicion.dibujar();

        assertNotEquals(unaPosicion, otraPosicion);
    }

    @Test
    public void test03RepresentarUnaPosicionRecienCreadaDevuelveComoResultado0(){
        Posicion unaPosicion = new Posicion(0, 0);

        int resultado = unaPosicion.representar();

        assertEquals(0, resultado);
    }

    @Test
    public void test04RepresentarUnaPosicionRecienDibujadaDevuelveComoResultado1(){
        Posicion unaPosicion = new Posicion(0, 0);

        unaPosicion.dibujar();
        int resultado = unaPosicion.representar();

        assertEquals(1, resultado);
    }
 */
}