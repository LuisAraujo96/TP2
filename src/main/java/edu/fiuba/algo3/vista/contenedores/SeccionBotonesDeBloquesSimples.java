package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.botones.BotonConIcono;
import javafx.scene.layout.GridPane;

public class SeccionBotonesDeBloquesSimples extends GridPane {

    public SeccionBotonesDeBloquesSimples(){
        super();

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

        add(botonMoverArriba,1,0);
        add(botonMoverIzquierda,0,1);
        add(botonMoverDerecha,2,1);
        add(botonMoverAbajo, 1,2);

        add(botonSubirLapiz, 0,4);
        add(botonBajarLapiz, 2,4);

    }
}
