package com.mycompany.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe principal para conexão com o banco de dados.
 * @author SUPORTE
 */
public class App {

    public static void main(String[] args) {
        // Carregar o driver JDBC
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // Corrigido o nome do driver JDBC

            String url = "jdbc:mysql://localhost:3306/escola";
            String usuario = "root";
            String senha = "mysql";
            
            // Estabelecendo a conexão com o banco
            try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {
                System.out.println("Conectado com sucesso!");

                // Criar a tabela 'alunos' se não existir
                String sqlCreate = "CREATE TABLE IF NOT EXISTS alunos (" +
                        "id INT AUTO_INCREMENT PRIMARY KEY, " +
                        "nome VARCHAR(45) NOT NULL, " +
                        "idade INT NOT NULL)";
                try (PreparedStatement stmt = conexao.prepareStatement(sqlCreate)) {
                    stmt.executeUpdate();
                    System.out.println("Tabela criada (ou já existe).");
                }

                // Inserir um aluno
                String sqlInsert = "INSERT INTO alunos (nome, idade) VALUES (?, ?)";
                try (PreparedStatement stmt = conexao.prepareStatement(sqlInsert)) {
                    stmt.setString(1, "Maria");
                    stmt.setInt(2, 20);
                    stmt.executeUpdate();
                    System.out.println("Aluno inserido!");
                }

                // Selecionar todos os alunos
                String sqlSelect = "SELECT * FROM alunos";
                try (PreparedStatement stmt = conexao.prepareStatement(sqlSelect);
                     ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        System.out.println(rs.getInt("id") + " - " +
                                           rs.getString("nome") + " - " +
                                           rs.getInt("idade"));
                    }
                }

            } catch (SQLException e) {
                System.err.println("Erro de conexão com o banco de dados: " + e.getMessage());
            }

        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC não encontrado: " + e.getMessage());
        }
    }
}
