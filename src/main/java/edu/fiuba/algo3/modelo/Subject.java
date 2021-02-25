package edu.fiuba.algo3.modelo;

import java.util.List;

abstract class Subject {
    private List<Observer> observers;

    public void addObserver(Observer observador){
        this.observers.add(observador);
    }

    public void removeObserver(Observer observador){
        this.observers.remove(observador);
    }

    public void notifyObservers(){
        for (Observer observador : observers) observador.update();
    }
}
