package edu.fiuba.algo3.vista.componentes.botones;

import javafx.scene.control.Button;

public class BotonBloque extends Button {

    public BotonBloque(String nombreBloque){
        super();
        this.setId("BotonBloque");
        this.setPrefSize(160,20);
        this.setText(nombreBloque);
    }
}
