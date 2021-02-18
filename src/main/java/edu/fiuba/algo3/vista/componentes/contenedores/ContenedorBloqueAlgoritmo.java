package edu.fiuba.algo3.vista.componentes.contenedores;

import edu.fiuba.algo3.vista.componentes.botones.BotonBloque;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class ContenedorBloqueAlgoritmo extends VBox {

    public ContenedorBloqueAlgoritmo() {
        this.setId("ContenedorBloqueAlgoritmo");
        this.setSpacing(10);
        this.setAlignment(Pos.BASELINE_CENTER);
        this.setPadding(new Insets(10));
    }

    public void crearBloque(Button botonBloque){
        this.getChildren().addAll(botonBloque);
    }
}
