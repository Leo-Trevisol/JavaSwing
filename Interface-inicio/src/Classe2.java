import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Classe2 {

 // ADICIONANDO VARIAVEIS ===

    private JFrame janela;
    private JLabel rotulo;
    private JButton button;

 //SETANDO AS VARIAVEIS DENTRO DE UM CONSTRUTOR ===
  public Classe2(){
  janela = new JFrame("Janela com componentes");
   rotulo = new JLabel("Elemento Jlabel");
   button = new JButton ("Botãozinho");
   janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 // CRIANDO CONTAINER PARA BOTAR OS ITENS ===
  Container cont = janela.getContentPane();

  cont.setLayout(new FlowLayout()); //FLOWLAYOUT ORGANIZA OS ITENS UM POR UM NA HORIZONTAL
  cont.add(button);
  cont.add(rotulo);
  janela.setSize(500,200);
  janela.setVisible(true);
  
  


}

public static void main(String[] args){
new Classe2();
}
}