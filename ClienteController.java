package com.mycompany.mvc.model;

public class ClienteController {
     private final Cliente model;
    private final ClienteView view;

    public ClienteController(Cliente model, ClienteView view) {
        this.model = model;
        this.view = view;
    }

    public void setClienteNome(String nome) { model.setNome(nome); }
    public void setClienteEmail(String email) { model.setEmail(email); }
    public void setClienteTelefone (String telefone) { model.setTelefone(telefone);}

    public void atualizarView() {
        view.imprimirDetalhesCliente(model.getNome(), model.getEmail(), model.getTelefone());
    }

}
