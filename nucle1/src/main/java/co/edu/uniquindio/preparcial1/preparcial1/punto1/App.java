
public class App {
    public static void main(String[] args) {
        String[] arreglo = {"Sara", "Antonio", "Chester", "Maycol"};
        MiLista miLista = new MiLista(arreglo);

        for (String string : miLista) {
            System.out.println(string);
        }
    }
    
}
