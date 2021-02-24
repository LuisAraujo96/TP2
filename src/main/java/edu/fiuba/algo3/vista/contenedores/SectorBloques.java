package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.botones.BotonConIcono;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.*;

public class SectorBloques extends VBox {

    public SectorBloques(){
        super(40);

        HBox BotonesAdminBloquesAlgoritmo =

        VBox subSeccion = new VBox();

        SeccionBotonesDeAdminBloqueAlgoritmo botonesDeControlDeBloquesAlgoritmo = new SeccionBotonesDeAdminBloqueAlgoritmo();

        SeccionBotonesDeBloquesSimples bloquesSimples = new SeccionBotonesDeBloquesSimples();

        SeccionBotonesDeBloquesContenedores bloquesContenedores = new SeccionBotonesDeBloquesContenedores();


        BotonConIcono botonUsarBloqueAlgoritmo =
            new BotonConIcono("UsarBloqueAlgoritmo","src/main/resources/ejecutar_sector_algoritmo.png");

        botonUsarBloqueAlgoritmo.setPrefSize(75,50);
        botonUsarBloqueAlgoritmo.setAlignment(Pos.CENTER);

        getChildren().addAll(bloquesSimples, bloquesContenedores, botonUsarBloqueAlgoritmo);

        setMargin(bloquesSimples, new Insets(25, 25, 0, 25));

        setHeight(575);
        setSpacing(50);
        setPadding(new Insets(25,25,25,25));
        setBorder(new Border(new BorderStroke(null, BorderStrokeStyle.SOLID, null, BorderStroke.THIN)));
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
}
