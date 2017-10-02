/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoArchivos_Cine;

import java.io.*;

/**
 *
 * @author Diaz
 */
public class Cls_ConnArchivos {

    public String ruta = "JugadoresGato.txt";

    public void CrearArchivo() throws IOException {
        File nuevo = new File(ruta);

        if (!nuevo.exists()) {
            FileWriter crear = new FileWriter(nuevo);
            crear.write("");
            crear.close();
        }

    }

    public void GuardarUsuario(Jugador Usuario) throws IOException {
        File nuevo = new File(ruta);

        if (!nuevo.exists()) {
            CrearArchivo();
        }

        FileWriter escribir = new FileWriter(nuevo, true);
        BufferedWriter buffer = new BufferedWriter(escribir);
        String registro = Usuario.getNombreJugador() + ";"
                + Usuario.getContrasena() + "\r\n";
        buffer.write(registro);
        buffer.close();
        escribir.close();

    }

    public void GuardarPuntos(Jugador Usuario1, Jugador Usuario2) throws IOException {
        File nuevo = new File("Puntuaciones.txt");

        if (!nuevo.exists()) {
            CrearArchivo();
        }

        FileWriter escribir = new FileWriter(nuevo, true);
        BufferedWriter buffer = new BufferedWriter(escribir);
        String registro = 
                  Usuario1.getNombreJugador() + ";"
                + Usuario1.getPuntos()+ ";"
                + Usuario2.getNombreJugador() + ";"
                + Usuario2.getPuntos() + "\r\n";
        buffer.write(registro);
        buffer.close();
        escribir.close();

    }

}
