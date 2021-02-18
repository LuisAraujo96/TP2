package edu.fiuba.algo3.vista.componentes.contenedores;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class ContenedorPrincipal extends GridPane {
    ContenedorSector sectorBloques;
    ContenedorSector sectorAlgoritmo;
    ContenedorSector sectorDibujo;

    public ContenedorPrincipal(){
        this.setId("ContenedorPrincipal");
        sectorBloques = new ContenedorSector("Sector Bloques");
        sectorAlgoritmo = new ContenedorSector("Sector Algoritmo");
        sectorDibujo = new ContenedorSector("Sector Dibujo");

        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(33);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(33);
        ColumnConstraints col3 = new ColumnConstraints();
        col3.setPercentWidth(33);
        this.getColumnConstraints().addAll(col1,col2,col3);
        RowConstraints rowBase = new RowConstraints();
        rowBase.setPercentHeight(100);
        this.getRowConstraints().add(rowBase);

        ContenedorBloquesBasicos contenedorBloquesBasicos = new ContenedorBloquesBasicos();
        ContenedorBloqueComplejo contenedorBloqueComplejo = new ContenedorBloqueComplejo();
        sectorBloques.getChildren().addAll(contenedorBloquesBasicos , contenedorBloqueComplejo);

        this.add(sectorBloques,0 ,0);
        this.add(sectorAlgoritmo, 1, 0);
        this.add(sectorDibujo, 2, 0);
    }

}
