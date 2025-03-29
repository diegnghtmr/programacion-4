public class App {
    public static void main(String[] args) {
        ListaSimplementeEnlazada<Persona> listaPersonas = new ListaSimplementeEnlazada<>();
        
        listaPersonas.agregarFinal(new Persona("1234", "Ana"));      
        listaPersonas.agregarFinal(new Persona("56789", "Luis"));    
        listaPersonas.agregarFinal(new Persona("9876", "Carlos"));   
        listaPersonas.agregarFinal(new Persona("54321", "Marta"));  
        
        System.out.println("Lista de personas:");
        System.out.println(listaPersonas.mostrar());
        
        ListaSimplementeEnlazada<Persona> listaCedulasPares = listaPersonas.obtenerListaCedulaPar();
        
        System.out.println("\nPersonas con cédula de cantidad par de dígitos:");
        System.out.println(listaCedulasPares.mostrar());
    }
}

