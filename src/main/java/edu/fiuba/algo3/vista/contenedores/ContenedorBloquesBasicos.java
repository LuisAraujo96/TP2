package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.botones.BotonBloque;
import edu.fiuba.algo3.vista.botones.BotonConIcono;
import edu.fiuba.algo3.vista.contenedores.ContenedorBloqueAlgoritmo;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class ContenedorBloquesBasicos extends VBox implements EventHandler {
    BotonConIcono bloqueArriba;
    BotonConIcono bloqueAbajo;
    BotonConIcono bloqueIzquierda;
    BotonConIcono bloqueDerecha;
    BotonConIcono bloqueLapizArriba;
    BotonConIcono bloqueLapizAbajo;
    BotonBloque bloqueNuevo;
    ContenedorBloqueAlgoritmo contenedorBloqueAlgoritmo;

    public ContenedorBloquesBasicos(ContenedorBloqueAlgoritmo contenedorBloqueAlgoritmo){
        this.setId("ContenedorBloquesBasicos");
        this.setSpacing(10);
        this.setAlignment(Pos.BASELINE_CENTER);
        this.setPadding(new Insets(10));
        this.contenedorBloqueAlgoritmo = contenedorBloqueAlgoritmo;

        bloqueArriba = new BotonConIcono("Moverse arriba","src/main/resources/flecha_arriba.png");

        bloqueArriba.setOnAction(this);
        bloqueAbajo = new BotonConIcono("Moverse abajo", "src/main/resources/flecha_abajo.png");
        bloqueAbajo.setOnAction(this);
        bloqueIzquierda = new BotonConIcono("Moverse izquierda", "src/main/resources/flecha_izquierda.png");
        bloqueIzquierda.setOnAction(this);
        bloqueDerecha = new BotonConIcono("Moverse derecha", "src/main/resources/flecha_derecha.png");
        bloqueDerecha.setOnAction(this);
        bloqueLapizArriba = new BotonConIcono("Subir lapiz", "src/main/resources/lapiz_arriba.png");
        bloqueLapizArriba.setOnAction(this);
        bloqueLapizAbajo = new BotonConIcono("Bajar lapiz", "src/main/resources/lapiz_abajo.png");
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
