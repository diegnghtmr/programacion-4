public class App {

    public static void main(String[] args) {
        Navegador nav = new Navegador();

        nav.navegar("AntonIA");
        nav.navegar("El rincon del Mono");
        nav.navegar("Estaban's");
        nav.navegar("Meller Blue");
        nav.mirarHistorial();
        nav.retroceder();
        nav.retroceder();
        nav.mirarHistorial();
    }
}
