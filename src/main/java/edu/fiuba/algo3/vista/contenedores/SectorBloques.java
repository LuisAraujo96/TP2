package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.botones.BotonConIcono;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.VBox;

public class SectorBloques extends VBox {

    public SectorBloques(){
        super();

        SeccionBotonesDeBloquesSimples bloquesSimples = new SeccionBotonesDeBloquesSimples();

        SeccionBotonesDeBloquesContenedores bloquesContenedores = new SeccionBotonesDeBloquesContenedores();

        BotonConIcono botonUsarBloqueAlgoritmo =
            new BotonConIcono("UsarBloqueAlgoritmo","src/main/resources/ejecutar_sector_algoritmo.png");

        botonUsarBloqueAlgoritmo.setPrefSize(75,50);
        botonUsarBloqueAlgoritmo.setAlignment(Pos.CENTER);

        getChildren().addAll(bloquesSimples, bloquesContenedores, botonUsarBloqueAlgoritmo);

        setMargin(bloquesSimples, new Insets(25, 25, 0, 25));

        setSpacing(50);
        setPadding(new Insets(25,25,25,25));
        setBorder(new Border(new BorderStroke(null, BorderStrokeStyle.SOLID, null, BorderStroke.THIN)));
    }
}
