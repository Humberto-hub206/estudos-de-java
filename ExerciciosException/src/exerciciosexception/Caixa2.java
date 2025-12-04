package exerciciosexception;

public class Caixa2 {
     public static void main(String[] args) {
        Conta2 minhaConta = new Conta2();
        minhaConta.deposita(100);
        minhaConta.setLimite(100);

        try {
            minhaConta.saca(1000);
            System.out.println("Saque realizado com sucesso!");
        } catch (ContaExcecao2 e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
            System.out.println("Saldo disponível: " + e.getSaldoAtual());
        }
    }
}
