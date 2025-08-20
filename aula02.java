/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01;

import javax.swing.*;

/**
 *
 * @author ALUNO
 */
public class aula02 extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo swing");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JLabel label = new JLabel("Digite seu nome:");
        label.setBounds(20, 20, 150, 25);
        
        JTextField campo = new JTextField();
        campo.setBounds(150, 20, 200, 25);
        
        JButton botao = new JButton("Enviar");
        botao.setBounds(150, 60, 100, 30);
        botao.addActionListener(e -> {
            campo.setText("");
            JOptionPane.showMessageDialog(null, "Enviado com sucesso!");
        });
        
        frame.add(label);
        frame.add(campo);
        frame.add(botao);
        
        frame.setVisible(true);
    }
}
