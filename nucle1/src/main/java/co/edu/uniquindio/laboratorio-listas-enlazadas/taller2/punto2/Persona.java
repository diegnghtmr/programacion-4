public class Persona implements Comparable<Persona> {
    private String cedula;
    private String nombre;

    public Persona (String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre =nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int compareTo(Persona otro) {
        return this.cedula.compareTo(otro.cedula);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
