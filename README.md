# TP-Patrones-de-Diseno-Creacional

Requerimiento 1: Motor renderizado

El patrón de diseño creacional elegido fue el Factory Method ya que este permite definir una interfaz o clase abstracta que delega la creación de objetos a las subclases concretas o las especializadas con el fin de evitar que el código se acople en otras clases específicas.
En el sistema se pide que se generen diversos tipos de reportes con sus respectivas lógicas de renderizado. Por lo tanto, con Factory Method se puede crear una fábrica centralizada y dependiendo del reporte que se solicita, se realiza una instancia del renderizado (PDF, Excel, CSV).
Los problemas que se evitan utilizando este patrón son:
Alto acoplamiento de clases, es decir, el cliente solo va a interactuar con la interfaz común Renderizador.
Se pueden agregar nuevos tipos de renderizados sin modificar las clases ya existentes.
Se evita el duplicado de código y de lógica de instancias, concentrándose en un único método de fábrica.

Requerimiento 2: Construcción de los reportes


Requerimiento 3: Gestor de configuración global

