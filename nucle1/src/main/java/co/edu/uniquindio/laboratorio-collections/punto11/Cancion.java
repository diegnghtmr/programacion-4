public class Cancion {
    private String titulo;
    private String artista;
    private String genero;

    public Cancion(String titulo, String artista, String genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cancion cancion = (Cancion) obj;
        return titulo.equals(cancion.titulo) && artista.equals(cancion.artista);
    }

    @Override
    public int hashCode() {
        return titulo.hashCode() + artista.hashCode();
    }

    @Override
    public String toString() {
        return titulo + " - " + artista + " (" + genero + ")";
    }
}
