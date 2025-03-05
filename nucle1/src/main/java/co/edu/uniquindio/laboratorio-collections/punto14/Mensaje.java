public class Mensaje {
    private String remitente;
    private String contenido;
    private String timestamp;

    public Mensaje(String remitente, String contenido, String timestamp) {
        this.remitente = remitente;
        this.contenido = contenido;
        this.timestamp = timestamp;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getContenido() {
        return contenido;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] " + remitente + ": " + contenido;
    }
}
