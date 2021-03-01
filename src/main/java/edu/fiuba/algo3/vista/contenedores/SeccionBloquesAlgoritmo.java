package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.controlador.CreadorDeBloquesAlgoritmoEventHandler;
import edu.fiuba.algo3.controlador.cliqueadores.BotonGuardarAlgoritmoEventHandler;
import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.SectorBloques;
import edu.fiuba.algo3.vista.botones.BotonDePrograma;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.Set;

public class SeccionBloquesAlgoritmo extends VBox implements Observer {
    private ScrollPane ventanaDeBloques;
    private SectorAlgoritmo sectorAlgoritmo;
    private SectorBloques sectorBloques;
    private BotonDePrograma botonGuardarBloqueAlgoritmo;

    public SeccionBloquesAlgoritmo(SectorAlgoritmo unSectorAlgoritmo, SectorBloques unSectorBloques){
        super();
        this.setMinWidth(290);
        this.setAlignment(Pos.CENTER);
        this.setStyle("-fx-background-color: #ec3e3a");

        this.sectorAlgoritmo = unSectorAlgoritmo;
        this.sectorBloques = unSectorBloques;
        this.sectorBloques.addObserver(this);
        this.sectorAlgoritmo.addObserver(this);



        this.ventanaDeBloques = new ScrollPane();
        this.ventanaDeBloques.setMinSize(250,550);
        this.ventanaDeBloques.setMaxSize(250,550);

        this.getChildren().add(this.ventanaDeBloques);

        this.setBotonesDeBloquesAlgoritmo(unSectorBloques);

    }

    @Override
    public void update() {

        this.botonGuardarBloqueAlgoritmo.setDisable( this.sectorAlgoritmo.estaVacio());

        Set<String> nombres = sectorBloques.obtenerListaDeBloques();

        VBox columna = new VBox();
        ventanaDeBloques.setContent(columna);

        for(String nombre : nombres){
            VistaDeBloquesAlgoritmo fila = new VistaDeBloquesAlgoritmo(nombre, sectorBloques.seleccionarBloque(nombre));
            fila.setOnMouseClicked(new CreadorDeBloquesAlgoritmoEventHandler(this.sectorAlgoritmo, this.sectorBloques, nombre));

            columna.getChildren().add(fila);


        }
    }


    private void setBotonesDeBloquesAlgoritmo (SectorBloques unSectorBloques){
        String botonID, rutaDeImagen;


        botonID = "GuardarBloqueAlgoritmo";
        rutaDeImagen = "src/main/resources/IconoGuardarAlgoritmo.png";

        this.botonGuardarBloqueAlgoritmo = new BotonDePrograma(botonID, rutaDeImagen);

        this.botonGuardarBloqueAlgoritmo.setOnAction(new BotonGuardarAlgoritmoEventHandler(this.sectorAlgoritmo, unSectorBloques));

        this.botonGuardarBloqueAlgoritmo.setDisable(true);

        this.botonGuardarBloqueAlgoritmo.setMinSize(75,75);



        HBox subSeccion = new HBox(50, this.botonGuardarBloqueAlgoritmo);

        subSeccion.setPadding(new Insets(0,30,0,30));
        subSeccion.setMinHeight(75);


        this.getChildren().add(subSeccion);

    }
}
