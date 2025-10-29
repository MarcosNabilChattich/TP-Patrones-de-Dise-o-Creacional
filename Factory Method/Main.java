import java.util.Scanner;

/**
 * Clase principal que demuestra el uso del patrón Factory Method
 * para el motor de renderizado de reportes.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Renderizado de Reportes ===");
        System.out.print("Ingrese el tipo de formato (PDF / EXCEL / CSV): ");
        String tipo = scanner.nextLine();

        // Crear un reporte genérico de ejemplo
        Reporte reporte = new Reporte("Balance General Q1", "Ingresos: $50,000 - Gastos: $30,000");

        try {
            // Crear el renderizador según el tipo indicado
            Renderizador renderizador = Factory.crearRenderizador(tipo);

            // Renderizar el reporte usando el renderizador adecuado
            renderizador.renderizar(reporte);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("=== Fin del programa ===");
        scanner.close();
    }
}
