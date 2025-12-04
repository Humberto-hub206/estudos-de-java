package exerciciosjava;

import java.util.Scanner;

public class Calculadora {

    // Interface estática
    interface OperacaoMatematica {
        int calcula(int a, int b);
    }

    static class Soma implements OperacaoMatematica {
        public int calcula(int a, int b) { return a + b; }
    }

    static class Subtracao implements OperacaoMatematica {
        public int calcula(int a, int b) { return a - b; }
    }

    static class Multiplicacao implements OperacaoMatematica {
        public int calcula(int a, int b) { return a * b; }
    }

    static class Divisao implements OperacaoMatematica {
        public int calcula(int a, int b) {
            if (b == 0) throw new ArithmeticException("Divisao por zero!");
            return a / b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escolha a operacao:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.print("Opcao: ");
        int opcao = sc.nextInt();

        System.out.print("Digite o primeiro numero: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int b = sc.nextInt();

        OperacaoMatematica operacao = null;

        switch (opcao) {
            case 1: operacao = new Soma(); break;
            case 2: operacao = new Subtracao(); break;
            case 3: operacao = new Multiplicacao(); break;
            case 4: operacao = new Divisao(); break;
            default:
                System.out.println("Opção invalida!");
                sc.close();
                return;
        }

        int resultado = operacao.calcula(a, b);
        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}


