import java.awt.*;
import javax.swing.*;


public class Desafio extends JFrame {
	
	public Desafio() {
		setTitle("Nome");	
		setSize(600, 600);
		setBackground(new Color(157, 10, 100));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setAlignmentX(CENTER_ALIGNMENT);
		
		var texto = new JLabel("Insira seu Nome: ");
		
		JTextField field = new JTextField();
		field.setPreferredSize(new Dimension(200, 50));
		
		var button = new Button("Enviar");
		var limpar = new Button("Limpar");
		
		button.setSize(new Dimension(80, 40));
		limpar.setSize(new Dimension(80,40));
		
		button.addActionListener(e -> {
			JOptionPane.showMessageDialog(painelPrincipal, "Seu nome é: " + field.getText());
		});
		
		limpar.addActionListener(e -> { 
			field.setText("");
		});
		
		painelPrincipal.add(texto);
		painelPrincipal.add(field);
		painelPrincipal.add(button);
		painelPrincipal.add(limpar);
	
		add(painelPrincipal);
		
		setVisible(true);
	}
	
	public static void main (String args[]) {
		new Desafio();
		
	}
} 
