package edu.fiuba.algo3.modelo.HerramientasDeDibujo;

import edu.fiuba.algo3.modelo.Posiciones.Posicion;

public class LapizArriba implements LapizEstado {

    @Override
    public int utilizarSobre(Posicion posicion) {
        return posicion.representar();
        //Acá no debería pintar el dibujo, ni alterar la matriz del SectorDibujo.
        //Para mas info revisar la clase SectorDibujo.
    }
}