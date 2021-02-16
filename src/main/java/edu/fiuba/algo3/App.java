package edu.fiuba.algo3;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;
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

        GridPane gridPane = new GridPane();
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(33);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(33);
        ColumnConstraints col3 = new ColumnConstraints();
        col3.setPercentWidth(33);
        gridPane.getColumnConstraints().addAll(col1,col2,col3);

        gridPane.setStyle("-fx-background-color: white; -fx-grid-lines-visible: true");
        Pane bloqueStackPane = new StackPane(etiquetaBloques);
        Pane algoritmoStackPane = new StackPane(etiquetaAlgoritmos);
        Pane dibujoStackPane = new StackPane(etiquetaDibujo);

        gridPane.add(bloqueStackPane,0,0);
        gridPane.add(algoritmoStackPane,1,0);
        gridPane.add(dibujoStackPane,2,0);

        Scene scene = new Scene(gridPane,600, 300);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}