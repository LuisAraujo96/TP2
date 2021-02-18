package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.DireccionAbajo;
import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.DireccionArriba;
import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.DireccionDerecha;
import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.DireccionIzquierda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosicionTest {

    @Test
    public void test01UnaPosicionConLasCoordenadasCeroCeroEsIgualAOtraPosicionConLasCoordenadasCeroCero(){
        Posicion unaPosicion = new Posicion(0, 0);
        Posicion otraPosicion = new Posicion(0, 0);

        assertEquals(unaPosicion, otraPosicion);
    }

    @Test
    public void test02ObtenerPosicionHaciaDerechaDesdeLaCoordenadaCeroCeroDebeDevolverCoordenadaUnoCero(){
        Posicion unaPosicion = new Posicion(0, 0);
        Posicion posicionALaDerecha = new Posicion(1, 0);

        Posicion posicionObtenida = unaPosicion.obtenerPosicionHacia(new DireccionDerecha());

        assertEquals(posicionALaDerecha, posicionObtenida);
    }

    @Test
    public void test03ObtenerPosicionHaciaIzquierdaDesdeLaCoordenadaCeroCeroDebeDevolverCoordenadaMenosUnoCero(){
        Posicion unaPosicion = new Posicion(0, 0);
        Posicion posicionALaIzquierda = new Posicion(-1, 0);

        Posicion posicionObtenida = unaPosicion.obtenerPosicionHacia(new DireccionIzquierda());

        assertEquals(posicionALaIzquierda, posicionObtenida);
    }

    @Test
    public void test04ObtenerPosicionHaciaArribaDesdeLaCoordenadaCeroCeroDebeDevolverCoordenadaCeroUno(){
        Posicion unaPosicion = new Posicion(0, 0);
        Posicion posicionArriba = new Posicion(0, 1);

        Posicion posicionObtenida = unaPosicion.obtenerPosicionHacia(new DireccionArriba());

        assertEquals(posicionArriba, posicionObtenida);
    }
    @Test
    public void test05ObtenerPosicionHaciaAbajoDesdeLaCoordenadaCeroCeroDebeDevolverCoordenadaCeroMenosUno(){
        Posicion unaPosicion = new Posicion(0, 0);
        Posicion posicionAbajo = new Posicion(0, -1);

        Posicion posicionObtenida = unaPosicion.obtenerPosicionHacia(new DireccionAbajo());

        assertEquals(posicionAbajo, posicionObtenida);
    }

    @Test
    public void test06TestEquals(){
        assertTrue(new Posicion(0,0).equals(new Posicion(0, 0)));
    }


    /*
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