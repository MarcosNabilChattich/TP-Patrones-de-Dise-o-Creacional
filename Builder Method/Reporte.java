import java.time.LocalDate;

public class Reporte {
    private final String titulo;
    private final String cuerpoPrincipal;
    private final String encabezado;
    private final String pieDePagina;
    private final LocalDate fecha;
    private final String autor;
    private final Orientacion orientacion;

    public enum Orientacion {
        VERTICAL,
        HORIZONTAL
    }

    private Reporte(ReporteBuilder builder) {
        this.titulo = builder.titulo;
        this.cuerpoPrincipal = builder.cuerpoPrincipal;
        this.encabezado = builder.encabezado;
        this.pieDePagina = builder.pieDePagina;
        this.fecha = builder.fecha;
        this.autor = builder.autor;
        this.orientacion = builder.orientacion;
    }

    @Override
    public String toString() {
        return "Reporte [Titulo=" + titulo + ", Cuerpo=" + cuerpoPrincipal.substring(0, Math.min(20, cuerpoPrincipal.length())) + "..."+ ", Encabezado=" + encabezado + ", Pie de pagina=" + pieDePagina + ", Fecha=" + fecha + ", Autor=" + autor + ", Orientacion=" + orientacion + "]";
    }

    public static class ReporteBuilder {
        private final String titulo;
        private final String cuerpoPrincipal;

        private String encabezado;
        private String pieDePagina;
        private LocalDate fecha;
        private String autor;
        private Orientacion orientacion = Orientacion.VERTICAL;

        public ReporteBuilder(String titulo, String cuerpoPrincipal) {
            this.titulo = titulo;
            this.cuerpoPrincipal = cuerpoPrincipal;
        }
        
        public ReporteBuilder conEncabezado(String encabezado) {
            this.encabezado = encabezado;
            return this; 
        }

        public ReporteBuilder conPieDePagina(String pieDePagina) {
            this.pieDePagina = pieDePagina;
            return this;
        }

        public ReporteBuilder conFecha(LocalDate fecha) {
            this.fecha = fecha;
            return this;
        }

        public ReporteBuilder conAutor(String autor) {
            this.autor = autor;
            return this;
        }

        public ReporteBuilder conOrientacion(Orientacion orientacion) {
            this.orientacion = orientacion;
            return this;
        }

        public Reporte build() {
            return new Reporte(this);
        }
    }
}