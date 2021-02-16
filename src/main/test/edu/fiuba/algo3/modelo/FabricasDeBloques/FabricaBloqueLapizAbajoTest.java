package edu.fiuba.algo3.modelo.FabricasDeBloques;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.DireccionAbajo;
import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.DireccionArriba;
import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.DireccionDerecha;
import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.DireccionIzquierda;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.Lapiz;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.SectorDibujo;
import edu.fiuba.algo3.modelo.Trazo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaBloqueLapizAbajoTest {

    @Test
    public void testFabricaBloqueLapizAbajoCreaUnBLoqueLapizAbajo(){
        SectorDibujo sector = new SectorDibujo();
        Personaje personaje = new Personaje(new Lapiz(sector));
        FabricaDeBloques fabrica = new FabricaBloqueLapizAbajo();
        Bloque bloque = fabrica.crearBloque();

        bloque.ejecutarSobre(personaje);

        personaje.moverseHacia(new DireccionArriba());
        personaje.moverseHacia(new DireccionDerecha());
        personaje.moverseHacia(new DireccionAbajo());
        personaje.moverseHacia(new DireccionIzquierda());

        Trazo trazosEsperados = new Trazo();

        trazosEsperados.agregarLinea(new Posicion(0,0), new Posicion(0,1));
        trazosEsperados.agregarLinea(new Posicion(1,0), new Posicion(1,1));
        trazosEsperados.agregarLinea(new Posicion(0,1), new Posicion(1,1));
        trazosEsperados.agregarLinea(new Posicion(0,0), new Posicion(1,0));

        assertEquals(trazosEsperados, sector.obtenerTrazos());
    }

}