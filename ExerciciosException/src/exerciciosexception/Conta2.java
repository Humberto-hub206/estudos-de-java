package exerciciosexception;

public class Conta2 {
    private double saldo;
    private double limite;

    public void deposita(double valor) {
        saldo += valor;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void saca(double valor) throws ContaExcecao2 {
    if (valor > saldo + limite) {
        throw new ContaExcecao2("Saldo insuficiente para saque!", saldo);
    }
    saldo -= valor;
}

    public double getSaldo() {
        return saldo;
    }
}
