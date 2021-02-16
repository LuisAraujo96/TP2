package edu.fiuba.algo3.modelo.FabricasDeBloques;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.Lapiz;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.SectorDibujo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaBloqueArribaTest  {

    @Test
    public void testFabricaBloqueArribaCreaUnBLoqueArriba(){
        Personaje personaje = new Personaje(new Lapiz(new SectorDibujo()));
        FabricaDeBloques fabrica = new FabricaBloqueArriba();
        Bloque bloque = fabrica.crearBloque();

        bloque.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), new Posicion(0,1));

        bloque.ejecutarInversoSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), new Posicion(0,0));
    }
}