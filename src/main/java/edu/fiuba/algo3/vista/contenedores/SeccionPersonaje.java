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
import javafx.scene.layout.*;

public class SeccionPersonaje extends GridPane implements Observer {
    final int numCeldas;
    Personaje personaje;
    int columnaAnterior;
    int filaAnterior;

    public SeccionPersonaje(Personaje unPersonaje) {
        super();
        personaje = unPersonaje;
        numCeldas = 15;

        this.personaje.addObserver(this);

        for (int i = 0; i < numCeldas; i++) {
            for (int j = 0; j < numCeldas; j++) {
                Pane celda = new Pane();
                celda.setMaxSize(32, 32);
                celda.setMinSize(32, 32);
                //celda.setStyle("-fx-background: transparent; -fx-background-color: transparent");
                this.add(celda, i, j);
            }
        }

        //this.columnaAnterior = personaje.obtenerPosicion().getX() + (numCeldas / 2);
        //this.filaAnterior = Math.abs(personaje.obtenerPosicion().getY() - (numCeldas / 2));

        this.columnaAnterior = 0;
        this.filaAnterior = 0;

        this.update();
        //setGridLinesVisible(true);
    }

    public void update() {

        int columnaActual = personaje.obtenerPosicion().getX() + (numCeldas / 2);
        int filaActual = Math.abs(personaje.obtenerPosicion().getY() - (numCeldas / 2));

        System.out.println("ColumnaAnterior: " + this.columnaAnterior);
        System.out.println("FilaAnterior: " + this.filaAnterior);

        System.out.println("ColumnaActual: " + columnaActual);
        System.out.println("FilaActual: " + filaActual);

        for (Node node : this.getChildren()) {

            if (this.getColumnIndex(node) == null) {
                continue;
            }

            if (this.getColumnIndex(node) == columnaAnterior && this.getRowIndex(node) == filaAnterior) {
                node.setStyle(" -fx-background-color: transparent");
            }

            if (this.getColumnIndex(node) == columnaActual && this.getRowIndex(node) == filaActual) {
                //node.setStyle(" -fx-background-color: green");
                Image imagen = this.crearImagenParaNodo();

                ((Pane) node).setBackground(new Background(new BackgroundImage(imagen, null, null, null, null)));

                //Pane nuevoNodo = this.crearNodoConImagen();
                //this.setConstraints(nuevoNodo, columnaActual, filaActual);
                //this.getChildren().remove(node);
                //this.add(nuevoNodo, columnaActual, filaActual);
            }
        }

        columnaAnterior = columnaActual;
        filaAnterior = filaActual;
    }

    /*
    public Pane crearNodoConImagen() {

        Pane nodoPersonaje = null;

        try {
            FileInputStream input = new FileInputStream("src/main/resources/personaje.png");
            Image image = new Image(input);
            ImageView imageView = new ImageView(image);
            nodoPersonaje = new Pane(imageView);

            System.out.println("Se creo al personaje con exito");

        } catch (FileNotFoundException e) {
            System.out.println("No Hay archivo personaje.png");
        }

        return nodoPersonaje;
    }

    */
    public Image crearImagenParaNodo() {
        Image image = null;

        try {
            FileInputStream input = new FileInputStream("src/main/resources/personaje.png");
            image = new Image(input);
        } catch (FileNotFoundException e) {
            System.out.println("No Hay archivo personaje.png");
        }
        return image;
    }
}