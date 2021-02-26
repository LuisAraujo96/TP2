package edu.fiuba.algo3.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.fiuba.algo3.modelo.Bloques.*;
import edu.fiuba.algo3.modelo.Excepciones.SinBloquesADevolverException;
import org.junit.jupiter.api.Test;

public class TableroTest {
   /*
   @Test
   public void test01CreoUnTableroYSeleccionoBloquesEjecutoElAlgoritmoYDebenVerseReflejadosEnElSectorDibujo(){
      Tablero tablero = new Tablero();
      SectorDibujo dibujoEsperado = new SectorDibujo();

      tablero.agregarBloque(new BloqueLapizAbajo());
      tablero.agregarBloque(new BloqueDerecha());
      tablero.agregarBloque(new BloqueArriba());
      tablero.agregarBloque(new BloqueArriba());
      
      dibujoEsperado.agregarTrazo(new Posicion(0,0), new Posicion(1,0));
      dibujoEsperado.agregarTrazo(new Posicion(1,0), new Posicion(1,1));
      dibujoEsperado.agregarTrazo(new Posicion(1,1), new Posicion(1,2));

      assertEquals(tablero.ejecutarPrograma(), dibujoEsperado);
   }
   @Test
   public void test02SeleccionoBloquesSinBajarLapizYEjecutoElAlgoritmoYNoDebeHaberNadaEnSectorDibujo(){
      Tablero tablero = new Tablero();
      SectorDibujo dibujoEsperado = new SectorDibujo();

      tablero.agregarBloque(new BloqueDerecha());
      tablero.agregarBloque(new BloqueArriba());
      tablero.agregarBloque(new BloqueArriba());
      
      assertEquals(tablero.ejecutarPrograma(), dibujoEsperado);
   }
   @Test
   public void test03SeleccionoBloquesQuitoElUltimoYEjecutoElAlgoritmoYDebeHaberseDibujadoEnSectorDibujoTodosLosBloquesMenosElRemovido(){
      Tablero tablero = new Tablero();
      SectorDibujo dibujoEsperado = new SectorDibujo();

      tablero.agregarBloque(new BloqueLapizAbajo());
      tablero.agregarBloque(new BloqueDerecha());
      tablero.agregarBloque(new BloqueArriba());
      tablero.agregarBloque(new BloqueArriba());

      tablero.removerBloque();
      
      dibujoEsperado.agregarTrazo(new Posicion(0,0), new Posicion(1,0));
      dibujoEsperado.agregarTrazo(new Posicion(1,0), new Posicion(1,1));

      assertEquals(tablero.ejecutarPrograma(), dibujoEsperado);
   }


   @Test
   public void test04SeleccionoBloquesYCreoUnBloqueAlgoritmoPersonalizadoLuegoLoSeleccionoYLoEjecuto(){
      Tablero tablero = new Tablero();
      SectorDibujo dibujoEsperado = new SectorDibujo();

      tablero.agregarBloque(new BloqueLapizAbajo());
      tablero.agregarBloque(new BloqueAbajo());
      tablero.agregarBloque(new BloqueDerecha());

      try {
         tablero.guardarBloqueAlgoritmoPersonalizado("prueba");

      } catch (SinBloquesADevolverException e){
      }

      Bloque BloqueAlgoritmo = tablero.seleccionarBloqueAlgoritmoPersonalizado("prueba");
      tablero.agregarBloque(BloqueAlgoritmo);

      dibujoEsperado.agregarTrazo(new Posicion(0,0), new Posicion(0,-1));
      dibujoEsperado.agregarTrazo(new Posicion(0,-1), new Posicion(1,-1));
      dibujoEsperado.agregarTrazo(new Posicion(1,-1), new Posicion(1,-2));
      dibujoEsperado.agregarTrazo(new Posicion(1,-2), new Posicion(2,-2));
          
      assertEquals(tablero.ejecutarPrograma(), dibujoEsperado);
   }
    */
}
