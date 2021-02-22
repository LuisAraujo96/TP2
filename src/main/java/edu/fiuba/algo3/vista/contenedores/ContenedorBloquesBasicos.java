package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.botones.BotonBloque;
import edu.fiuba.algo3.vista.contenedores.ContenedorBloqueAlgoritmo;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class ContenedorBloquesBasicos extends VBox implements EventHandler {
    BotonBloque bloqueArriba;
    BotonBloque bloqueAbajo;
    BotonBloque bloqueIzquierda;
    BotonBloque bloqueDerecha;
    BotonBloque bloqueLapizArriba;
    BotonBloque bloqueLapizAbajo;
    BotonBloque bloqueNuevo;
    ContenedorBloqueAlgoritmo contenedorBloqueAlgoritmo;

    public ContenedorBloquesBasicos(ContenedorBloqueAlgoritmo contenedorBloqueAlgoritmo){
        this.setId("ContenedorBloquesBasicos");
        this.setSpacing(10);
        this.setAlignment(Pos.BASELINE_CENTER);
        this.setPadding(new Insets(10));
        this.contenedorBloqueAlgoritmo = contenedorBloqueAlgoritmo;

        bloqueArriba = new BotonBloque("Moverse arriba","src/main/resources/arrows_circle_up.png");
        bloqueArriba.setOnAction(this);
        bloqueAbajo = new BotonBloque("Moverse abajo", "src/main/resources/arrows_circle_down.png");
        bloqueAbajo.setOnAction(this);
        bloqueIzquierda = new BotonBloque("Moverse izquierda", "src/main/resources/arrows_circle_right.png");
        bloqueIzquierda.setOnAction(this);
        bloqueDerecha = new BotonBloque("Moverse derecha", "src/main/resources/arrows_circle_left.png");
        bloqueDerecha.setOnAction(this);
        bloqueLapizArriba = new BotonBloque("Subir lapiz", "src/main/resources/software_pencil.png");
        bloqueLapizArriba.setOnAction(this);
        bloqueLapizAbajo = new BotonBloque("Bajar lapiz", "src/main/resources/software_pencil_on.png");
        bloqueLapizAbajo.setOnAction(this);

        this.getChildren().addAll(bloqueArriba, bloqueAbajo, bloqueIzquierda, bloqueDerecha, bloqueLapizArriba, bloqueLapizAbajo);
    }

    @Override
    public void handle(Event event) {
        if(event.getSource() == bloqueArriba){
            this.contenedorBloqueAlgoritmo.getChildren().add(new BotonBloque("Moverse arriba","src/main/resources/arrows_circle_up.png"));
        } else if (event.getSource() == bloqueAbajo){
            this.contenedorBloqueAlgoritmo.getChildren().add(new BotonBloque("Moverse abajo", "src/main/resources/arrows_circle_down.png"));
        } else if (event.getSource() == bloqueIzquierda){
            this.contenedorBloqueAlgoritmo.getChildren().add(new BotonBloque("Moverse izquierda", "src/main/resources/arrows_circle_right.png"));
        } else if (event.getSource() == bloqueDerecha){
            this.contenedorBloqueAlgoritmo.getChildren().add(new BotonBloque("Moverse derecha", "src/main/resources/arrows_circle_left.png"));
        } else if (event.getSource() == bloqueLapizArriba){
            this.contenedorBloqueAlgoritmo.getChildren().add(new BotonBloque("Subir lapiz", "src/main/resources/software_pencil.png"));
        } else if (event.getSource() == bloqueLapizAbajo){
            this.contenedorBloqueAlgoritmo.getChildren().add(new BotonBloque("Bajar lapiz", "src/main/resources/software_pencil_on.png"));
        }
    }
}
