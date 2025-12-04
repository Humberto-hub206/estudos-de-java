package classesabstratas;

import java.util.Scanner;

public class ClassesAbstratas {

    public interface FormaGeometrica {
        double Area();
        double Perimetro();
        void exibirDados();
    }

    // Classe abstrata que implementa a interface
    public static abstract class Forma implements FormaGeometrica {
        protected double lado;
        protected double altura;

        public Forma(double lado, double altura) {
            this.lado = lado;
            this.altura = altura;
        }

        public abstract double Area();
        public abstract double Perimetro();
        public abstract void exibirDados();
    }

    public static class Circulo extends Forma {
        public Circulo(double raio) {
            super(raio, 0); // altura não usada
        }

        public double Area() {
            return Math.PI * Math.pow(lado, 2);
        }

        public double Perimetro() {
            return 2 * Math.PI * lado;
        }

        public void exibirDados() {
            System.out.println("--- dados do círculo ---");
            System.out.println("Área: " + Area());
            System.out.println("Perímetro: " + Perimetro());
            System.out.println("------------------------");
        }
    }

    public static class Triangulo extends Forma {
        public Triangulo(double lado, double altura) {
            super(lado, altura);
        }

        public double Area() {
            return (lado * altura) / 2;
        }

        public double Perimetro() {
            return lado * 3;
        }

        public void exibirDados() {
            System.out.println("--- dados do triângulo ---");
            System.out.println("Área: " + Area());
            System.out.println("Perímetro: " + Perimetro());
            System.out.println("--------------------------");
        }
    }

    public static class Retangulo extends Forma {
        public Retangulo(double lado, double altura) {
            super(lado, altura);
        }

        public double Area() {
            return lado * altura;
        }

        public double Perimetro() {
            return 2 * (lado + altura);
        }

        public void exibirDados() {
            System.out.println("--- dados do retângulo ---");
            System.out.println("Área: " + Area());
            System.out.println("Perímetro: " + Perimetro());
            System.out.println("--------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do lado: ");
        double lado = sc.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double altura = sc.nextDouble();

        Triangulo t = new Triangulo(lado, altura);
        Retangulo r = new Retangulo(lado, altura);
        Circulo c = new Circulo(lado); // aqui o lado funciona como raio

        t.exibirDados();
        r.exibirDados();
        c.exibirDados();

        sc.close();
    }
}
