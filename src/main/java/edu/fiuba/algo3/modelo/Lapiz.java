package edu.fiuba.algo3.modelo;

public class Lapiz {
    private LapizEstado estado = new LapizArriba();

    public void subirLapiz(){
        this.estado = new LapizArriba();
    }

    public void bajarLapiz(){
        this.estado = new LapizAbajo();
    }

    public LapizEstado direccion () {
        return this.estado;
    }

    public void dibujar(SectorDibujo dibujo){
        estado.dibujar(dibujo);
    }
}