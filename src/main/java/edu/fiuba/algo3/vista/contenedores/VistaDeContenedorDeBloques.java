package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.controlador.SelectorDeContenedoresEventHandler;
import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.Bloques.BloqueContenedor;
import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class VistaDeContenedorDeBloques extends HBox implements Observer {
    SectorAlgoritmo sectorAlgoritmo;
    BloqueContenedor contenedor;

    public VistaDeContenedorDeBloques(SectorAlgoritmo unSectorAlgoritmo, BloqueContenedor unContenedor){
        super();

        setBorder(new Border(new BorderStroke(Color.BLUE, null, null, new BorderWidths(1,0,0,0))));
        setMinHeight(75);


        unContenedor.addObserver(this);

        sectorAlgoritmo = unSectorAlgoritmo;
        contenedor = unContenedor;
    }

    @Override
    public void update() {
        VistaDeBloque vistaDeBloqueActual = new VistaDeBloque(contenedor.obtenerUltimoBloque());

        if (sectorAlgoritmo.getContenedor() == contenedor.obtenerUltimoBloque()){
            VistaDeContenedorDeBloques nuevaVistaDeContenedor = new VistaDeContenedorDeBloques(sectorAlgoritmo, sectorAlgoritmo.getContenedor());
            vistaDeBloqueActual.setOnMouseClicked(new SelectorDeContenedoresEventHandler(sectorAlgoritmo, sectorAlgoritmo.getContenedor()));
            VBox Columna = new VBox(vistaDeBloqueActual, nuevaVistaDeContenedor);
            getChildren().add(Columna);

        } else {
            getChildren().add(vistaDeBloqueActual);
        }
    }

    private class VistaDeBloque extends Pane {
        public VistaDeBloque(Bloque unBloque){
            super();

            String imgPath = "src/main/resources/" + unBloque.obtenerID() + ".png";

            try {
                setImage(imgPath);

            } catch (FileNotFoundException e){
                System.out.println( this.getClass().getSimpleName() + " no encontro : " + imgPath);

            }

            setOnMouseClicked(new SelectorDeContenedoresEventHandler(sectorAlgoritmo, contenedor));
        }

        private void setImage(String imgPath) throws FileNotFoundException {
            FileInputStream input = new FileInputStream(imgPath);
            Image image = new Image(input);
            ImageView imageView = new ImageView(image);
            imageView.setPreserveRatio(true);
            imageView.setSmooth(true);
            imageView.setCache(true);
            getChildren().add(imageView);
            setMinSize(image.getWidth(), image.getHeight());
            setMaxSize(image.getWidth(), image.getHeight());
        }
    }
}
