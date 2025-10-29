Requerimiento 1: El motor Renderizado

El Patrón de Diseño creacional elegido fue el Factory Method ya que nos permite definir una interfaz o clase abstracta que delega la creación de objetos a las subclases concretas o fábricas especializadas, con el fin de evitar que el código cliente se acople en otras clases específicas.
Como el sistema requiere que se generen diversos tipos de reportes, cada uno tiene su propia lógica de renderizado. Entonces, Factory Method crea una fábrica centralizada que, dependiendo del tipo de reporte solicitado, se haga una instancia del renderizador adecuado (RenderizadorPDF, RenderizadorExcel,etc).
Por lo tanto, cada fábrica o método fábrica tiene su propia responsabilidad: crear un renderizador acorde al formato solicitado, manteniendo la flexibilidad del sistema y respetando los principios de diseño orientado a objetos.
Los problemas que se evitan utilizando este patrón son:
    - El alto acoplamiento de clases, es decir, el cliente solo va a interactuar con la interfaz común Renderizador.
    - Se pueden agregar nuevos tipos de renderizados sin modifcar las clases ya existentes.
    - Se evita el duplicado de código y de lógica de instancias, concentrandose en un único método de fábrica. 
