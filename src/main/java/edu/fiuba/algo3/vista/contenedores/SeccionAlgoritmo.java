package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.controlador.EjecutadorDeSectorAlgoritmoEventHandler;
import edu.fiuba.algo3.controlador.LimpiadorDeSectorAlgoritmoDeBloques;
import edu.fiuba.algo3.controlador.SelectorDeContenedoresEventHandler;
import edu.fiuba.algo3.modelo.Bloques.BloqueContenedor;
import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import edu.fiuba.algo3.vista.botones.BotonDePrograma;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SeccionAlgoritmo extends HBox implements Observer {

    private SectorAlgoritmo sectorAlgoritmo;
    private ScrollPane ventana;


    public SeccionAlgoritmo(SectorAlgoritmo unSectorAlgoritmo, Personaje unPersonaje){
        super();

        this.sectorAlgoritmo = unSectorAlgoritmo;
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

        botonLimpiarSectorAlgoritmo.setOnAction( new LimpiadorDeSectorAlgoritmoDeBloques( this.sectorAlgoritmo, unPersonaje ) );

        botonLimpiarSectorAlgoritmo.setMinSize(50,50);



        botonID = "BotonLimpiarCanvas";
        rutaDeImagen = "src/main/resources/IconoBorrarDibujo.png";

        BotonDePrograma botonLimpiarCanvas = new BotonDePrograma(botonID, rutaDeImagen);

        botonLimpiarCanvas.setMinSize(50,50);



        VBox seccionDeBotones = new VBox(botonLimpiarSectorAlgoritmo, botonLimpiarCanvas);

        this.getChildren().add(seccionDeBotones);

    }

    private void setVentana(){
        ScrollPane scrollPane = new ScrollPane();

        scrollPane.setMinSize(650,150);
        scrollPane.setMaxSize(650,150);

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
        botonEjecutarSectorAlgoritmo.setMinSize(50,100);

        BotonDePrograma botonEstablecerContenedorSectorAlgoritmo = new BotonDePrograma("botonEstablecerContenedorSectorAlgoritmo", "src/main/resources/IconoSeccionAlgoritmo.png");

        botonEstablecerContenedorSectorAlgoritmo.setOnMouseClicked(new SelectorDeContenedoresEventHandler(sectorAlgoritmo, (BloqueContenedor) sectorAlgoritmo.getContenedor()));
        VBox vbox = new VBox(botonEjecutarSectorAlgoritmo, botonEstablecerContenedorSectorAlgoritmo);

        this.getChildren().add(vbox);

    }


}
