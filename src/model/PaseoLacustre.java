package model;

/**
 * Clase que representa un paseo lacustre ofrecido por Llanquihue Tour.
 *
 * Hereda los atributos generales de ServicioTuristico y agrega
 * información específica sobre el tipo de embarcación utilizada.
 */
public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;

    /**
     * Constructor de la clase PaseoLacustre.
     *
     * @param nombre nombre del paseo lacustre.
     * @param duracionHoras duración del paseo en horas.
     * @param tipoEmbarcacion tipo de embarcación utilizada.
     */
    public PaseoLacustre(String nombre, double duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Tipo de servicio: Paseo lacustre");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Duración: " + getDuracionHoras() + " horas");
        System.out.println("Tipo de embarcación: " + tipoEmbarcacion);
        System.out.println("-----------------------------------");
    }
}
