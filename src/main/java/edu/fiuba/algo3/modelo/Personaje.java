package edu.fiuba.algo3.modelo;

public class Personaje {
    private Dibujador dibujador;
    private Posicion posicion = new Posicion(0, 0);

    public Personaje(Dibujador unDibujador){ this.dibujador = unDibujador; }

    protected Dibujador direccionLapiz() { return this.dibujador; }

    public void subirLapiz() { this.dibujador = new LapizArriba(); }

    public void bajarLapiz() { this.dibujador = new LapizAbajo(); }

    public void moverseHaciaArriba() { this.posicion.moverseHaciaArriba(); }

    public void moverseHaciaAbajo() { this.posicion.moverseHaciaAbajo(); }

    public void moverseHaciaDerecha() { this.posicion.moverseHaciaDerecha(); }

    public void moverseHaciaIzquierda() { this.posicion.moverseHaciaIzquierda(); }

    protected Posicion obtenerPosicion() { return posicion; }
}
