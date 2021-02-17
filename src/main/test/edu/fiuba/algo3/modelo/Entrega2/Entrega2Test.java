package edu.fiuba.algo3.modelo.Entrega2;

import edu.fiuba.algo3.modelo.Bloques.*;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.Lapiz;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.SectorDibujo;
import edu.fiuba.algo3.modelo.Trazo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Entrega2Test {

    /*Creación del sector dibujo (en el modelo, sin interfaz gráfica)*/

    @Test
    public void test01PedirleTrazosAlSectorDibujoDevuelveTrazosVacios(){

        SectorDibujo sectorDibujo = new SectorDibujo();
        Trazo trazosEsperados = new Trazo();

        assertEquals(trazosEsperados, sectorDibujo.obtenerTrazos());
    }



    /*Mover al personaje con el pincel arriba y abajo, verificando que el sector dibujo quede
     dibujado según corresponda*/

    @Test
    public void test01MoverAlPersonajeArribaConElLapizArribaNoDibujaSobreElSectorDibujo(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Lapiz lapiz = new Lapiz(sectorDibujo);
        Personaje personaje = new Personaje(lapiz);
        BloqueArriba bloqueArriba = new BloqueArriba();

        bloqueArriba.ejecutarSobre(personaje);

        Trazo trazosEsperados = new Trazo();
        assertEquals(trazosEsperados, sectorDibujo.obtenerTrazos());
    }

    @Test
    public void test02MoverAlPersonajeAbajoConElLapizArribaNoDibujaSobreElSectorDibujo(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Lapiz lapiz = new Lapiz(sectorDibujo);
        Personaje personaje = new Personaje(lapiz);
        BloqueAbajo bloqueAbajo = new BloqueAbajo();

        bloqueAbajo.ejecutarSobre(personaje);

        Trazo trazosEsperados = new Trazo();
        assertEquals(trazosEsperados, sectorDibujo.obtenerTrazos());
    }

    @Test
    public void test03MoverAlPersonajeAIzquierdaConElLapizArribaNoDibujaSobreElSectorDibujo(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Lapiz lapiz = new Lapiz(sectorDibujo);
        Personaje personaje = new Personaje(lapiz);
        BloqueIzquierda bloqueIzquierda = new BloqueIzquierda();

        bloqueIzquierda.ejecutarSobre(personaje);

        Trazo trazosEsperados = new Trazo();
        assertEquals(trazosEsperados, sectorDibujo.obtenerTrazos());
    }

    @Test
    public void test04MoverAlPersonajeADerechaConElLapizArribaNoDibujaSobreElSectorDibujo(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Lapiz lapiz = new Lapiz(sectorDibujo);
        Personaje personaje = new Personaje(lapiz);
        BloqueDerecha bloqueDerecha = new BloqueDerecha();

        bloqueDerecha.ejecutarSobre(personaje);

        Trazo trazosEsperados = new Trazo();
        assertEquals(trazosEsperados, sectorDibujo.obtenerTrazos());
    }

    @Test
    public void test05MoverAlPersonajeArribaConElLapizAbajoDibujaSobreElSectorDibujo(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Lapiz lapiz = new Lapiz(sectorDibujo);
        Personaje personaje = new Personaje(lapiz);
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();
        BloqueArriba bloqueArriba = new BloqueArriba();

        bloqueLapizAbajo.ejecutarSobre(personaje);
        bloqueArriba.ejecutarSobre(personaje);

        Trazo trazosEsperados = new Trazo();
        trazosEsperados.agregarLinea(new Posicion(0,0), new Posicion(0,1));
        assertEquals(trazosEsperados, sectorDibujo.obtenerTrazos());
    }

    @Test
    public void test06MoverAlPersonajeAbajoConElLapizAbajoDibujaSobreElSectorDibujo(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Lapiz lapiz = new Lapiz(sectorDibujo);
        Personaje personaje = new Personaje(lapiz);
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();
        BloqueAbajo bloqueAbajo = new BloqueAbajo();

        bloqueLapizAbajo.ejecutarSobre(personaje);
        bloqueAbajo.ejecutarSobre(personaje);

        Trazo trazosEsperados = new Trazo();
        trazosEsperados.agregarLinea(new Posicion(0,0), new Posicion(0,-1));
        assertEquals(trazosEsperados, sectorDibujo.obtenerTrazos());
    }

    @Test
    public void test07MoverAlPersonajeAIzquierdaConElLapizAbajoDibujaSobreElSectorDibujo(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Lapiz lapiz = new Lapiz(sectorDibujo);
        Personaje personaje = new Personaje(lapiz);
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();
        BloqueIzquierda bloqueIzquierda = new BloqueIzquierda();

        bloqueLapizAbajo.ejecutarSobre(personaje);
        bloqueIzquierda.ejecutarSobre(personaje);

        Trazo trazosEsperados = new Trazo();
        trazosEsperados.agregarLinea(new Posicion(-1,0), new Posicion(0,0));
        assertEquals(trazosEsperados, sectorDibujo.obtenerTrazos());
    }

    @Test
    public void test08MoverAlPersonajeADerechaConElLapizAbajoDibujaSobreElSectorDibujo(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Lapiz lapiz = new Lapiz(sectorDibujo);
        Personaje personaje = new Personaje(lapiz);
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();
        BloqueDerecha bloqueDerecha = new BloqueDerecha();

        bloqueLapizAbajo.ejecutarSobre(personaje);
        bloqueDerecha.ejecutarSobre(personaje);

        Trazo trazosEsperados = new Trazo();
        trazosEsperados.agregarLinea(new Posicion(1,0), new Posicion(0,0));
        assertEquals(trazosEsperados, sectorDibujo.obtenerTrazos());
    }



    /*Creación de un algoritmo usando los bloques de repetición*/

    @Test
    public void test01MoverAlPersonajeConElLapizArribaMedianteLaEjecucionDeUnBloqueRepetidorDevuelveUnTrazoVacio(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Lapiz lapiz = new Lapiz(sectorDibujo);
        Personaje personaje = new Personaje(lapiz);
        BloqueRepetidor bloqueRepetidor = new BloqueRepetidor(2);
        bloqueRepetidor.agregarBloque(new BloqueLapizArriba());
        bloqueRepetidor.agregarBloque(new BloqueArriba());
        bloqueRepetidor.agregarBloque(new BloqueArriba());
        bloqueRepetidor.agregarBloque(new BloqueAbajo());

        bloqueRepetidor.ejecutarSobre(personaje);

        Trazo trazosEsperados = new Trazo();
        assertEquals(trazosEsperados, sectorDibujo.obtenerTrazos());
    }

    @Test
    public void test02MoverAlPersonajeConElLapizAbajoMedianteLaEjecucionDeUnBloqueRepetidorDobleDevuelveUnTipoDeTrazo(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Lapiz lapiz = new Lapiz(sectorDibujo);
        Personaje personaje = new Personaje(lapiz);
        BloqueRepetidor bloqueRepetidor = new BloqueRepetidor(2);
        bloqueRepetidor.agregarBloque(new BloqueLapizAbajo());
        bloqueRepetidor.agregarBloque(new BloqueArriba());
        bloqueRepetidor.agregarBloque(new BloqueArriba());
        bloqueRepetidor.agregarBloque(new BloqueAbajo());

        bloqueRepetidor.ejecutarSobre(personaje);

        Trazo trazosEsperados = new Trazo();
        trazosEsperados.agregarLinea(new Posicion(0,0), new Posicion(0,1));
        trazosEsperados.agregarLinea(new Posicion(0,1), new Posicion(0,2));
        trazosEsperados.agregarLinea(new Posicion(0,2), new Posicion(0,3));
        assertEquals(trazosEsperados, sectorDibujo.obtenerTrazos());
    }

    @Test
    public void test03MoverAlPersonajeConElLapizAbajoMedianteLaEjecucionDeUnBloqueRepetidorTripleDevuelveOtroTipoDeTrazo(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        Lapiz lapiz = new Lapiz(sectorDibujo);
        Personaje personaje = new Personaje(lapiz);
        BloqueRepetidor bloqueRepetidor = new BloqueRepetidor(3);
        bloqueRepetidor.agregarBloque(new BloqueLapizAbajo());
        bloqueRepetidor.agregarBloque(new BloqueArriba());
        bloqueRepetidor.agregarBloque(new BloqueArriba());
        bloqueRepetidor.agregarBloque(new BloqueAbajo());

        bloqueRepetidor.ejecutarSobre(personaje);

        Trazo trazosEsperados = new Trazo();
        trazosEsperados.agregarLinea(new Posicion(0,0), new Posicion(0,1));
        trazosEsperados.agregarLinea(new Posicion(0,1), new Posicion(0,2));
        trazosEsperados.agregarLinea(new Posicion(0,2), new Posicion(0,3));
        trazosEsperados.agregarLinea(new Posicion(0,3), new Posicion(0,4));
        assertEquals(trazosEsperados, sectorDibujo.obtenerTrazos());
    }
}