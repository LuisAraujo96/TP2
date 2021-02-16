package edu.fiuba.algo3.modelo.FabricasDeBloques;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.Bloques.BloqueRepetidor;

public class FabricaBloqueRepetidorTriple implements FabricaDeBloques{

    @Override
    public Bloque crearBloque() {
        return new BloqueRepetidor(3);
    }
}