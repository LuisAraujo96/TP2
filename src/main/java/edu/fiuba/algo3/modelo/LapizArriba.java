package edu.fiuba.algo3.modelo;

public class LapizArriba implements Lapiz {

    @Override
    public int utilizarSobre(Posicion posicion) {
        return posicion.representar();
        //Acá no debería pintar el dibujo, ni alterar la matriz del SectorDibujo.
        //Para mas info revisar la clase SectorDibujo.
    }
}