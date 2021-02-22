package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.Excepciones.AlgoritmoSinBloquesException;
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

    public SectorDibujo ejecutarPrograma(){
        this.sectorAlgoritmo.ejecutarPrograma(this.personaje);
        return this.sectorDibujo;
    }

    public void agregarBloque(Bloque unBloque){
        this.sectorAlgoritmo.agregarBloque(unBloque);
    }

    public void removerBloque(){
        this.sectorAlgoritmo.removerBloque();
    }

    public void guardarBloqueAlgoritmoPersonalizado(String nombreBloqueAlgoritmo) throws AlgoritmoSinBloquesException {
        this.sectorBloques.guardarBloqueAlgoritmoPersonalizado(nombreBloqueAlgoritmo, this.sectorAlgoritmo.obtenerBloques());
    }

    public Bloque seleccionarBloqueAlgoritmoPersonalizado(String nombreBloqueAlgoritmo){
        return this.sectorBloques.seleccionarBloque(nombreBloqueAlgoritmo);
    }
}
