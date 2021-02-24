package edu.fiuba.algo3.vista.contenedores;

import javafx.geometry.Insets;
import javafx.scene.layout.*;

public class SeccionPrincipal extends HBox {

    public SeccionPrincipal(){
        super(60);

        setPadding(new Insets(30,30,30,30));

        SectorBloques sectorBloques = new SectorBloques();
        SectorAlgoritmo sectorAlgoritmo = new SectorAlgoritmo();
        SectorDibujo sectorDibujo = new SectorDibujo();

        VBox SegundaColumna = new VBox(40, sectorDibujo, sectorAlgoritmo);

        getChildren().addAll(sectorBloques, SegundaColumna);

        setId("ContenedorPrincipal");

    }
}
