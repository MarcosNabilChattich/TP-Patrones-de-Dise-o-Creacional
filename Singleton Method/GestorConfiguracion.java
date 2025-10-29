

public class GestorConfiguracion {

        //privado para asegurar instancia unica
    private static GestorConfiguracion intanciaUnica;

    private String urlBd;
    private String userBd;
    private String pathReportes;

    private GestorConfiguracion(){
        this.urlBd = "jdbc:mysql://localhost/mi_app_db";
        this.userBd = "Pablo";
        this.pathReportes = "C:\\Users\\PC 02 - Biblioteca\\Documents\\Ejemplo\\2025 - SLII- G05- Ejemplo\\bin\\Debug";
        System.out.println("Objeto de configuración creado.");
    }
        
        //unico acceso global
    public static GestorConfiguracion getInstanciaUnica() {
        if (intanciaUnica == null) {
            intanciaUnica = new GestorConfiguracion();
        }
        return intanciaUnica;
    }

    public String getUrlBd(){
        return urlBd;
    }
    public String getUserBd(){
        return userBd;
    }
    public String getPathReportes(){
        return pathReportes;
    }
}
