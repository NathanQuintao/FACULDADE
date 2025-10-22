package Exemplobanco;
    public class ContaPoupanca extends Conta {
        private double rendimentoMensal;
            public ContaPoupanca(int numero, Cliente cliente, double rendimentoMensal) {
                super(numero, cliente);
                this.rendimentoMensal = rendimentoMensal;
            }
    public void sacar(double valor) {
        double saldo = 0;
        if(valor > 0 && saldo >= valor) {
        saldo -= valor;
            String numero = null;
        System.out.println("Saque de R$" + valor + " realizado na poupança " + numero);
    } else {
        System.out.println("Saque não autorizado: saldo insuficiente.");
    } }
    public void aplicarRendimento() {
        double saldo = 0;
        saldo += saldo * rendimentoMensal / 100;
        System.out.println("Rendimento aplicado: novo saldo R$" + saldo);
}}