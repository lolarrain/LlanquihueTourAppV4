package model;

/**
 * Clase que representa una excursión cultural ofrecida por Llanquihue Tour.
 *
 * Hereda los atributos generales de ServicioTuristico y agrega
 * información específica sobre el lugar histórico visitado.
 */
public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;

    /**
     * Constructor de la clase ExcursionCultural.
     *
     * @param nombre nombre de la excursión cultural.
     * @param duracionHoras duración de la excursión en horas.
     * @param lugarHistorico lugar histórico asociado a la excursión.
     */
    public ExcursionCultural(String nombre, double duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Tipo de servicio: Excursión cultural");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Duración: " + getDuracionHoras() + " horas");
        System.out.println("Lugar histórico: " + lugarHistorico);
        System.out.println("-----------------------------------");
    }
}
