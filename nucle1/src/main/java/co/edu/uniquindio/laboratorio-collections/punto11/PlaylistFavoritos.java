import java.util.LinkedHashSet;

public class PlaylistFavoritos {
    private LinkedHashSet<Cancion> favoritos;

    public PlaylistFavoritos() {
        favoritos = new LinkedHashSet<>();
    }

    public boolean agregarFavorito(Cancion cancion) {
        return favoritos.add(cancion);
    }

    public boolean eliminarFavorito(Cancion cancion) {
        return favoritos.remove(cancion);
    }

    public int cantidadFavoritos() {
        return favoritos.size();
    }

    public void mostrarFavoritos() {
        System.out.println("\nCanciones favoritas (en orden de agregación):");
        for (Cancion cancion : favoritos) {
            System.out.println(cancion);
        }
    }
}
