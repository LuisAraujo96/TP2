package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Bloques.BloqueDerecha;
import edu.fiuba.algo3.modelo.Bloques.BloqueLapizAbajo;
import edu.fiuba.algo3.modelo.Bloques.BloqueLapizArriba;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.Lapiz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloqueLapizAbajoTest {
    @Test
    public void test01CreoUnPersonajeYAlBajarSuLapizYMoverseDebeDibujar() {
        SectorDibujo sectorDibujo = new SectorDibujo();
        SectorDibujo otroSectorDibujo = new SectorDibujo();

        Lapiz lapiz = new Lapiz(sectorDibujo);
        Lapiz otroLapiz = new Lapiz(otroSectorDibujo);

        otroLapiz.dibujar(new Posicion(0,0), new Posicion(1,0));

        Personaje personaje = new Personaje(lapiz);

        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();
        BloqueDerecha bloqueDerecha = new BloqueDerecha();
        bloqueLapizAbajo.ejecutarSobre(personaje);
        bloqueDerecha.ejecutarSobre(personaje);

        assertEquals(sectorDibujo.obtenerTrazos(), otroSectorDibujo.obtenerTrazos());
    }

    @Test
    public void test02CreoUnPersonajeBajoSuLapizLoSuboYLoVuelvoABajarConBloquesYAlMoverseDebeDibujar(){
        SectorDibujo sectorDibujo = new SectorDibujo();
        SectorDibujo otroSectorDibujo = new SectorDibujo();
        BloqueLapizArriba bloqueLapizArriba = new BloqueLapizArriba();
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();
        BloqueDerecha bloqueDerecha = new BloqueDerecha();
        Lapiz lapiz = new Lapiz(sectorDibujo);
        Lapiz otroLapiz = new Lapiz(otroSectorDibujo);
        Personaje personaje = new Personaje(lapiz);

        otroLapiz.dibujar(new Posicion(0,0), new Posicion(1,0));

        bloqueLapizAbajo.ejecutarSobre(personaje);
        bloqueLapizArriba.ejecutarSobre(personaje);
        bloqueLapizAbajo.ejecutarSobre(personaje);
        bloqueDerecha.ejecutarSobre(personaje);

        assertEquals(sectorDibujo.obtenerTrazos(), otroSectorDibujo.obtenerTrazos());
    }

}