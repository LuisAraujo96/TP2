package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.controlador.SelectorDeContenedoresEventHandler;
import edu.fiuba.algo3.modelo.Bloques.BloqueContenedor;
import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class VistaDeContenedorDeBloques extends HBox implements Observer {
    SectorAlgoritmo sectorAlgoritmo;
    BloqueContenedor contenedor;

    public VistaDeContenedorDeBloques(SectorAlgoritmo unSectorAlgoritmo, BloqueContenedor unContenedor){
        super();

        setBorder(new Border(new BorderStroke(Color.BLUE, null, null, new BorderWidths(1,0,0,0))));
        setMinHeight(75);


        unContenedor.addObserver(this);

        sectorAlgoritmo = unSectorAlgoritmo;
        contenedor = unContenedor;
    }

    @Override
    public void update() {
        VistaDeBloque vistaDeBloqueActual = new VistaDeBloque(contenedor.obtenerUltimoBloque());
        vistaDeBloqueActual.setOnMouseClicked(new SelectorDeContenedoresEventHandler(sectorAlgoritmo, contenedor));

        if (sectorAlgoritmo.getContenedor() == contenedor.obtenerUltimoBloque()){
            VistaDeContenedorDeBloques nuevaVistaDeContenedor = new VistaDeContenedorDeBloques(sectorAlgoritmo, sectorAlgoritmo.getContenedor());
            vistaDeBloqueActual.setOnMouseClicked(new SelectorDeContenedoresEventHandler(sectorAlgoritmo, sectorAlgoritmo.getContenedor()));
            VBox Columna = new VBox(vistaDeBloqueActual, nuevaVistaDeContenedor);
            getChildren().add(Columna);

        } else {
            getChildren().add(vistaDeBloqueActual);
        }
    }

}
