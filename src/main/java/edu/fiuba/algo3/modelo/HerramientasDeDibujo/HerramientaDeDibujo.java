package edu.fiuba.algo3.modelo.HerramientasDeDibujo;

import edu.fiuba.algo3.modelo.Posiciones.Posicion;

public interface HerramientaDeDibujo {

    void bajarHerramienta();

    void subirHerramienta();

    int utilizarSobre(Posicion unaPosicion);
}
