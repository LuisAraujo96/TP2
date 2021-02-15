package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Bloques.Bloque;

public class SectorAlgoritmo extends ContenedorDeBloques{

    private ContenedorDeBloques contenedor;

    public SectorAlgoritmo(){
        this.contenedor = new ContenedorDeBloques();
    }

  //  public void ejecutar(Personaje personaje){ this.contenedor.ejecutar(personaje); }

    public void agregarBloque(Bloque unBloque) { this.contenedor.agregarBloque(unBloque); }
}