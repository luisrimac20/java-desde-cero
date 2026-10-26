package semana01;

import java.util.Scanner;

public class UsoScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Como te llamas? ");
        String nombre = sc.nextLine();

        System.out.print(" Cuantos años tienes? ");
        int edad = sc.nextInt();

        System.out.println(" Hola " + nombre + ", en 5 años tendras " + (edad+ 5));


    }
}
