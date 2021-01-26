package edu.fiuba.algo3.modelo.DireccionesDeMovimiento;

public class DireccionArriba implements Direccion{

    @Override
    public int obtenerColumnaDelPersonaje() { return 0; }

    @Override
    public int obtenerFilaDelPersonaje() { return 1; }
}