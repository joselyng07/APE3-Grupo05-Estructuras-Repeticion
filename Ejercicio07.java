import java.util.Locale;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double totalAcumulado = 0;
        int numeroVentas = 0;
        char otra;

        do {
            System.out.println("\nTipo de entrada: 1) General 2) Estudiante 3) Nino");
            System.out.print("Tipo: ");
            int tipo = sc.nextInt();

            while (tipo < 1 || tipo > 3) {
                System.out.print("Tipo invalido. Ingrese 1, 2 o 3: ");
                tipo = sc.nextInt();
            }

            System.out.print("Cantidad de entradas: ");
            int cantidad = sc.nextInt();

            while (cantidad <= 0) {
                System.out.print("Cantidad invalida. Ingrese un valor mayor que 0: ");
                cantidad = sc.nextInt();
            }

            System.out.print("Precio unitario: $");
            double precio = sc.nextDouble();

            while (precio <= 0) {
                System.out.print("Precio invalido. Ingrese un valor mayor que 0: $");
                precio = sc.nextDouble();
            }

            double subtotal = cantidad * precio;
            totalAcumulado += subtotal;
            numeroVentas++;

            System.out.printf("Subtotal de la venta: $%.2f%n", subtotal);

            System.out.print("Desea realizar otra venta? (S/N): ");
            otra = Character.toUpperCase(sc.next().charAt(0));

        } while (otra == 'S');

        System.out.println("\nVentas realizadas: " + numeroVentas);
        System.out.printf("Total acumulado: $%.2f%n", totalAcumulado);
    }
}