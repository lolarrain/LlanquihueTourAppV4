package ui;

import data.GestorServicios;
import model.ServicioTuristico;

import java.util.List;

/**
 * Clase principal del sistema Llanquihue Tour.
 *
 * Ejecuta el programa, obtiene los servicios turísticos desde GestorServicios
 * y muestra su información en consola aplicando polimorfismo.
 */
public class Main {

    public static void main(String[] args) {
        GestorServicios gestorServicios = new GestorServicios();

        List<ServicioTuristico> servicios = gestorServicios.crearServiciosDePrueba();

        System.out.println("=======================================");
        System.out.println(" SERVICIOS TURÍSTICOS LLANQUIHUE TOUR ");
        System.out.println("=======================================");

        gestorServicios.mostrarServicios(servicios);
    }
}
