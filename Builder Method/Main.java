import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creando reporte básico");
        Reporte reporteBasico = new Reporte.ReporteBuilder(
                "Ventas Enero",
                "El cuerpo del reporte básico de ventas de enero...")
                .build();

        System.out.println(reporteBasico);
        System.out.println("\n");

        System.out.println("Creando reporte completo");
        Reporte reporteCompleto = new Reporte.ReporteBuilder(
                "Informe Anual 2024",
                "Cuerpo principal del informe anual, detallando...")
                .conEncabezado("Compania XYZ - Reporte Confidencial")
                .conPieDePagina("Pagina 1 de 50")
                .conAutor("Analista Juan Jose Bolano")
                .conFecha(LocalDate.of(2025, 1, 20))
                .conOrientacion(Reporte.Orientacion.HORIZONTAL)
                .build();

        System.out.println(reporteCompleto);
        System.out.println("\n");

        System.out.println("Creando reporte interno");
        Reporte reporteInterno = new Reporte.ReporteBuilder(
                "Minuta de Reunion",
                "Asistentes: Ana, Luis, Carla. Temas tratados...")
                .conAutor("Equipo de Proyecto")
                .conFecha(LocalDate.now())
                .build();

        System.out.println(reporteInterno);

    }
}