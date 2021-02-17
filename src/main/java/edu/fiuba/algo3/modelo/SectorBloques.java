package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Bloques.*;
import edu.fiuba.algo3.modelo.FabricasDeBloques.*;

import java.util.HashMap;

public class SectorBloques {

    private HashMap<String, FabricaDeBloques> menuBloques;

    public SectorBloques(){
        this.menuBloques = new HashMap<>();
        this.menuBloques.put("arriba", new FabricaBloqueArriba());
        this.menuBloques.put("abajo", new FabricaBloqueAbajo());
        this.menuBloques.put("izquierda", new FabricaBloqueIzquierda());
        this.menuBloques.put("derecha", new FabricaBloqueDerecha());
        this.menuBloques.put("lapizarriba", new FabricaBloqueLapizArriba());
        this.menuBloques.put("lapizabajo", new FabricaBloqueLapizAbajo());
        this.menuBloques.put("repetidordoble", new FabricaBloqueRepetidorDoble());
        this.menuBloques.put("repetidortriple", new FabricaBloqueRepetidorTriple());
        this.menuBloques.put("inversor", new FabricaBloqueInversor());
    }

    public Bloque seleccionarBloque(String nombreBloque){
        FabricaDeBloques fabricaSeleccionada = this.menuBloques.get(nombreBloque);
        return fabricaSeleccionada.crearBloque();
    }

    public void guardarBloqueAlgoritmoPersonalizado(String nombreBloque, Bloque[] bloquesAlgoritmo){
        //verificacion el nombre de bloque algoritmo para guardar en el hashmap (loop mediante javafx), que puede elevar excepcion
        this.menuBloques.put(nombreBloque, new FabricaBloqueAlgoritmo(bloquesAlgoritmo));
    }
}