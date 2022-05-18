import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Classe3 {
    private JFrame janela;

public Classe3(){
 janela = new JFrame("Janela com componentes");
  janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  JPanel p1 = new JPanel();
  JPanel p2 = new JPanel();
  JPanel p3 = new JPanel();
  JPanel p4 = new JPanel();
  JPanel p5 = new JPanel();
  
  JLabel text = new JLabel("Elemento JLabel");
  JButton btn1 = new JButton ("Botão EM BAIXO");
  JButton btn2 = new JButton ("Botão DIREITA");
  JButton btn3 = new JButton ("Botão ESQUERDA");
  JButton btn4 = new JButton ("Botão CENTRO");
  
  
  p1.setBackground(Color.green);
  p2.setBackground(Color.white);
  p3.setBackground(Color.red);
  p4.setBackground(Color.yellow);
  p5.setBackground(Color.pink);  
  
  p1.add(text);
  p2.add(btn1);
  p3.add(btn2);
  p4.add(btn3);
  p5.add(btn4);
  
   Container cont = janela.getContentPane();
   cont.setLayout(new BorderLayout());
   cont.add(p1,BorderLayout.NORTH);
   cont.add(p2,BorderLayout.SOUTH);
   cont.add(p3,BorderLayout.EAST);
   cont.add(p4,BorderLayout.WEST);
   cont.add(p5, BorderLayout.CENTER);
     
  janela.setSize(500,400);
  janela.setVisible(true);
  
}

public static void main(String[] args){
new Classe3();
}
}