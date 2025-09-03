/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JavaBD {
    
    
 public static void main(String[] args) throws SQLException{
     Class.forName("com.mysql.jdbc.Driver");
     
        String url = "jdbc:mysql://localhost:3306/escola";
        String usuario = "root";
        String senha = "mysql";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {
            System.out.println("✅ Conectado com sucesso!");

            // Inserindo um aluno
            String sqlInsert = "INSERT INTO alunos (nome, idade) VALUES (?, ?)";
            try (PreparedStatement stmt = conexao.prepareStatement(sqlInsert)) {
                stmt.setString(1, "Maria");
                stmt.setInt(2, 20);
                stmt.executeUpdate();
                System.out.println("Aluno inserido!");
            }

            // Consultando alunos
            String sqlSelect = "SELECT * FROM alunos";
            try (PreparedStatement stmt = conexao.prepareStatement(sqlSelect);
                 ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " - " +
                                       rs.getString("nome") + " - " +
                                       rs.getInt("idade"));
                }
            }
            
            conexao.close();    
        } catch (SQLException e) {
            System.err.println("Erro de conexão: " + e.getMessage());
        }
    }
}
