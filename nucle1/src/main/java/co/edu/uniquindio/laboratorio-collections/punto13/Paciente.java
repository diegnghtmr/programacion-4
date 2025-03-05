public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private int nivelUrgencia;
    private String condicion;

    public Paciente(String nombre, int nivelUrgencia, String condicion) {
        this.nombre = nombre;
        this.nivelUrgencia = nivelUrgencia;
        this.condicion = condicion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivelUrgencia() {
        return nivelUrgencia;
    }

    public String getCondicion() {
        return condicion;
    }

    @Override
    public int compareTo(Paciente otro) {
        return otro.nivelUrgencia - this.nivelUrgencia;
    }

    @Override
    public String toString() {
        return nombre + " - Urgencia: " + nivelUrgencia + " - Condición: " + condicion;
    }
}