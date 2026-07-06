package model;

/**
 * Clase que representa una ruta gastronómica ofrecida por Llanquihue Tour.
 *
 * Hereda los atributos generales de ServicioTuristico y agrega
 * información específica sobre la cantidad de paradas gastronómicas.
 */
public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    /**
     * Constructor de la clase RutaGastronomica.
     *
     * @param nombre nombre de la ruta gastronómica.
     * @param duracionHoras duración de la ruta en horas.
     * @param numeroDeParadas cantidad de paradas incluidas en la ruta.
     */
    public RutaGastronomica(String nombre, double duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Tipo de servicio: Ruta gastronómica");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Duración: " + getDuracionHoras() + " horas");
        System.out.println("Número de paradas: " + numeroDeParadas);
        System.out.println("-----------------------------------");
    }
}