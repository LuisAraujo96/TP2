package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.controlador.cliqueadores.BotonEjecutarAlgoritmoEventHandler;
import edu.fiuba.algo3.controlador.cliqueadores.BotonLimpiarSeccionAlgoritmoEventHandler;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import edu.fiuba.algo3.controlador.agarradores.SeccionAlgoritmoDragDroppedEventHandler;
import edu.fiuba.algo3.controlador.agarradores.SeccionAlgoritmoDragOverEventHandler;
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




        VBox seccionDeBotones = new VBox(20, botonEjecutarSectorAlgoritmo, botonLimpiarSectorAlgoritmo);

        getChildren().addAll(seccionAlgoritmoContenedorDeBloques, seccionDeBotones);

        HBox contenedorDeBloquesHorizontal = new HBox();
        seccionAlgoritmoContenedorDeBloques.setContent(contenedorDeBloquesHorizontal);

        SeccionAlgoritmoDragDroppedEventHandler seccionAlgoritmoDragDroppedEventHandler= new SeccionAlgoritmoDragDroppedEventHandler(contenedorDeBloquesHorizontal, sectorAlgoritmo);
        botonEjecutarSectorAlgoritmo.setOnAction(new BotonEjecutarAlgoritmoEventHandler(personaje, sectorAlgoritmo));
        botonLimpiarSectorAlgoritmo.setOnAction(new BotonLimpiarSeccionAlgoritmoEventHandler(sectorAlgoritmo, seccionAlgoritmoDragDroppedEventHandler));

        seccionAlgoritmoContenedorDeBloques.setOnDragOver(new SeccionAlgoritmoDragOverEventHandler(contenedorDeBloquesHorizontal));
        seccionAlgoritmoContenedorDeBloques.setOnDragDropped(seccionAlgoritmoDragDroppedEventHandler);
    }
}
