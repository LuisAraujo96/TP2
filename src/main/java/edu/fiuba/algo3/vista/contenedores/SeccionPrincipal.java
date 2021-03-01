package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.SectorBloques;
import edu.fiuba.algo3.modelo.SectorDibujo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.*;

public class SeccionPrincipal extends HBox {

    public SeccionPrincipal(SectorAlgoritmo sectorAlgoritmo, SectorBloques sectorBloques, SectorDibujo sectorDibujo, Personaje personaje){
        super(45);

        this.setStyle("-fx-background-color: #424242");

        setPadding(new Insets(30,30,30,30));

        SeccionBloques seccionBloques = new SeccionBloques(sectorBloques, sectorAlgoritmo);
        SeccionAlgoritmo seccionAlgoritmo = new SeccionAlgoritmo(sectorAlgoritmo, personaje);
        SeccionDibujo seccionDibujo = new SeccionDibujo(personaje, sectorDibujo);

        VBox SegundaColumna = new VBox(40, seccionDibujo, seccionAlgoritmo);

        SegundaColumna.setAlignment(Pos.CENTER);
        SeccionBloquesAlgoritmo seccionBloquesAlgoritmo =  new SeccionBloquesAlgoritmo(sectorAlgoritmo, sectorBloques);

        getChildren().addAll(seccionBloques, SegundaColumna, seccionBloquesAlgoritmo);

        setId("ContenedorPrincipal");

    }
}
