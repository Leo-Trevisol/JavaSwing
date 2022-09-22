import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Classe4 {
    private JFrame janela;

public Classe4(){
  janela = new JFrame("Janela com Flowlayout");
  janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  JButton btn1 = new JButton("Botão 1");
  JButton btn2 = new JButton("Botão 2");
  JButton btn3 = new JButton("Botão 3");


  Container cont = janela.getContentPane();
  cont.setLayout (new FlowLayout(FlowLayout.CENTER));  //FLOWLAYOUT ORGANIZA OS ITENS UM POR UM NA HORIZONTAL
  
  cont.add(btn1);
  cont.add(btn2);
  cont.add(btn3);
  
  
 
  janela.setSize(500,100);
  janela.setVisible(true);
  
}

public static void main(String[] args){
new Classe4();
}
}