package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.controlador.cliqueadores.BotonEjecutarAlgoritmoEventHandler;
import edu.fiuba.algo3.controlador.cliqueadores.BotonLimpiarSeccionAlgoritmoEventHandler;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import edu.fiuba.algo3.controlador.arrastradores.SeccionAlgoritmoDragDroppedEventHandler;
import edu.fiuba.algo3.controlador.arrastradores.SeccionAlgoritmoDragOverEventHandler;
import edu.fiuba.algo3.vista.botones.BotonDePrograma;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SeccionAlgoritmo extends HBox {

    public SeccionAlgoritmo(SectorAlgoritmo sectorAlgoritmo, Personaje personaje){
        super();

        ScrollPane seccionAlgoritmoContenedorDeBloques = new ScrollPane();
        seccionAlgoritmoContenedorDeBloques.setPrefSize(700,150);

        BotonDePrograma botonEjecutarSectorAlgoritmo =
                new BotonDePrograma("BotonEjecutarSectorAlgoritmo","src/main/resources/ejecutar_sector_algoritmo.png");

        BotonDePrograma botonLimpiarSectorAlgoritmo =
                new BotonDePrograma("BotonLimpiarSectorAlgoritmo","src/main/resources/limpiar_sector_algoritmo.png");


        BotonDePrograma botonLimpiarCanvas =
                new BotonDePrograma("BotonLimpiarCanvas","src/main/resources/limpiar_sector_algoritmo.png");

        botonLimpiarSectorAlgoritmo.setMinSize(50,50);
        botonLimpiarCanvas.setMinSize(50,50);

        botonEjecutarSectorAlgoritmo.setMinSize(50,100);


        VBox seccionDeBotones = new VBox(botonLimpiarSectorAlgoritmo, botonLimpiarCanvas);

        getChildren().addAll(seccionDeBotones,seccionAlgoritmoContenedorDeBloques, botonEjecutarSectorAlgoritmo);

        HBox contenedorDeBloquesHorizontal = new HBox();
        seccionAlgoritmoContenedorDeBloques.setContent(contenedorDeBloquesHorizontal);

        SeccionAlgoritmoDragDroppedEventHandler seccionAlgoritmoDragDroppedEventHandler= new SeccionAlgoritmoDragDroppedEventHandler(sectorAlgoritmo);
        botonEjecutarSectorAlgoritmo.setOnAction(new BotonEjecutarAlgoritmoEventHandler(personaje, sectorAlgoritmo));
        botonLimpiarSectorAlgoritmo.setOnAction(new BotonLimpiarSeccionAlgoritmoEventHandler(sectorAlgoritmo));

        seccionAlgoritmoContenedorDeBloques.setOnDragOver(new SeccionAlgoritmoDragOverEventHandler(contenedorDeBloquesHorizontal));
        seccionAlgoritmoContenedorDeBloques.setOnDragDropped(seccionAlgoritmoDragDroppedEventHandler);
    }
}
