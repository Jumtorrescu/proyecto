/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;


public class Casilla {
     private int row;
    private int col;
    private int value;

    public Casilla(int row, int col, int value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }
      public Casilla (int index, int value) {
        this.row = (index-1)/10;
        this.col = (index-1)%10;
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
     @Override
    public String toString() {
        return String.valueOf(this.getValue());
    }
}
