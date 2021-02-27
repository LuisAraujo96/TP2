package edu.fiuba.algo3.vista.contenedores;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.Math;
import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class SeccionPersonaje extends GridPane implements Observer {
    final int numCeldas;
    Personaje personaje;
    int grindIndexAnterior;

    public SeccionPersonaje(Personaje unPersonaje) {
        super();
        personaje = unPersonaje;
        numCeldas = 15;
        setGridLinesVisible(true);
        grindIndexAnterior = 111;
        for (int i = 0; i < numCeldas; i++) {
            for (int j = 0; j < numCeldas; j++) {
                ImageView celda = new ImageView();
                celda.setFitWidth(32);
                celda.setFitHeight(32);
                celda.setStyle("-fx-background: transparent; -fx-background-color: transparent");
                this.add(celda, i, j);
            }
        }
        this.update();

    }

    public void update(){
        Posicion posicionActual = personaje.obtenerPosicion();
        int columna = posicionActual.getX() + (numCeldas/2);
        int fila = Math.abs(posicionActual.getY() -(numCeldas/2));
        ImageView imageView = null;
        try {
            FileInputStream input = new FileInputStream("src/main/resources/personaje.png");
            Image image = new Image(input);
            imageView = new ImageView(image);
        }catch(FileNotFoundException e){
            System.out.println("No Hay archivo personaje");
        }
        this.setConstraints(imageView,columna,fila);
        ImageView imageViewAnterior = new ImageView();
        imageViewAnterior.setFitWidth(32);
        imageViewAnterior.setFitHeight(32);
        imageViewAnterior.setStyle("-fx-background: transparent; -fx-background-color: transparent");


        /*int gridIndex = numCeldas * columna + fila;
        System.out.println(gridIndex);
        this.getChildren().remove(gridIndex);
        this.getChildren().add(gridIndex, imageView);
        this.getChildren().remove(grindIndexAnterior);
        this.getChildren().add(grindIndexAnterior, imageViewAnterior);
        this.getChildren().set(gridIndex, imageView);
        this.getChildren().set(grindIndexAnterior, imageViewAnterior);*/

    };
}
