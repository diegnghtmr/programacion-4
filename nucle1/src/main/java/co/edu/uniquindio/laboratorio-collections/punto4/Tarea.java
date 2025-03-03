public class Tarea implements Comparable<Tarea>{
    private String nombre;
    private int prioridad;

    public Tarea(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }
    
    @Override
    public int compareTo(Tarea otro) {
        return otro.getPrioridad() - this.prioridad; 
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }
}
