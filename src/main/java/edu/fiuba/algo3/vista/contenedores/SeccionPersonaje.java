package edu.fiuba.algo3.vista.contenedores;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.Personaje;
import javafx.scene.Node;
import javafx.scene.image.Image;
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
                this.add(celda, i, j);
            }
        }

        this.columnaAnterior = -1;
        this.filaAnterior = -1;

        this.update();
    }

    public void update() {

        int columnaActual = personaje.obtenerPosicion().getX() + (numCeldas / 2);
        int filaActual = (numCeldas / 2) - personaje.obtenerPosicion().getY();

        System.out.println("ColumnaAnterior: " + this.columnaAnterior + " FilaAnterior: " + this.filaAnterior);

        System.out.println("ColumnaActual: " + columnaActual + " FilaActual: " + filaActual);

        for (Node node : this.getChildren()) {

            if (this.getColumnIndex(node) == columnaAnterior && this.getRowIndex(node) == filaAnterior) {
                ((Pane) node).setBackground(Background.EMPTY);
            }

            if (this.getColumnIndex(node) == columnaActual && this.getRowIndex(node) == filaActual) {
                Image imagen = this.crearImagenParaNodo();

                ((Pane) node).setBackground(new Background(new BackgroundImage(imagen, null, null, null, null)));
            }
        }

        columnaAnterior = columnaActual;
        filaAnterior = filaActual;
    }


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