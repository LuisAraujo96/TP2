package edu.fiuba.algo3.modelo.FabricasDeBloques;

import edu.fiuba.algo3.modelo.Bloques.BloqueArriba;
import edu.fiuba.algo3.modelo.Bloques.BloqueRepetidor;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.Lapiz;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.SectorDibujo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaBloqueRepetidorTripleTest {

    @Test
    public void testFabricaBloquerepetidorTripleCreaUnBLoqueRepetidorDeTresRepeticiones(){
        Personaje personaje = new Personaje(new Lapiz(new SectorDibujo()));
        FabricaDeBloques fabrica = new FabricaBloqueRepetidorTriple();
        BloqueRepetidor bloque = (BloqueRepetidor) fabrica.crearBloque();

        bloque.agregarBloque(new BloqueArriba());

        bloque.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), new Posicion(0,3));

        bloque.ejecutarInversoSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), new Posicion(0,0));
    }

}