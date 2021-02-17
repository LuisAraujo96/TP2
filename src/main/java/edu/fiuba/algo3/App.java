package edu.fiuba.algo3;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.*;
import javafx.stage.Stage;


/**
 * JavaFX App
 */

public class App extends Application {

    public GridPane construirGridPaneBase(){
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
        gridPane.getStyleClass().add("game-grid");
        return gridPane;
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Algo3 - TP2");

        Label etiquetaBloques = new Label("Sector Bloques");
        Label etiquetaAlgoritmos = new Label("Sector Algoritmos");
        Label etiquetaDibujo = new Label("Sector Dibujo");

        Button boton1 = new Button("Seleccionar");
        Button boton2 = new Button("Ejecutar");
        Button boton3 = new Button("Limpiar");

        GridPane gridPane = construirGridPaneBase();

        Separator separator1 = new Separator(Orientation.HORIZONTAL);
        Separator separator2 = new Separator(Orientation.HORIZONTAL);
        Separator separator3 = new Separator(Orientation.HORIZONTAL);
        VBox bloqueVBox = new VBox(etiquetaBloques,separator1, boton1);
        bloqueVBox.setSpacing(10);
        bloqueVBox.setAlignment(Pos.BASELINE_CENTER);
        VBox algoritmoVBox = new VBox(etiquetaAlgoritmos,separator2, boton2);
        algoritmoVBox.setSpacing(10);
        algoritmoVBox.setAlignment(Pos.BASELINE_CENTER);
        VBox dibujoVBox = new VBox(etiquetaDibujo,separator3, boton3);
        dibujoVBox.setSpacing(10);
        dibujoVBox.setAlignment(Pos.BASELINE_CENTER);

        gridPane.add(bloqueVBox,0,0);
        gridPane.add(algoritmoVBox,1,0);
        gridPane.add(dibujoVBox,2,0);

        Scene scene = new Scene(gridPane,600, 300);
        scene.getStylesheets().add(String.valueOf(getClass().getClassLoader().getResource("interfaz.css")));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}