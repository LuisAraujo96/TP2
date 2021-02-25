package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.controlador.agarradores.DragDroppedEventHandler;
import edu.fiuba.algo3.controlador.agarradores.DragOverEventHandler;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import edu.fiuba.algo3.vista.botones.BotonDePrograma;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SeccionAlgoritmo extends HBox {

    public SeccionAlgoritmo(SectorAlgoritmo sectorAlgoritmo){
        super();

        ScrollPane seccionDeBloques = new ScrollPane();
        seccionDeBloques.setPrefSize(700,150);

        BotonDePrograma botonEjecutarSectorAlgoritmo =
                new BotonDePrograma("BotonEjecutarSectorAlgoritmo","src/main/resources/ejecutar_sector_algoritmo.png");

        BotonDePrograma botonLimpiarSectorAlgoritmo =
                new BotonDePrograma("BotonLimpiarSectorAlgoritmo","src/main/resources/limpiar_sector_algoritmo.png");

        VBox seccionDeBotones = new VBox(20, botonEjecutarSectorAlgoritmo, botonLimpiarSectorAlgoritmo);

        getChildren().addAll(seccionDeBloques, seccionDeBotones);

        HBox botoneraDeScroll = new HBox();
        seccionDeBloques.setContent(botoneraDeScroll);

        seccionDeBloques.setOnDragOver(new DragOverEventHandler(botoneraDeScroll));
        seccionDeBloques.setOnDragDropped(new DragDroppedEventHandler(botoneraDeScroll));
    }

    public void setOnActionBoton(){
        //sectorAlgoritmo.ejecutarPrograma();
    }
}
