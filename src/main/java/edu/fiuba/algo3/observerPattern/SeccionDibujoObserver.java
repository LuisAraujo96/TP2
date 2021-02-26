package edu.fiuba.algo3.observerPattern;

import edu.fiuba.algo3.vista.contenedores.SeccionDibujo;

public class SeccionDibujoObserver implements Observer {

    //aqui va tu subject
    Subject subject;
    SeccionDibujo seccionDibujo;

    public SeccionDibujoObserver(Subject unSubject){
        subject = unSubject;
    }

    @Override
    public void update(){

    }
}
