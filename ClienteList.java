package com.mycompany.mvc.model;
import java.util.List;
import java.util.ArrayList;

public class ClienteList {
    int i = 0;
    
    private final List<Cliente> clientes;
    
    public ClienteList(){
    clientes = new ArrayList<>();
    }
    
    public void adicionarCliente(Cliente cliente) {
    clientes.add(cliente);
    }
    
    public List<Cliente> getCliente(){
        return clientes;
    }
    public void AtualizarCliente(Cliente cliente) {
  
        for (int i=0, i < clientes.size(); i++) {
        clientes.set(i, cliente);
        break;
    }
    }
}
