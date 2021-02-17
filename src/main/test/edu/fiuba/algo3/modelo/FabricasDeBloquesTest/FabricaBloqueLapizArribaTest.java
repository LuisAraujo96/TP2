package edu.fiuba.algo3.modelo.FabricasDeBloquesTest;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.DireccionDerecha;
import edu.fiuba.algo3.modelo.FabricasDeBloques.FabricaBloqueLapizArriba;
import edu.fiuba.algo3.modelo.FabricasDeBloques.FabricaDeBloques;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.Lapiz;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.SectorDibujo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FabricaBloqueLapizArribaTest {

    @Test
    public void testFabricaBloqueLapizArribaCreaUnBLoqueLapizArriba(){
        SectorDibujo sector = new SectorDibujo();
        Personaje personaje = new Personaje(new Lapiz(sector));
        FabricaDeBloques bloqueFabricador = new FabricaBloqueLapizArriba();

        Bloque bloqueCreado = bloqueFabricador.crearBloque();

        personaje.bajarLapiz();
        personaje.moverseHacia(new DireccionDerecha());

        bloqueCreado.ejecutarSobre(personaje);
        personaje.moverseHacia(new DireccionDerecha());

        SectorDibujo dibujoEsperado = new SectorDibujo();

        dibujoEsperado.agregarTrazo(new Posicion(0,0), new Posicion(1,0));

        assertEquals(dibujoEsperado, sector);
    }

}