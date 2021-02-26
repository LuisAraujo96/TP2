package edu.fiuba.algo3.vista.contenedores;

import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SeccionDibujo extends StackPane {

    public SeccionDibujo(){
        super();

        Canvas subSeccionDeDibujo = new Canvas(750,550);

        GridPane subSeccionDePersonaje = new GridPane();

        getChildren().add(subSeccionDeDibujo);
        getChildren().add(subSeccionDePersonaje);

        try { setCanvasImage(subSeccionDeDibujo,"src/main/resources/fondo_sector_dibujo.png"); } catch (FileNotFoundException e) {}
    }

    private void setCanvasImage (Canvas unCanvas, String ImgPath) throws FileNotFoundException{
        FileInputStream input = new FileInputStream(ImgPath);
        unCanvas.getGraphicsContext2D().drawImage(new Image(input), 0, 0);
    }

}

