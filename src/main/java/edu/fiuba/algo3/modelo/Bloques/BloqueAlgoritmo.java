package edu.fiuba.algo3.modelo.Bloques;

import edu.fiuba.algo3.modelo.Personaje;

public class BloqueAlgoritmo implements Bloque{

    private Bloque[] bloques;
    private String nombre;

    public BloqueAlgoritmo(String unNombre, Bloque[] unosBloques){
        this.bloques = unosBloques;
        this.nombre = unNombre;
    }

    public String obtenerNombre () {
        return this.nombre;
    }

    @Override
    public void ejecutarSobre(Personaje personaje) {
        for (Bloque unBloque: this.bloques){
            unBloque.ejecutarSobre(personaje);
        }
    }

    @Override
    public void ejecutarInversoSobre(Personaje personaje) {
        for (Bloque unBloque: this.bloques){
            unBloque.ejecutarInversoSobre(personaje);
        }
    }
}
