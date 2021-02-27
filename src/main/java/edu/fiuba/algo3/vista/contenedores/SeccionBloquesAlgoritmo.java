package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.controlador.CreadorDeBloquesEventHandler;
import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.SectorBloques;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.util.Set;

public class SeccionBloquesAlgoritmo extends VBox implements Observer {
    private ScrollPane ventanaDeBloques;

    SectorBloques sectorBloques;

    public SeccionBloquesAlgoritmo(SectorBloques unSector){
        super();

        this.sectorBloques = unSector;
        this.sectorBloques.addObserver(this);

        this.setStyle("-fx-background-color: #FF5C4E");

        this.ventanaDeBloques = new ScrollPane();

        getChildren().add(this.ventanaDeBloques);

        ventanaDeBloques.setMinSize(200,550);

        setMinSize(200, 690);
    }

    @Override
    public void update() {
        Set<String> nombres = sectorBloques.obtenerListaDeBloques();

        VBox columna = new VBox();
        ventanaDeBloques.setContent(columna);

        for(String nombre : nombres){
            VentanaDeBloquesAlgoritmo fila = new VentanaDeBloquesAlgoritmo(nombre, sectorBloques.seleccionarBloque(nombre));
            columna.getChildren().add(fila);
            fila.getOnMouseClicked(new CreadorDeBloquesEventHandler())

        }
    }
}
