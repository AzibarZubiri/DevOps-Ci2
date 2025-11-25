package actions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int a = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int b = scanner.nextInt();

        System.out.println("Suma: " + calc.add(a, b));
        System.out.println("Resta: " + calc.subtract(a, b));
        System.out.println("Multiplicación: " + calc.multiply(a, b));

        scanner.close();
    }
}