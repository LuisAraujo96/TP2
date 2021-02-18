package edu.fiuba.algo3;

import edu.fiuba.algo3.vista.componentes.contenedores.ContenedorPrincipal;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * JavaFX App
 */

public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Algo3 - TP2");
        ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal();
        Scene scene = new Scene(contenedorPrincipal,600, 300);
        scene.getStylesheets().add(String.valueOf(getClass().getClassLoader().getResource("interfaz.css")));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}