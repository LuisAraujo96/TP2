package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.Bloques.BloqueContenedor;
import edu.fiuba.algo3.modelo.Excepciones.SinBloquesADevolverException;

import java.util.ArrayList;
import java.util.List;

public class SectorAlgoritmo implements Subject {
    List<Observer> observadores;

    BloqueContenedor contenedorInicial;
    BloqueContenedor contenedorActual;

    public SectorAlgoritmo() {
        contenedorInicial = new BloqueContenedor();
        setContenedor(contenedorInicial);

        observadores = new ArrayList<>();
    }

    public void ejecutarPrograma(Personaje personaje) {
        contenedorInicial.ejecutarSobre(personaje);
        System.out.println(personaje.obtenerPosicion().toString());
    }

    public Bloque[] obtenerBloques() throws SinBloquesADevolverException {
        return this.contenedorInicial.obtenerBloques();
    }

    public void vaciarSector() {
        contenedorInicial.vaciarContenedor();
        setContenedor(contenedorInicial);

        notifyObservers();
    }

    public void setContenedor(BloqueContenedor unContenedor) {
        this.contenedorActual = unContenedor;
    }

    public BloqueContenedor getContenedor() {
        return contenedorActual;
    }

    public void agregarBloque(Bloque unBloque) {
        contenedorActual.agregarBloque(unBloque);
        notifyObservers();
    }

    public void agregarBloqueContenedor(BloqueContenedor unContenedor) {
        BloqueContenedor contenedorTemp = contenedorActual;
        this.setContenedor(unContenedor);
        contenedorTemp.agregarBloque(unContenedor);
        notifyObservers();
    }

    public boolean estaVacio(){
        return this.contenedorInicial.estaVacio();
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

    //