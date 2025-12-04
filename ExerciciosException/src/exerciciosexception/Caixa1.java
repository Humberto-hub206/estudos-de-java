package exerciciosexception;

public class Caixa1 {
    public static void main(String[] args) {
        Conta1 minhaConta = new Conta1();
        minhaConta.deposita(100);
        minhaConta.setLimite(100);

        try {
            minhaConta.saca(1000);
            System.out.println("Saque realizado com sucesso!");
        } catch (ContaExcecao1 e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }
    }
}
