package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.botones.BotonConIcono;
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

        BotonConIcono botonUsarBloqueAlgoritmo =
                new BotonConIcono("UsarBloqueAlgoritmo","src/main/resources/ejecutar_sector_algoritmo.png");

        botonUsarBloqueAlgoritmo.setMinWidth(75);

        VBox subSeccion = new VBox(50, bloquesSimples, bloquesContenedores, botonUsarBloqueAlgoritmo);

        subSeccion.setAlignment(Pos.CENTER);

        setMargin(bloquesSimples, new Insets(25, 25, 0, 25));

        subSeccion.setPadding(new Insets(25,25,25,25));

        subSeccion.setBorder(new Border(new BorderStroke(null, BorderStrokeStyle.SOLID, null, BorderStroke.THIN)));

        return subSeccion;
    }

    private HBox botonesDeControlDeBloquesAlgoritmo(){

        BotonConIcono botonBorrarBloqueAlgoritmo =
            new BotonConIcono("BorrarBloqueAlgoritmo", "src/main/resources/borrar_bloque_algoritmo.png");

        BotonConIcono botonGuardarBloqueAlgoritmo =
            new BotonConIcono("GuardarBloqueAlgoritmo", "src/main/resources/guardar_bloque_algoritmo.png");

        botonBorrarBloqueAlgoritmo.setMinSize(75,75);
        botonGuardarBloqueAlgoritmo.setMinSize(75,75);

        HBox subSeccion = new HBox(50, botonBorrarBloqueAlgoritmo, botonGuardarBloqueAlgoritmo);

        subSeccion.setPadding(new Insets(0,30,0,30));
        subSeccion.setMinHeight(75);

        return subSeccion;
    }


    private HBox BloquesContenedores(){

        BotonConIcono botonBloqueInversor =
                new BotonConIcono("BotonBloqueInversor", "src/main/resources/inverso.png");

        BotonConIcono botonBloqueRepetidorDoble =
                new BotonConIcono("BotonRepetidorDoble","src/main/resources/repetir_doble.png");

        BotonConIcono botonBloqueRepetidorTriple =
                new BotonConIcono("BotonRepetidorTriple","src/main/resources/repetir_triple.png");

        botonBloqueInversor.setMinHeight(75);
        botonBloqueRepetidorDoble.setMinHeight(75);
        botonBloqueRepetidorTriple.setMinHeight(75);

        HBox subSeccion = new HBox(25, botonBloqueInversor, botonBloqueRepetidorDoble, botonBloqueRepetidorTriple);

        subSeccion.setMinWidth(200);

        return subSeccion;
    }

    private GridPane BloquesSimples(){
        GridPane grid = new GridPane();

        BotonConIcono botonMoverArriba =
                new BotonConIcono("BotonMoverArriba", "src/main/resources/flecha_arriba.png");

        BotonConIcono botonMoverAbajo =
                new BotonConIcono("BotonMoverAbajo", "src/main/resources/flecha_abajo.png");

        BotonConIcono botonMoverIzquierda =
                new BotonConIcono("BotonMoverIzquierda", "src/main/resources/flecha_izquierda.png");

        BotonConIcono botonMoverDerecha =
                new BotonConIcono("BotonMoverDerecha", "src/main/resources/flecha_derecha.png");

        BotonConIcono botonSubirLapiz =
                new BotonConIcono("BotonSubirLapiz", "src/main/resources/lapiz_arriba.png");

        BotonConIcono botonBajarLapiz =
                new BotonConIcono("BotonBajarLapiz", "src/main/resources/lapiz_abajo.png");

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
