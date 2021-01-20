package edu.fiuba.algo3.modelo;

public class Personaje {
    private Lapiz lapiz;
    private SectorDibujo sectorDibujo;

    public Personaje(Lapiz unLapiz){
        this.lapiz = unLapiz;
        this.sectorDibujo = new SectorDibujo(); //El constructor deberia recibir el sector dibujo por parametro
    }

    public void bajarLapiz() { lapiz.bajarLapiz(); }

    public void subirLapiz() { lapiz.subirLapiz(); }

    public int moverseHacia(Direccion unaDireccion){
        this.dibujar();
        this.sectorDibujo.moverPersonajeHacia(unaDireccion);
        return this.dibujar();
    }

    protected Posicion obtenerPosicion() { return this.sectorDibujo.obtenerPosicionDelPersonaje(); }

    protected int dibujar() { return this.lapiz.utilizarSobre(this.obtenerPosicion()); }
}
