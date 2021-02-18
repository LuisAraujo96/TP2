package edu.fiuba.algo3.vista.componentes.botones;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class BotonBloque extends Button {

    public BotonBloque(String nombreBloque, String imgPath) {
        super();
        try {
            FileInputStream input = new FileInputStream(imgPath);
            Image image = new Image(input);
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(32);
            imageView.setPreserveRatio(true);
            imageView.setSmooth(true);
            imageView.setCache(true);
            this.setGraphic(imageView);
        }catch(FileNotFoundException e){
            System.out.println("No se encontro icono en: " + imgPath);
        }

        this.setText(nombreBloque);
        this.setId("BotonBloque");
        this.setPrefSize(180,48);
    }

    public BotonBloque(String nombreBloque){
        super();
        this.setText(nombreBloque);
        this.setId("BotonBloque");
        this.setPrefSize(180,48);
    }
}
