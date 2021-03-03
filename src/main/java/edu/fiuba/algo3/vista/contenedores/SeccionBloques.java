package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.controlador.*;
import edu.fiuba.algo3.modelo.Bloques.*;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.SectorDibujo;
import edu.fiuba.algo3.vista.botones.BotonDePrograma;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SeccionBloques extends VBox {

    private SectorAlgoritmo sectorAlgoritmo;

    public SeccionBloques(SectorAlgoritmo sectorAlgoritmo, SectorDibujo unSectorDibujo, Personaje unPersonaje){
        super(50);

        this.setMinWidth(290);
        this.setAlignment(Pos.CENTER);
        this.setStyle("-fx-background-color: #01abe8");


        this.sectorAlgoritmo = sectorAlgoritmo;

        setBotonesDeBloquesSimples();

        setBotonesDeBloquesDefinidos();

        setBotoneDeReinicioDePantalla( unSectorDibujo,  unPersonaje);

    }


    private void setBotonesDeBloquesDefinidos(){

        /*GridPane subSeccionDeBloquesSimples = new GridPane();
        setBotonesDeBloquesSimplesEn(subSeccionDeBloquesSimples);*/

        HBox subSeccionDeBloquesDeHerramientas = new HBox();
        setBotonesDeHerramientaEn(subSeccionDeBloquesDeHerramientas);

        HBox subSeccionDeBloquesContenedores = new HBox();
        setBotonesDeBloquesContenedoresEn( subSeccionDeBloquesContenedores);


        VBox subSeccionGeneral = new VBox(50, subSeccionDeBloquesDeHerramientas, subSeccionDeBloquesContenedores);

        subSeccionGeneral.setAlignment(Pos.CENTER);



        this.getChildren().add(subSeccionGeneral);

    }



    private void setBotonesDeBloquesSimples(){
        GridPane unaGrilla = new GridPane();

        String botonID, rutaDeImagen;

        try {
            FileInputStream input = new FileInputStream("src/main/resources/FondoDeBotonesDeMovimiento.png");
            Image imagenDeFondo = new Image(input);
            unaGrilla.setBackground(new Background(new BackgroundImage(imagenDeFondo, null, null, null, null)));
        } catch (FileNotFoundException e){
            unaGrilla.setStyle("-fx-background-color: #019de3");
        }

        //unaGrilla.setStyle("-fx-background-color: #019de3");
        unaGrilla.setMinSize(235, 235);
        unaGrilla.setMaxSize(235, 235);


        botonID = "BotonMoverArriba";
        rutaDeImagen = "src/main/resources/IconoArriba.png";

        BotonDePrograma botonMoverArriba = new BotonDePrograma(botonID, rutaDeImagen);
        botonMoverArriba.setStyle("-fx-background-color: transparent");
        botonMoverArriba.setPickOnBounds(false);
        botonMoverArriba.setMinSize(55, 55);

        botonMoverArriba.setOnAction (new CreadorDeBloquesEventHandler (sectorAlgoritmo, new BloqueArriba()));


        botonID = "BotonMoverAbajo";
        rutaDeImagen = "src/main/resources/IconoAbajo.png";

        BotonDePrograma botonMoverAbajo = new BotonDePrograma(botonID, rutaDeImagen);
        botonMoverAbajo.setStyle("-fx-background-color: transparent");
        botonMoverAbajo.setPickOnBounds(false);
        botonMoverAbajo.setMinSize(55, 55);

        botonMoverAbajo.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new BloqueAbajo() ));


        botonID = "BotonMoverIzquierda";
        rutaDeImagen = "src/main/resources/IconoIzquierda.png";

        BotonDePrograma botonMoverIzquierda = new BotonDePrograma(botonID, rutaDeImagen);
        botonMoverIzquierda.setStyle("-fx-background-color: transparent");
        botonMoverIzquierda.setPickOnBounds(false);
        botonMoverIzquierda.setMinSize(55, 55);

        botonMoverIzquierda.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new BloqueIzquierda() ));


        botonID = "BotonMoverDerecha";
        rutaDeImagen = "src/main/resources/IconoDerecha.png";

        BotonDePrograma botonMoverDerecha = new BotonDePrograma(botonID, rutaDeImagen);
        botonMoverDerecha.setStyle("-fx-background-color: transparent");
        botonMoverDerecha.setPickOnBounds(false);
        botonMoverDerecha.setMinSize(55, 55);

        botonMoverDerecha.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new BloqueDerecha() ));



        unaGrilla.add(botonMoverArriba,1,0);
        unaGrilla.setMargin(botonMoverArriba, new Insets(27,4,4,4));

        unaGrilla.add(botonMoverIzquierda,0,1);
        unaGrilla.setMargin(botonMoverIzquierda, new Insets(4,4,4,27));
        unaGrilla.add(botonMoverDerecha,2,1);
        unaGrilla.setMargin(botonMoverDerecha, new Insets(4,24,4,4));

        unaGrilla.add(botonMoverAbajo, 1,2);
        unaGrilla.setMargin(botonMoverAbajo, new Insets(4,4,27,4));


        this.getChildren().add(unaGrilla);
    }

    private void setBotonesDeHerramientaEn (HBox unaFila){
        String botonID, rutaDeImagen;

        unaFila.setStyle("-fx-background-color: #019de3");
        unaFila.setMinHeight(90);
        unaFila.setMaxWidth(236);


        botonID = "BotonSubirLapiz";
        rutaDeImagen = "src/main/resources/IconoKirbyBrochaArriba.png";

        BotonDePrograma botonSubirLapiz = new BotonDePrograma(botonID, rutaDeImagen);
        botonSubirLapiz.setStyle("-fx-background-color: transparent");
        botonSubirLapiz.setMinSize(118, 90);

        botonSubirLapiz.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new BloqueLapizArriba()));


        botonID = "BotonBajarLapiz";
        rutaDeImagen = "src/main/resources/IconoKirbyBrochaAbajo.png";

        BotonDePrograma botonBajarLapiz = new BotonDePrograma(botonID, rutaDeImagen);
        botonBajarLapiz.setStyle("-fx-background-color: transparent");
        botonBajarLapiz.setMinSize(118, 90);

        botonBajarLapiz.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new BloqueLapizAbajo()));

        unaFila.getChildren().addAll(botonSubirLapiz, botonBajarLapiz);

    }

    private void setBotonesDeBloquesContenedoresEn (HBox unaFila){
        String botonID, rutaDeImagen;

        unaFila.setStyle("-fx-background-color: #019de3");
        unaFila.setMinHeight(90);
        unaFila.setMaxWidth(234);


        botonID = "BotonBloqueInversor";
        rutaDeImagen = "src/main/resources/IconoInvertir.png";

        BotonDePrograma botonBloqueInversor = new BotonDePrograma(botonID, rutaDeImagen);
        botonBloqueInversor.setStyle("-fx-background-color: transparent");
        botonBloqueInversor.setMinSize(78, 90);

        botonBloqueInversor.setOnAction(new CreadorDeBloquesInversoresEventHandler(sectorAlgoritmo));


        botonID = "BotonRepetidorDoble";
        rutaDeImagen = "src/main/resources/IconoRepetir2.png";

        BotonDePrograma botonBloqueRepetidorDoble = new BotonDePrograma(botonID, rutaDeImagen);
        botonBloqueRepetidorDoble.setStyle("-fx-background-color: transparent");
        botonBloqueRepetidorDoble.setMinSize(78, 90);

        botonBloqueRepetidorDoble.setOnAction(new CreadorDeBloquesRepetidoresDoblesEventHandler(sectorAlgoritmo));


        botonID = "BotonRepetidorTriple";
        rutaDeImagen = "src/main/resources/IconoRepetir3.png";

        BotonDePrograma botonBloqueRepetidorTriple = new BotonDePrograma(botonID, rutaDeImagen);
        botonBloqueRepetidorTriple.setStyle("-fx-background-color: transparent");
        botonBloqueRepetidorTriple.setMinSize(78, 90);

        botonBloqueRepetidorTriple.setOnAction(new CreadorDeBloquesRepetidoresTriplesEventHandler(sectorAlgoritmo));


        unaFila.getChildren().addAll(botonBloqueInversor, botonBloqueRepetidorDoble, botonBloqueRepetidorTriple);

    }

    private void setBotoneDeReinicioDePantalla (SectorDibujo unSectorDibujo, Personaje unPersonaje){
        String botonID, rutaDeImagen;

        HBox unaFila = new HBox();
        unaFila.setStyle("-fx-background-color: #019de3");
        unaFila.setMinHeight(90);
        unaFila.setMaxWidth(234);


        botonID = "BotonReiniciarPantalla";
        rutaDeImagen = "src/main/resources/IconoBorrarDibujo.png";

        BotonDePrograma botonReiniciarPantalla = new BotonDePrograma(botonID, rutaDeImagen);
        botonReiniciarPantalla.setMinSize(44,44);
        botonReiniciarPantalla.setMaxSize(44,44);
        botonReiniciarPantalla.setStyle("-fx-background-color: transparent");

        botonReiniciarPantalla.setOnAction(new ReiniciadorDePantallaEventHandler(unSectorDibujo, unPersonaje));


        unaFila.getChildren().add(botonReiniciarPantalla);

        this.getChildren().add(unaFila);
    }
}

