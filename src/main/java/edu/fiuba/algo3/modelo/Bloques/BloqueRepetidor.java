package edu.fiuba.algo3.modelo.Bloques;

import edu.fiuba.algo3.modelo.ContenedorDeBloques;
import edu.fiuba.algo3.modelo.Personaje;

public class BloqueRepetidor extends ContenedorDeBloques implements Bloque{

    private final int cantidadDeRepeticiones;

    public BloqueRepetidor(int unaCantidad){
        this.cantidadDeRepeticiones = unaCantidad;
    }

    @Override
    public void ejecutarSobre(Personaje personaje){
        for (int i = 0; i < cantidadDeRepeticiones; ++i) this.ejecutar(bloque -> bloque.ejecutarSobre(personaje));
    }

    @Override
    public void ejecutarInversoSobre(Personaje personaje) {
        for (int i = 0; i < cantidadDeRepeticiones; ++i) this.ejecutar(bloque -> bloque.ejecutarInversoSobre(personaje));
    }
}
