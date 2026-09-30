import java.util.Locale;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 100.00;
        int transacciones = 0;
        int opcion;

        do {
            System.out.println("\n--- CAJERO UNIVERSITARIO ---");
            System.out.println("1) Consultar saldo 2) Depositar 3) Retirar");
            System.out.println("4) Ver transacciones 5) Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("Saldo actual: $%.2f%n", saldo);
                    break;

                case 2:
                    System.out.print("Monto a depositar: ");
                    double deposito = sc.nextDouble();

                    if (deposito <= 0) {
                        System.out.println("Error: el monto debe ser positivo.");
                    } else {
                        saldo += deposito;
                        transacciones++;
                        System.out.printf("Deposito exitoso. Saldo: $%.2f%n", saldo);
                    }
                    break;

                case 3:
                    System.out.print("Monto a retirar: ");
                    double retiro = sc.nextDouble();

                    if (retiro <= 0) {
                        System.out.println("Error: el monto debe ser positivo.");
                    } else if (retiro > saldo) {
                        System.out.println("Error: saldo insuficiente.");
                    } else {
                        saldo -= retiro;
                        transacciones++;
                        System.out.printf("Retiro exitoso. Saldo: $%.2f%n", saldo);
                    }
                    break;

                case 4:
                    System.out.println("Transacciones realizadas: " + transacciones);
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 5);

        System.out.println("Gracias por usar el cajero.");
    }
}