package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Bloques.*;

public class SectorBloques {

    public Bloque seleccionarBloqueArriba(){return new BloqueArriba(); }

    public Bloque seleccionarBloqueAbajo(){ return new BloqueAbajo(); }

    public Bloque seleccionarBloqueIzquierda(){ return new BloqueIzquierda(); }

    public Bloque seleccionarBloqueDerecha(){ return new BloqueDerecha(); }

    public Bloque seleccionarBloqueLapizArriba(){ return new BloqueLapizArriba(); }

    public Bloque seleccionarBloqueLapizAbajo(){ return new BloqueLapizAbajo(); }

    public Bloque seleccionarBloqueRepetidorDos(){ return new BloqueRepetidor(2); }

    public Bloque seleccionarBloqueRepetidorTres(){ return new BloqueRepetidor(3); }
}
