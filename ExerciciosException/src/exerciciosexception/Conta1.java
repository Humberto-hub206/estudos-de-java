package exerciciosexception;

public class Conta1 {
    private double saldo;
    private double limite;

    public void deposita(double valor) {
        saldo += valor;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void saca(double valor) throws ContaExcecao1 {
        if (valor > saldo + limite) {
            throw new ContaExcecao1("Saldo insuficiente para saque!");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
