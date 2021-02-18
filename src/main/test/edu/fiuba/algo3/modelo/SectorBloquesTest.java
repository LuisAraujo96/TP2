package edu.fiuba.algo3.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.Bloques.BloqueArriba;
import edu.fiuba.algo3.modelo.Bloques.BloqueDerecha;
import edu.fiuba.algo3.modelo.Bloques.BloqueLapizAbajo;
import edu.fiuba.algo3.modelo.HerramientasDeDibujo.Lapiz;

public class SectorBloquesTest {
   @Test
   public void test01SeleccionoUnBloqueDerechaYAlEjecutarloSobreSectorDibujoNoDebeDibujar(){
      SectorBloques sectorBloques = new SectorBloques();

      SectorDibujo sectorDibujo = new SectorDibujo();
      SectorDibujo dibujoEsperado = new SectorDibujo();

      Bloque bloqueElegidoDerecha = sectorBloques.seleccionarBloque("derecha");
      
      Personaje personaje = new Personaje(new Lapiz(sectorDibujo));

      bloqueElegidoDerecha.ejecutarSobre(personaje);

      assertEquals(sectorDibujo, dibujoEsperado);

   }

   @Test
   public void test02SeleccionoBloquesConLapizAbajoYAlEjecutarloSobreSectorDibujoDebeDibujar(){
      SectorBloques sectorBloques = new SectorBloques();

      SectorDibujo sectorDibujo = new SectorDibujo();
      SectorDibujo dibujoEsperado = new SectorDibujo();

      Bloque bloqueElegidoLapizAbajo = sectorBloques.seleccionarBloque("lapizabajo");
      Bloque bloqueElegidoDerecha = sectorBloques.seleccionarBloque("derecha");
      Bloque bloqueElegidoAbajo = sectorBloques.seleccionarBloque("abajo");

      Personaje personaje = new Personaje(new Lapiz(sectorDibujo));

      bloqueElegidoLapizAbajo.ejecutarSobre(personaje);
      bloqueElegidoDerecha.ejecutarSobre(personaje);
      bloqueElegidoAbajo.ejecutarSobre(personaje);
      bloqueElegidoDerecha.ejecutarSobre(personaje);

      dibujoEsperado.agregarTrazo(new Posicion(0,0), new Posicion(1,0));
      dibujoEsperado.agregarTrazo(new Posicion(1,0), new Posicion(1,-1));
      dibujoEsperado.agregarTrazo(new Posicion(1,-1), new Posicion(2, -1));

      assertEquals(sectorDibujo, dibujoEsperado);

   }


   @Test
   public void test03GuardoUnBloquePersonalizadoConMovimientosYLoEjecutoDebeDibujarSobreElSectorDibujo(){
      SectorBloques sectorBloques = new SectorBloques();
      SectorAlgoritmo sectorAlgoritmo = new SectorAlgoritmo();

      SectorDibujo sectorDibujo = new SectorDibujo();
      SectorDibujo dibujoEsperado = new SectorDibujo();

      BloqueLapizAbajo bloqueLapizAbajo = new BloqueLapizAbajo();
      BloqueDerecha bloqueDerecha = new BloqueDerecha();
      BloqueArriba bloqueArriba = new BloqueArriba();
      sectorAlgoritmo.agregarBloque(bloqueLapizAbajo);
      sectorAlgoritmo.agregarBloque(bloqueDerecha);
      sectorAlgoritmo.agregarBloque(bloqueDerecha);
      sectorAlgoritmo.agregarBloque(bloqueArriba);

      sectorBloques.guardarBloqueAlgoritmoPersonalizado("prueba", sectorAlgoritmo.obtenerBloques());
      Bloque bloquePrueba = sectorBloques.seleccionarBloque("prueba");

      Personaje personaje = new Personaje(new Lapiz(sectorDibujo));
      
      bloquePrueba.ejecutarSobre(personaje);

      dibujoEsperado.agregarTrazo(new Posicion(0,0), new Posicion(1,0));
      dibujoEsperado.agregarTrazo(new Posicion(1,0), new Posicion(2,0));
      dibujoEsperado.agregarTrazo(new Posicion(2,0), new Posicion(2,1));

      assertEquals(sectorDibujo, dibujoEsperado);

   }

}
