import java.util.Locale;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        final double NOTA_APROBACION = 7.0;

        System.out.print("Numero de estudiantes: ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Error: debe ser mayor que 0.");
            System.out.print("Numero de estudiantes: ");
            n = sc.nextInt();
        }

        double suma = 0, mayor = 0, menor = 10;
        int aprobados = 0, reprobados = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nota del estudiante " + i + ": ");
            double nota = sc.nextDouble();

            while (nota < 0 || nota > 10) {
                System.out.println("Error: la nota debe estar entre 0 y 10.");
                System.out.print("Nota del estudiante " + i + ": ");
                nota = sc.nextDouble();
            }

            suma += nota;
            if (nota > mayor) mayor = nota;
            if (nota < menor) menor = nota;

            if (nota >= NOTA_APROBACION) aprobados++;
            else reprobados++;
        }

        System.out.printf("Promedio general: %.2f%n", suma / n);
        System.out.printf("Nota mayor: %.2f%n", mayor);
        System.out.printf("Nota menor: %.2f%n", menor);
        System.out.printf("Aprobados: %d (%.2f%%)%n", aprobados, aprobados * 100.0 / n);
        System.out.printf("Reprobados: %d (%.2f%%)%n", reprobados, reprobados * 100.0 / n);
    }
}