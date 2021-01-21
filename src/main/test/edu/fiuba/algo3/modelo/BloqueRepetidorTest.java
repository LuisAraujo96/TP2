package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BloqueRepetidorTest {

    @Test
    public void test01RepitoMovimientoHaciaArriba(){
        Personaje personaje = new Personaje(new Lapiz());
        BloqueRepetidor bloqueRepetidor = new BloqueRepetidor(2);
        bloqueRepetidor.agregarBloque(new BloqueArriba());
        Posicion posicionDestino = new Posicion(0,2);

        bloqueRepetidor.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), posicionDestino);
    }

    @Test
    public void test02RepitoMovimientoHaciaAbajo(){
        Personaje personaje = new Personaje(new Lapiz());
        BloqueRepetidor bloqueRepetidor = new BloqueRepetidor(2);
        bloqueRepetidor.agregarBloque(new BloqueAbajo());
        Posicion posicionDestino = new Posicion(0,-2);

        bloqueRepetidor.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), posicionDestino);
    }

    @Test
    public void test03RepitoMovimientoHaciaLaDerecha(){
        Personaje personaje = new Personaje(new Lapiz());
        BloqueRepetidor bloqueRepetidor = new BloqueRepetidor(2);
        bloqueRepetidor.agregarBloque(new BloqueDerecha());
        Posicion posicionDestino = new Posicion(2,0);

        bloqueRepetidor.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), posicionDestino);
    }

    @Test
    public void test04RepitoMovimientoHaciaLaIzquierda(){
        Personaje personaje = new Personaje(new Lapiz());
        BloqueRepetidor bloqueRepetidor = new BloqueRepetidor(2);
        bloqueRepetidor.agregarBloque(new BloqueIzquierda());
        Posicion posicionDestino = new Posicion(-2,0);

        bloqueRepetidor.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), posicionDestino);
    }

    @Test
    public void test05RepitoLapizArriba(){
        Personaje personaje = new Personaje(new Lapiz());
        BloqueRepetidor bloqueRepetidor = new BloqueRepetidor(2);
        bloqueRepetidor.agregarBloque(new BloqueLapizArriba());

        bloqueRepetidor.ejecutarSobre(personaje);
        int resultado = personaje.dibujar();

        assertEquals(0, resultado);
    }

    @Test
    public void test06RepitoLapizAbajo(){
        Personaje personaje = new Personaje(new Lapiz());
        BloqueRepetidor bloqueRepetidor = new BloqueRepetidor(2);
        bloqueRepetidor.agregarBloque(new BloqueLapizAbajo());

        bloqueRepetidor.ejecutarSobre(personaje);
        int resultado = personaje.dibujar();

        assertEquals(1, resultado);
    }

    @Test
    public void test07RepitoVariosMovimientos(){
        Personaje personaje = new Personaje(new Lapiz());
        BloqueRepetidor bloqueRepetidor = new BloqueRepetidor(2);

        bloqueRepetidor.agregarBloque(new BloqueArriba());
        bloqueRepetidor.agregarBloque(new BloqueArriba());
        bloqueRepetidor.agregarBloque(new BloqueAbajo());

        Posicion posicionDestino = new Posicion(0,2);

        bloqueRepetidor.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), posicionDestino);
    }
}