package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Bloques.*;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.Lapiz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloqueAlgoritmoTest {

    @Test
    public void test01BloqueAlgoritmoDevuelveCorrectamenteElNombreConElQueSeCreo () {
        BloqueAlgoritmo algoritmo = new BloqueAlgoritmo("TEST", new Bloque[0]);

        assertEquals("TEST", algoritmo.obtenerNombre());
    }

    @Test
    public void test02BloqueAlgoritmoEjecutaCorrectamenteUnBloque () {
        Bloque[] bloques = new Bloque[1];

        bloques[0] = new BloqueArriba();

        BloqueAlgoritmo algoritmo = new BloqueAlgoritmo("TEST", bloques);

        Personaje personaje = new Personaje(new Lapiz(new SectorDibujo()));

        algoritmo.ejecutarSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), new Posicion(0,1));
    }

    @Test
    public void test03BloqueAlgoritmoEjecutaCorrectamenteElInversoDeUnBloque () {
        Bloque[] bloques = new Bloque[1];

        bloques[0] = new BloqueArriba();

        BloqueAlgoritmo algoritmo = new BloqueAlgoritmo("TEST", bloques);

        Personaje personaje = new Personaje(new Lapiz(new SectorDibujo()));

        algoritmo.ejecutarInversoSobre(personaje);

        assertEquals(personaje.obtenerPosicion(), new Posicion(0,-1));
    }

    @Test
    public void test04BloqueAlgoritmoEjecutaCorrectamenteVariosBloque () {
        Bloque[] bloques = new Bloque[7];

        bloques[0] = new BloqueLapizAbajo();
        bloques[1] = new BloqueArriba();
        bloques[2] = new BloqueDerecha();
        bloques[3] = new BloqueAbajo();
        bloques[4] = new BloqueIzquierda();
        bloques[5] = new BloqueLapizArriba();
        bloques[6] = new BloqueIzquierda();

        BloqueAlgoritmo algoritmo = new BloqueAlgoritmo("TEST", bloques);

        SectorDibujo sector = new SectorDibujo();
        Personaje personaje = new Personaje(new Lapiz(sector));

        algoritmo.ejecutarSobre(personaje);

        Trazo trazosEsperados = new Trazo();
        trazosEsperados.agregarLinea(new Posicion(0,0), new Posicion(0,1));
        trazosEsperados.agregarLinea(new Posicion(0,1), new Posicion(1,1));
        trazosEsperados.agregarLinea(new Posicion(1,1), new Posicion(1,0));
        trazosEsperados.agregarLinea(new Posicion(1,0), new Posicion(0,0));

        assertEquals(sector.obtenerTrazos(), trazosEsperados);
        assertEquals(personaje.obtenerPosicion(), new Posicion(-1,0));
    }

    @Test
    public void test05BloqueAlgoritmoEjecutaCorrectamenteElInversoDeVariosBloque () {
        Bloque[] bloques = new Bloque[7];

        bloques[0] = new BloqueLapizAbajo();
        bloques[1] = new BloqueArriba();
        bloques[2] = new BloqueDerecha();
        bloques[3] = new BloqueAbajo();
        bloques[4] = new BloqueIzquierda();
        bloques[5] = new BloqueLapizArriba();
        bloques[6] = new BloqueIzquierda();

        BloqueAlgoritmo algoritmo = new BloqueAlgoritmo("TEST", bloques);

        SectorDibujo sector = new SectorDibujo();
        Personaje personaje = new Personaje(new Lapiz(sector));

        algoritmo.ejecutarInversoSobre(personaje);

        Trazo trazosEsperados = new Trazo();
        trazosEsperados.agregarLinea(new Posicion(0,0), new Posicion(1,0));

        assertEquals(sector.obtenerTrazos(), trazosEsperados);
        assertEquals(personaje.obtenerPosicion(), new Posicion(1,0));
    }
}