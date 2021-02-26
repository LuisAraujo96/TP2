package edu.fiuba.algo3.observerPattern;


public interface Subject {

    public void addObserver(Observer obs);

    public void removeObserver(Observer obs);

    public void notifyObservers();

}
