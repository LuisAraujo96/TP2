package edu.fiuba.algo3.modelo.FabricasDeBloquesTest;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.FabricasDeBloques.FabricaBloqueIzquierda;
import edu.fiuba.algo3.modelo.FabricasDeBloques.FabricaDeBloques;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.Lapiz;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.SectorDibujo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FabricaBloqueIzquierdaTest {

    @Test
    public void testFabricaBloqueIzquierdaCreaUnBLoqueIzquierda(){
        Personaje personaje = new Personaje(new Lapiz(new SectorDibujo()));
        FabricaDeBloques bloqueFabricador = new FabricaBloqueIzquierda();
        Bloque bloqueCreado = bloqueFabricador.crearBloque();

        bloqueCreado.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), new Posicion(-1,0));

        bloqueCreado.ejecutarInversoSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), new Posicion(0,0));
    }
}