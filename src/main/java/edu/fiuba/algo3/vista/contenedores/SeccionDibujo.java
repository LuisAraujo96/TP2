package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.SectorDibujo;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SeccionDibujo extends StackPane implements Observer {
    SectorDibujo sectorDibujo;
    SeccionPersonaje seccionPersonaje;
    Canvas seccionCanvas;

    public SeccionDibujo(Personaje unPersonaje){
        super();
        setMaxSize(480,480);
        seccionPersonaje = new SeccionPersonaje(unPersonaje);

        seccionCanvas = new Canvas(480,480);
        try { setCanvasImage(seccionCanvas,"src/main/resources/canvasBackgroundTest.png"); } catch (FileNotFoundException e) {
            System.out.println("Archivo canvas background no encontrado");
        }
        getChildren().add(seccionCanvas);
        getChildren().add(seccionPersonaje);
    }

    private void setCanvasImage (Canvas unCanvas, String ImgPath) throws FileNotFoundException{
        FileInputStream input = new FileInputStream(ImgPath);
        unCanvas.getGraphicsContext2D().drawImage(new Image(input), 0, 0);
    }

    @Override
    public void update(){

    };

}

