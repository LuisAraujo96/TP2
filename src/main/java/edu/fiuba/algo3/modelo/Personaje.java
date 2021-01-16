package edu.fiuba.algo3.modelo;

public class Personaje {
    private Lapiz lapiz;
    private SectorDibujo sectorDibujo;

    public Personaje(Lapiz unLapiz){
        this.lapiz = unLapiz;
        this.sectorDibujo = new SectorDibujo(); //El constructor deberia recibir el sector dibujo por parametro
    }

    public void bajarLapiz() { this.lapiz = new LapizAbajo(); }

    public void subirLapiz() { this.lapiz = new LapizArriba(); }

    public int moverseHaciaArriba() {
        int resultadoDelDibujo = this.dibujar();
        this.sectorDibujo.moverPersonajeArriba();
        return resultadoDelDibujo; }

    public int moverseHaciaAbajo() {
        int resultadoDelDibujo = this.dibujar();
        this.sectorDibujo.moverPersonajeAbajo();
        return resultadoDelDibujo; }

    public int moverseHaciaIzquierda() {
        int resultadoDelDibujo = this.dibujar();
        this.sectorDibujo.moverPersonajeAIzquierda();
        return resultadoDelDibujo; }

    public int moverseHaciaDerecha() {
        int resultadoDelDibujo = this.dibujar();
        this.sectorDibujo.moverPersonajeADerecha();
        return resultadoDelDibujo; }

    protected Posicion obtenerPosicion() { return this.sectorDibujo.obtenerPosicionDelPersonaje(); }

    protected int dibujar() { return this.lapiz.utilizarSobre(this.obtenerPosicion()); }
}
