package edu.fiuba.algo3.modelo;

public class BloqueArriba implements Bloque {

    @Override
    public void ejecutarSobre(Personaje personaje){ personaje.moverseHaciaArriba(); }
}
