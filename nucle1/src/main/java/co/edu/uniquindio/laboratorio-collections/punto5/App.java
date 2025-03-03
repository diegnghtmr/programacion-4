import java.util.*;
public class App {
    public static void main(String[] args) {
        // Producto con nombre como clave y precio como valor
        
        // 1. HashMap
        Map<String, Double> productosHashMap = new HashMap<>();
        productosHashMap.put("Laptop", 999.99);
        productosHashMap.put("Teléfono", 599.99);
        productosHashMap.put("Tablet", 299.99);
        productosHashMap.put("Monitor", 199.99);

        System.out.println("HashMap (orden no garantizado):");
        for (Map.Entry<String, Double> entrada : productosHashMap.entrySet()) {
            System.out.println(entrada.getKey() + ": $" + entrada.getValue());
        }
        System.out.println();

        // 2. LinkedHashMap
        Map<String, Double> productosLinkedHashMap = new LinkedHashMap<>();
        productosLinkedHashMap.put("Laptop", 999.99);
        productosLinkedHashMap.put("Teléfono", 599.99);
        productosLinkedHashMap.put("Tablet", 299.99);
        productosLinkedHashMap.put("Monitor", 199.99);

        System.out.println("LinkedHashMap (orden de inserción):");
        for (Map.Entry<String, Double> entrada : productosLinkedHashMap.entrySet()) {
            System.out.println(entrada.getKey() + ": $" + entrada.getValue());
        }
        System.out.println();

        // 3. TreeMap
        Map<String, Double> productosTreeMap = new TreeMap<>();
        productosTreeMap.put("Laptop", 999.99);
        productosTreeMap.put("Teléfono", 599.99);
        productosTreeMap.put("Tablet", 299.99);
        productosTreeMap.put("Monitor", 199.99);

        System.out.println("TreeMap (orden alfabético por clave):");
        for (Map.Entry<String, Double> entrada : productosTreeMap.entrySet()) {
            System.out.println(entrada.getKey() + ": $" + entrada.getValue());
        }
    }
    
}
