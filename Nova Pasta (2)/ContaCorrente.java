package Exemplobanco;
    public class ContaCorrente extends Conta {
    private double limite = 0;
    public ContaCorrente(int numero, Cliente cliente, double limite) {
        super(numero, cliente);
        this.limite = limite;
       }
        @Override
    public void sacar(double valor) {
        if(valor > 0 && saldo + limite >= valor) {
               saldo -= valor;
               System.out.println("Saque de R$" + valor + " realizado na conta corrente " + numero);
        } else {
               System.out.println("Saque não autorizado: saldo + limite insuficiente.");
        }
}}