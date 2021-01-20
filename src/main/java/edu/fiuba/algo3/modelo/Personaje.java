package edu.fiuba.algo3.modelo;

public class Personaje {
    private HerramientaDeDibujo lapiz;
    private SectorDibujo sectorDibujo;

    public Personaje(HerramientaDeDibujo unLapiz){
        this.lapiz = unLapiz;
        this.sectorDibujo = new SectorDibujo(); //El constructor deberia recibir el sector dibujo por parametro
    }

    public void bajarLapiz() { lapiz.bajarHerramienta(); }

    public void subirLapiz() { lapiz.subirHerramienta(); }

    public int moverseHacia(Direccion unaDireccion){
        this.dibujar();
        this.sectorDibujo.cambiarPosicionDePersonajeHacia(unaDireccion);
        return this.dibujar();
    }

    protected Posicion obtenerPosicion() { return this.sectorDibujo.obtenerPosicionDelPersonaje(); }

    protected int dibujar() { return this.lapiz.utilizarSobre(this.obtenerPosicion()); }
}
