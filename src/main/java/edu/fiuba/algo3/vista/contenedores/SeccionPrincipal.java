package edu.fiuba.algo3.vista.contenedores;

import javafx.geometry.Insets;
import javafx.scene.layout.*;

public class SeccionPrincipal extends HBox {

    public SeccionPrincipal(){
        super(60);

        setPadding(new Insets(30,30,30,30));

        SeccionBloques seccionBloques = new SeccionBloques();
        SeccionAlgoritmo seccionAlgoritmo = new SeccionAlgoritmo();
        SeccionDibujo seccionDibujo = new SeccionDibujo();

        VBox SegundaColumna = new VBox(40, seccionDibujo, seccionAlgoritmo);

        getChildren().addAll(seccionBloques, SegundaColumna);

        setId("ContenedorPrincipal");

    }
}
