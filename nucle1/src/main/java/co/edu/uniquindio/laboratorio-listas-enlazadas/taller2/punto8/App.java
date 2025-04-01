public class App {
    public static void main(String[] args) {
        ListaDoblementeEnlazada<Persona> listaPersonas = new ListaDoblementeEnlazada<>();
        
        listaPersonas.agregarFinal(new Persona("1234", "Ana"));     
        listaPersonas.agregarFinal(new Persona("56789", "Luis"));   
        listaPersonas.agregarFinal(new Persona("9876", "Carlos"));  
        listaPersonas.agregarFinal(new Persona("54321", "Marta")); 
        
        System.out.println("Lista de personas:");
        System.out.println(listaPersonas.mostrarAdelante());
        
        ListaDoblementeEnlazada<Persona> personasCedulaPar = listaPersonas.obtenerListaLongitudCedulaPar();
        
        System.out.println("\nPersonas con cédula de cantidad par de dígitos:");
        System.out.println(personasCedulaPar.mostrarAdelante());
    }
}

