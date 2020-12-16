package edu.fiuba.algo3.modelo;

public class BloqueLapizArriba implements Bloque{

    @Override
    public void ejecutarSobre(Personaje personaje){ personaje.subirLapiz(); }
}
