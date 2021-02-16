package edu.fiuba.algo3;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;


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

        Button boton1 = new Button();
        boton1.setText("Seleccionar Bloque");
        Button boton2 = new Button();
        boton2.setText("Agregar Bloque");
        Button boton3 = new Button();
        boton3.setText("Ejecutar Bloque");

        GridPane gridPane = new GridPane();
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(33);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(33);
        ColumnConstraints col3 = new ColumnConstraints();
        col3.setPercentWidth(33);
        gridPane.getColumnConstraints().addAll(col1,col2,col3);
        RowConstraints rowBase = new RowConstraints();
        rowBase.setPercentHeight(100);
        gridPane.getRowConstraints().add(rowBase);
        gridPane.setStyle("-fx-background-color: white; -fx-grid-lines-visible: true");

        TilePane bloqueTilePane = new TilePane();
        TilePane algoritmoTilePane = new TilePane();
        TilePane dibujoTilePane = new TilePane();

        bloqueTilePane.getChildren().addAll(etiquetaBloques, boton1);
        algoritmoTilePane.getChildren().addAll(etiquetaAlgoritmos, boton2);
        dibujoTilePane.getChildren().addAll(etiquetaDibujo, boton3);

        bloqueTilePane.setPrefColumns(1);
        algoritmoTilePane.setPrefColumns(1);
        dibujoTilePane.setPrefColumns(1);

        gridPane.add(bloqueTilePane,0,0);
        gridPane.add(algoritmoTilePane,1,0);
        gridPane.add(dibujoTilePane,2,0);

        Scene scene = new Scene(gridPane,600, 300);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}