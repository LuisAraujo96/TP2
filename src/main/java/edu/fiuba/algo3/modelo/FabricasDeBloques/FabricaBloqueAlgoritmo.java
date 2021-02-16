package edu.fiuba.algo3.modelo.FabricasDeBloques;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.Bloques.BloqueAlgoritmo;

public class FabricaBloqueAlgoritmo implements FabricaDeBloques{

    private Bloque[] bloquesAlgoritmo;

    public FabricaBloqueAlgoritmo(Bloque[] bloquesAlgoritmo){
        this.bloquesAlgoritmo = bloquesAlgoritmo;
    }

    @Override
    public Bloque crearBloque() { return new BloqueAlgoritmo("quitarDeConstructor", this.bloquesAlgoritmo); }
}

