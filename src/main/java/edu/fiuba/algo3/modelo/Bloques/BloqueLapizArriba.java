package edu.fiuba.algo3.modelo.Bloques;

import edu.fiuba.algo3.modelo.Personaje;

public class BloqueLapizArriba implements Bloque{

    @Override
    public void ejecutarSobre(Personaje personaje){ personaje.subirLapiz(); }

    @Override
    public void ejecutarInversoSobre(Personaje personaje){
        personaje.bajarLapiz();
    }
}
