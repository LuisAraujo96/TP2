package edu.fiuba.algo3.modelo;

public class SectorDibujo {
    private Trazo trazos;

    public SectorDibujo(){
        trazos = new Trazo();
    }

    public Trazo obtenerTrazos(){
        return this.trazos;
    }
}
