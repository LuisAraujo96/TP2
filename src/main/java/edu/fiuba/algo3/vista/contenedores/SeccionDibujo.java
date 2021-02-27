package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.SectorDibujo;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SeccionDibujo extends StackPane implements Observer {
    Personaje personaje;
    SectorDibujo sectorDibujo;
    GridPane seccionGridpane;
    Canvas seccionCanvas;
    final int numCeldas;

    public SeccionDibujo(){
        super();
        setMaxSize(512,512);
        numCeldas = 16;
        seccionGridpane = new GridPane();
        for (int i = 0; i < numCeldas; i++) {
            for (int j = 0; j < numCeldas; j++) {
                Pane celda = new Pane();
                celda.setMinSize(32,32);
                celda.setMaxSize(32,32);
                celda.setStyle("-fx-background: transparent; -fx-background-color: transparent; ");
                seccionGridpane.add(celda, i, j);
            }
        }

        seccionCanvas = new Canvas(512,512);
        try { setCanvasImage(seccionCanvas,"src/main/resources/canvasBackgroundTest.png"); } catch (FileNotFoundException e) {
            System.out.println("Archivo canvas background no encontrado");
        }
        getChildren().add(seccionCanvas);
        getChildren().add(seccionGridpane);
    }

    private void setCanvasImage (Canvas unCanvas, String ImgPath) throws FileNotFoundException{
        FileInputStream input = new FileInputStream(ImgPath);
        unCanvas.getGraphicsContext2D().drawImage(new Image(input), 0, 0);
    }

    @Override
    public void update(){

    };

}

