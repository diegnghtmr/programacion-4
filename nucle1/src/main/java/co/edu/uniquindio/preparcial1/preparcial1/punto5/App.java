
public class App {
    public static void main(String[] args) {
        int[][] matriz = 
        {
            {1,3,5,7},
            {2,4,6,8}
        };

        int[][] matrizT = matrizT(matriz);
        imprimir(matrizT);
    }

    public static int[][] matrizT(int[][] m) {
        int filas = m.length;
        int columnas = m[0].length;

        int [][] t = new int[columnas][filas];
        matrizTRecursiva(m, t, 0, 0);

        return t;

    }

    public static void matrizTRecursiva(int[][] m, int[][] t, int filaActual, int columnaActual) {

        if (filaActual == m.length){
            return;
        }

        if (columnaActual == m[0].length) {
            matrizTRecursiva(m, t, filaActual+1, 0);
            return;
        }

        t[columnaActual][filaActual] = m[filaActual][columnaActual];
        
        matrizTRecursiva(m, t, filaActual, columnaActual+1);
    }

    public static void imprimir(int[][] m) {
        for (int i =0; i<m.length; i++) {
            for (int j = 0; j<m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
