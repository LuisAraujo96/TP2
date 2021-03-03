package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.Personaje;
import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SeccionDibujo extends StackPane implements Observer {

    SeccionPersonaje seccionPersonaje;
    Canvas seccionCanvas;
    GraphicsContext gc;
    final int pixelRatio;
    Personaje personaje;

    public SeccionDibujo(Personaje unPersonaje){
        super();

        this.setStyle("-fx-background-color: #282828");

        pixelRatio = 32;

        setMinSize(680,510);

        personaje = unPersonaje;
        seccionPersonaje = new SeccionPersonaje(unPersonaje);
        this.personaje.addObserver(this);

        seccionCanvas = new Canvas(672,480);

        setCanvasImage(seccionCanvas, "src/main/resources/background.png");

        gc = seccionCanvas.getGraphicsContext2D();
        gc.setLineWidth(5);
        gc.setStroke(Color.YELLOW.brighter());
        gc.beginPath();
        gc.moveTo(336, 240);

        getChildren().add(seccionCanvas);
        getChildren().add(seccionPersonaje);

        this.setMargin(seccionPersonaje, new Insets(15,14,15,14));
    }

    private void setCanvasImage (Canvas unCanvas, String ImgPath){
        try {
            FileInputStream input = new FileInputStream(ImgPath);
            unCanvas.getGraphicsContext2D().drawImage(new Image(input), 0, 0);
        }catch (FileNotFoundException e){
            System.out.println("Archivo background no encontrado");
        }
    }

    @Override
    public void update(){
        int posX = personaje.obtenerPosicion().getX();
        int posY = personaje.obtenerPosicion().getY();
        if (personaje.estaDibujando()){
            gc.lineTo( 336 + pixelRatio * posX , 240  - pixelRatio * posY);
            gc.stroke();
            System.out.println("pinta");
        }else{
            gc.moveTo( 336 + pixelRatio * posX , 240  - pixelRatio * posY);
            System.out.println("no pinta");
        }
    };

}

