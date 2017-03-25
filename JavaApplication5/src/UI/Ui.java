/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the
editor.
 */
package UI;

import Data.*;
import java.util.Scanner;

public class Ui {

    private static Scanner reader = new Scanner(System.in);

    public static void printWelcome(Tablero board) {
        System.out.println("*****************************************************");
        System.out.println("\t Escaleras y Sepientes");
        System.out.println("*****************************************************");

        System.out.println();
        System.out.println("Bienvenido al juego escaleras y serpientes\n"
                + "por favor ingrese los nombres de los jugadores");
        
        System.out.println();

        listaJugadores();
        
        System.out.println("*****************************************************");
        System.out.println( "*************Escaleras y Serpientes*****************");
        imprimirTablero(board);

    }
    
     private static void listaJugadores() {
             System.out.println("jugador 1:");
        Scanner jugador = new Scanner(System.in);
        String jugador1 = jugador.nextLine();
        System.out.println("jugador 2:");
        String jugador2 = jugador.nextLine();
     
        
        
        Jugador player1 = new Jugador(jugador1, "o");
        Jugador player2 = new Jugador(jugador2, "x");
     
        
        System.out.println();
        
        System.out.println("*****************************************************");
        System.out.println( "**********************JUGADORES*********************");
        System.out.println(player1.getNombre() + " 'o' :");
        System.out.println(player2.getNombre() + " 'x':");
      
     }
    private static void imprimirTablero(Tablero board) {
        System.out.println(board);
    }

}
