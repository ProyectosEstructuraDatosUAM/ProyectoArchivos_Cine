/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoArchivos_Cine;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diaz
 */
public class Validaciones {

    public boolean ValidarContrasena(String C1, String C2) {

        int i = C1.compareTo(C2); //Compare To devuelve 0 cuando es verdadero (Ambas son iguales)

        if (i == 0) {
            return (true);
        } else {
            return (false);
        }

    }

    public boolean ValidarInicioSesion(String Usuario, String Contrasena) {
        // TODO add your handling code here:
        InputStream f = null;
        try {
            f = new FileInputStream("JugadoresGato.txt");
            //Almacena el texto del archivo en la variable f

            //
            InputStreamReader reader = new InputStreamReader(f);

            BufferedReader Buff = new BufferedReader(reader);
            // buffer para almacenar el archivo en la memoria linea a linea

            // para ir guardando del bufferedreader las lineas que se van leyendo y se declara sin ningun valor
            String line = null;

            // sigue leyendo lineas hasta que no haya nada
            while ((line = Buff.readLine()) != null) {

                //Se declara un arreglo de Strings en el que se guardaran los valores del archivo, en este caso usuario y contrasena respectivamente
                String UsuarioYContrasena[] = line.split(";");

                //Se comparan los valores recogidos del archivo de texto con los que se recibieron en el objeto desde los textfield
                if ((Usuario.equals(UsuarioYContrasena[0])) && (Contrasena.equals(UsuarioYContrasena[1]))) {
                    
                    //Devuelve un verdadero si hay coindcidencia de usuario con contrasena
                    return true;
                }
            }
        } catch (IOException ex) {
            //Solo para que no se caiga si no encuentra el archivo
        }
        return false; //No se encontro el usuario
    }

}
