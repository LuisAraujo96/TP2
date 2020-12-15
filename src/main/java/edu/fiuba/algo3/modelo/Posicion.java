package edu.fiuba.algo3.modelo;

public class Posicion {
    private int x;
    private int y;

    public Posicion(int unaPosicion, int otraPosicion){ this.x = unaPosicion; this.y = otraPosicion;}

    public void moverseHaciaArriba() { y++; }

    public void moverseHaciaAbajo() { y--; }

    public void moverseHaciaDerecha() { x++; }

    public void moverseHaciaIzquierda() { x--; }

    public boolean compararPosiciones(Posicion otraPosicion){

        return (this.x == otraPosicion.x && this.y == otraPosicion.y);
    }
}
