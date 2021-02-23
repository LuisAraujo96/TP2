package edu.fiuba.algo3.vista.contenedores;

import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import static javafx.scene.paint.Color.LEMONCHIFFON;
import static javafx.scene.paint.Color.color;

public class SeccionPrincipal extends HBox {

    public SeccionPrincipal(){
        super(60);

        SectorBloques sectorBloques = new SectorBloques();
        SectorAlgoritmo sectorAlgoritmo = new SectorAlgoritmo();

        Canvas sectorDibujo = new Canvas();
        sectorDibujo.setHeight(500);
        sectorDibujo.setWidth(750);

        sectorAlgoritmo.setBorder(new Border(new BorderStroke(null, BorderStrokeStyle.SOLID, null, BorderStroke.THIN)));

        SeccionBotonesDeAdminBloqueAlgoritmo botonesDeControlDeBloquesAlgoritmo = new SeccionBotonesDeAdminBloqueAlgoritmo();


        VBox PrimerColumna = new VBox(40, sectorBloques, botonesDeControlDeBloquesAlgoritmo);

        VBox SegundaColumna = new VBox(40, sectorDibujo, sectorAlgoritmo);

        getChildren().addAll(PrimerColumna, SegundaColumna);

        setId("ContenedorPrincipal");
        setPadding(new Insets(30,30,40,30));
        setBackground (new Background (new BackgroundFill (new Color(0.9,0.9,0.45,0.9), null, null)));
    }
}
