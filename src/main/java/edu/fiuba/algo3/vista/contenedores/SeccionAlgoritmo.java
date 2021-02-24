package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.controlador.agarradores.SeccionAlgoritmoDragDroppedEventHandler;
import edu.fiuba.algo3.controlador.agarradores.SeccionAlgoritmoDragOverEventHandler;
import edu.fiuba.algo3.vista.botones.BotonDePrograma;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SeccionAlgoritmo extends HBox {

    public SeccionAlgoritmo(){
        super();

        ScrollPane seccionAlgoritmoContenedorDeBloques = new ScrollPane();
        seccionAlgoritmoContenedorDeBloques.setPrefSize(700,150);

        BotonDePrograma botonEjecutarSectorAlgoritmo =
                new BotonDePrograma("BotonEjecutarSectorAlgoritmo","src/main/resources/ejecutar_sector_algoritmo.png");

        BotonDePrograma botonLimpiarSectorAlgoritmo =
                new BotonDePrograma("BotonLimpiarSectorAlgoritmo","src/main/resources/limpiar_sector_algoritmo.png");

        VBox seccionDeBotones = new VBox(20, botonEjecutarSectorAlgoritmo, botonLimpiarSectorAlgoritmo);

        getChildren().addAll(seccionAlgoritmoContenedorDeBloques, seccionDeBotones);

        HBox botoneraDeScroll = new HBox();
        seccionAlgoritmoContenedorDeBloques.setContent(botoneraDeScroll);

        seccionAlgoritmoContenedorDeBloques.setOnDragOver(new SeccionAlgoritmoDragOverEventHandler(botoneraDeScroll));
        seccionAlgoritmoContenedorDeBloques.setOnDragDropped(new SeccionAlgoritmoDragDroppedEventHandler(botoneraDeScroll));
    }
}
