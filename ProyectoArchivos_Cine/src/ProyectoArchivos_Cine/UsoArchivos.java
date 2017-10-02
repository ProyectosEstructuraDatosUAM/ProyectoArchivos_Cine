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
public class UsoArchivos {

    public void CrearArchivo(File nuevo) throws IOException {

        if (!nuevo.exists()) {
            FileWriter crear = new FileWriter(nuevo);
            crear.write("");
            crear.close();
        }

    }

    public void GuardarUsuario(Administradores Usuario) throws IOException {
        File nuevo = new File("Administradores.txt");

        if (!nuevo.exists()) {
            CrearArchivo(nuevo);
        }

        FileWriter escribir = new FileWriter(nuevo, true);
        BufferedWriter buffer = new BufferedWriter(escribir);
        String registro = Usuario.getNombre() + ";"
                + Usuario.getContrasena() + "\r\n";
        buffer.write(registro);
        buffer.close();
        escribir.close();

    }

    public void GuardarCompra(RegistroCompra Usuario) throws IOException {
        File nuevo = new File("Informacion de Compra.txt");

        if (!nuevo.exists()) {
            CrearArchivo(nuevo);
        }

        FileWriter escribir = new FileWriter(nuevo, true);
        BufferedWriter buffer = new BufferedWriter(escribir);
        String registro
                = //Informacion General del cliente y compra
                Usuario.getIDCompra() + ";"
                + Usuario.getNombreComprador() + ";"
                + Usuario.getApellidosComprador() + ";"
                + Usuario.getTelefonoComprador() + ";"
                + Usuario.getDireccionComprador() + ";"
                + Usuario.getEmailComprador() + ";"
                //Informacion de pago y tarjeta
                + Usuario.getPagoRealizado() + ";"
                + Usuario.getTarjeta_Tipo() + ";"
                + Usuario.getTarjeta_Habiente() + ";"
                + Usuario.getTarjeta_Numero() + ";"
                + Usuario.getTarjeta_Expiracion() + ";"
                + Usuario.getTarjeta_CSC() + ";"
                //Informacion de los tiquetes
                + Usuario.getTipoTiquetes() + ";"
                + Usuario.getCantidadTiquetes() + ";"
                + Usuario.getAsientosSeleccionados() + ";"
                + Usuario.getPeliculaSeleccionada() + ";"
                + Usuario.getDiaSeleccionado() + ";"
                + Usuario.getFuncionSeleccionada() + "\r\n"; //Ultimo dato de la línea

        buffer.write(registro);
        buffer.close();
        escribir.close();

    }

}
