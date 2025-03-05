public class App {
    public static void main(String[] args) {
        PlaylistFavoritos playlist = new PlaylistFavoritos();

        System.out.println("=== Aplicación de Música - Playlist de Favoritos ===");

        Cancion cancion1 = new Cancion("Bohemian Rhapsody", "Queen", "Rock");
        Cancion cancion2 = new Cancion("Billie Jean", "Michael Jackson", "Pop");
        Cancion cancion3 = new Cancion("Sweet Child O' Mine", "Guns N' Roses", "Rock");
        Cancion cancion4 = new Cancion("Bohemian Rhapsody", "Queen", "Rock");

        System.out.println("\nAgregando canciones a favoritos:");
        mostrarResultadoAgregacion(playlist, cancion1);
        mostrarResultadoAgregacion(playlist, cancion2);
        mostrarResultadoAgregacion(playlist, cancion3);
        
        System.out.println("\nIntentando agregar canción duplicada:");
        mostrarResultadoAgregacion(playlist, cancion4);

        playlist.mostrarFavoritos();
        
        System.out.println("\nTotal de canciones favoritas: " + playlist.cantidadFavoritos());
    }

    private static void mostrarResultadoAgregacion(PlaylistFavoritos playlist, Cancion cancion) {
        boolean resultado = playlist.agregarFavorito(cancion);
        System.out.println("Agregando: " + cancion + " - " + 
            (resultado ? "Exitoso" : "Fallido - Canción ya existe"));
    }
}
