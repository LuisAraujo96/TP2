package edu.fiuba.algo3.modelo;

public class SectorDibujo {
    private Posicion matrizDePosiciones[][];
    private int extensionDeLaMatriz = 11;
    private int yDelPersonaje;
    private int xDelPersonaje;

    public SectorDibujo(){
        int ejeMedio = (extensionDeLaMatriz / 2); //Calculo que sirve para que cada posicion de la matriz tenga un x e y correcto

        this.matrizDePosiciones = new Posicion[extensionDeLaMatriz][extensionDeLaMatriz];

        for(int fila = 0; fila < extensionDeLaMatriz; fila++){
            for(int columna = 0; columna < extensionDeLaMatriz; columna++){
                this.matrizDePosiciones[columna][fila] = new Posicion(columna - ejeMedio, ejeMedio - fila);
            }
        }

        this.yDelPersonaje = ejeMedio;
        this.xDelPersonaje = ejeMedio;
    }

    public Posicion obtenerPosicionDelPersonaje() {
        return this.matrizDePosiciones[this.xDelPersonaje][this.yDelPersonaje];
    }

    public void moverPersonajeA(Direccion unaDireccion) {
        this.xDelPersonaje += unaDireccion.direccionEnX();
        this.yDelPersonaje -= unaDireccion.direccionEnY();
    }

    //El Sector Dibujo esta compuesto por una matriz donde cada posicion este llena de 0's,
    //donde el 0 significa que es una posicion la cual no esta pintada o pintada de blanco
    //y el 1 significa que es una posicion que esta pintada de negro.
    //
    //El personaje es el unico que pinta las posicion de negro (con 1), y no puede volverse a pintar
    //con posiciones blancas (con 0).
    //
}
