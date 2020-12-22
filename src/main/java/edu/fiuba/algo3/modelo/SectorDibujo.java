package edu.fiuba.algo3.modelo;

public class SectorDibujo {
    private int extension;
    private Posicion posicion[][];
    private int filaPersonaje;
    private int columnaPersonaje;
    private int calculoAuxiliarPositivo;
    private int calculoAuxiliarNegativo;

    public SectorDibujo(){
        this.extension = 101; //Numeros impares solamente
        this.calculoAuxiliarPositivo = (this.extension / 2);
        this.calculoAuxiliarNegativo = (this.extension / 2) * (-1);

        this.posicion = new Posicion[this.extension][this.extension];

        for(int fila = 0; fila < this.extension; fila++){
            for(int columna = 0; columna < this.extension; columna++){
                this.posicion[fila][columna] = new Posicion(this.calculoAuxiliarNegativo + columna, this.calculoAuxiliarPositivo - fila);
            }
        }

        this.filaPersonaje = (this.extension / 2);
        this.columnaPersonaje = (this.extension / 2);
    }

    public Posicion obtenerPosicion() {
        return this.posicion[this.filaPersonaje][this.columnaPersonaje];
    }

    public int dibujar(Lapiz unLapiz){
        return unLapiz.utilizarSobre(this.posicion[this.filaPersonaje][this.columnaPersonaje]);
    }

    public void moverseHaciaArriba(){ this.filaPersonaje -= 1; }

    public void moverseHaciaAbajo(){ this.filaPersonaje += 1; }

    public void moverseHaciaDerecha() { this.columnaPersonaje += 1; }

    public void moverseHaciaIzquierda() { this.columnaPersonaje -= 1; }

    //Deberia estar compuesto por una matriz donde cada posicion este llena de 0's,
    //donde el 0 significa que es una posicion la cual no esta pintada o pintada de blanco
    //y el 1 significa que es una posicion que esta pintada de negro.
    //
    //El personaje es el unico que pinta las posicion de negro (con 1), y no puede volverse a pintar
    //con posiciones blancas (con 0).
    //
    //No implementé el sector dibujo ya que se tiene que implementar para una futura entrega.
    //
    //Tampoco me parece necesario implementarlo ahora, porque es un vistazo general
    //y estas ideas pueden sufrir cambios a futuro.

}
