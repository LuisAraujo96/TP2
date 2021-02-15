package edu.fiuba.algo3.modelo.Bloques;

import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.Direccion;
import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.DireccionArriba;
import edu.fiuba.algo3.modelo.Personaje;

public class BloqueArriba implements Bloque {

    @Override
    public void ejecutarSobre(Personaje personaje){
        Direccion arriba = new DireccionArriba();
        personaje.moverseHacia(arriba);
    }

    public void ejecutarInversoSobre(Personaje personaje){
        Direccion abajo = new DireccionAbajo();
        personaje.moverseHacia(abajo);
    }
}
