package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.SectorDibujo;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SeccionDibujo extends StackPane implements Observer {

    SectorDibujo sectorDibujo;
    SeccionPersonaje seccionPersonaje;
    Canvas seccionCanvas;
    GraphicsContext gc;
    final int numColumnas;
    final int numFilas;
    double celdaXActual;
    double celdaYActual;
    int pixelRatio;
    Personaje personaje;

    public SeccionDibujo(Personaje unPersonaje, SectorDibujo unSectorDibujo){
        super();

        this.setStyle("-fx-background-color: #282828");

        pixelRatio = 32;
        numColumnas = 15;
        numFilas = 15;
        celdaXActual = 10.5;//numcelda entre 2 , no me acuerdo como hacer decimal jaja
        celdaYActual = 7.5;

        setMinSize(680,510);

        personaje = unPersonaje;
        seccionPersonaje = new SeccionPersonaje(unPersonaje);
        sectorDibujo = unSectorDibujo;
        this.sectorDibujo.addObserver(this);


        seccionCanvas = new Canvas(672,480);

        seccionCanvas.getGraphicsContext2D().setFill(Color.WHITE);
        seccionCanvas.getGraphicsContext2D().fillRect(0,0,672,480);
        seccionCanvas.getGraphicsContext2D().setFill(Color.BLACK);


        gc = seccionCanvas.getGraphicsContext2D();
        gc.setLineWidth(5);
        gc.beginPath();
        gc.moveTo(pixelRatio * celdaXActual, pixelRatio * celdaYActual);

        getChildren().add(seccionCanvas);
        getChildren().add(seccionPersonaje);
    }

    private void setCanvasImage (Canvas unCanvas, String ImgPath) throws FileNotFoundException{
        FileInputStream input = new FileInputStream(ImgPath);
        unCanvas.getGraphicsContext2D().drawImage(new Image(input), 0, 0);
    }

    @Override
    public void update(){
        int varX = sectorDibujo.obtenerVariacionDePosicion().getX();
        int varY = sectorDibujo.obtenerVariacionDePosicion().getY();

        celdaXActual = celdaXActual + varX;
        celdaYActual = celdaYActual + varY;
        System.out.println("Se mueve:" + varX + " y " + varY);
        if (personaje.estaDibujando()){
            gc.lineTo(pixelRatio*celdaXActual,pixelRatio*celdaYActual);
            gc.stroke();
            System.out.println("pinta");
        }else{
            gc.moveTo(pixelRatio*celdaXActual,pixelRatio*celdaYActual);
            System.out.println("no pinta");
        }
    };

}

