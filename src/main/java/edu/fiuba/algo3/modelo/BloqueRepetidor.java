package edu.fiuba.algo3.modelo;

public class BloqueRepetidor implements Bloque, ContenedorDeBloques{

    private int cantidadDeRepeticiones;
    private BloqueAlgoritmo bloqueAlgoritmo;

    public BloqueRepetidor(int unaCantidad){
        this.cantidadDeRepeticiones = unaCantidad;
        this.bloqueAlgoritmo = new BloqueAlgoritmo();
    }

    @Override
    public void ejecutarSobre(Personaje personaje){

        for (int iteracion = 0; iteracion < cantidadDeRepeticiones; ++iteracion) {
            bloqueAlgoritmo.ejecutarSobre(personaje);
        }
    }

    @Override
    public void agregarBloque(Bloque unBloque) {
        bloqueAlgoritmo.agregarBloque(unBloque);
    }

    @Override
    public Bloque removerBloque() {
        return bloqueAlgoritmo.removerBloque();
    }
}
