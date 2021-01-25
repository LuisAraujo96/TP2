package edu.fiuba.algo3.modelo.HerramientaDeDibujo;

import edu.fiuba.algo3.modelo.Posicion.Posicion;

public interface HerramientaDeDibujo {

    void bajarHerramienta();

    void subirHerramienta();

    int utilizarSobre(Posicion unaPosicion);
}
