package edu.fiuba.algo3.modelo.DireccionesDeMovimiento;

public class DireccionAbajo implements Direccion{

    @Override
    public int obtenerColumnaDelPersonaje() { return 0; }

    @Override
    public int obtenerFilaDelPersonaje() { return -1; }
}