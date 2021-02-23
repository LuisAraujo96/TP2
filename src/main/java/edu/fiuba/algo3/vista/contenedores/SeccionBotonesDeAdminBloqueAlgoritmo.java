package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.botones.BotonConIcono;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;

public class SeccionBotonesDeAdminBloqueAlgoritmo extends HBox {

    public SeccionBotonesDeAdminBloqueAlgoritmo(){
        super();

        BotonConIcono botonBorrarBloqueAlgoritmo =
            new BotonConIcono("BorrarBloqueAlgoritmo", "src/main/resources/borrar_bloque_algoritmo.png");

        BotonConIcono botonGuardarBloqueAlgoritmo =
            new BotonConIcono("GuardarBloqueAlgoritmo", "src/main/resources/guardar_bloque_algoritmo.png");

        botonBorrarBloqueAlgoritmo.setPrefSize(75,75);
        botonGuardarBloqueAlgoritmo.setPrefSize(75,75);

        getChildren().addAll(botonBorrarBloqueAlgoritmo, botonGuardarBloqueAlgoritmo);

        setSpacing(40);
        setPadding(new Insets(0,30,0,30));

    }
}
