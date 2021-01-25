package edu.fiuba.algo3.modelo.HerramientaDeDibujo;

import edu.fiuba.algo3.modelo.Posicion.Posicion;

public class Lapiz implements HerramientaDeDibujo{
    private LapizEstado lapizEstado;

    public Lapiz() {
        this.lapizEstado = new LapizArriba();
    }

    public void bajarHerramienta(){ this.lapizEstado = new LapizAbajo(); }

    public void subirHerramienta(){ this.lapizEstado = new LapizArriba(); }

    public int utilizarSobre(Posicion unaPosicion){ return this.lapizEstado.utilizarSobre(unaPosicion); }
}
