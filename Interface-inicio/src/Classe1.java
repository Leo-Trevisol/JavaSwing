import javax.swing.JFrame;
public class Classe1 {

    // ADICIONANDO VARIAVEIS ===

    private JFrame janela;  //JFrame funciona como a janela principal onde componentes como rótulos, botões.

    //SETANDO AS VARIAVEIS DENTRO DE UM CONSTRUTOR ===

public Classe1(){
  janela = new JFrame("Primeira janela");
  janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


 janela.setSize(400,300);
 janela.setVisible(true);


}

public static void main(String[] args){
new Classe1();
}
}