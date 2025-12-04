package exerciciosjava;

import java.util.Scanner;

public class ConversorDeTemperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * (5.0 / 9.0);

        System.out.println("A temperatura em Celsius e: " + celsius);

        sc.close();
    }
    
}
