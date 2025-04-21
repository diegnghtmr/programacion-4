public class App{
    public static void main(String[] args){
        Cola<Persona> cola = new Cola<>();
        cola.encolar(new Persona("Juan", 25, "M"));
        cola.encolar(new Persona("Maria", 32, "F"));
        cola.encolar(new Persona("Pedro", 45, "M"));
        cola.encolar(new Persona("Ana", 29, "F"));
        cola.encolar(new Persona("Luis", 52, "M"));
        cola.encolar(new Persona("Carmen", 38, "F"));
        Cola<Persona> newCola = quitarPersonaCola(cola);
        while(!newCola.estaVacia()) {
            System.out.println(newCola.peek().getEdad() + " " + newCola.peek().getNombre());
            cola.desencolar();
        }
    }

    public static <T extends Persona> Cola<T> quitarPersonaCola(Cola<T> cola) {
        int longitud = cola.getTamanio();
        for(int i=0; i<longitud; i++){
            T persona = cola.peek();
            cola.desencolar();
            if(persona.getEdad()<30 || persona.getEdad()>50) {
                cola.encolar(persona);
            }
        }
        return cola;
    }
}
