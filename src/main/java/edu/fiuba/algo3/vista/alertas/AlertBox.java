package edu.fiuba.algo3.vista.alertas;

import edu.fiuba.algo3.controlador.cliqueadores.GuardarAlgoritmoPersonalizadoEventHandler;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.SectorBloques;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

    public static void display(String titulo, String mensaje, SectorAlgoritmo sectorAlgoritmo, SectorBloques sectorBloques){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(titulo);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(mensaje);

        TextField textField = new TextField();
        textField.setOnAction(e -> window.close());

        Button okButton = new Button("Aceptar");


        okButton.setOnAction(new GuardarAlgoritmoPersonalizadoEventHandler(textField, sectorAlgoritmo, sectorBloques));



        Button closeButton = new Button("Cancelar");
        closeButton.setOnAction(e -> window.close());

        HBox layout2 = new HBox(10);
        layout2.getChildren().addAll(okButton, closeButton);
        layout2.setAlignment(Pos.CENTER);

        VBox layout1 = new VBox(10);
        layout1.getChildren().addAll(label, textField, layout2);
        layout1.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout1, 325, 125);
        window.setScene(scene);
        window.showAndWait();
    }
}
