import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero (1 a 12): ");
        int numero = sc.nextInt();

        while (numero < 1 || numero > 12) {
            System.out.println("Error: el numero debe estar entre 1 y 12.");
            System.out.print("Numero (1 a 12): ");
            numero = sc.nextInt();
        }

        System.out.println("Tabla del " + numero);

        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}