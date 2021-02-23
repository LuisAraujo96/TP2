package edu.fiuba.algo3;

import edu.fiuba.algo3.vista.contenedores.SeccionPrincipal;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * JavaFX App
 */

public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("AlgoBlocks");
        //ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal();
        SeccionPrincipal contenedorPrincipal = new SeccionPrincipal();
        Scene scene = new Scene(contenedorPrincipal,1120, 760);
        //scene.getStylesheets().add(String.valueOf(getClass().getClassLoader().getResource("interfaz.css")));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}