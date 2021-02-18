package edu.fiuba.algo3.vista.componentes.contenedores;
import edu.fiuba.algo3.vista.componentes.alertas.AlertBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class ContenedorBloqueComplejo extends VBox {
    Button agregar;
    Button limpiar;
    Button ejecutarAlgoritmo;
    Button agregarAlgoritmo;
    Button salir;
    ChoiceBox<String> choiceBox;
    public ContenedorBloqueComplejo(){

        choiceBox = new ChoiceBox<>();
        choiceBox.setValue("Espacio de trabajo");
        choiceBox.getItems().add("Espacio de trabajo");
        choiceBox.getItems().add("Bloque Repetidor");
        choiceBox.getItems().add("Bloque Inversor");
        choiceBox.setPrefSize(160,20);

        agregar = new Button("Agregar bloque");
        limpiar = new Button("Quitar bloque");

        HBox miniContenedorBotones = new HBox(agregar, limpiar);
        miniContenedorBotones.setSpacing(10);
        miniContenedorBotones.setAlignment(Pos.BASELINE_CENTER);

        ejecutarAlgoritmo = new Button("Ejecutar algoritmo");

        agregarAlgoritmo = new Button("Guardar bloque algoritmo");
        agregarAlgoritmo.setOnAction(e -> AlertBox.display("Guardar bloque algoritmo", "Ingrese nombre para su bloque algoritmo: "));

        salir = new Button("Salir");
        salir.setOnAction(e -> ((Stage)(((Button)e.getSource()).getScene().getWindow())).close());

        VBox miniContenedorBotonAlgoritmo = new VBox(ejecutarAlgoritmo, agregarAlgoritmo, salir);
        miniContenedorBotonAlgoritmo.setSpacing(10);
        miniContenedorBotonAlgoritmo.setAlignment(Pos.BASELINE_CENTER);

        this.setId("ContenedorBloquesComplejos");
        this.setSpacing(10);
        this.setAlignment(Pos.BASELINE_CENTER);
        this.setPadding(new Insets(10));

        this.getChildren().addAll(choiceBox, miniContenedorBotones, miniContenedorBotonAlgoritmo);
    }

}