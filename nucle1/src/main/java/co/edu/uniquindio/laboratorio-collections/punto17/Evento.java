public class Evento {
    private String nombre;
    private String descripcion;
    private String ubicacion;

    public Evento(String nombre, String descripcion, String ubicacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    @Override
    public String toString() {
        return nombre + " - " + descripcion + " (" + ubicacion + ")";
    }
}
