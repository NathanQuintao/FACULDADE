
package aula01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Aula01 extends JFrame  {
    
   public Aula01() {
       super("EXEMPLO AWT");
       setSize(300, 150);
       setLayout(new FlowLayout());
       setLocationRelativeTo(null);
       
       Label lbl = new Label("Clique no Botão:");
       Button btn = new Button("clique-me");
       
       btn.addActionListener(e -> JOptionPane.showMessageDialog(null,"Botão foi clicado"));
       
       
       
       addWindowListener(new WindowAdapter(){
           
           @Override
           public void windowClosing(WindowEvent we) {
               dispose();
           }
       });
       
       add(lbl);
       add(btn);
       setVisible(true);

}

  
    public static void main(String[] args) {
        new Aula01();
    }
     
}
