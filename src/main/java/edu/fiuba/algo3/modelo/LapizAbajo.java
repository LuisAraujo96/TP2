package edu.fiuba.algo3.modelo;

public class LapizAbajo implements LapizEstado {

    @Override
    public int utilizarSobre(Posicion posicion) {
        posicion.dibujar();
        return posicion.representar();
        //Acá debería pintar el dibujo con un 1 en esa posición, sin importar que contenga la matriz
        //del SectorDibujo previamente en esa posición.
        //Para mas info revisar la clase SectorDibujo.
    }
}