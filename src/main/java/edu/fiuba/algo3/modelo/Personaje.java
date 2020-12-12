package edu.fiuba.algo3.modelo;

public class Personaje {
    private Lapiz lapiz = new Lapiz();
    //private SectorDibujo dibujo = new SectorDibujo();

    public void subirLapiz() { lapiz.subirLapiz(); }

    public void bajarLapiz() { lapiz.bajarLapiz(); }

    public void moverseHaciaArriba() {}

    public void moverseHaciaAbajo() {}

    public void moverseHaciaDerecha() {
        //Los metodos de dibujar sobre el tablero no son necesarios para implementar en esta entrega
        //Tienen que ser implementados una vez que ya este creado el sector dibujo (para la entrega de febrero).
        //Falta terminar de implementar el movimiento del personaje en si, como de momento no esta hecho.
        //el sector en el que se va a mover, no llegue a pensar como hacerlo

        //lapiz.dibujar(dibujo);
        //moverseADerecha
        //lapiz.dibujar(dibujo);
        //moverseADerecha
        //lapiz.dibujar(dibujo);
    }

    public void moverseHaciaIzquierda() {}
}
