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
        bloqueArriba = new BotonBloque("Bloque arriba");
        bloqueAbajo = new BotonBloque("Bloque abajo");
        bloqueIzquierda = new BotonBloque("Bloque izquierda");
        bloqueDerecha = new BotonBloque("Bloque derecha");
        bloqueLapizArriba = new BotonBloque("Bloque lapiz arriba");
        bloqueLapizAbajo = new BotonBloque("Bloque lapiz abajo");

        this.getChildren().addAll(bloqueArriba, bloqueAbajo, bloqueIzquierda, bloqueDerecha, bloqueLapizArriba, bloqueLapizAbajo);
    }
}
