
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EX04 extends JFrame implements ActionListener {
    private TextField display;
    private String operador = "";
    private double valor1, valor2;
    
    public EX04(){
    setTitle("CALCULADORA");
    setSize(260, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout(5,5));
    
    display = new TextField("0", 20);
    display.setEditable(false);
    add(display, BorderLayout.NORTH);
    
    Panel botoes = new Panel(new GridLayout(4, 4, 5, 5));
    String[] labels = {
    "7","8","9","/",
    "4","5","6","*",
    "1","2","3","-",
    "0",".","=","+","c"
    };
    for (String s : labels) {
    Button b = new Button(s);
    b.addActionListener(this);
    botoes.add(b);
    }
    add(botoes, BorderLayout.CENTER);
    
    setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
    String cmd = e.getActionCommand();
    if ("0123456789.".contains(cmd)){
        if (display.getText().equals("0")) {
            display.setText(cmd); 
        } else {
            display.setText(display.getText() + cmd); 
        }
    } else if ("+-*/".contains(cmd)) {
        valor1 = Double.parseDouble(display.getText());
        operador = cmd;
        display.setText("0");
    } else if (cmd.equals("=")) {
        valor2 = Double .parseDouble(display.getText());
        switch (operador) {
            case "+" -> display.setText("" + (valor1 + valor2));
            case "-" -> display.setText("" + (valor1 - valor2));
            case "*" -> display.setText("" + (valor1 * valor2));
            case "/" -> display.setText("" + (valor1 / valor2));
        }
    } else if (cmd.equals("c")) {
        display.setText("0");
    }
  }
    public static void main(String[]args){
        new EX04();
    }
} 
   
   
    