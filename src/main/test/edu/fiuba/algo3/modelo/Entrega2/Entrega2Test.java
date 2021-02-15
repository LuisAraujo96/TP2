package edu.fiuba.algo3.modelo.Entrega2;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Entrega2Test {

    /*Creación del sector dibujo (en el modelo, sin interfaz gráfica)*/
/*
    @Test
    public void test01AlCrearseElSectorDibujoLaPosicionInicialDelPersonajeEsLaPosicionCeroCero(){

        Posicion posicionInicial = new Posicion(0, 0);
        SectorDibujo sectorDibujo = new SectorDibujo();

        Posicion posicionOrigen = sectorDibujo.obtenerPosicionDelPersonaje();

        assertEquals(posicionInicial, posicionOrigen);
    }

    @Test
    public void test02MoverAlPersonajeDesdeLaPosicionCeroCeroHaciaArribaLoDejaEnLaPosicionCeroUno(){

        Posicion posicionFinal = new Posicion(0, 1);
        SectorDibujo sectorDibujo = new SectorDibujo();
        Direccion arriba = new DireccionArriba();

        sectorDibujo.cambiarPosicionDePersonajeHacia(arriba);
        Posicion posicionDestino = sectorDibujo.obtenerPosicionDelPersonaje();

        assertEquals(posicionFinal, posicionDestino);
    }

    @Test
    public void test03MoverAlPersonajeDesdeLaPosicionCeroCeroHaciaAbajoLoDejaEnLaPosicionCeroMenosUno(){
        Posicion posicionFinal = new Posicion(0, -1);
        SectorDibujo sectorDibujo = new SectorDibujo();
        Direccion abajo = new DireccionAbajo();

        sectorDibujo.cambiarPosicionDePersonajeHacia(abajo);
        Posicion posicionDestino = sectorDibujo.obtenerPosicionDelPersonaje();

        assertEquals(posicionFinal, posicionDestino);
    }

    @Test
    public void test04MoverAlPersonajeDesdeLaPosicionCeroCeroAIzquierdaLoDejaEnLaPosicionMenosUnoCero(){
        Posicion posicionFinal = new Posicion(-1, 0);
        SectorDibujo sectorDibujo = new SectorDibujo();
        Direccion izquierda = new DireccionIzquierda();

        sectorDibujo.cambiarPosicionDePersonajeHacia(izquierda);
        Posicion posicionDestino = sectorDibujo.obtenerPosicionDelPersonaje();

        assertEquals(posicionFinal, posicionDestino);
    }

    @Test
    public void test05MoverAlPersonajeDesdeLaPosicionCeroCeroADerechaLoDejaEnLaPosicionUnoCero(){
        Posicion posicionFinal = new Posicion(1, 0);
        SectorDibujo sectorDibujo = new SectorDibujo();
        Direccion derecha = new DireccionDerecha();

        sectorDibujo.cambiarPosicionDePersonajeHacia(derecha);
        Posicion posicionDestino = sectorDibujo.obtenerPosicionDelPersonaje();

        assertEquals(posicionFinal, posicionDestino);
    }

*/

    /*Mover al personaje con el pincel arriba y abajo, verificando que el sector dibujo quede
     dibujado según corresponda*/
/*
    @Test
    public void test01MoverAlPersonajeArribaConElLapizArribaNoDibujaSobreElSectorDibujo(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Personaje personaje = new Personaje(new Lapiz(), sectorDibujo);
        BloqueArriba bloqueArriba = new BloqueArriba();

        bloqueArriba.ejecutarSobre(personaje);
        Posicion posicionFinal = sectorDibujo.obtenerPosicionDelPersonaje();
        int representacion = posicionFinal.representar();

        assertEquals(0, representacion);
    }

    @Test
    public void test02MoverAlPersonajeAbajoConElLapizArribaNoDibujaSobreElSectorDibujo(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Personaje personaje = new Personaje(new Lapiz(), sectorDibujo);
        BloqueAbajo bloqueAbajo = new BloqueAbajo();

        bloqueAbajo.ejecutarSobre(personaje);
        Posicion posicionFinal = sectorDibujo.obtenerPosicionDelPersonaje();
        int representacion = posicionFinal.representar();

        assertEquals(0, representacion);
    }

    @Test
    public void test03MoverAlPersonajeAIzquierdaConElLapizArribaNoDibujaSobreElSectorDibujo(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Personaje personaje = new Personaje(new Lapiz(), sectorDibujo);
        BloqueIzquierda bloqueIzquierda = new BloqueIzquierda();

        bloqueIzquierda.ejecutarSobre(personaje);
        Posicion posicionFinal = sectorDibujo.obtenerPosicionDelPersonaje();
        int representacion = posicionFinal.representar();

        assertEquals(0, representacion);
    }

    @Test
    public void test04MoverAlPersonajeADerechaConElLapizArribaNoDibujaSobreElSectorDibujo(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Personaje personaje = new Personaje(new Lapiz(), sectorDibujo);
        BloqueDerecha bloqueDerecha = new BloqueDerecha();

        bloqueDerecha.ejecutarSobre(personaje);
        Posicion posicionFinal = sectorDibujo.obtenerPosicionDelPersonaje();
        int representacion = posicionFinal.representar();

        assertEquals(0, representacion);
    }

    @Test
    public void test05MoverAlPersonajeArribaConElLapizAbajoDibujaSobreElSectorDibujo(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Personaje personaje = new Personaje(new Lapiz(), sectorDibujo);
        BloqueArriba bloqueArriba = new BloqueArriba();
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();

        bloqueLapizAbajo.ejecutarSobre(personaje);
        bloqueArriba.ejecutarSobre(personaje);
        Posicion posicionFinal = sectorDibujo.obtenerPosicionDelPersonaje();
        int representacion = posicionFinal.representar();

        assertEquals(1, representacion);
    }

    @Test
    public void test06MoverAlPersonajeAbajoConElLapizAbajoDibujaSobreElSectorDibujo(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Personaje personaje = new Personaje(new Lapiz(), sectorDibujo);
        BloqueAbajo bloqueAbajo = new BloqueAbajo();
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();

        bloqueLapizAbajo.ejecutarSobre(personaje);
        bloqueAbajo.ejecutarSobre(personaje);
        Posicion posicionFinal = sectorDibujo.obtenerPosicionDelPersonaje();
        int representacion = posicionFinal.representar();

        assertEquals(1, representacion);
    }

    @Test
    public void test07MoverAlPersonajeAIzquierdaConElLapizAbajoDibujaSobreElSectorDibujo(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Personaje personaje = new Personaje(new Lapiz(), sectorDibujo);
        BloqueIzquierda bloqueIzquierda = new BloqueIzquierda();
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();

        bloqueLapizAbajo.ejecutarSobre(personaje);
        bloqueIzquierda.ejecutarSobre(personaje);
        Posicion posicionFinal = sectorDibujo.obtenerPosicionDelPersonaje();
        int representacion = posicionFinal.representar();

        assertEquals(1, representacion);
    }

    @Test
    public void test08MoverAlPersonajeADerechaConElLapizAbajoDibujaSobreElSectorDibujo(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Personaje personaje = new Personaje(new Lapiz(), sectorDibujo);
        BloqueDerecha bloqueDerecha = new BloqueDerecha();
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();

        bloqueLapizAbajo.ejecutarSobre(personaje);
        bloqueDerecha.ejecutarSobre(personaje);
        Posicion posicionFinal = sectorDibujo.obtenerPosicionDelPersonaje();
        int representacion = posicionFinal.representar();

        assertEquals(1, representacion);
    }


*/
    /*Creación de un algoritmo usando los bloques de repetición*/
/*
    @Test
    public void test01RepitoVariosMovimientos(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Personaje personaje = new Personaje(new Lapiz(), sectorDibujo);
        Posicion posicionDestino = new Posicion(0,2);
        BloqueRepetidor bloqueRepetidor = new BloqueRepetidor(2);
        bloqueRepetidor.agregarBloque(new BloqueArriba());
        bloqueRepetidor.agregarBloque(new BloqueArriba());
        bloqueRepetidor.agregarBloque(new BloqueAbajo());

        bloqueRepetidor.ejecutarSobre(personaje);

        assertEquals(sectorDibujo.obtenerPosicionDelPersonaje(), posicionDestino);
    }

    @Test
    public void test02AgregoVariosBloquesDeRepeticionDentroDeUnBloqueDeRepeticionYSeRepitenMovimientos (){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Personaje personaje = new Personaje(new Lapiz(), sectorDibujo);
        BloqueRepetidor zigzag = new BloqueRepetidor(2);

        zigzag.agregarBloque(new BloqueDerecha());
        zigzag.agregarBloque(new BloqueArriba());
        zigzag.agregarBloque(new BloqueIzquierda());
        zigzag.agregarBloque(new BloqueArriba());

        BloqueRepetidor bajar = new BloqueRepetidor(4);

        bajar.agregarBloque(new BloqueAbajo());

        BloqueRepetidor bloqueRepetidor = new BloqueRepetidor(2);

        bloqueRepetidor.agregarBloque( zigzag );
        bloqueRepetidor.agregarBloque( bajar );
        bloqueRepetidor.agregarBloque( new BloqueDerecha());
        bloqueRepetidor.agregarBloque( new BloqueDerecha());

        bloqueRepetidor.ejecutarSobre(personaje);

        assertEquals(sectorDibujo.obtenerPosicionDelPersonaje(), new Posicion(4,0));
    }*/
}