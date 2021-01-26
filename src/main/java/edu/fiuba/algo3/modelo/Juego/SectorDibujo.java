package edu.fiuba.algo3.modelo.Juego;

import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.Direccion;
import edu.fiuba.algo3.modelo.Posicion.Posicion;

public class SectorDibujo {
    private int extensionDeLaMatriz;
    private Posicion matrizDePosiciones[][];
    private int filaDelPersonaje;
    private int columnaDelPersonaje;

    public SectorDibujo(){
        this.extensionDeLaMatriz = 21;
        int extremoYPositivo = (this.extensionDeLaMatriz / 2);
        int extremoXNegativo = (this.extensionDeLaMatriz / 2) * (-1);

        this.matrizDePosiciones = new Posicion[extensionDeLaMatriz][extensionDeLaMatriz];

        for(int fila = 0; fila < this.extensionDeLaMatriz; fila++){
            for(int columna = 0; columna < this.extensionDeLaMatriz; columna++){
                this.matrizDePosiciones[fila][columna] = new Posicion(extremoXNegativo + columna, extremoYPositivo - fila);
            }
        }

        this.filaDelPersonaje = (this.extensionDeLaMatriz / 2);
        this.columnaDelPersonaje = (this.extensionDeLaMatriz / 2);
    }

    public Posicion obtenerPosicionDelPersonaje() {
        return this.matrizDePosiciones[this.filaDelPersonaje][this.columnaDelPersonaje];
    }

    public void cambiarPosicionDePersonajeHacia(Direccion unaDireccion) {
        this.columnaDelPersonaje = Math.floorMod(this.columnaDelPersonaje + unaDireccion.columnaDelPersonaje(), this.extensionDeLaMatriz);
        this.filaDelPersonaje = Math.floorMod(this.filaDelPersonaje - unaDireccion.filaDelPersonaje(), this.extensionDeLaMatriz);
    }
}
