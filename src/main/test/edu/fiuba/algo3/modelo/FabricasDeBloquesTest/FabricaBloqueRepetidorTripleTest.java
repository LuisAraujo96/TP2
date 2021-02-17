package edu.fiuba.algo3.modelo.FabricasDeBloquesTest;

import edu.fiuba.algo3.modelo.Bloques.BloqueArriba;
import edu.fiuba.algo3.modelo.Bloques.BloqueRepetidor;
import edu.fiuba.algo3.modelo.FabricasDeBloques.FabricaBloqueRepetidorTriple;
import edu.fiuba.algo3.modelo.FabricasDeBloques.FabricaDeBloques;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.Lapiz;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.SectorDibujo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FabricaBloqueRepetidorTripleTest {

    @Test
    public void testFabricaBloquerepetidorTripleCreaUnBLoqueRepetidorDeTresRepeticiones(){
        Personaje personaje = new Personaje(new Lapiz(new SectorDibujo()));
        FabricaDeBloques bloqueFabricador = new FabricaBloqueRepetidorTriple();
        BloqueRepetidor bloqueCreado = (BloqueRepetidor) bloqueFabricador.crearBloque();

        bloqueCreado.agregarBloque(new BloqueArriba());

        bloqueCreado.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), new Posicion(0,3));

        bloqueCreado.ejecutarInversoSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), new Posicion(0,0));
    }

}