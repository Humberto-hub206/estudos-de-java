package exerciciosexception;

public class ContaExcecao2 extends Exception {
     private double saldoAtual;

     public ContaExcecao2(String mensagem, double saldoAtual) {
         super(mensagem);
         this.saldoAtual = saldoAtual;
     }

    public double getSaldoAtual() {
        return saldoAtual;
    }
}
