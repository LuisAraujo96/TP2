package edu.fiuba.algo3.modelo.FabricasDeBloquesTest;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.FabricasDeBloques.FabricaBloqueAbajo;
import edu.fiuba.algo3.modelo.FabricasDeBloques.FabricaDeBloques;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.Lapiz;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.SectorDibujo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FabricaBloqueAbajoTest {

    @Test
    public void testFabricaBloqueAbajoCreaUnBLoqueAbajo(){
        Personaje personaje = new Personaje(new Lapiz(new SectorDibujo()));
        FabricaDeBloques fabrica = new FabricaBloqueAbajo();
        Bloque bloque = fabrica.crearBloque();

        bloque.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), new Posicion(0,-1));

        bloque.ejecutarInversoSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), new Posicion(0,0));
    }
}
