import java.util.HashSet;

public class App {
    
    public static void main(String[] args) {
        HashSet<Integer> codigos = new HashSet<>();

        agregarUsuario(codigos, "ANTO11");
        agregarUsuario(codigos, "Holla11");

        permitirIngreso(codigos, "ANTO11");
        permitirIngreso(codigos, "uwu1");
        
    } 

        public static void agregarUsuario(HashSet<Integer> codigos, String idEmpleado) {
            int codigo = idEmpleado.hashCode();
            codigos.add(codigo);
            System.out.println("Usuario " + idEmpleado + " con id " + codigo + " registrado");
        }

        public static void permitirIngreso(HashSet<Integer> codigos, String idEmpleado) {
            if (codigos.contains(idEmpleado.hashCode())) {
                System.out.println("Usuario autorizado");
            } else {
                System.out.println("Usuario no autorizado");
            }
        }


    
}
