package edu.fiuba.algo3.modelo.Bloques;

import edu.fiuba.algo3.modelo.Personaje;

import java.util.ArrayList;
import java.util.function.Consumer;

public class BloqueRepetidor implements Bloque, ContenedorDeBloques{

    private int cantidadDeRepeticiones;
    private ArrayList<Bloque> bloques;

    public BloqueRepetidor(int unaCantidad){
        this.cantidadDeRepeticiones = unaCantidad;
        this.bloques = new ArrayList<>();
    }

    @Override
    public void ejecutarSobre(Personaje personaje){
        Consumer<Bloque> ejecutar = bloque -> bloque.ejecutarSobre(personaje);

        for (int iteracion = 0; iteracion < cantidadDeRepeticiones; ++iteracion) {
            bloques.forEach(ejecutar);
        }
    }

    @Override
    public void agregarBloque(Bloque unBloque) {
        bloques.add(unBloque);
    }
}
