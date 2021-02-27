package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Bloques.*;
import edu.fiuba.algo3.modelo.FabricasDeBloques.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class SectorBloques implements Subject{

    private List<Observer> observadores;

    private HashMap<String, FabricaDeBloques> menuBloques;

    public SectorBloques(){
        this.observadores = new ArrayList<>();

        this.menuBloques = new HashMap<>();
    }

    public Bloque seleccionarBloque(String nombreBloque){
        FabricaDeBloques fabricaSeleccionada = this.menuBloques.get(nombreBloque);
        return fabricaSeleccionada.crearBloque();
    }

    public void guardarBloqueAlgoritmoPersonalizado(String nombreBloque, Bloque[] bloquesAlgoritmo){
        this.menuBloques.put(nombreBloque, new FabricaBloqueAlgoritmo(bloquesAlgoritmo));
        notifyObservers();
    }

    public Set<String> obtenerListaDeBloques(){
        return menuBloques.keySet();
    }

    @Override
    public void addObserver(Observer obs) {
        observadores.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observadores.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observadores) obs.update();
    }

}