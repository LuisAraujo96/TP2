package edu.fiuba.algo3.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.Bloques.BloqueArriba;
import edu.fiuba.algo3.modelo.Bloques.BloqueDerecha;
import edu.fiuba.algo3.modelo.Bloques.BloqueIzquierda;
import edu.fiuba.algo3.modelo.Bloques.BloqueLapizAbajo;

public class TableroTest {
   @Test
   public void test01CreoUnTableroYSeleccionoBloquesEjecutoElAlgoritmoYDebenVerseReflejadosEnElSectorDibujo(){
      Tablero tablero = new Tablero();
      SectorDibujo dibujoEsperado = new SectorDibujo();
 
      tablero.agregarBloque("lapizabajo");
      tablero.agregarBloque("derecha");
      tablero.agregarBloque("arriba");
      tablero.agregarBloque("arriba");
      
      dibujoEsperado.agregarTrazo(new Posicion(0,0), new Posicion(1,0));
      dibujoEsperado.agregarTrazo(new Posicion(1,0), new Posicion(1,1));
      dibujoEsperado.agregarTrazo(new Posicion(1,1), new Posicion(1,2));

      assertEquals(tablero.ejecutarPrograma(), dibujoEsperado);
   }
   @Test
   public void test02SeleccionoBloquesSinBajarLapizYEjecutoElAlgoritmoYNoDebeHaberNadaEnSectorDibujo(){
      Tablero tablero = new Tablero();
      SectorDibujo dibujoEsperado = new SectorDibujo();

      tablero.agregarBloque("derecha");
      tablero.agregarBloque("arriba");
      tablero.agregarBloque("arriba");
      
      assertEquals(tablero.ejecutarPrograma(), dibujoEsperado);
   }
   @Test
   public void test03SeleccionoBloquesQuitoElUltimoYEjecutoElAlgoritmoYDebeHaberseDibujadoEnSectorDibujoTodosLosBloquesMenosElRemovido(){
      Tablero tablero = new Tablero();
      SectorDibujo dibujoEsperado = new SectorDibujo();

      tablero.agregarBloque("lapizabajo");
      tablero.agregarBloque("derecha");
      tablero.agregarBloque("arriba");
      tablero.agregarBloque("arriba");

      tablero.removerBloque();
      
      dibujoEsperado.agregarTrazo(new Posicion(0,0), new Posicion(1,0));
      dibujoEsperado.agregarTrazo(new Posicion(1,0), new Posicion(1,1));

      assertEquals(tablero.ejecutarPrograma(), dibujoEsperado);
   }

   @Test
   public void test04AlgoritmoPersonalizado(){
      Tablero tablero = new Tablero();
      SectorDibujo dibujoEsperado = new SectorDibujo();

      tablero.agregarBloque("lapizabajo");
      tablero.agregarBloque("abajo"); 
      tablero.agregarBloque("derecha"); 
      tablero.guardarBloqueAlgoritmoPersonalizado("prueba");
      tablero.agregarBloque("prueba");

      dibujoEsperado.agregarTrazo(new Posicion(0,0), new Posicion(0,-1));
      dibujoEsperado.agregarTrazo(new Posicion(0,-1), new Posicion(1,-1));
      dibujoEsperado.agregarTrazo(new Posicion(1,-1), new Posicion(1,-2));
      dibujoEsperado.agregarTrazo(new Posicion(1,-2), new Posicion(2,-2));
          
      assertEquals(tablero.ejecutarPrograma(), dibujoEsperado);
   }
}
