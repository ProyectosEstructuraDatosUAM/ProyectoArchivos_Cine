/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoArchivos_Cine;

/**
 *
 * @author Diaz
 */
public class Comprobaciones { //Para cambio de movimiento y jugador

    public String SeleccionActual(String Movimiento, String MovJugador1, String MovJugador2) {
        //Cambio para el jugador siguiente
        if (Movimiento.equals(MovJugador1)) {
            Movimiento = MovJugador2;
        } else {
            Movimiento = MovJugador1;
        }
        return Movimiento;
    }

      
    public String JugadorActual(String JugadorActual, String Jugador1, String Jugador2) {
        if (JugadorActual.equals(Jugador1)) {
            JugadorActual = Jugador2;
        } else {
            JugadorActual = Jugador1;
        }
        
        return JugadorActual;
    }

    

}
