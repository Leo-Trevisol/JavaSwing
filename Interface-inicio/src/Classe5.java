import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Classe5 {
    private JFrame janela;

public Classe5(){
 janela = new JFrame("Janela com componentes");
  janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  JButton btn1 = new JButton("A");
  JButton btn2 = new JButton("B");
  JButton btn3 = new JButton("C");
   JButton btn4 = new JButton("D");
  JButton btn5 = new JButton("E");
  JButton btn6 = new JButton("F");
   JButton btn7 = new JButton("G");
  JButton btn8 = new JButton("H");
  JButton btn9 = new JButton("I");
   JButton btn10 = new JButton("J");
  JButton bt11 = new JButton("K");
  JButton btn12 = new JButton("L");


  Container cont = janela.getContentPane();
  cont.setLayout(new GridLayout(2,6));
  
  cont.add(btn1);
  cont.add(btn2);
  cont.add(btn3);
  cont.add(btn4);
  cont.add(btn5);
  cont.add(btn6);
  cont.add(btn7);
  cont.add(btn8);
  cont.add(btn9);
  cont.add(btn10);
  cont.add(bt11);
  cont.add(btn12);
 
  janela.setSize(500,400);
  janela.setVisible(true);
  
}

public static void main(String[] args){
new Classe5();
}
}