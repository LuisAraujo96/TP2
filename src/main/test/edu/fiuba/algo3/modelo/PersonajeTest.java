package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Bloques.BloqueAbajo;
import edu.fiuba.algo3.modelo.Bloques.BloqueArriba;
import edu.fiuba.algo3.modelo.Bloques.BloqueDerecha;
import edu.fiuba.algo3.modelo.Bloques.BloqueIzquierda;
import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.*;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.Lapiz;
import edu.fiuba.algo3.modelo.Posiciones.Posicion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonajeTest {

    @Test
    public void test01UnPersonajeDibujaConElLapizArribaYComoResultadoDevuelve0(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());

        int resultado = personaje.dibujar();

        assertEquals(0, resultado);
    }

    @Test
    public void test02UnPersonajeSubeSuLapizDibujaConElYComoResultadoDevuelve0(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());

        personaje.subirLapiz();
        int resultado = personaje.dibujar();

        assertEquals(0, resultado);
    }

    @Test
    public void test03UnPersonajeBajaSuLapizDibujaConElYComoResultadoDevuelve1(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());

        personaje.bajarLapiz();
        int resultado = personaje.dibujar();

        assertEquals(1, resultado);
    }

    @Test
    public void test04UnPersonajeSubeYBajaSuLapizDibujaConElYComoResultadoDevuelve1(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());

        personaje.subirLapiz();
        personaje.bajarLapiz();
        int resultado = personaje.dibujar();

        assertEquals(1, resultado);
    }

    @Test
    public void test05UnPersonajeBajaYSubeSuLapizDibujaConElYComoResultadoDevuelve0(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());

        personaje.bajarLapiz();
        personaje.subirLapiz();
        int resultado = personaje.dibujar();

        assertEquals(0, resultado);
    }

    @Test
    public void test06UnPersonajeSubeBajaYSubeSuLapizDibujaConElYComoResultadoDevuelve0(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());

        personaje.subirLapiz();
        personaje.bajarLapiz();
        personaje.subirLapiz();
        int resultado = personaje.dibujar();

        assertEquals(0, resultado);
    }

    @Test
    public void test07UnPersonajeBajaSubeYBajaSuLapizDibujaConElYComoResultadoDevuelve1(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());

        personaje.bajarLapiz();
        personaje.subirLapiz();
        personaje.bajarLapiz();
        int resultado = personaje.dibujar();

        assertEquals(1, resultado);
    }

    @Test
    public void test08LaPosicionObtenidaDeUnPersonajeRecienCreadoEsLaPosicionCeroCero(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());

        Posicion posicionOrigen = new Posicion(0,0);

        assertEquals(posicionOrigen, personaje.obtenerPosicion());
    }

    @Test
    public void test09LaPosicionObtenidaDelPersonajeLuegoDeDibujarseConUnLapizArribaSeRepresentaConUn0(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());

        personaje.dibujar();
        Posicion posicionOrigen = personaje.obtenerPosicion();

        assertEquals(0, posicionOrigen.representar());
    }

    @Test
    public void test10LaPosicionObtenidaDelPersonajeLuegoDeSubirElLapizYDibujarlaSeRepresentaConUn0(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());

        personaje.subirLapiz();
        personaje.dibujar();
        Posicion posicionOrigen = personaje.obtenerPosicion();

        assertEquals(0, posicionOrigen.representar());
    }

    @Test
    public void test11LaPosicionObtenidaDelPersonajeLuegoDeBajarElLapizYDibujarlaSeRepresentaConUn1(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());

        personaje.bajarLapiz();
        personaje.dibujar();
        Posicion posicionOrigen = personaje.obtenerPosicion();

        assertEquals(1, posicionOrigen.representar());
    }

    @Test
    public void test12LaPosicionObtenidaDeUnPersonajeQueSeMueveHaciaArribaEsLaPosicionCeroUno(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        Posicion posicionDestino = new Posicion(0, 1);
        Direccion arriba = new DireccionArriba();

        personaje.moverseHacia(arriba);

        assertEquals(posicionDestino, personaje.obtenerPosicion());
    }

    @Test
    public void test13LaPosicionObtenidaDeUnPersonajeQueSeMueveHaciaAbajoEsLaPosicionCeroMenosUno(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        Posicion posicionDestino = new Posicion(0, -1);
        Direccion abajo = new DireccionAbajo();

        personaje.moverseHacia(abajo);

        assertEquals(posicionDestino, personaje.obtenerPosicion());
    }

    @Test
    public void test14LaPosicionObtenidaDeUnPersonajeQueSeMueveHaciaIzquierdaEsLaPosicionMenosUnoCero(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        Posicion posicionDestino = new Posicion(-1, 0);
        Direccion izquierda = new DireccionIzquierda();

        personaje.moverseHacia(izquierda);

        assertEquals(posicionDestino, personaje.obtenerPosicion());
    }

    @Test
    public void test15LaPosicionObtenidaDeUnPersonajeQueSeMueveHaciaDerechaEsLaPosicionUnoCero(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        Posicion posicionDestino = new Posicion(1, 0);
        Direccion derecha = new DireccionDerecha();

        personaje.moverseHacia(derecha);

        assertEquals(posicionDestino, personaje.obtenerPosicion());
    }

    @Test
    public void test16MuevoElPersonajeHaciaArribaConElLapizArribaYNoDibujaNada(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        Direccion arriba = new DireccionArriba();

        int resultado = personaje.moverseHacia(arriba);

        assertEquals(0, resultado);
    }

    @Test
    public void test17MuevoElPersonajeHaciaAbajoConElLapizArribaYNoDibujaNada(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        Direccion abajo = new DireccionAbajo();

        int resultado = personaje.moverseHacia(abajo);

        assertEquals(0, resultado);
    }

    @Test
    public void test18MuevoElPersonajeHaciaIzquierdaConElLapizArribaYNoDibujaNada(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        Direccion izquierda = new DireccionIzquierda();

        int resultado = personaje.moverseHacia(izquierda);

        assertEquals(0, resultado);
    }

    @Test
    public void test19MuevoElPersonajeHaciaDerechaConElLapizArribaYNoDibujaNada(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        Direccion derecha = new DireccionDerecha();

        int resultado = personaje.moverseHacia(derecha);

        assertEquals(0, resultado);
    }

    @Test
    public void test20MuevoElPersonajeHaciaArribaConElLapizAbajoYSiDibuja(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        Direccion arriba = new DireccionArriba();

        personaje.bajarLapiz();
        int resultado = personaje.moverseHacia(arriba);

        assertEquals(1, resultado);
    }

    @Test
    public void test21MuevoElPersonajeHaciaAbajoConElLapizAbajoYSiDibuja(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        Direccion abajo = new DireccionAbajo();

        personaje.bajarLapiz();
        int resultado = personaje.moverseHacia(abajo);

        assertEquals(1, resultado);
    }

    @Test
    public void test22MuevoElPersonajeHaciaIzquierdaConElLapizAbajoYSiDibuja(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        Direccion izquierda = new DireccionIzquierda();

        personaje.bajarLapiz();
        int resultado = personaje.moverseHacia(izquierda);

        assertEquals(1, resultado);
    }

    @Test
    public void test23MuevoElPersonajeHaciaDerechaConElLapizAbajoYSiDibuja(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        Direccion derecha = new DireccionDerecha();

        personaje.bajarLapiz();
        int resultado = personaje.moverseHacia(derecha);

        assertEquals(1, resultado);
    }


    @Test
    // test de integración
    public void test24MoverElPersonajeConBloquesHaciaLaDerechaConLapizAbajoDebeDibujarYLuegoMoverloALaDerechaConLapizArribaNoDebeDibujar(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        BloqueDerecha bloqueDerecha = new BloqueDerecha();

        personaje.bajarLapiz();
        bloqueDerecha.ejecutarSobre(personaje);

        int resultadoPrimerMovimiento = personaje.obtenerPosicion().representar();

        personaje.subirLapiz();
        bloqueDerecha.ejecutarSobre(personaje);
        int resultadoSegundoMovimiento = personaje.obtenerPosicion().representar();

        assertEquals(1, resultadoPrimerMovimiento);
        assertEquals(0, resultadoSegundoMovimiento);
    }

    @Test
    public void test25MoverElPersonaje4VecesHaciaLaDerechaConLapizArribaNoDebeDibujarNingunaPosicion(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        BloqueDerecha bloqueDerecha = new BloqueDerecha();


        bloqueDerecha.ejecutarSobre(personaje);
        int resultadoPrimerMovimiento = personaje.obtenerPosicion().representar();
        bloqueDerecha.ejecutarSobre(personaje);
        int resultadoSegundoMovimiento = personaje.obtenerPosicion().representar();
        bloqueDerecha.ejecutarSobre(personaje);
        int resultadoTercerMovimiento = personaje.obtenerPosicion().representar();
        bloqueDerecha.ejecutarSobre(personaje);
        int resultadoCuartoMovimiento = personaje.obtenerPosicion().representar();

        assertEquals(0, resultadoPrimerMovimiento);
        assertEquals(0, resultadoSegundoMovimiento);
        assertEquals(0, resultadoTercerMovimiento);
        assertEquals(0, resultadoCuartoMovimiento);
    }


    @Test
    public void test26MuevoConBloquesElPersonajeEnVariasDireccionesPeroDebeTerminarEnSuPosicionOrigen(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        BloqueDerecha bloqueDerecha = new BloqueDerecha();
        BloqueIzquierda bloqueIzquierda = new BloqueIzquierda();
        BloqueArriba bloqueArriba = new BloqueArriba();
        BloqueAbajo bloqueAbajo = new BloqueAbajo();

        Posicion posicionOrigen = personaje.obtenerPosicion();
        bloqueDerecha.ejecutarSobre(personaje);
        bloqueIzquierda.ejecutarSobre(personaje);
        bloqueArriba.ejecutarSobre(personaje);
        bloqueAbajo.ejecutarSobre(personaje);

        assertEquals(posicionOrigen, personaje.obtenerPosicion());

    }
}