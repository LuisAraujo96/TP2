package edu.fiuba.algo3.modelo.FabricasDeBloquesTest;

import edu.fiuba.algo3.modelo.Bloques.BloqueArriba;
import edu.fiuba.algo3.modelo.Bloques.BloqueRepetidor;
import edu.fiuba.algo3.modelo.FabricasDeBloques.FabricaBloqueRepetidorDoble;
import edu.fiuba.algo3.modelo.FabricasDeBloques.FabricaDeBloques;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.Lapiz;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.SectorDibujo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FabricaBloqueRepetidorDobleTest {

    @Test
    public void testFabricaBloquerepetidorDobleCreaUnBLoqueRepetidorDeDosRepeticiones(){
        Personaje personaje = new Personaje(new Lapiz(new SectorDibujo()));
        FabricaDeBloques fabrica = new FabricaBloqueRepetidorDoble();
        BloqueRepetidor bloque = (BloqueRepetidor) fabrica.crearBloque();

        bloque.agregarBloque(new BloqueArriba());

        bloque.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), new Posicion(0,2));

        bloque.ejecutarInversoSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), new Posicion(0,0));
    }

}