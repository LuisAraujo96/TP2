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
    int columnaAnterior;
    int filaAnterior;

    public SeccionPersonaje(Personaje unPersonaje) {
        super();
        personaje = unPersonaje;
        numCeldas = 15;
        setGridLinesVisible(true);
        columnaAnterior = 3;
        filaAnterior = 3;
        for (int i = 0; i < numCeldas; i++) {
            for (int j = 0; j < numCeldas; j++) {
                Pane celda = new Pane();
                celda.setMaxSize(32,32);
                celda.setMinSize(32,32);
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
        try{
            for (Node node : this.getChildren()) {
                if (this.getColumnIndex(node) == columnaAnterior && this.getRowIndex(node) == filaAnterior)
                    this.getChildren().remove(node);
            }
        }catch (NullPointerException e){
            System.out.println("No se encontro el nodo a remover");
        }

        Pane celdaAnterior = new Pane();
        celdaAnterior.setMaxSize(32,32);
        celdaAnterior.setMinSize(32,32);
        celdaAnterior.setStyle(" -fx-background-color: yellow");

        this.add(celdaAnterior,columna,fila);

        try {
            FileInputStream input = new FileInputStream("src/main/resources/personaje.png");
            Image image = new Image(input);
            ImageView imageView = new ImageView(image);
            Pane celdaPersonaje = new Pane(imageView);
            this.add(celdaPersonaje,columna,fila);
            //this.getChildren().set(fila * numCeldas + columna, imageView);
        }catch(FileNotFoundException e) {
            System.out.println("No Hay archivo personaje.png");
        }

        columnaAnterior = columna;
        filaAnterior = fila;


    };

}
