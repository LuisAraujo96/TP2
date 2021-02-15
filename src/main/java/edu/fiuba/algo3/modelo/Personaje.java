package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.DireccionesDeMovimiento.Direccion;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.HerramientaDeDibujo;
import edu.fiuba.algo3.modelo.Posiciones.Posicion;

public class Personaje {
    private HerramientaDeDibujo herramienta;
    private Posicion posicionActual;
    private FormaDeMoverse formaDeMoverse;

    public Personaje(HerramientaDeDibujo unaHerramienta){
        this.posicionActual = new Posicion(0,0);
        this.formaDeMoverse = new MoverseSinDibujar();
        this.herramienta = unaHerramienta;
    }

    public void bajarLapiz() { formaDeMoverse = new MoverseDibujando(herramienta); }

    public void subirLapiz() { formaDeMoverse = new MoverseSinDibujar(); }

    public void moverseHacia(Direccion unaDireccion){
        posicionActual = formaDeMoverse.moverHacia(posicionActual, unaDireccion);
    }

    protected Posicion obtenerPosicion() { return this.posicionActual; }
}
