/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;


public class Tablero {
     private Casilla[][] board;
     
     
       public Tablero() {

        int value =0;
        int add=9;
        
        board = new Casilla[10][10];

        for (int row = 9 ; row >= 0; row--) {
            for (int col = 0; col < board.length; col++) {
                if (row%2 == 1){
                Casilla casilla = new Casilla(row, col,  (++value));
                board[row][col] = casilla;
                }else {
                    Casilla casilla = new Casilla(row, col,  ((++value + add )));
                board[row][col] = casilla;
                add-=2;
                }
                
            }
            add=9;
          
        }
    }
     public Casilla[][] gettablero() {
        return board;
        
}
     @Override
    public String toString() {
        String imprimirTablero = "\n";

        for (int row = 0; row < board.length; row++) {
            imprimirTablero = imprimirTablero.concat("\t|");
            for (int col = 0; col < board.length; col++) {
                imprimirTablero = imprimirTablero.concat(
                        String.valueOf(board[row][col]).concat("|"));
            }
            imprimirTablero = imprimirTablero.concat("\n");
        }
        return imprimirTablero;
    }
}

