package Exemplobanco;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
        public class Banco {
            private String nome;
    private final ArrayList<Object> contas;
            public Banco(String nome) {
                    this.nome = nome;
                    this.contas = new ArrayList<>();
            }
            public void adicionarConta(Conta conta) {
                    contas.add(conta);
                    System.out.println("Conta adicionada: " + conta.getNumero() + " | Cliente: " + conta.getCliente().getNome());
            }
        public Conta buscarConta(int numero) {
                for (Iterator<Object> it = contas.iterator(); it.hasNext();) {
                    Conta c = (Conta) it.next();
                    if(c.getNumero() == numero) return c;
                }
                System.out.println("Conta não encontrada: " + numero);
        return null;
        }
        public void listarContas() {
                System.out.println("Contas do banco " + nome + ":");
                for(Object c : contas) {
                System.out.println(" | Saldo: R$" + c.getNumero() + c.getCliente().getNome() + "- " + " | Cliente: " + c.saldo);
                }
        }