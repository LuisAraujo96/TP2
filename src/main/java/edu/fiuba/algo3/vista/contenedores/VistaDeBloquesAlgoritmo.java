package edu.fiuba.algo3.vista.contenedores;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class VistaDeBloquesAlgoritmo extends HBox{

    public VistaDeBloquesAlgoritmo(String unNombre) {
        super();

        this.setMaxWidth(215);
        this.setMinSize(215,88);
        this.setStyle("-fx-background-color: #a9aaaa");

        this.setImage();
        Label nombre = new Label(unNombre);

        nombre.setFont(new Font(20));

        getChildren().add( nombre );
    }

    private void setImage(){
        ImageView imagen = new ImageView();

        try {
            FileInputStream input = new FileInputStream("src/main/resources/IconoAlgoritmo.png");
            Image image = new Image(input);
            imagen.setImage(image);

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra Icono");

        }

        this.getChildren().add(imagen);

    }
}
