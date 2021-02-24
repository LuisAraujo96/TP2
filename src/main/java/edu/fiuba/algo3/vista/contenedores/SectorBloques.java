package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.botones.BotonConIcono;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.*;

public class SectorBloques extends VBox {

    public SectorBloques(){
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

        botonUsarBloqueAlgoritmo.setPrefSize(75,50);
        botonUsarBloqueAlgoritmo.setAlignment(Pos.CENTER);

        VBox subSeccion = new VBox(50,bloquesSimples, bloquesContenedores, botonUsarBloqueAlgoritmo);

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

        botonBorrarBloqueAlgoritmo.setPrefSize(75,75);
        botonGuardarBloqueAlgoritmo.setPrefSize(75,75);

        HBox subSeccion = new HBox(50, botonBorrarBloqueAlgoritmo, botonGuardarBloqueAlgoritmo);

        subSeccion.setPadding(new Insets(0,30,0,30));
        subSeccion.setPrefHeight(75);

        return subSeccion;
    }


    private HBox BloquesContenedores(){

        BotonConIcono botonBloqueInversor =
                new BotonConIcono("BotonBloqueInversor", "src/main/resources/inverso.png");

        BotonConIcono botonBloqueRepetidorDoble =
                new BotonConIcono("BotonRepetidorDoble","src/main/resources/repetir_doble.png");

        BotonConIcono botonBloqueRepetidorTriple =
                new BotonConIcono("BotonRepetidorTriple","src/main/resources/repetir_triple.png");

        botonBloqueInversor.setPrefHeight(75);
        botonBloqueRepetidorDoble.setPrefHeight(75);
        botonBloqueRepetidorTriple.setPrefHeight(75);

        HBox subSeccion = new HBox(25, botonBloqueInversor, botonBloqueRepetidorDoble, botonBloqueRepetidorTriple);

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

        grid.add(botonMoverArriba,1,0);
        grid.add(botonMoverIzquierda,0,1);
        grid.add(botonMoverDerecha,2,1);
        grid.add(botonMoverAbajo, 1,2);

        grid.add(botonSubirLapiz, 0,4);
        grid.add(botonBajarLapiz, 2,4);

        return grid;
    }
}
