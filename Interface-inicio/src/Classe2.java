import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Classe2 {
    private JFrame janela;

public Classe2(){
 janela = new JFrame("Janela com componentes");
  janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  Container cont = janela.getContentPane();
  JLabel rotulo = new JLabel("Elemento Jlabel");
  JButton button = new JButton ("Botãozinho");
       
  cont.setLayout(new FlowLayout());
  cont.add(button);
  cont.add(rotulo);
  janela.setSize(500,400);
  janela.setVisible(true);
  
  


}

public static void main(String[] args){
new Classe2();
}
}