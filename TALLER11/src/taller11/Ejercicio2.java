
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("Seleccione una opción para calcular el área:");
            System.out.println("1. Área de un cuadrado");
            System.out.println("2. Área de un triángulo");
            System.out.println("3. Área de un rectángulo");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    obtenerAreaCuadrado(scanner);
                    break;
                case 2:
                    obtenerAreaTriangulo(scanner);
                    break;
                case 3:
                    obtenerAreaRectangulo(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        } while (opcion != 0);
    }

    public static void obtenerAreaCuadrado(Scanner scanner) {
        System.out.println("Ingrese el lado del cuadrado:");
        double lado = scanner.nextDouble();
        double area = lado * lado * lado * lado; 
        System.out.println("El área del cuadrado es: " + area);
    }

    public static void obtenerAreaTriangulo(Scanner scanner) {
        System.out.println("Ingrese la base del triángulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del triángulo:");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2; 
        System.out.println("El área del triángulo es: " + area);
    }


    public static void obtenerAreaRectangulo(Scanner scanner) {
        System.out.println("Ingrese la base del rectángulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectángulo:");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }
}

/***
 * Seleccione una opci�n para calcular el �rea:
1. �rea de un cuadrado
2. �rea de un tri�ngulo
3. �rea de un rect�ngulo
0. Salir
1
Ingrese el lado del cuadrado:
21
El �rea del cuadrado es: 194481.0
Seleccione una opci�n para calcular el �rea:
1. �rea de un cuadrado
2. �rea de un tri�ngulo
3. �rea de un rect�ngulo
0. Salir
2
Ingrese la base del tri�ngulo:
22
Ingrese la altura del tri�ngulo:
24
El �rea del tri�ngulo es: 264.0
Seleccione una opci�n para calcular el �rea:
1. �rea de un cuadrado
2. �rea de un tri�ngulo
3. �rea de un rect�ngulo
0. Salir
23
Opci�n inv�lida, intente nuevamente.
Seleccione una opci�n para calcular el �rea:
1. �rea de un cuadrado
2. �rea de un tri�ngulo
3. �rea de un rect�ngulo
0. Salir
0
Saliendo del programa
 */
