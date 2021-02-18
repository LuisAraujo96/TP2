package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Bloques.Bloque;

public class SectorAlgoritmo extends ContenedorDeBloques{

    public void ejecutarPrograma (Personaje personaje) { this.ejecutar(bloque -> bloque.ejecutarSobre(personaje)); }

    public Bloque[] obtenerBloques(){ 
      return this.bloques.toArray(new Bloque[0]); }
}