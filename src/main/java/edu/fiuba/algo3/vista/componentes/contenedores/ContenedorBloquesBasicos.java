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
    public ContenedorBloquesBasicos(){
        this.setId("ContenedorBloquesBasicos");
        this.setSpacing(10);
        this.setAlignment(Pos.BASELINE_CENTER);
        this.setPadding(new Insets(10));
        bloqueArriba = new BotonBloque("BloqueArriba");
        bloqueAbajo = new BotonBloque("BloqueAbajo");
        bloqueIzquierda = new BotonBloque("BloqueIzquierda");
        bloqueDerecha = new BotonBloque("BloqueDerecha");

        this.getChildren().addAll(bloqueArriba, bloqueAbajo, bloqueIzquierda, bloqueDerecha);
    }
}
