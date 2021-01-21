package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.function.Consumer;

public class BloqueAlgoritmo implements Bloque, ContenedorDeBloques{
    private ArrayList<Bloque> bloques;

    public BloqueAlgoritmo(){
        this.bloques = new ArrayList<>();
    }

    @Override
    public void ejecutarSobre(Personaje personaje) {
        Consumer<Bloque> ejecutar = bloque -> bloque.ejecutarSobre(personaje);
        bloques.forEach(ejecutar);
    }

    @Override
    public void agregarBloque(Bloque unBloque) {
        bloques.add(unBloque);
    }

    @Override
    public Bloque removerBloque() {
        return bloques.remove(bloques.size() - 1);
    }
}
