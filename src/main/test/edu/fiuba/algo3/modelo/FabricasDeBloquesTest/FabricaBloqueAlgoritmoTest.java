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
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FabricaBloqueAlgoritmoTest {

    @Test
    public void testFabricaBloqueAlgoritmo(){
        Bloque[] bloques = new Bloque[2];

        bloques[0] = new BloqueArriba();
        bloques[1] = new BloqueDerecha();

        FabricaDeBloques bloqueFabricador = new FabricaBloqueAlgoritmo(bloques);
        SectorDibujo sector = new SectorDibujo();
        Personaje personaje = new Personaje(new Lapiz(sector));

        Bloque bloqueCreado = bloqueFabricador.crearBloque();

        SectorDibujo dibujoEsperado = new SectorDibujo();

        dibujoEsperado.agregarTrazo(new Posicion(0,0), new Posicion(0,1));
        dibujoEsperado.agregarTrazo(new Posicion(1,0), new Posicion(1,1));
        dibujoEsperado.agregarTrazo(new Posicion(0,1), new Posicion(1,1));
        dibujoEsperado.agregarTrazo(new Posicion(0,0), new Posicion(1,0));

        personaje.bajarLapiz();
        bloqueCreado.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), new Posicion(1,1));

        bloqueCreado.ejecutarInversoSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), new Posicion(0,0));

        assertEquals(dibujoEsperado, sector);
    }
}
