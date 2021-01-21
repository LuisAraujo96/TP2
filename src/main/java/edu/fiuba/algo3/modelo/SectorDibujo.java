package edu.fiuba.algo3.modelo;

public class SectorDibujo {
    private int extensionDeLaMatriz;
    private Posicion matrizDePosiciones[][];
    private int yDelPersonaje;
    private int xDelPersonaje;

    public SectorDibujo(){
        this.extensionDeLaMatriz = 21; //Matriz de 21x21. Usar numeros impares para la matriz unicamente
        int extremoYPositivo = (this.extensionDeLaMatriz / 2); //Calculo que sirve para que cada posicion de la matriz tenga un x e y correcto
        int extremoXNegativo = (this.extensionDeLaMatriz / 2) * (-1); //Calculo que sirve para que cada posicion de la matriz tenga un x e y correcto

        this.matrizDePosiciones = new Posicion[extensionDeLaMatriz][extensionDeLaMatriz];

        for(int fila = 0; fila < this.extensionDeLaMatriz; fila++){
            for(int columna = 0; columna < this.extensionDeLaMatriz; columna++){
                this.matrizDePosiciones[fila][columna] = new Posicion(extremoXNegativo + columna, extremoYPositivo - fila);
            }
        }

        this.yDelPersonaje = (this.extensionDeLaMatriz / 2);
        this.xDelPersonaje = (this.extensionDeLaMatriz / 2);
    }

    public Posicion obtenerPosicionDelPersonaje() {
        return this.matrizDePosiciones[this.yDelPersonaje][this.xDelPersonaje];
    }

    public void cambiarPosicionDePersonajeHacia(Direccion unaDireccion) {
        this.xDelPersonaje = (this.xDelPersonaje + unaDireccion.direccionEnX()) % this.extensionDeLaMatriz;
        this.yDelPersonaje = (this.yDelPersonaje - unaDireccion.direccionEnY()) % this.extensionDeLaMatriz;
    }

    //El Sector Dibujo esta compuesto por una matriz donde cada posicion este llena de 0's,
    //donde el 0 significa que es una posicion la cual no esta pintada o pintada de blanco
    //y el 1 significa que es una posicion que esta pintada de negro.
    //
    //El personaje es el unico que pinta las posicion de negro (con 1), y no puede volverse a pintar
    //con posiciones blancas (con 0).
    //
}
