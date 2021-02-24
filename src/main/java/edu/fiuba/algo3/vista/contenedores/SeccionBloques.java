package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.botones.BotonBloqueComplejo;
import edu.fiuba.algo3.vista.botones.BotonBloqueSimple;
import edu.fiuba.algo3.vista.botones.BotonDePrograma;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.*;

public class SeccionBloques extends VBox {

    public SeccionBloques(){
        super(40);

        VBox BotonesDeAcciones = botonesDeAcciones();

        HBox BotonesAdminBloquesAlgoritmo = botonesDeControlDeBloquesAlgoritmo();

        getChildren().addAll(BotonesDeAcciones, BotonesAdminBloquesAlgoritmo);

        setHeight(575);
    }

    private VBox botonesDeAcciones(){

        GridPane bloquesSimples = BloquesSimples();

        HBox bloquesContenedores = BloquesContenedores();

        BotonDePrograma botonUsarBloqueAlgoritmo =
                new BotonDePrograma("UsarBloqueAlgoritmo","src/main/resources/ejecutar_sector_algoritmo.png");

        botonUsarBloqueAlgoritmo.setMinWidth(75);

        VBox subSeccion = new VBox(50, bloquesSimples, bloquesContenedores, botonUsarBloqueAlgoritmo);

        subSeccion.setAlignment(Pos.CENTER);

        setMargin(bloquesSimples, new Insets(25, 25, 0, 25));

        subSeccion.setPadding(new Insets(25,25,25,25));

        subSeccion.setBorder(new Border(new BorderStroke(null, BorderStrokeStyle.SOLID, null, BorderStroke.THIN)));

        return subSeccion;
    }

    private HBox botonesDeControlDeBloquesAlgoritmo(){

        BotonDePrograma botonBorrarBloqueAlgoritmo =
            new BotonDePrograma("BorrarBloqueAlgoritmo", "src/main/resources/borrar_bloque_algoritmo.png");

        BotonDePrograma botonGuardarBloqueAlgoritmo =
            new BotonDePrograma("GuardarBloqueAlgoritmo", "src/main/resources/guardar_bloque_algoritmo.png");

        botonBorrarBloqueAlgoritmo.setMinSize(75,75);
        botonGuardarBloqueAlgoritmo.setMinSize(75,75);

        HBox subSeccion = new HBox(50, botonBorrarBloqueAlgoritmo, botonGuardarBloqueAlgoritmo);

        subSeccion.setPadding(new Insets(0,30,0,30));
        subSeccion.setMinHeight(75);

        return subSeccion;
    }


    private HBox BloquesContenedores(){

        BotonDePrograma botonBloqueInversor =
                new BotonBloqueComplejo("BotonBloqueInversor", "src/main/resources/inverso.png");

        BotonDePrograma botonBloqueRepetidorDoble =
                new BotonBloqueComplejo("BotonRepetidorDoble","src/main/resources/repetir_doble.png");

        BotonDePrograma botonBloqueRepetidorTriple =
                new BotonBloqueComplejo("BotonRepetidorTriple","src/main/resources/repetir_triple.png");

        botonBloqueInversor.setMinHeight(75);
        botonBloqueRepetidorDoble.setMinHeight(75);
        botonBloqueRepetidorTriple.setMinHeight(75);

        HBox subSeccion = new HBox(25, botonBloqueInversor, botonBloqueRepetidorDoble, botonBloqueRepetidorTriple);

        subSeccion.setMinWidth(200);

        return subSeccion;
    }

    private GridPane BloquesSimples(){
        GridPane grid = new GridPane();

        BotonBloqueSimple botonMoverArriba =
                new BotonBloqueSimple("BotonMoverArriba", "src/main/resources/flecha_arriba.png");

        BotonBloqueSimple botonMoverAbajo =
                new BotonBloqueSimple("BotonMoverAbajo", "src/main/resources/flecha_abajo.png");

        BotonBloqueSimple botonMoverIzquierda =
                new BotonBloqueSimple("BotonMoverIzquierda", "src/main/resources/flecha_izquierda.png");

        BotonBloqueSimple botonMoverDerecha =
                new BotonBloqueSimple("BotonMoverDerecha", "src/main/resources/flecha_derecha.png");

        BotonBloqueSimple botonSubirLapiz =
                new BotonBloqueSimple("BotonSubirLapiz", "src/main/resources/lapiz_arriba.png");

        BotonBloqueSimple botonBajarLapiz =
                new BotonBloqueSimple("BotonBajarLapiz", "src/main/resources/lapiz_abajo.png");

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
}
