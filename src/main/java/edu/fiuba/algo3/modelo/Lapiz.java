package edu.fiuba.algo3.modelo;

public class Lapiz implements HerramientaDeDibujo{
    private LapizEstado lapizEstado;

    public Lapiz() {
        this.lapizEstado = new LapizArriba();
    }

    public void bajarHerramienta(){ this.lapizEstado = new LapizAbajo(); }

    public void subirHerramienta(){ this.lapizEstado = new LapizArriba(); }

    public int utilizarSobre(Posicion unaPosicion){ return this.lapizEstado.utilizarSobre(unaPosicion); }
}
