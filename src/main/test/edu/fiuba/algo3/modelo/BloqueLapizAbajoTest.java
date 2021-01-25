package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Bloques.BloqueLapizAbajo;
import edu.fiuba.algo3.modelo.Bloques.BloqueLapizArriba;
import edu.fiuba.algo3.modelo.HerramientaDeDibujo.Lapiz;
import edu.fiuba.algo3.modelo.Juego.SectorDibujo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloqueLapizAbajoTest {

    @Test
    public void test01CreoUnPersonajeConElLapizArribaYBajoSuLapizUsandoElBloqueLapizAbajo(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();

        bloqueLapizAbajo.ejecutarSobre(personaje);
        int resultado = personaje.dibujar();

        assertEquals(1, resultado);
    }

    @Test
    public void test02CreoUnPersonajeBajoSuLapizLoSuboYLoVuelvoABajarConBloques(){
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();
        BloqueLapizArriba bloqueLapizArriba = new BloqueLapizArriba();

        bloqueLapizAbajo.ejecutarSobre(personaje);
        bloqueLapizArriba.ejecutarSobre(personaje);
        bloqueLapizAbajo.ejecutarSobre(personaje);
        int resultado = personaje.dibujar();

        assertEquals(1, resultado);
    }

    @Test
    public void test03CreoUnPersonajeYLeOrdenoBajarElLapizDosVeces() {
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();

        bloqueLapizAbajo.ejecutarSobre(personaje);
        bloqueLapizAbajo.ejecutarSobre(personaje);
        int resultado = personaje.dibujar();

        assertEquals(1, resultado);
    }

    @Test
    public void test04CreoUnPersonajeYLeOrdenoBajarElLapizDosVecesConDosBloquesDistintos() {
        Personaje personaje = new Personaje(new Lapiz(), new SectorDibujo());
        BloqueLapizAbajo bloqueLapizAbajoUno = new BloqueLapizAbajo();
        BloqueLapizAbajo bloqueLapizAbajoDos = new BloqueLapizAbajo();

        bloqueLapizAbajoUno.ejecutarSobre(personaje);
        bloqueLapizAbajoDos.ejecutarSobre(personaje);
        int resultado = personaje.dibujar();

        assertEquals(1, resultado);
    }
}