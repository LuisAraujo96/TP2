package edu.fiuba.algo3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Algo3 - TP2");

        Label etiquetaBloques = new Label();
        etiquetaBloques.setText("Sector Bloques");
        Label etiquetaAlgoritmos = new Label();
        etiquetaAlgoritmos.setText("Sector Algoritmos");
        Label etiquetaDibujo = new Label();
        etiquetaDibujo.setText("Sector Dibujo");

        VBox contenedorSectorBloques = new VBox(etiquetaBloques);
        contenedorSectorBloques.setSpacing(10);
        VBox contenedorSectorAlgoritmo = new VBox(etiquetaAlgoritmos);
        contenedorSectorAlgoritmo.setSpacing(10);
        VBox contenedorSectorDibujo = new VBox(etiquetaDibujo);
        contenedorSectorDibujo.setSpacing(10);

        HBox contenedorPrincipal = new HBox(contenedorSectorBloques, contenedorSectorAlgoritmo, contenedorSectorDibujo);
        contenedorPrincipal.setSpacing(10);
        contenedorPrincipal.setPadding(new Insets(20));

        Scene scene = new Scene(contenedorPrincipal,500, 700);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}