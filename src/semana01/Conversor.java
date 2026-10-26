package semana01;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Monto en soles: ");
        double soles = sc.nextDouble();


        final double TIPO_CAMBIO = 3.75;
        double dolares = soles / TIPO_CAMBIO;

        System.out.printf("Equivale a $%.2f%n", dolares);

        sc.close();

    }
}
