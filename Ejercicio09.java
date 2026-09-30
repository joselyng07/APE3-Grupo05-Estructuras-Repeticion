import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de estudiantes: ");
        int estudiantes = sc.nextInt();

        while (estudiantes <= 0) {
            System.out.print("Debe ser mayor que 0. Numero de estudiantes: ");
            estudiantes = sc.nextInt();
        }

        System.out.print("Numero de dias: ");
        int dias = sc.nextInt();

        while (dias <= 0) {
            System.out.print("Debe ser mayor que 0. Numero de dias: ");
            dias = sc.nextInt();
        }

        int totalPresentes = 0, totalAusentes = 0;

        for (int e = 1; e <= estudiantes; e++) {
            int presentes = 0, ausentes = 0;

            for (int d = 1; d <= dias; d++) {
                char marca;

                do {
                    System.out.print("Estudiante " + e + ", dia " + d + " (P/A): ");
                    marca = Character.toUpperCase(sc.next().charAt(0));

                    if (marca != 'P' && marca != 'A') {
                        System.out.println("Error: ingrese solo P o A.");
                    }

                } while (marca != 'P' && marca != 'A');

                if (marca == 'P') presentes++;
                else ausentes++;
            }

            System.out.println("Estudiante " + e + " -> Asistencias: " + presentes
                    + " | Ausencias: " + ausentes);

            totalPresentes += presentes;
            totalAusentes += ausentes;
        }

        System.out.println("TOTAL DEL CURSO -> Asistencias: " + totalPresentes
                + " | Ausencias: " + totalAusentes);
    }
}