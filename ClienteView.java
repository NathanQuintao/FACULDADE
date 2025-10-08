package com.mycompany.mvc.model;


public class ClienteView {
    public void imprimirDetalhesCliente(String nome, String email, String telefone) {
        System.out.println("Cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
    }

}
