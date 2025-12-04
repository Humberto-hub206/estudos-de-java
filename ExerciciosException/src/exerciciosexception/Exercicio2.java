package exerciciosexception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int x = 0, y = 0;
        boolean continua = false;
            while(!continua){
                try {
                    System.out.println("informe o primeiro numero: ");
                    x = sc.nextInt();
                    System.out.println("informe o segundo numero: ");
                    y = sc.nextInt();
                    
                    double r = x/y;
                    System.out.println("a divisao e igual a: " +r);
                    continua = true;
                } 
                catch (InputMismatchException e){ 
                    System.out.println("ERRO: voce deve digitar um numero inteiro");
                    sc.nextLine(); //limpa o buffer
                }
                catch (ArithmeticException e){
                    System.out.println("o numero do divisor deve ser diferente de 0");
                }
                catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
                }
                    finally{
                    System.out.println("finally executado");
                }
            }
    }
}
