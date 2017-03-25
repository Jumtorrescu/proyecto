/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.Scanner;

/**
 *
 * @author OSCAR TRIANA
 */
public class Jugador {
    private String nombre;
    private String ficha;

    public Jugador(String nombre, String ficha) {
        this.nombre = nombre;
        this.ficha = ficha;
    }

    
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }
    public static void crearJugador (String jugador1,String ficha) {
         
         Scanner jugador = new Scanner(System.in);
          jugador1 = jugador.nextLine();         
         Jugador player1 = new Jugador(jugador1,ficha) ;
         
    }
}
