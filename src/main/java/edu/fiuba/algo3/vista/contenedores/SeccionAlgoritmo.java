package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.controlador.EjecutadorDeSectorAlgoritmoEventHandler;
import edu.fiuba.algo3.controlador.LimpiadorDeSectorAlgoritmoDeBloques;
import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import edu.fiuba.algo3.vista.botones.BotonDePrograma;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SeccionAlgoritmo extends HBox implements Observer {
    private SectorAlgoritmo sector;
    private ScrollPane ventana;

    public SeccionAlgoritmo(SectorAlgoritmo sectorAlgoritmo, Personaje personaje){
        super();

        this.sector = sectorAlgoritmo;
        sectorAlgoritmo.addObserver(this);

        ScrollPane ventanaDeBloques = new ScrollPane();
        ventanaDeBloques.setMinSize(650,150);
        ventanaDeBloques.setMaxSize(650,150);

        this.ventana = ventanaDeBloques;

        BotonDePrograma botonEjecutarSectorAlgoritmo =
                new BotonDePrograma("BotonEjecutarSectorAlgoritmo","src/main/resources/ejecutar_sector_algoritmo.png");

        botonEjecutarSectorAlgoritmo.setOnAction(new EjecutadorDeSectorAlgoritmoEventHandler(sectorAlgoritmo, personaje));


        BotonDePrograma botonLimpiarSectorAlgoritmo =
                new BotonDePrograma("BotonLimpiarSectorAlgoritmo","src/main/resources/limpiar_sector_algoritmo.png");

        BotonDePrograma botonLimpiarCanvas =
                new BotonDePrograma("BotonLimpiarCanvas","src/main/resources/limpiar_sector_algoritmo.png");

        botonLimpiarSectorAlgoritmo.setOnAction(new LimpiadorDeSectorAlgoritmoDeBloques(sectorAlgoritmo));

        botonLimpiarSectorAlgoritmo.setMinSize(50,50);
        botonLimpiarCanvas.setMinSize(50,50);

        botonEjecutarSectorAlgoritmo.setMinSize(50,100);


        VBox seccionDeBotones = new VBox(botonLimpiarSectorAlgoritmo, botonLimpiarCanvas);

        getChildren().addAll(seccionDeBotones,ventanaDeBloques, botonEjecutarSectorAlgoritmo);

        ventanaDeBloques.setContent(new VistaDeContenedorDeBloques(sector, sector.getContenedor()));
    }

    @Override
    public void update() {
        ventana.setContent(new VistaDeContenedorDeBloques(sector, sector.getContenedor()));
    }
}
