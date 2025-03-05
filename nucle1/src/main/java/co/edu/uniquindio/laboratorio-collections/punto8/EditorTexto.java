import java.util.Vector;

public class EditorTexto {
    private Vector<String> cambios;
    private String textoActual;

    public EditorTexto() {
        cambios = new Vector<>();
        textoActual = "";
    }

    public void realizarCambio(String nuevoTexto) {
        cambios.add(textoActual);
        textoActual = nuevoTexto;
    }

    public boolean deshacer() {
        if (cambios.isEmpty()) {
            return false;
        }
        textoActual = cambios.remove(cambios.size() - 1);
        return true;
    }

    public String getTextoActual() {
        return textoActual;
    }

    public int getCantidadCambios() {
        return cambios.size();
    }
}
