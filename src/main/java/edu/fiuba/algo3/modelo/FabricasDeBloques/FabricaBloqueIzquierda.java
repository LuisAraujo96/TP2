package edu.fiuba.algo3.modelo.FabricasDeBloques;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.Bloques.BloqueIzquierda;

public class FabricaBloqueIzquierda implements FabricaDeBloques{

    @Override
    public Bloque crearBloque() {
        return new BloqueIzquierda();
    }
}