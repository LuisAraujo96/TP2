package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.HerramientasDeDibujo.Lapiz;

public class Tablero {

    private SectorAlgoritmo sectorAlgoritmo;
    private SectorBloques sectorBloques;
    private SectorDibujo sectorDibujo;
    private Personaje personaje;

    public Tablero(){
        this.sectorAlgoritmo = new SectorAlgoritmo();
        this.sectorBloques = new SectorBloques();
        this.sectorDibujo = new SectorDibujo();
        this.personaje = new Personaje(new Lapiz(this.sectorDibujo));
    }

    public void ejecutarPrograma(){
        this.sectorAlgoritmo.ejecutarPrograma(this.personaje);
    }

    public void agregarBloque(String nombreBloque){
        this.sectorAlgoritmo.agregarBloque(this.sectorBloques.seleccionarBloque(nombreBloque));
    }

    public void removerBloque(){
        this.sectorAlgoritmo.removerBloque();
    }

    public void guardarBloqueAlgoritmoPersonalizado(String nombreBloqueAlgoritmo){
        this.sectorBloques.guardarBloqueAlgoritmoPersonalizado(nombreBloqueAlgoritmo, this.sectorAlgoritmo.obtenerBloques());
    }
}
