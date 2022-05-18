import javax.swing.JFrame;
public class Classe {
    private JFrame janela;

public Classe(){
 janela = new JFrame("Primeira janela");
  janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 janela.setSize(400,300);
 janela.setVisible(true);


}

public static void main(String[] args){
new Classe();
}
}