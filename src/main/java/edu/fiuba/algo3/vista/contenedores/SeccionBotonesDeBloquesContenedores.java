package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.botones.BotonConIcono;
import javafx.scene.layout.HBox;

public class SeccionBotonesDeBloquesContenedores extends HBox {

    public SeccionBotonesDeBloquesContenedores(){
        super();

        BotonConIcono botonBloqueInversor =
            new BotonConIcono("BotonBloqueInversor", "src/main/resources/inverso.png");

        BotonConIcono botonBloqueRepetidorDoble =
            new BotonConIcono("BotonRepetidorDoble","src/main/resources/repetir_doble.png");

        BotonConIcono botonBloqueRepetidorTriple =
            new BotonConIcono("BotonRepetidorTriple","src/main/resources/repetir_triple.png");

        botonBloqueInversor.setPrefHeight(75);
        botonBloqueRepetidorDoble.setPrefHeight(75);
        botonBloqueRepetidorTriple.setPrefHeight(75);

        getChildren().addAll(botonBloqueInversor, botonBloqueRepetidorDoble, botonBloqueRepetidorTriple);

        setSpacing(25);
    }
}
