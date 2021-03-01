package edu.fiuba.algo3.modelo;

import java.util.*;

public class SectorDibujo implements Subject{
    List<Observer> observadores;
    Posicion inicio;
    Posicion fin;

    private final HashMap<Posicion, HashSet<Posicion>> trazos;

    public SectorDibujo(){
        trazos = new HashMap<>();
        observadores = new ArrayList<>();
    }

    public void agregarTrazo (Posicion inicio, Posicion fin){
        trazos.putIfAbsent(inicio, new HashSet<>());
        trazos.putIfAbsent(fin, new HashSet<>());

        this.inicio = inicio;
        this.fin = fin;

        trazos.get(inicio).add(fin);
        trazos.get(fin).add(inicio);
        notifyObservers();
    }

    public Posicion obtenerVariacionDePosicion(){
        return new Posicion(fin.getX() - inicio.getX(), inicio.getY() - fin.getY() );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SectorDibujo that = (SectorDibujo) o;
        return Objects.equals(trazos, that.trazos);
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
