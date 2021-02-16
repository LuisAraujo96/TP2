package edu.fiuba.algo3.modelo.FabricasDeBloques;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.Bloques.BloqueAbajo;

public class FabricaBloqueAbajo implements FabricaDeBloques{

    @Override
    public Bloque crearBloque() {
        return new BloqueAbajo();
    }
}