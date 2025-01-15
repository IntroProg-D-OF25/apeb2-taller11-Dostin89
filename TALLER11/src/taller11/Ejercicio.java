
import java.util.Scanner;

/**
 * Generar los procedimientos y/o funciones que impriman los valor pares, impares y el promedio de un arreglo bidimensional. 
 * El (los) procedimiento(s) o método(s) deben ser invocados desde el método principal (quien es el único responsable de gestionar las entradas/salidas);
 * además el método debe recibir como parámetro un arreglo bidimensional.
 */
public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de filas y columnas:");
        int filas = scanner.nextInt();
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];
        llenarMatrizAleatoria(matriz);

        System.out.println("Matriz generada:");
        mostrarMatriz(matriz);

        System.out.println("Elementos pares:");
        mostrarElementos(matriz, true);

        System.out.println("Elementos impares:");
        mostrarElementos(matriz, false);

        double promedio = calcularPromedio(matriz);
        System.out.println("Promedio de los elementos de la matriz: " + promedio);
    }

    public static void llenarMatrizAleatoria(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void mostrarElementos(int[][] matriz, boolean esPar) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((matriz[i][j] % 2 == 0) == esPar) { 
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static double calcularPromedio(int[][] matriz) {
        int suma = 0;
        int elementos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
                elementos++;
            }
        }
        return (double) suma / elementos;
    }
}

/***
 * Ingrese el n�mero de filas y columnas:
3
3
Matriz generada:
1	15	33	
36	28	10	
15	35	22	
Elementos pares:
36 28 10 22 
Elementos impares:
1 15 33 15 35 
Promedio de los elementos de la matriz: 21.666666666666668 
 */

