
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer valor (decimal):");
        double Promedio1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo valor (decimal):");
        double Promedio2 = scanner.nextDouble();
        System.out.println("Ingrese el tercer valor (decimal):");
        double Promedio3 = scanner.nextDouble();
        System.out.println("Ingrese el cuarto valor (decimal):");
        double Promedio4 = scanner.nextDouble();

        String promedioCualitativo = calcularPromedioCualitativo(Promedio1, Promedio2, Promedio3, Promedio4);
        System.out.println("El promedio cualitativo es: " + promedioCualitativo);
    }

    public static String calcularPromedioCualitativo(double Promedio1, double Promedio2, double Promedio3, double Promedio4) {
        double promedio = (Promedio1 + Promedio2 + Promedio3 + Promedio4) / 4;

        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else if (promedio > 5 && promedio <= 8) {
            return "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            return "Muy Bueno";
        } else if (promedio > 9 && promedio <= 10) {
            return "Sobresaliente";
        } else {
            return "Promedio fuera de rango";  
        }
    }
}

/***
 * Ingrese el primer valor (decimal):
7
Ingrese el segundo valor (decimal):
6
Ingrese el tercer valor (decimal):
8
Ingrese el cuarto valor (decimal):
9
El promedio cualitativo es: Bueno
 */

 