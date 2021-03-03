package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.controlador.*;
import edu.fiuba.algo3.modelo.Bloques.BloqueContenedor;
import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.SectorDibujo;
import edu.fiuba.algo3.vista.botones.BotonDePrograma;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SeccionAlgoritmo extends HBox implements Observer {
    private SectorDibujo sectorDibujo;
    private SectorAlgoritmo sectorAlgoritmo;
    private ScrollPane ventana;


    public SeccionAlgoritmo(SectorAlgoritmo unSectorAlgoritmo, SectorDibujo unSectorDibujo, Personaje unPersonaje){
        super(20);

        this.setMinSize(650,160);
        this.setPadding(new Insets(14,14,14,14));
        this.setStyle("-fx-background-color: #282828");

        this.sectorAlgoritmo = unSectorAlgoritmo;
        this.sectorDibujo = unSectorDibujo;
        this.sectorAlgoritmo.addObserver(this);


        setBotonesDeLimpieza(unPersonaje);

        setVentana();

        setBotonDeEjecucion(unPersonaje);

    }

    @Override
    public void update() {

        if ( this.sectorAlgoritmo.estaVacio() ) setVentanaContent();

    }



    private void setBotonesDeLimpieza(Personaje unPersonaje){
        String botonID, rutaDeImagen;


        botonID = "BotonLimpiarSectorAlgoritmo";
        rutaDeImagen = "src/main/resources/IconoLimpiarAlgoritmo.png";

        BotonDePrograma botonLimpiarSectorAlgoritmo = new BotonDePrograma(botonID, rutaDeImagen);
        botonLimpiarSectorAlgoritmo.setMinSize(44,44);
        botonLimpiarSectorAlgoritmo.setMaxSize(44,44);

        botonLimpiarSectorAlgoritmo.setOnAction( new LimpiadorDeSectorAlgoritmoDeBloques( this.sectorAlgoritmo ) );




        botonID = "BotonLimpiarCanvas";
        rutaDeImagen = "src/main/resources/IconoBorrarDibujo.png";

        BotonDePrograma botonLimpiarCanvas = new BotonDePrograma(botonID, rutaDeImagen);
        botonLimpiarCanvas.setMinSize(44,44);
        botonLimpiarCanvas.setMaxSize(44,44);

        botonLimpiarCanvas.setOnAction(new LimpiadorDeSectorDibujoEventHandler(this.sectorDibujo));


        botonID = "botonReiniciarPosicionDelPersonaje";
        rutaDeImagen = "src/main/resources/IconoKirby.png";

        BotonDePrograma botonReiniciarPosicionDelPersonaje = new BotonDePrograma(botonID, rutaDeImagen);
        botonReiniciarPosicionDelPersonaje.setMinSize(44,44);
        botonReiniciarPosicionDelPersonaje.setMaxSize(44,44);

        botonReiniciarPosicionDelPersonaje.setOnAction(new BotonReiniciarPosicionDelPersonaje(unPersonaje));



        VBox seccionDeBotones = new VBox(botonLimpiarSectorAlgoritmo, botonLimpiarCanvas, botonReiniciarPosicionDelPersonaje);

        this.getChildren().add(seccionDeBotones);

    }

    private void setVentana(){
        ScrollPane scrollPane = new ScrollPane();

        scrollPane.setMinSize(494,132);
        scrollPane.setMaxSize(494,132);

        this.ventana = scrollPane;

        setVentanaContent();


        this.getChildren().add(scrollPane);

    }

    private void setVentanaContent(){
        this.ventana.setContent(new VistaDeContenedorDeBloques(this.sectorAlgoritmo, this.sectorAlgoritmo.getContenedor()));

    }

    private void setBotonDeEjecucion(Personaje unPersonaje){
        String botonID, rutaDeImagen;


        botonID = "BotonEjecutarSectorAlgoritmo";
        rutaDeImagen = "src/main/resources/IconoEjecutarAlgoritmo.png";

        BotonDePrograma botonEjecutarSectorAlgoritmo = new BotonDePrograma(botonID, rutaDeImagen);

        botonEjecutarSectorAlgoritmo.setOnAction( new EjecutadorDeSectorAlgoritmoEventHandler(this.sectorAlgoritmo, unPersonaje) );
        botonEjecutarSectorAlgoritmo.setMinSize(44,44);
        botonEjecutarSectorAlgoritmo.setMaxSize(44,44);


        botonID = "botonEstablecerContenedorSectorAlgoritmo";
        rutaDeImagen = "src/main/resources/IconoSeccionAlgoritmo.png";

        BotonDePrograma botonEstablecerContenedorSectorAlgoritmo = new BotonDePrograma(botonID, rutaDeImagen);
        botonEstablecerContenedorSectorAlgoritmo.setMinSize(44,44);
        botonEstablecerContenedorSectorAlgoritmo.setMaxSize(44,44);

        botonEstablecerContenedorSectorAlgoritmo.setOnMouseClicked(new SelectorDeContenedoresEventHandler(sectorAlgoritmo, sectorAlgoritmo.getContenedor()));
        VBox vbox = new VBox(botonEjecutarSectorAlgoritmo, botonEstablecerContenedorSectorAlgoritmo);

        this.getChildren().add(vbox);

    }


}
