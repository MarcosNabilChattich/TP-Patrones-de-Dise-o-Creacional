# TP-Patrones-de-Diseno-Creacional

### Requerimiento 1: Motor renderizado

El patrón de diseño creacional elegido fue el **Factory Method** ya que este permite definir una interfaz o clase abstracta que delega la creación de objetos a las subclases concretas o las especializadas con el fin de evitar que el código se acople en otras clases específicas.
En el sistema se pide que se generen diversos tipos de reportes con sus respectivas lógicas de renderizado. Por lo tanto, con Factory Method se puede crear una fábrica centralizada y dependiendo del reporte que se solicita, se realiza una instancia del renderizado (PDF, Excel, CSV).
Los problemas que se evitan utilizando este patrón son:
Alto acoplamiento de clases, es decir, el cliente solo va a interactuar con la interfaz común Renderizador.
Se pueden agregar nuevos tipos de renderizados sin modificar las clases ya existentes.
Se evita el duplicado de código y de lógica de instancias, concentrándose en un único método de fábrica.

### Requerimiento 2: Construcción de los reportes

Desarrollo:
	Para este requerimiento se eligió el patrón de diseño builder, ya que este permite hacer un objeto más complejo a partir de constructores, todo esto ensamblado por un “director”, de esta forma se evita tener un constructor con 7 parámetros y valores null o múltiples constructores, obteniendo asi un código más limpio.


### Requerimiento 3: Gestor de configuración global
Se utilizo el diseño **singleton**, con el objetivo de mantener una unica instacia utilizable por todas las clases, sin oportunidad de modificación.
El sistema tiene la necesidad de un punto de acceso unico para configuraciones globales, las cuales son
  - La URL de la base de datos (String urlBd)
  - El nombre de usuario de la BD (String userBd)
  - El directorio de salida para los reportes (String pathReporte)

Para lo que se creo la clase de gestor como acceso
```public class GestorConfiguracion```

y la clase de prueba Main
```public class Main```
