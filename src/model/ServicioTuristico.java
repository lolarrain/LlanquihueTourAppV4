package model;

/**
 * Clase base que representa un servicio turístico general
 * ofrecido por Llanquihue Tour.
 *
 * Contiene los atributos comunes que comparten todos los tipos
 * de servicios turísticos del sistema.
 */
public class ServicioTuristico {

    private String nombre;
    private double duracionHoras;

    /**
     * Constructor de la clase ServicioTuristico.
     *
     * @param nombre nombre del servicio turístico.
     * @param duracionHoras duración del servicio en horas.
     */
    public ServicioTuristico(String nombre, double duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public void mostrarInformacion() {
        System.out.println("Servicio turístico: " + nombre);
        System.out.println("Duración: " + duracionHoras + " horas");
    }
}
