import java.util.*;

interface Renderizador {
    void renderizar(Reporte reporte);
}

/**
 * Renderiza un reporte en formato CSV.
 */
class RenderizadorCSV implements Renderizador {

    @Override
    public void renderizar(Reporte reporte) {
        System.out.println("[Renderizando CSV]");
        System.out.println("Generando archivo CSV para: " + reporte.getTitulo());
        System.out.println("Contenido CSV: " + reporte.getContenido());
        System.out.println("Archivo CSV generado exitosamente.\n");
    }
}

/**
 * Renderiza un reporte en formato Excel.
 */
class RenderizadorExcel implements Renderizador {

    @Override
    public void renderizar(Reporte reporte) {
        System.out.println("[Renderizando Excel]");
        System.out.println("Creando hoja de cálculo para: " + reporte.getTitulo());
        System.out.println("Contenido Excel: " + reporte.getContenido());
        System.out.println("Archivo Excel generado exitosamente.\n");
    }
}

/**
 * Renderiza un reporte en formato PDF.
 */
class RenderizadorPDF implements Renderizador {

    @Override
    public void renderizar(Reporte reporte) {
        System.out.println("[Renderizando PDF]");
        System.out.println("Generando documento PDF para: " + reporte.getTitulo());
        System.out.println("Contenido PDF: " + reporte.getContenido());
        System.out.println("PDF generado exitosamente.\n");
    }
}

/**
 * Clase simple que representa un reporte
 */
class Reporte {
    private String titulo;
    private String contenido;

    public Reporte(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    @Override
    public String toString() {
        return "Reporte: " + titulo + "\nContenido: " + contenido;
    }
}

/**
 * Clase Fábrica responsable de instanciar el renderizador adecuado
 * según el tipo de reporte solicitado.
 */
public class Factory {

    /**
     * Método de fábrica que retorna una instancia de Renderizador
     * según el tipo especificado.
     */
    public static Renderizador crearRenderizador(String tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("El tipo de reporte no puede ser nulo.");
        }

        switch (tipo.toLowerCase()) {
            case "pdf":
                return new RenderizadorPDF();
            case "excel":
                return new RenderizadorExcel();
            case "csv":
                return new RenderizadorCSV();
            default:
                throw new IllegalArgumentException("Tipo de reporte no soportado: " + tipo);
        }
    }
}
