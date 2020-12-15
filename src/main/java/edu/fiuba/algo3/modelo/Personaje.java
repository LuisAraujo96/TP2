package edu.fiuba.algo3.modelo;

public class Personaje {
    private Lapiz lapiz = new Lapiz();
    private Posicion posicion = new Posicion(0, 0);

    public LapizEstado direccionLapiz() { return lapiz.direccion(); }

    public void subirLapiz() { lapiz.subirLapiz(); }

    public void bajarLapiz() { lapiz.bajarLapiz(); }

    public void moverseHaciaArriba() { this.posicion.moverseHaciaArriba(); }

    public void moverseHaciaAbajo() { this.posicion.moverseHaciaAbajo(); }

    public void moverseHaciaDerecha() { this.posicion.moverseHaciaDerecha(); }

    public void moverseHaciaIzquierda() { this.posicion.moverseHaciaIzquierda(); }

    protected Posicion obtenerPosicion() { return posicion; }
}
