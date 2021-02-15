package edu.fiuba.algo3.modelo.Bloques;

import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.Direccion;
import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.DireccionAbajo;
import edu.fiuba.algo3.modelo.Personaje;

public class BloqueAbajo implements Bloque{

    @Override
    public void ejecutarSobre(Personaje personaje){
        Direccion abajo = new DireccionAbajo();
        personaje.moverseHacia(abajo);
    }


    public void ejecutarInversoSobre(Personaje personaje){
        Direccion arriba = new DireccionArriba();
        personaje.moverseHacia(arriba);
    }
}