package edu.fiuba.algo3.modelo.FabricasDeBloques;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.Bloques.BloqueRepetidor;

public class FabricaBloqueRepetidorDoble implements FabricaDeBloques{

    @Override
    public Bloque crearBloque() {
        return new BloqueRepetidor(2);
    }
}