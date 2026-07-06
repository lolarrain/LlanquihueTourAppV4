package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de gestionar los servicios turísticos de prueba
 * del sistema Llanquihue Tour.
 *
 * Su responsabilidad es crear y almacenar distintos tipos de servicios
 * en una colección polimórfica de tipo List<ServicioTuristico>.
 */
public class GestorServicios {

    /**
     * Crea una lista de servicios turísticos de prueba.
     *
     * La lista utiliza el tipo general ServicioTuristico, pero almacena
     * objetos de distintas subclases. Esto permite aplicar polimorfismo
     * al recorrer la colección.
     *
     * @return lista de servicios turísticos.
     */
    public List<ServicioTuristico> crearServiciosDePrueba() {
        List<ServicioTuristico> servicios = new ArrayList<>();

        servicios.add(new RutaGastronomica(
                "Ruta de Sabores del Sur",
                3.5,
                4
        ));

        servicios.add(new RutaGastronomica(
                "Experiencia Gastronómica Puerto Varas",
                2.5,
                3
        ));

        servicios.add(new PaseoLacustre(
                "Paseo por el Lago Llanquihue",
                2.0,
                "Lancha turística"
        ));

        servicios.add(new PaseoLacustre(
                "Navegación Escénica Volcán Osorno",
                4.0,
                "Catamarán"
        ));

        servicios.add(new ExcursionCultural(
                "Recorrido Patrimonial Frutillar",
                3.0,
                "Teatro del Lago"
        ));

        servicios.add(new ExcursionCultural(
                "Historia y Cultura de Puerto Octay",
                2.5,
                "Casa Niklitschek"
        ));

        return servicios;
    }

    /**
     * Recorre la lista de servicios turísticos y muestra su información.
     *
     * Aunque la referencia usada en el ciclo es de tipo ServicioTuristico,
     * Java ejecuta automáticamente el método mostrarInformacion()
     * correspondiente a la subclase real del objeto.
     *
     * @param servicios lista de servicios turísticos a mostrar.
     */
    public void mostrarServicios(List<ServicioTuristico> servicios) {
        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
        }
    }
}