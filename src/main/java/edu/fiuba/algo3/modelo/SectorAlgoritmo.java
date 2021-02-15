package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.Bloques.ContenedorDeBloques;

public class SectorAlgoritmo {

    private ContenedorDeBloques contenedor;

    public SectorAlgoritmo(){
        this.contenedor = new ContenedorDeBloques();
    }

    public void ejecutar(Personaje personaje){ this.contenedor.ejecutarBloquesCon(personaje); }

    public void agregarBloque(Bloque unBloque) { this.contenedor.agregarBloque(unBloque); }
}