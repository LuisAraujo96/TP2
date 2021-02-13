package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Posiciones.Posicion;

public class SectorDibujo {
    private Trazo trazos;

    public SectorDibujo(){
        trazos = new Trazo();
    }

    public void dibujarDesdeHasta(Posicion posicionInicial, Posicion posicionFinal){
        trazos.agregarLinea(posicionInicial, posicionFinal);
    }

    public Trazo obtenerTrazos(){
        return this.trazos;
    }
}
