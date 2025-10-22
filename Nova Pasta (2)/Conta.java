package Exemplobanco;
    public abstract class Conta {
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0;
        }
        public abstract void sacar(double valor);
        public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
            System.out.println("Depositado R$" + valor + " na conta " + numero);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
      }
        public void transferir(Conta destino, double valor) {
        if(valor > 0 && saldo >= valor) {
        this.saldo -= valor;
        destino.depositar(valor);
        System.out.println("Transferido R$" + valor + " da conta " + this.numero + " para a conta " + destino.numero);
        } else {
            System.out.println("Transferência não realizada: saldo insuficiente ou valor inválido.");
        }
      }
        public void imprimirSaldo() {
        System.out.println("Conta " + numero + " | Saldo: R$" + saldo);
      }
        public int getNumero() {
            return numero;
        }
        public Cliente getCliente() {
            return cliente;
}}