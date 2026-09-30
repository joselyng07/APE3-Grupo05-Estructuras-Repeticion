import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double TARIFA_AUTO = 1.00;
        final double TARIFA_MOTO = 0.50;
        final double TARIFA_CAMION = 2.00;

        double recaudacion = 0;
        int vehiculos = 0;

        System.out.println("Tipo: 1) Auto 2) Moto 3) Camion 0) Terminar");
        System.out.print("Tipo: ");
        int tipo = sc.nextInt();

        while (tipo != 0) {
            if (tipo < 1 || tipo > 3) {
                System.out.println("Tipo invalido.");
            } else {
                System.out.print("Horas de estacionamiento: ");
                int horas = sc.nextInt();

                if (horas <= 0) {
                    System.out.println("Error: las horas deben ser mayores que 0.");
                } else {
                    double tarifa;

                    if (tipo == 1) {
                        tarifa = TARIFA_AUTO;
                    } else if (tipo == 2) {
                        tarifa = TARIFA_MOTO;
                    } else {
                        tarifa = TARIFA_CAMION;
                    }

                    double valor = horas * tarifa;
                    recaudacion += valor;
                    vehiculos++;

                    System.out.printf("Valor a pagar: $%.2f%n", valor);
                }
            }

            System.out.println("\nTipo: 1) Auto 2) Moto 3) Camion 0) Terminar");
            System.out.print("Tipo: ");
            tipo = sc.nextInt();
        }

        System.out.println("Vehiculos atendidos: " + vehiculos);
        System.out.printf("Recaudacion total: $%.2f%n", recaudacion);
    }
}