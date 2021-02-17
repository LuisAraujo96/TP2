package edu.fiuba.algo3.modelo.Bloques;


import edu.fiuba.algo3.modelo.ContenedorDeBloques;
import edu.fiuba.algo3.modelo.Personaje;

public class BloqueInversor extends ContenedorDeBloques implements Bloque{

    @Override
    public void ejecutarSobre(Personaje personaje){
        this.ejecutar(bloque -> bloque.ejecutarInversoSobre(personaje));
    }

    @Override
    public void ejecutarInversoSobre(Personaje personaje) {
        this.ejecutar(bloque -> bloque.ejecutarSobre(personaje));
    }

}