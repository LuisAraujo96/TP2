package edu.fiuba.algo3.modelo;

public class Personaje {
    private Lapiz lapiz;
    private SectorDibujo dibujo;

    public Personaje(Lapiz unLapiz){
        this.lapiz = unLapiz;
        this.dibujo = new SectorDibujo();
    }

    protected Lapiz lapiz() { return this.lapiz; }

    public void subirLapiz() { this.lapiz = new LapizArriba(); }

    public void bajarLapiz() { this.lapiz = new LapizAbajo(); }

    private int utilizarLapiz() { return this.dibujo.dibujar(this.lapiz); }

    public int moverseHaciaArriba() {
        this.utilizarLapiz();
        this.dibujo.moverseHaciaArriba();
        int resultadoDelDibujo = this.utilizarLapiz();
        return resultadoDelDibujo; }

    public int moverseHaciaAbajo() {
        this.utilizarLapiz();
        this.dibujo.moverseHaciaAbajo();
        int resultadoDelDibujo = this.utilizarLapiz();
        return resultadoDelDibujo; }

    public int moverseHaciaDerecha() {
        this.utilizarLapiz();
        this.dibujo.moverseHaciaDerecha();
        int resultadoDelDibujo = this.utilizarLapiz();
        return resultadoDelDibujo; }

    public int moverseHaciaIzquierda() {
        this.utilizarLapiz();
        this.dibujo.moverseHaciaIzquierda();
        int resultadoDelDibujo = this.utilizarLapiz();
        return resultadoDelDibujo; }

    protected Posicion obtenerPosicion() { return this.dibujo.obtenerPosicion(); }
}
