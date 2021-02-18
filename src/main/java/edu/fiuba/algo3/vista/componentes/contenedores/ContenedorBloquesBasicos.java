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

        bloqueArriba = new BotonBloque("Bloque arriba","src/main/resources/arrows_circle_up.png");
        bloqueAbajo = new BotonBloque("Bloque abajo", "src/main/resources/arrows_circle_down.png");
        bloqueIzquierda = new BotonBloque("Bloque izquierda", "src/main/resources/arrows_circle_left.png");
        bloqueDerecha = new BotonBloque("Bloque derecha", "src/main/resources/arrows_circle_right.png");
        bloqueLapizArriba = new BotonBloque("Bloque lapiz arriba", "src/main/resources/software_pencil.png");
        bloqueLapizAbajo = new BotonBloque("Bloque lapiz abajo", "src/main/resources/software_pencil_on.png");

        this.getChildren().addAll(bloqueArriba, bloqueAbajo, bloqueIzquierda, bloqueDerecha, bloqueLapizArriba, bloqueLapizAbajo);
    }
}
