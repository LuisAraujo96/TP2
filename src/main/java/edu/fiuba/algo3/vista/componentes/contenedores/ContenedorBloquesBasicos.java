package edu.fiuba.algo3.vista.componentes.contenedores;

import edu.fiuba.algo3.vista.componentes.botones.BotonBloque;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class ContenedorBloquesBasicos extends VBox {
    BotonBloque bloqueArriba;
    BotonBloque bloqueAbajo;
    BotonBloque bloqueIzquierda;
    BotonBloque bloqueDerecha;
    BotonBloque bloqueLapizArriba;
    BotonBloque bloqueLapizAbajo;

    public ContenedorBloquesBasicos(){
        this.setId("ContenedorBloquesBasicos");
        this.setSpacing(10);
        this.setAlignment(Pos.BASELINE_CENTER);
        this.setPadding(new Insets(10));

        bloqueArriba = new BotonBloque("Moverse arriba","src/main/resources/arrows_circle_up.png");
        bloqueAbajo = new BotonBloque("Moverse abajo", "src/main/resources/arrows_circle_down.png");
        bloqueIzquierda = new BotonBloque("Moverse izquierda", "src/main/resources/arrows_circle_right.png");
        bloqueDerecha = new BotonBloque("Moverse derecha", "src/main/resources/arrows_circle_left.png");
        bloqueLapizArriba = new BotonBloque("Subir lapiz", "src/main/resources/software_pencil.png");
        bloqueLapizAbajo = new BotonBloque("Bajar lapiz", "src/main/resources/software_pencil_on.png");

        this.getChildren().addAll(bloqueArriba, bloqueAbajo, bloqueIzquierda, bloqueDerecha, bloqueLapizArriba, bloqueLapizAbajo);
    }
}
