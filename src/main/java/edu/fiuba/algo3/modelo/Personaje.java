package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.Direccion;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.HerramientaDeDibujo;
import edu.fiuba.algo3.modelo.Movimientos.MoverseDibujando;
import edu.fiuba.algo3.modelo.Movimientos.MoverseSinDibujar;
import edu.fiuba.algo3.modelo.Movimientos.Movimiento;

public class Personaje {
    private HerramientaDeDibujo herramienta;
    private Posicion posicion;
    private Movimiento movimiento;

    public Personaje(HerramientaDeDibujo unaHerramienta){
        this.posicion = new Posicion(0,0);
        this.movimiento = new MoverseSinDibujar();
        this.herramienta = unaHerramienta;
    }

    public void bajarLapiz() { this.movimiento = new MoverseDibujando(herramienta); }

    public void subirLapiz() { this.movimiento = new MoverseSinDibujar(); }

    public void moverseHacia(Direccion unaDireccion){
        this.posicion = this.movimiento.cambiarPosicion(this.posicion, unaDireccion);
    }

    public Posicion obtenerPosicion() { return this.posicion; }
}
