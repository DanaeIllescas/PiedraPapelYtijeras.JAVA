package com.piedra.papel.tijeras;

import java.util.Scanner;

public class PiedraPapelTijeras {
	
public static void main (String[] args) {
    Scanner s = new Scanner(System.in); //Pa qué se vea (1)
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    Scanner s1 = new Scanner(System.in);
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    Scanner s2 = new Scanner(System.in ); //Pa que se vea (1)
    String j2 = s.nextLine();
    // (1) HASTA ESTE MOMENTO NO REFLEJA EMPATES
    //(2) AHORA SI REFLEJA EMPATE, PERO NO REFLEJA PIEDRA VS. TIJERAS
    //(3) CON ESTAS MODIFICACIONES AL FIN FUNCIONA, NO PUEDO CREERLO, QUIERO LLORAR
    
    if (j1.equals(j2)) { //Se quitó un corchete (1) //Se cambió el metodo (2)
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals( "tijeras")) { //Se quitó el == para transcribirlo como equals (3)
            g = 1;
          }

        case "papel":
          if (j2.equals("piedra")) { //Se quitó el == para transcribirlo como equals (3)
            g = 1;
          } //se agregó un corchete (1)
          
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
  
  
}
} //se agregó este corchete (1)