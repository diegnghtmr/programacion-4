public class App {

    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.agregarCliente("Camilo");

        banco.agregarCliente("Papotico");
        
        banco.agregarCliente("Zazza");

        System.out.println(banco.toString());

        banco.agregarCliente("Antonio");
        banco.agregarClientePrioridad("Esteban de la cruz");

        System.out.println(banco.toString());

        banco.atenderCliente();
        banco.atenderCliente();
        System.out.println(banco.toString());
    }
}
