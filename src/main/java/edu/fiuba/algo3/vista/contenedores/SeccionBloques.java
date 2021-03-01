package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.controlador.CreadorDeBloquesContenedoresEventHandler;
import edu.fiuba.algo3.controlador.CreadorDeBloquesEventHandler;
import edu.fiuba.algo3.controlador.cliqueadores.BotonGuardarAlgoritmoEventHandler;
import edu.fiuba.algo3.modelo.FabricasDeBloques.*;
import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.SectorBloques;
import edu.fiuba.algo3.vista.botones.BotonDePrograma;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.*;

public class SeccionBloques extends VBox {

    private SectorAlgoritmo sectorAlgoritmo;

    public SeccionBloques(SectorBloques sectorBloques, SectorAlgoritmo sectorAlgoritmo){
        super();

        this.setMinWidth(290);
        this.setAlignment(Pos.CENTER);
        this.setStyle("-fx-background-color: #01abe8");


        this.sectorAlgoritmo = sectorAlgoritmo;

        setBotonesDeBloquesDefinidos();

    }


    private void setBotonesDeBloquesDefinidos(){

        GridPane subSeccionDeBloquesSimples = new GridPane();
        setBotonesDeBloquesSimplesEn(subSeccionDeBloquesSimples);

        HBox subSeccionDeBloquesDeHerramientas = new HBox();
        setBotonesDeHerramientaEn(subSeccionDeBloquesDeHerramientas);

        HBox subSeccionDeBloquesContenedores = new HBox();
        setBotonesDeBloquesContenedoresEn( subSeccionDeBloquesContenedores);


        VBox subSeccionGeneral = new VBox(50, subSeccionDeBloquesSimples, subSeccionDeBloquesDeHerramientas, subSeccionDeBloquesContenedores);

        subSeccionGeneral.setAlignment(Pos.CENTER);



        this.getChildren().add(subSeccionGeneral);

    }



    private void setBotonesDeBloquesSimplesEn (GridPane unaGrilla){
        String botonID, rutaDeImagen;

        unaGrilla.setStyle("-fx-background-color: #019de3");
        unaGrilla.setMaxWidth(236);


        botonID = "BotonMoverArriba";
        rutaDeImagen = "src/main/resources/IconoArriba.png";

        BotonDePrograma botonMoverArriba = new BotonDePrograma(botonID, rutaDeImagen);

        botonMoverArriba.setOnAction (new CreadorDeBloquesEventHandler (sectorAlgoritmo, new FabricaBloqueArriba()));


        botonID = "BotonMoverAbajo";
        rutaDeImagen = "src/main/resources/IconoAbajo.png";
        BotonDePrograma botonMoverAbajo = new BotonDePrograma(botonID, rutaDeImagen);
        botonMoverAbajo.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new FabricaBloqueAbajo() ));


        botonID = "BotonMoverIzquierda";
        rutaDeImagen = "src/main/resources/IconoIzquierda.png";

        BotonDePrograma botonMoverIzquierda = new BotonDePrograma(botonID, rutaDeImagen);

        botonMoverIzquierda.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new FabricaBloqueIzquierda() ));


        botonID = "BotonMoverDerecha";
        rutaDeImagen = "src/main/resources/IconoDerecha.png";

        BotonDePrograma botonMoverDerecha = new BotonDePrograma(botonID, rutaDeImagen);

        botonMoverDerecha.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new FabricaBloqueDerecha() ));



        unaGrilla.add(botonMoverArriba,1,0);

        unaGrilla.add(botonMoverIzquierda,0,1);
        unaGrilla.add(botonMoverDerecha,2,1);

        unaGrilla.add(botonMoverAbajo, 1,2);

    }

    private void setBotonesDeHerramientaEn (HBox unaFila){
        String botonID, rutaDeImagen;

        unaFila.setStyle("-fx-background-color: #019de3");
        unaFila.setMinHeight(90);
        unaFila.setMaxWidth(235);


        botonID = "BotonSubirLapiz";
        rutaDeImagen = "src/main/resources/IconoLapizArriba.png";

        BotonDePrograma botonSubirLapiz = new BotonDePrograma(botonID, rutaDeImagen);

        botonSubirLapiz.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new FabricaBloqueLapizArriba()));


        botonID = "BotonBajarLapiz";
        rutaDeImagen = "src/main/resources/IconoLapizAbajo.png";

        BotonDePrograma botonBajarLapiz = new BotonDePrograma(botonID, rutaDeImagen);

        botonBajarLapiz.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new FabricaBloqueLapizAbajo()));

        unaFila.setMinWidth(200);
        unaFila.setSpacing(25);
        unaFila.getChildren().addAll(botonSubirLapiz, botonBajarLapiz);

    }

    private void setBotonesDeBloquesContenedoresEn (HBox unaFila){
        String botonID, rutaDeImagen;

        unaFila.setStyle("-fx-background-color: #019de3");
        unaFila.setMinHeight(90);
        unaFila.setMaxWidth(235);


        botonID = "BotonBloqueInversor";
        rutaDeImagen = "src/main/resources/IconoInvertir.png";

        BotonDePrograma botonBloqueInversor = new BotonDePrograma(botonID, rutaDeImagen);
        botonBloqueInversor.setMinHeight(75);

        botonBloqueInversor.setOnAction(new CreadorDeBloquesContenedoresEventHandler(sectorAlgoritmo, new FabricaBloqueInversor() ));


        botonID = "BotonRepetidorDoble";
        rutaDeImagen = "src/main/resources/IconoRepetir2.png";

        BotonDePrograma botonBloqueRepetidorDoble = new BotonDePrograma(botonID, rutaDeImagen);
        botonBloqueRepetidorDoble.setMinHeight(75);

        botonBloqueRepetidorDoble.setOnAction(new CreadorDeBloquesContenedoresEventHandler(sectorAlgoritmo, new FabricaBloqueRepetidorDoble() ));


        botonID = "BotonRepetidorTriple";
        rutaDeImagen = "src/main/resources/IconoRepetir3.png";

        BotonDePrograma botonBloqueRepetidorTriple = new BotonDePrograma(botonID, rutaDeImagen);
        botonBloqueRepetidorTriple.setMinHeight(75);

        botonBloqueRepetidorTriple.setOnAction(new CreadorDeBloquesContenedoresEventHandler(sectorAlgoritmo, new FabricaBloqueRepetidorTriple() ));


        unaFila.setMinWidth(200);
        unaFila.setSpacing(25);
        unaFila.getChildren().addAll(botonBloqueInversor, botonBloqueRepetidorDoble, botonBloqueRepetidorTriple);

    }
}

