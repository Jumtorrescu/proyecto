/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussines;

import Data.Jugador;
import Data.Tablero;
import UI.Ui;
import java.util.Scanner;


public class GameEngine {
private static Tablero board;

    public static void main(String[] args) {
       iniciarJuego ();
    }
 
    private static void iniciarJuego() {
         board = new Tablero();
        
        Ui.printWelcome(board);
        
         
    }
    
}
