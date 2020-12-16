package edu.fiuba.algo3.modelo;

public class BloqueLapizAbajo implements Bloque {

    @Override
    public void ejecutarSobre(Personaje personaje){ personaje.bajarLapiz(); }
}
