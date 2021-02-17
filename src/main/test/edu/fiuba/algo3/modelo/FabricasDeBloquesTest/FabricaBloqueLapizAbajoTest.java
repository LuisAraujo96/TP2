package edu.fiuba.algo3.modelo.FabricasDeBloquesTest;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.DireccionAbajo;
import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.DireccionArriba;
import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.DireccionDerecha;
import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.DireccionIzquierda;
import edu.fiuba.algo3.modelo.FabricasDeBloques.FabricaBloqueLapizAbajo;
import edu.fiuba.algo3.modelo.FabricasDeBloques.FabricaDeBloques;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.Lapiz;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.SectorDibujo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FabricaBloqueLapizAbajoTest {

    @Test
    public void testFabricaBloqueLapizAbajoCreaUnBLoqueLapizAbajo(){
        SectorDibujo sector = new SectorDibujo();
        Personaje personaje = new Personaje(new Lapiz(sector));
        FabricaDeBloques bloqueFabricador = new FabricaBloqueLapizAbajo();
        Bloque bloqueCreado = bloqueFabricador.crearBloque();

        bloqueCreado.ejecutarSobre(personaje);

        personaje.moverseHacia(new DireccionArriba());
        personaje.moverseHacia(new DireccionDerecha());
        personaje.moverseHacia(new DireccionAbajo());
        personaje.moverseHacia(new DireccionIzquierda());

        SectorDibujo dibujoEsperado = new SectorDibujo();

        dibujoEsperado.agregarTrazo(new Posicion(0,0), new Posicion(0,1));
        dibujoEsperado.agregarTrazo(new Posicion(1,0), new Posicion(1,1));
        dibujoEsperado.agregarTrazo(new Posicion(0,1), new Posicion(1,1));
        dibujoEsperado.agregarTrazo(new Posicion(0,0), new Posicion(1,0));

        assertEquals(dibujoEsperado, sector);
    }

}