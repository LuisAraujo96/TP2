package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.SectorBloques;
import edu.fiuba.algo3.modelo.SectorDibujo;
import javafx.geometry.Insets;
import javafx.scene.layout.*;

public class SeccionPrincipal extends HBox {

    public SeccionPrincipal(SectorAlgoritmo sectorAlgoritmo, SectorBloques sectorBloques, SectorDibujo sectorDibujo, Personaje personaje){
        super(60);

        setPadding(new Insets(30,30,30,30));

        SeccionBloques seccionBloques = new SeccionBloques(sectorBloques);
        SeccionAlgoritmo seccionAlgoritmo = new SeccionAlgoritmo(sectorAlgoritmo, personaje);
        SeccionDibujo seccionDibujo = new SeccionDibujo(sectorDibujo, personaje);

        VBox SegundaColumna = new VBox(40, seccionDibujo, seccionAlgoritmo);

        getChildren().addAll(seccionBloques, SegundaColumna);

        setId("ContenedorPrincipal");

    }
}
