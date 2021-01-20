package edu.fiuba.algo3.modelo;
public class BloqueRepetidor implements Bloque{

    private int cantidadDeRepeticiones;
    private Bloque bloqueARepetir;

    public BloqueRepetidor(int unaCantidad){
        cantidadDeRepeticiones = unaCantidad;
    }

    @Override
    public void ejecutarSobre(Personaje personaje){
        for (int iteracion = 0; iteracion < cantidadDeRepeticiones; ++iteracion){
            bloqueARepetir.ejecutarSobre(personaje);
        }
    }

    public void agregarBloque(Bloque unBloque){
        bloqueARepetir = unBloque;
    }
}
