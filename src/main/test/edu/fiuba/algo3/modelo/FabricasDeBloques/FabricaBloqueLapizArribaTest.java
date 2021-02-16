package edu.fiuba.algo3.modelo.FabricasDeBloques;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.DireccionDerecha;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.Lapiz;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.SectorDibujo;
import edu.fiuba.algo3.modelo.Trazo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaBloqueLapizArribaTest {

    @Test
    public void testFabricaBloqueLapizArribaCreaUnBLoqueLapizArriba(){
        SectorDibujo sector = new SectorDibujo();
        Personaje personaje = new Personaje(new Lapiz(sector));
        FabricaDeBloques fabrica = new FabricaBloqueLapizArriba();

        Bloque bloque = fabrica.crearBloque();

        personaje.bajarLapiz();
        personaje.moverseHacia(new DireccionDerecha());
        bloque.ejecutarSobre(personaje);
        personaje.moverseHacia(new DireccionDerecha());

        Trazo trazosEsperados = new Trazo();

        trazosEsperados.agregarLinea(new Posicion(0,0), new Posicion(1,0));

        assertEquals(trazosEsperados, sector.obtenerTrazos());
    }

}