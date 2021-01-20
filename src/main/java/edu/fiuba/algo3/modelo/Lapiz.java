package edu.fiuba.algo3.modelo;

public class Lapiz {
    private LapizEstado lapizEstado;

    public Lapiz() {
        this.lapizEstado = new LapizArriba();
    }

    public void bajarLapiz(){ this.lapizEstado = new LapizAbajo(); }

    public void subirLapiz(){ this.lapizEstado = new LapizArriba(); }

    public int utilizarSobre(Posicion unaPosicion){ return this.lapizEstado.utilizarSobre(unaPosicion); }
}
