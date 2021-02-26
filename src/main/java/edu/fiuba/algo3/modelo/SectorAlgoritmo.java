package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.Excepciones.AlgoritmoSinBloquesException;

public class SectorAlgoritmo extends ContenedorDeBloques{

    public void ejecutarPrograma (Personaje personaje) { this.ejecutar(bloque -> bloque.ejecutarSobre(personaje)); }

    public Bloque[] obtenerBloques() throws AlgoritmoSinBloquesException {
        if (this.bloques.isEmpty()) { throw new AlgoritmoSinBloquesException(); }
        return this.bloques.toArray(new Bloque[this.bloques.size()]);
    }

    public void vaciarSector(){
        bloques.clear();
    }
}