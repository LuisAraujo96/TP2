package edu.fiuba.algo3.modelo.FabricasDeBloques;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.Bloques.BloqueLapizArriba;

public class FabricaBloqueLapizArriba extends FabricaDeBloques{

    @Override
    public Bloque crearBloque() {
        return new BloqueLapizArriba();
    }
}