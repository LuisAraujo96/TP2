package edu.fiuba.algo3.vista;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ImageLoader {

    private ImageLoader();

    public Image load(String imgPath){
        Image img = new Image();

        try {
            FileInputStream inputStream = new FileInputStream(imgPath);
            img = new Image(inputStream);

        } catch (FileNotFoundException e){
            System.out.println("No se encontro: " + imgPath);

        }

        return img;
    }
}
