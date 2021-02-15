package edu.fiuba.algo3.modelo.Bloques;

import edu.fiuba.algo3.modelo.Personaje;

public class BloqueRepetidor implements Bloque {

    private ContenedorDeBloques contenedor;
    private int cantidadDeRepeticiones;

    public BloqueRepetidor(int unaCantidad){
        this.contenedor = new ContenedorDeBloques();
        this.cantidadDeRepeticiones = unaCantidad;
    }

    @Override
    public void ejecutarSobre(Personaje personaje){
        for (int iteracion = 0; iteracion < cantidadDeRepeticiones; ++iteracion) {
            this.contenedor.ejecutarBloquesCon(personaje);
        }
    }

    public void agregarBloque(Bloque unBloque) { this.contenedor.agregarBloque(unBloque); }
}
