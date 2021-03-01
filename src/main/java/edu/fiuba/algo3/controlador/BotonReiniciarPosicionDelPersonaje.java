package edu.fiuba.algo3.controlador;


import edu.fiuba.algo3.modelo.Personaje;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonReiniciarPosicionDelPersonaje implements EventHandler<ActionEvent> {

    private Personaje personaje;

    public BotonReiniciarPosicionDelPersonaje(Personaje unPersonaje){
        this.personaje = unPersonaje;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.personaje.resetPersonaje();
    }
}
