package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.controlador.CreadorDeBloquesAlgoritmoEventHandler;
import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.SectorBloques;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.util.Set;

public class SeccionBloquesAlgoritmo extends VBox implements Observer {
    private ScrollPane ventanaDeBloques;
    private SectorAlgoritmo sectorAlgoritmo;
    private SectorBloques sectorBloques;

    public SeccionBloquesAlgoritmo(SectorAlgoritmo unSectorAlgoritmo, SectorBloques unSectorBloques){
        super();
        this.setMinSize(250, 690);
        this.setMaxSize(250, 690);

        this.sectorAlgoritmo = unSectorAlgoritmo;
        this.sectorBloques = unSectorBloques;
        this.sectorBloques.addObserver(this);

        this.setStyle("-fx-background-color: #FF5C4E");

        this.ventanaDeBloques = new ScrollPane();
        this.ventanaDeBloques.setMinSize(250,550);
        this.ventanaDeBloques.setMaxSize(250,550);

        this.getChildren().add(this.ventanaDeBloques);

    }

    @Override
    public void update() {
        Set<String> nombres = sectorBloques.obtenerListaDeBloques();

        VBox columna = new VBox();
        ventanaDeBloques.setContent(columna);

        for(String nombre : nombres){
            VistaDeBloquesAlgoritmo fila = new VistaDeBloquesAlgoritmo(nombre, sectorBloques.seleccionarBloque(nombre));
            fila.setOnMouseClicked(new CreadorDeBloquesAlgoritmoEventHandler(this.sectorAlgoritmo, this.sectorBloques, nombre));

            columna.getChildren().add(fila);


        }
    }
}
