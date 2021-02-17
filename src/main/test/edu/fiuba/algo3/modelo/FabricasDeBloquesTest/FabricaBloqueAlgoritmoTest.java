package edu.fiuba.algo3.modelo.FabricasDeBloquesTest;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.Bloques.BloqueArriba;
import edu.fiuba.algo3.modelo.Bloques.BloqueDerecha;
import edu.fiuba.algo3.modelo.FabricasDeBloques.FabricaBloqueAlgoritmo;
import edu.fiuba.algo3.modelo.FabricasDeBloques.FabricaDeBloques;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.Lapiz;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.SectorDibujo;
import edu.fiuba.algo3.modelo.Trazo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FabricaBloqueAlgoritmoTest {

    @Test
    public void testFabricaBloqueAlgoritmo(){
        Bloque[] bloques = new Bloque[2];

        bloques[0] = new BloqueArriba();
        bloques[1] = new BloqueDerecha();

        FabricaDeBloques fabrica = new FabricaBloqueAlgoritmo(bloques);
        SectorDibujo sector = new SectorDibujo();
        Personaje personaje = new Personaje(new Lapiz(sector));

        Bloque bloqueFabrica = fabrica.crearBloque();

        Trazo trazosEsperados = new Trazo();

        trazosEsperados.agregarLinea(new Posicion(0,0), new Posicion(0,1));
        trazosEsperados.agregarLinea(new Posicion(1,0), new Posicion(1,1));
        trazosEsperados.agregarLinea(new Posicion(0,1), new Posicion(1,1));
        trazosEsperados.agregarLinea(new Posicion(0,0), new Posicion(1,0));

        personaje.bajarLapiz();
        bloqueFabrica.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), new Posicion(1,1));

        bloqueFabrica.ejecutarInversoSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), new Posicion(0,0));

        assertEquals(trazosEsperados, sector.obtenerTrazos());
    }
}
