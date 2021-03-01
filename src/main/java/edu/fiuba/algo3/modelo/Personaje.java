package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.Direccion;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.HerramientaDeDibujo;
import edu.fiuba.algo3.modelo.Movimientos.MoverseDibujando;
import edu.fiuba.algo3.modelo.Movimientos.MoverseSinDibujar;
import edu.fiuba.algo3.modelo.Movimientos.Movimiento;

import java.util.ArrayList;
import java.util.List;

public class Personaje implements Subject{

    List<Observer> observadores;
    private HerramientaDeDibujo herramienta;
    private Posicion posicion;
    private Movimiento movimiento;

    public Personaje(HerramientaDeDibujo unaHerramienta){
        this.posicion = new Posicion(0,0);
        this.movimiento = new MoverseSinDibujar();
        this.herramienta = unaHerramienta;
        //notificar a seccion personaje para incicalizar en 0,0
        observadores = new ArrayList<>();
    }

    public void bajarLapiz() { this.movimiento = new MoverseDibujando(herramienta); }

    public void subirLapiz() { this.movimiento = new MoverseSinDibujar(); }

    public void moverseHacia(Direccion unaDireccion){
        this.posicion = this.movimiento.cambiarPosicion(this.posicion, unaDireccion);
        notifyObservers();
    }

    public Posicion obtenerPosicion() { return this.posicion; }

    public void resetPosicion(){
        this.posicion = new Posicion(0,0);
    }

    @Override
    public void addObserver(Observer obs) {
        observadores.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observadores.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observadores) obs.update();
    }
}
