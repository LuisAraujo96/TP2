package edu.fiuba.algo3.modelo.HerramientasDeDibujo;

import edu.fiuba.algo3.modelo.Posiciones.Posicion;
import edu.fiuba.algo3.modelo.SectorDibujo;

public class Lapiz implements HerramientaDeDibujo{
    private SectorDibujo sector;

    public Lapiz(SectorDibujo sectorDibujo) {
        this.sector = sectorDibujo;
    }

    public void dibujarLinea(Posicion posicionInicial, Posicion posicionFinal){
        this.sector.dibujarDesdeHasta(posicionInicial, posicionFinal);
    }
}
