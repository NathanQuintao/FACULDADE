/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author ALUNO
 */
public class aula02 extends JFrame {
    
    public aula02(){
        setTitle("Exemplo swing");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JLabel label = new JLabel("Digite seu nome:");
        label.setBounds(20, 20, 15, 25);
        
        
        JTextField campo = new JTextField();
        campo.setMaximumSize(new Dimension(80,30));
        
        JButton botao = new JButton("Enviar");
        botao.setMaximumSize(new Dimension(100,50));
        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
    
        botao.addActionListener(e -> {
            campo.setText("");
            JOptionPane.showMessageDialog(null, "Enviado com sucesso!");
        });
        
        
        mainPanel.add(label);
        mainPanel.add(campo);
        mainPanel.add(botao);
        
        add(mainPanel);
        
        setVisible(true);
    }
     public static void main(String[] args) {
    
        new aula02();
    }
}

