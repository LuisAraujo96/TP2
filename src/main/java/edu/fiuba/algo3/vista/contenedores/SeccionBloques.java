package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.controlador.CreadorDeBloquesContenedoresEventHandler;
import edu.fiuba.algo3.controlador.CreadorDeBloquesEventHandler;
import edu.fiuba.algo3.controlador.cliqueadores.BotonGuardarAlgoritmoEventHandler;
import edu.fiuba.algo3.modelo.FabricasDeBloques.*;
import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.SectorBloques;
import edu.fiuba.algo3.vista.botones.BotonDePrograma;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.*;

public class SeccionBloques extends VBox implements Observer{

    private SectorAlgoritmo sectorAlgoritmo;
    private BotonDePrograma botonGuardarBloqueAlgoritmo;

    public SeccionBloques(SectorBloques sectorBloques, SectorAlgoritmo sectorAlgoritmo){
        super(40);

        this.setStyle("-fx-background-color: #00BDDD");

        this.sectorAlgoritmo = sectorAlgoritmo;

        sectorAlgoritmo.addObserver((Observer) this);

        VBox BotonesDeAcciones = botonesDeAcciones(sectorAlgoritmo);

        HBox BotonesAdminBloquesAlgoritmo = botonesDeControlDeBloquesAlgoritmo(sectorAlgoritmo, sectorBloques);

        getChildren().addAll(BotonesDeAcciones, BotonesAdminBloquesAlgoritmo);

        setHeight(575);
    }

    private VBox botonesDeAcciones(SectorAlgoritmo sectorAlgoritmo){

        GridPane bloquesSimples = BloquesSimples(sectorAlgoritmo);

        HBox bloquesContenedores = BloquesContenedores(sectorAlgoritmo);

        VBox subSeccion = new VBox(50, bloquesSimples, bloquesContenedores);

        subSeccion.setAlignment(Pos.CENTER);

        setMargin(bloquesSimples, new Insets(25, 25, 0, 25));

        subSeccion.setPadding(new Insets(25,25,25,25));

        subSeccion.setBorder(new Border(new BorderStroke(null, BorderStrokeStyle.SOLID, null, BorderStroke.THIN)));

        return subSeccion;
    }

    private HBox botonesDeControlDeBloquesAlgoritmo(SectorAlgoritmo sectorAlgoritmo, SectorBloques sectorBloques){


        this.botonGuardarBloqueAlgoritmo =
                new BotonDePrograma("GuardarBloqueAlgoritmo", "src/main/resources/IconoGuardarAlgoritmo" +
                        ".png");

        this.botonGuardarBloqueAlgoritmo.setDisable(true);

        botonGuardarBloqueAlgoritmo.setMinSize(75,75);

        botonGuardarBloqueAlgoritmo.setOnAction(new BotonGuardarAlgoritmoEventHandler(sectorAlgoritmo, sectorBloques));

        HBox subSeccion = new HBox(50, botonGuardarBloqueAlgoritmo);

        subSeccion.setPadding(new Insets(0,30,0,30));
        subSeccion.setMinHeight(75);

        return subSeccion;
    }


    private HBox BloquesContenedores(SectorAlgoritmo sectorAlgoritmo){

        BotonDePrograma botonBloqueInversor =
                new BotonDePrograma("BotonBloqueInversor", "src/main/resources/IconoInvertir.png");

        BotonDePrograma botonBloqueRepetidorDoble =
                new BotonDePrograma("BotonRepetidorDoble","src/main/resources/IconoRepetir2.png");

        BotonDePrograma botonBloqueRepetidorTriple =
                new BotonDePrograma("BotonRepetidorTriple","src/main/resources/IconoRepetir3.png");

        botonBloqueInversor.setOnAction(new CreadorDeBloquesContenedoresEventHandler(sectorAlgoritmo, new FabricaBloqueInversor() ));
        botonBloqueRepetidorDoble.setOnAction(new CreadorDeBloquesContenedoresEventHandler(sectorAlgoritmo, new FabricaBloqueRepetidorDoble() ));
        botonBloqueRepetidorTriple.setOnAction(new CreadorDeBloquesContenedoresEventHandler(sectorAlgoritmo, new FabricaBloqueRepetidorTriple() ));


        botonBloqueInversor.setMinHeight(75);
        botonBloqueRepetidorDoble.setMinHeight(75);
        botonBloqueRepetidorTriple.setMinHeight(75);

        HBox subSeccion = new HBox(25, botonBloqueInversor, botonBloqueRepetidorDoble, botonBloqueRepetidorTriple);

        subSeccion.setMinWidth(200);

        return subSeccion;
    }

    private GridPane BloquesSimples(SectorAlgoritmo sectorAlgoritmo){
        GridPane grid = new GridPane();

        BotonDePrograma botonMoverArriba =
                new BotonDePrograma("BotonMoverArriba", "src/main/resources/IconoArriba.png");

        BotonDePrograma botonMoverAbajo =
                new BotonDePrograma("BotonMoverAbajo", "src/main/resources/IconoAbajo.png");

        BotonDePrograma botonMoverIzquierda =
                new BotonDePrograma("BotonMoverIzquierda", "src/main/resources/IconoIzquierda.png");

        BotonDePrograma botonMoverDerecha =
                new BotonDePrograma("BotonMoverDerecha", "src/main/resources/IconoDerecha.png");

        BotonDePrograma botonSubirLapiz =
                new BotonDePrograma("BotonSubirLapiz", "src/main/resources/IconoLapizArriba.png");

        BotonDePrograma botonBajarLapiz =
                new BotonDePrograma("BotonBajarLapiz", "src/main/resources/IconoLapizAbajo.png");

        botonMoverArriba.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new FabricaBloqueArriba() ));
        botonMoverAbajo.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new FabricaBloqueAbajo() ));
        botonMoverIzquierda.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new FabricaBloqueIzquierda() ));
        botonMoverDerecha.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new FabricaBloqueDerecha() ));
        botonBajarLapiz.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new FabricaBloqueLapizAbajo()));
        botonSubirLapiz.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new FabricaBloqueLapizArriba()));

        Pane panelVacio = new Pane();

        panelVacio.setMinSize(50,50);

        grid.add(botonMoverArriba,1,0);
        grid.add(botonMoverIzquierda,0,1);
        grid.add(botonMoverDerecha,2,1);
        grid.add(botonMoverAbajo, 1,2);

        grid.add(panelVacio,1,3);

        grid.add(botonSubirLapiz, 0,4);
        grid.add(botonBajarLapiz, 2,4);

        return grid;
    }

    @Override
    public void update() {

        if (this.sectorAlgoritmo.estaVacio()) {
            this.botonGuardarBloqueAlgoritmo.setDisable(true);
        } else {
            this.botonGuardarBloqueAlgoritmo.setDisable(false);
        }
    }
}

