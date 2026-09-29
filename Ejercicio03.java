import java.util.Locale;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int opcion;

        do {
            System.out.println("\n--- CALCULADORA ---");
            System.out.println("1) Sumar 2) Restar 3) Multiplicar 4) Dividir 5) Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Primer numero: ");
                double a = sc.nextDouble();
                System.out.print("Segundo numero: ");
                double b = sc.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.printf("Resultado: %.2f%n", a + b);
                        break;
                    case 2:
                        System.out.printf("Resultado: %.2f%n", a - b);
                        break;
                    case 3:
                        System.out.printf("Resultado: %.2f%n", a * b);
                        break;
                    case 4:
                        if (b == 0) {
                            System.out.println("Error: no se puede dividir entre cero.");
                        } else {
                            System.out.printf("Resultado: %.2f%n", a / b);
                        }
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("Opcion invalida.");
            }
        } while (opcion != 5);

        System.out.println("Fin del programa.");
    }
}}
