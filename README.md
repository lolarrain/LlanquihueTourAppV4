# Entrega Actividad S7 - Desarrollo Orientado a Objetos I

## Autor del proyecto

Nombre: Paloma Larraín Pereira

## Descripción general del sistema

Proyecto desarrollado en Java como continuación de la digitalización de procesos administrativos de la agencia turística ficticia Llanquihue Tour.

El sistema permite organizar distintos tipos de servicios turísticos utilizando herencia, sobrescritura de métodos y polimorfismo. 
En esta versión, los servicios se almacenan en una colección común List<ServicioTuristico>, lo que permite recorrerlos y mostrar su información específica de manera flexible desde una misma estructura.

## Estructura general del proyecto

El proyecto está organizado en paquetes funcionales:

```text
src/
├── data/
│   └── GestorServicios.java
├── model/
│   ├── ExcursionCultural.java
│   ├── PaseoLacustre.java
│   ├── RutaGastronomica.java
│   ├── ServicioTuristico.java
├── ui/
    └── Main.java
```

## Descripción breve de los paquetes

`data`: contiene la clase GestorServicios, encargada de crear y almacenar servicios turísticos de prueba en una colección polimórfica de tipo List<ServicioTuristico>.
`model`: contiene la jerarquía de clases que representa los servicios turísticos de Llanquihue Tour.

`ui`: contiene la clase principal Main.java, encargada de ejecutar el programa, obtener la lista de servicios desde GestorServicios y mostrar los resultados por consola.


## Instrucciones para clonar y ejecutar el proyecto

Clona el repositorio desde GitHub:
```text
git clone https://github.com/lolarrain/LlanquihueTourAppV4.git
```
Abre el proyecto en IntelliJ IDEA.

Verifica que las clases estén correctamente ubicadas en sus paquetes correspondientes.

Ejecuta el archivo Main.java desde el paquete ui.

Repositorio GitHub: [https://github.com/lolarrain/LlanquihueTourAppV4]  Fecha de entrega: [06/07/2026]
