public class Main {
    
    public static void main(String[] args) {
       GestorConfiguracion config1 = GestorConfiguracion.getInstanciaUnica();
       System.out.println("URL: " + config1.getUrlBd());

       GestorConfiguracion config2 = GestorConfiguracion.getInstanciaUnica();

       if(config1 == config2){
        System.out.println("ambas variables poseen la misma instancia\n" 
        + "Url variable 1: " + config1.getUrlBd() +
        "\n" + "Nombre variable 1: " + config1.getUserBd() +
        "\n" + "Directorio Variable 1 " + config1.getPathReportes()
        +"\n\n" + "Url variable 2: " + config2.getUrlBd() +
        "\n" + "Nombre variable 2: " + config2.getUserBd() +
        "\n" + "Directorio Variable 2 " + config2.getPathReportes());
       }
    }
}
