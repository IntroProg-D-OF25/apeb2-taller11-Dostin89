
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz cuadrada (n x n): ");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("La suma de los elementos es: " + sumaMatriz(matriz));
        System.out.println("La resta de los elementos es: " + restaMatriz(matriz));
        System.out.println("La multiplicación de los elementos es: " + multiplicacionMatriz(matriz));

        scanner.close();
    }

    public static int sumaMatriz(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                suma += valor;
            }
        }
        return suma;
    }

    public static int restaMatriz(int[][] matriz) {
        int resta = matriz[0][0]; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = (i == 0 ? 1 : 0); j < matriz[i].length; j++) { 
                resta -= matriz[i][j];
            }
        }
        return resta;
    }

    public static int multiplicacionMatriz(int[][] matriz) {
        int producto = 1;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                producto *= valor;
            }
        }
        return producto;
    }
}

/***
 * Ingrese el tama�o de la matriz cuadrada (n x n): 3
Ingrese los elementos de la matriz:
Elemento [0][0]: 3
Elemento [0][1]: 3
Elemento [0][2]: 1
Elemento [1][0]: 2
Elemento [1][1]: 2
Elemento [1][2]: 3
Elemento [2][0]: 4
Elemento [2][1]: 7
Elemento [2][2]: 9
La suma de los elementos es: 34
La resta de los elementos es: -28
La multiplicaci�n de los elementos es: 27216
 */
