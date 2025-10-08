package com.mycompany.mvc.model;


public class MVCTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Guilherme", "guilherme@email.com", "9-123345678");
        ClienteView view = new ClienteView();
        ClienteController controller = new ClienteController(cliente, view);

        controller.atualizarView(); // exibe dados iniciais

        controller.setClienteNome("Ana");
        controller.setClienteEmail("ana@email.com");
        controller.setClienteTelefone("9-87654321");

        controller.atualizarView(); // exibe dados atualizados
    }
    
}
