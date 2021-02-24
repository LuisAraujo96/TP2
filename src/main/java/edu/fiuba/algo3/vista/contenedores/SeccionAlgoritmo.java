package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.botones.BotonConIcono;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SeccionAlgoritmo extends HBox {

    public SeccionAlgoritmo(){
        super();

        ScrollPane seccionDeBloques = new ScrollPane();
        seccionDeBloques.setPrefSize(700,150);

        BotonConIcono botonEjecutarSectorAlgoritmo =
            new BotonConIcono("BotonEjecutarSectorAlgoritmo","src/main/resources/ejecutar_sector_algoritmo.png");

        BotonConIcono botonLimpiarSectorAlgoritmo =
            new BotonConIcono("BotonLimpiarSectorAlgoritmo","src/main/resources/limpiar_sector_algoritmo.png");

        botonEjecutarSectorAlgoritmo.setMinHeight(80);

        VBox seccionDeBotones = new VBox(20, botonEjecutarSectorAlgoritmo, botonLimpiarSectorAlgoritmo);

        getChildren().addAll(seccionDeBloques, seccionDeBotones);
    }
}
