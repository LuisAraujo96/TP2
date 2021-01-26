package edu.fiuba.algo3.modelo.DireccionesDeMovimiento;

public class DireccionIzquierda implements Direccion{

    @Override
    public int obtenerColumnaDelPersonaje() { return -1; }

    @Override
    public int obtenerFilaDelPersonaje() { return 0; }
}
