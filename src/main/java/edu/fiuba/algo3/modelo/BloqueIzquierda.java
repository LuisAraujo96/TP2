package edu.fiuba.algo3.modelo;

public class BloqueIzquierda implements Bloque{

    @Override
    public void ejecutarSobre(Personaje personaje){
        Direccion izquierda = new DireccionIzquierda();
        personaje.moverseHacia(izquierda);
    }
}
