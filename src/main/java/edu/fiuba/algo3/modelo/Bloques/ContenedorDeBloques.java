package edu.fiuba.algo3.modelo.Bloques;

import edu.fiuba.algo3.modelo.Personaje;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ContenedorDeBloques {

    private ArrayList<Bloque> bloques;

    public ContenedorDeBloques(){
        this.bloques = new ArrayList<>();
    }

    public void agregarBloque(Bloque unBloque) { bloques.add(unBloque); }

    public void ejecutarBloquesCon(Personaje personaje){
        Consumer<Bloque> ejecutar = bloque -> bloque.ejecutarSobre(personaje);
        bloques.forEach(ejecutar);
    }
}