package edu.fiuba.algo3.vista.contenedores;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.VBox;

public class ContenedorSector extends VBox {

    public ContenedorSector(String tituloSector){
        this.setId("ContenedorSector");
        this.setSpacing(10);
        this.setAlignment(Pos.TOP_CENTER);
        Label titulo = new Label(tituloSector);
        Separator separator = new Separator(Orientation.HORIZONTAL);
        this.getChildren().addAll(titulo, separator);

    }

}
