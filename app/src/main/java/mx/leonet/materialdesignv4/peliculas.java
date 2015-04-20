package mx.leonet.materialdesignv4;

/**
 * Created by L3oNeT on 19/04/15.
 */
public class peliculas {

    private String titulo, genero;
    private int imagen;
    private double calificacion;
    private int anio;

    public peliculas(int imagen, String titulo, double calificacion, int anio, String genero) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.calificacion = calificacion;
        this.anio = anio;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getImagen() {
        return imagen;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public int getAnio() {
        return anio;
    }
}
