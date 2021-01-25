package edu.fiuba.algo3.modelo.DireccionesDeMovimiento;

public class DireccionArriba implements Direccion{

    @Override
    public int direccionEnX() { return 0; }

    @Override
    public int direccionEnY() { return 1; }
}