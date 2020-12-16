package edu.fiuba.algo3.modelo;

public class BloqueIzquierda implements Bloque{

    @Override
    public void ejecutarSobre(Personaje personaje){ personaje.moverseHaciaIzquierda(); }
}
