package edu.fiuba.algo3.vista.contenedores;

import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SectorDibujo extends Canvas {

    public SectorDibujo(){
        super(750, 500);

        try { loadImage("src/main/resources/fondo_sector_dibujo.png"); } catch (FileNotFoundException e) {}
    }

    protected void loadImage (String ImgPath) throws FileNotFoundException{
        FileInputStream input = new FileInputStream(ImgPath);
        getGraphicsContext2D().drawImage(new Image(input), 0, 0);
    }
}
