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

        this.setHeight(575);

        this.setStyle("-fx-background-color: #00BDDD");

        this.sectorAlgoritmo = sectorAlgoritmo;
        sectorAlgoritmo.addObserver(this);

        setBotonesDeBloquesDefinidos();

        setBotonesDeBloquesAlgoritmo(sectorBloques);

    }

    @Override
    public void update() {
        this.botonGuardarBloqueAlgoritmo.setDisable( this.sectorAlgoritmo.estaVacio());

    }


    private void setBotonesDeBloquesDefinidos(){

        GridPane subSeccionDeBloquesSimples = new GridPane();
        setBotonesDeBloquesSimplesEn(subSeccionDeBloquesSimples);

        HBox subSeccionDeBloquesContenedores = new HBox();
        setBotonesDeBloquesContenedoresEn( subSeccionDeBloquesContenedores);


        VBox subSeccionGeneral = new VBox(50, subSeccionDeBloquesSimples, subSeccionDeBloquesContenedores);

        subSeccionGeneral.setAlignment(Pos.CENTER);

        this.setMargin(subSeccionDeBloquesSimples, new Insets(25, 25, 0, 25));

        subSeccionGeneral.setPadding(new Insets(25,25,25,25));

        subSeccionGeneral.setBorder(new Border(new BorderStroke(null, BorderStrokeStyle.SOLID, null, BorderStroke.THIN)));

        this.getChildren().add(subSeccionGeneral);

    }

    private void setBotonesDeBloquesAlgoritmo (SectorBloques unSectorBloques){
        String botonID, rutaDeImagen;


        botonID = "GuardarBloqueAlgoritmo";
        rutaDeImagen = "src/main/resources/IconoGuardarAlgoritmo.png";

        this.botonGuardarBloqueAlgoritmo = new BotonDePrograma(botonID, rutaDeImagen);

        this.botonGuardarBloqueAlgoritmo.setOnAction(new BotonGuardarAlgoritmoEventHandler(this.sectorAlgoritmo, unSectorBloques));

        this.botonGuardarBloqueAlgoritmo.setDisable(true);

        this.botonGuardarBloqueAlgoritmo.setMinSize(75,75);



        HBox subSeccion = new HBox(50, this.botonGuardarBloqueAlgoritmo);

        subSeccion.setPadding(new Insets(0,30,0,30));
        subSeccion.setMinHeight(75);


        this.getChildren().add(subSeccion);

    }



    private void setBotonesDeBloquesSimplesEn (GridPane unaGrilla){
        String botonID, rutaDeImagen;


        botonID = "BotonMoverArriba";
        rutaDeImagen = "src/main/resources/IconoArriba.png";

        BotonDePrograma botonMoverArriba = new BotonDePrograma(botonID, rutaDeImagen);

        botonMoverArriba.setOnAction (new CreadorDeBloquesEventHandler (sectorAlgoritmo, new FabricaBloqueArriba()));


        botonID = "BotonMoverAbajo";
        rutaDeImagen = "src/main/resources/IconoAbajo.png";
        BotonDePrograma botonMoverAbajo = new BotonDePrograma(botonID, rutaDeImagen);
        botonMoverAbajo.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new FabricaBloqueAbajo() ));


        botonID = "BotonMoverIzquierda";
        rutaDeImagen = "src/main/resources/IconoIzquierda.png";

        BotonDePrograma botonMoverIzquierda = new BotonDePrograma(botonID, rutaDeImagen);

        botonMoverIzquierda.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new FabricaBloqueIzquierda() ));


        botonID = "BotonMoverDerecha";
        rutaDeImagen = "src/main/resources/IconoDerecha.png";

        BotonDePrograma botonMoverDerecha = new BotonDePrograma(botonID, rutaDeImagen);

        botonMoverDerecha.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new FabricaBloqueDerecha() ));


        botonID = "BotonSubirLapiz";
        rutaDeImagen = "src/main/resources/IconoLapizArriba.png";

        BotonDePrograma botonSubirLapiz = new BotonDePrograma(botonID, rutaDeImagen);

        botonSubirLapiz.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new FabricaBloqueLapizArriba()));


        botonID = "BotonBajarLapiz";
        rutaDeImagen = "src/main/resources/IconoLapizAbajo.png";

        BotonDePrograma botonBajarLapiz = new BotonDePrograma(botonID, rutaDeImagen);

        botonBajarLapiz.setOnAction(new CreadorDeBloquesEventHandler(sectorAlgoritmo, new FabricaBloqueLapizAbajo()));


        Pane panelVacio = new Pane();
        panelVacio.setMinSize(50,50);


        unaGrilla.add(botonMoverArriba,1,0);

        unaGrilla.add(botonMoverIzquierda,0,1);
        unaGrilla.add(botonMoverDerecha,2,1);

        unaGrilla.add(botonMoverAbajo, 1,2);

        unaGrilla.add(panelVacio,1,3);

        unaGrilla.add(botonSubirLapiz, 0,4);
        unaGrilla.add(botonBajarLapiz, 2,4);

    }

    private void setBotonesDeBloquesContenedoresEn (HBox unaFila){
        String botonID, rutaDeImagen;


        botonID = "BotonBloqueInversor";
        rutaDeImagen = "src/main/resources/IconoInvertr.png";

        BotonDePrograma botonBloqueInversor = new BotonDePrograma(botonID, rutaDeImagen);
        botonBloqueInversor.setMinHeight(75);

        botonBloqueInversor.setOnAction(new CreadorDeBloquesContenedoresEventHandler(sectorAlgoritmo, new FabricaBloqueInversor() ));


        botonID = "BotonRepetidorDoble";
        rutaDeImagen = "src/main/resources/IconoRepetir2.png";

        BotonDePrograma botonBloqueRepetidorDoble = new BotonDePrograma(botonID, rutaDeImagen);
        botonBloqueRepetidorDoble.setMinHeight(75);

        botonBloqueRepetidorDoble.setOnAction(new CreadorDeBloquesContenedoresEventHandler(sectorAlgoritmo, new FabricaBloqueRepetidorDoble() ));


        botonID = "BotonRepetidorTriple";
        rutaDeImagen = "src/main/resources/IconoRepetir3.png";

        BotonDePrograma botonBloqueRepetidorTriple = new BotonDePrograma(botonID, rutaDeImagen);
        botonBloqueRepetidorTriple.setMinHeight(75);

        botonBloqueRepetidorTriple.setOnAction(new CreadorDeBloquesContenedoresEventHandler(sectorAlgoritmo, new FabricaBloqueRepetidorTriple() ));


        unaFila.setMinWidth(200);
        unaFila.setSpacing(25);
        unaFila.getChildren().addAll(botonBloqueInversor, botonBloqueRepetidorDoble, botonBloqueRepetidorTriple);

    }
}

