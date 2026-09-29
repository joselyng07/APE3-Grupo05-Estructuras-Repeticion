import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menores = 0, adultos = 0, mayores = 0, total = 0, suma = 0;

        System.out.print("Edad (-1 para terminar): ");
        int edad = sc.nextInt();

        while (edad != -1) {
            if (edad < 0 || edad > 120) {
                System.out.println("Error: edad no valida.");
            } else {
                suma += edad;
                total++;

                if (edad < 18) {
                    menores++;
                } else if (edad <= 65) {
                    adultos++;
                } else {
                    mayores++;
                }
            }

            System.out.print("Edad (-1 para terminar): ");
            edad = sc.nextInt();
        }

        if (total > 0) {
            System.out.println("Menores de edad: " + menores);
            System.out.println("Adultos: " + adultos);
            System.out.println("Mayores de 65 anios: " + mayores);
            System.out.printf("Promedio de edades: %.2f%n", (double) suma / total);
        } else {
            System.out.println("No se ingresaron edades validas.");
        }
    }
}