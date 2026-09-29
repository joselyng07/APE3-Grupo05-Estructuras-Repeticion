import java.util.Locale;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        final double NOTA_APROBACION = 7.0;

        int n;
        do {
            System.out.print("Cantidad de estudiantes (N): ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Error: N debe ser mayor que 0.");
            }
        } while (n <= 0);

        double suma = 0, mayor = 0, menor = 10;
        int aprobados = 0, reprobados = 0;

        for (int i = 1; i <= n; i++) {
            double nota;
            do {
                System.out.print("Calificacion " + i + ": ");
                nota = sc.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Error: la nota debe estar entre 0 y 10.");
                }
            } while (nota < 0 || nota > 10);

            suma += nota;
            if (nota > mayor) mayor = nota;
            if (nota < menor) menor = nota;
            if (nota >= NOTA_APROBACION) aprobados++;
            else reprobados++;
        }

        System.out.printf("Promedio general: %.2f%n", suma / n);
        System.out.printf("Calificacion mayor: %.2f%n", mayor);
        System.out.printf("Calificacion menor: %.2f%n", menor);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
    }
}