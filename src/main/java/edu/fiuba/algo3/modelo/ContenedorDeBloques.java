package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Bloques.Bloque;

import java.util.ArrayList;
import java.util.function.Consumer;



public class ContenedorDeBloques {

    private final ArrayList<Bloque> bloques;

    public ContenedorDeBloques(){
        this.bloques = new ArrayList<>();
    }

    public void agregarBloque(Bloque unBloque) { 
        bloques.add(unBloque); 
    }
    
    public void removerBloque( Bloque unBloque ) {
        bloques.remove(unBloque);
    }
    
    protected void ejecutar(Consumer<Bloque> funcion){
        bloques.forEach(funcion);
    }
}