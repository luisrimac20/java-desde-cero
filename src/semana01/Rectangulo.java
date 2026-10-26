package semana01;

import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Largo: ");
        double largo = sc.nextDouble();

        System.out.print("Ancho: ");
        double ancho = sc.nextDouble();


        double area = largo * ancho;
        double perimetro = 2 *(largo + ancho);

        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);

        sc.close();

    }

}
