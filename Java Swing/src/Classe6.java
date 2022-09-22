import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Classe6{
    private JFrame janela;

public Classe6(){
 janela = new JFrame("Exercicio");
  janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  JLabel baixo = new JLabel ("Tempo = 0");
  JButton calc = new JButton ("Calcular");
  JLabel um = new JLabel ("Espaço Inicial:");
  JLabel dois = new JLabel ("Velocidade Inicial:");
  JLabel tres = new JLabel ("Aceleração:");
  
  JPanel p1 = new JPanel();
  JPanel p2 = new JPanel();
  JPanel p3 = new JPanel();

  p1.setBackground(Color.orange);
  p2.setBackground(Color.white);
  p3.setBackground(Color.yellow);


  p1.add(calc);
  p2.add(um);
  p2.add(dois);
  p2.add(tres);
  p3.add(baixo);

  Container cont = janela.getContentPane();
  cont.setLayout(new BorderLayout());
   cont.add(p1,BorderLayout.NORTH);
   cont.add(p2,BorderLayout.CENTER);
   cont.add(p3,BorderLayout.SOUTH);
    janela.setSize(400,300);
    janela.setVisible(true);

}

public static void main(String[] args){
new Classe6();
}
}