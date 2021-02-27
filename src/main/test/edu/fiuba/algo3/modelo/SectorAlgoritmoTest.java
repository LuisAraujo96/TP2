package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Bloques.*;
import edu.fiuba.algo3.modelo.Excepciones.SinBloquesADevolverException;
import edu.fiuba.algo3.modelo.FabricasDeBloques.FabricaBloqueAlgoritmo;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.Lapiz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SectorAlgoritmoTest {

    @Test
    public void test01AgregarBloqueDeMovimientoDerechaYEjecutarElAlgoritmoNoDebeDibujarSobreElSectorDibujo(){

        SectorAlgoritmo sectorAlgoritmo = new SectorAlgoritmo();
        SectorDibujo sectorDibujo = new SectorDibujo();
        SectorDibujo sectorDibujoVacio = new SectorDibujo();

        Personaje personaje = new Personaje(new Lapiz(sectorDibujo));
        BloqueDerecha bloqueDerecha = new BloqueDerecha();

        sectorAlgoritmo.agregarBloque(bloqueDerecha);
        sectorAlgoritmo.ejecutarPrograma(personaje);

        assertEquals(sectorDibujo, sectorDibujoVacio);

    }

    @Test
    public void test02AgregarBloqueBloqueLapizAbajoYBloqueMovimientoDerechaAlEjecutarElAlgoritmoDebeDibujarSobreElSectorDibujo(){

        SectorAlgoritmo sectorAlgoritmo = new SectorAlgoritmo();
        SectorDibujo sectorDibujo = new SectorDibujo();
        SectorDibujo dibujoEsperado = new SectorDibujo();

        Personaje personaje = new Personaje(new Lapiz(sectorDibujo));

        dibujoEsperado.agregarTrazo(new Posicion(0,0), new Posicion(1,0));

        BloqueDerecha bloqueDerecha = new BloqueDerecha();
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();

        sectorAlgoritmo.agregarBloque(bloqueLapizAbajo);
        sectorAlgoritmo.agregarBloque(bloqueDerecha);
        sectorAlgoritmo.ejecutarPrograma(personaje);

        assertEquals(sectorDibujo, dibujoEsperado);
    }

    @Test
    public void test03CrearUnBloqueAlgoritmoPersonalizadoConBloquesDelSectorAlgoritmoDeberianRealizarLoMismo(){

        SectorAlgoritmo sectorAlgoritmo = new SectorAlgoritmo();
        SectorDibujo sectorDibujo = new SectorDibujo();
        SectorDibujo dibujoEsperado = new SectorDibujo();

        Personaje personaje = new Personaje(new Lapiz(sectorDibujo));

        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();
        BloqueIzquierda bloqueIzquierda = new BloqueIzquierda();

        sectorAlgoritmo.agregarBloque(bloqueLapizAbajo);
        sectorAlgoritmo.agregarBloque(bloqueIzquierda);

        try {
            FabricaBloqueAlgoritmo fabricaBloqueAlgoritmo = new FabricaBloqueAlgoritmo(sectorAlgoritmo.obtenerBloques());
            Bloque bloqueAlgoritmo = fabricaBloqueAlgoritmo.crearBloque();
            bloqueAlgoritmo.ejecutarSobre(personaje);

        } catch (SinBloquesADevolverException e){

        }

        dibujoEsperado.agregarTrazo(new Posicion(0,0), new Posicion(-1,0));

        assertEquals(sectorDibujo, dibujoEsperado);
    }

    @Test
    public void test04ObtenerLosBloquesDeUnSectorAlgoritmoSinBloquesLanzaAlgoritmoSinBloquesException(){

        SectorAlgoritmo sectorAlgoritmo = new SectorAlgoritmo();

        assertThrows( SinBloquesADevolverException.class, () -> {sectorAlgoritmo.obtenerBloques();} );
    }
}