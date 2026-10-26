package semana01;

import java.util.Scanner;

public class ParOImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero: ");
        int numero = sc.nextInt();

        boolean esPar = numero % 2 == 0;
        boolean esMultiploDe3 = numero % 3 == 0;
        System.out.println("Es par? " + esPar);
        System.out.println("Es multiplo? " + esMultiploDe3);

        sc.close();

    }
}
