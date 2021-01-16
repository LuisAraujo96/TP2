package edu.fiuba.algo3.modelo;

public class BloqueAbajo implements Bloque{

    @Override
    public void ejecutarSobre(Personaje personaje){
        Direccion abajo = new DireccionAbajo();
        personaje.moverseHacia(abajo);
    }
}