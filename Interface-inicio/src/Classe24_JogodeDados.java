
import java.awt.Cursor;
import java.awt.Rectangle;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Classe24_JogodeDados extends JFrame  {

    //ADICIONANDO VARIAVEIS

    JFrame frame;
    JLabel titulo = null, jogada1 = null ,jogada2= null ,
            mais= null, igual= null;
    JPanel jContentPane;
    JButton informacao, jogardados;

    //CONSTRUTOR QUE VAI RECEBER OS METODOS ===

    Classe24_JogodeDados(){

        interfeice();
    }



    private JButton getJogardados() {

        if (jogardados == null) {
            jogardados = new JButton();
            jogardados.setBounds(new Rectangle(253, 292, 150, 36));
            jogardados.setText("Lançar Dados");
            //Mensagem ao passar o mouse
            jogardados.setToolTipText("Play");
            //Transforma o mouse em mão
            jogardados.setCursor(new Cursor(Cursor.HAND_CURSOR));
          //  jogardados.addActionListener(this);
        }
        return jogardados;
    }

    private JButton getInformacao() {
        if (informacao == null) {
            ImageIcon icone = new ImageIcon(getClass().getResource("/imagens/Informacao.png"));
            informacao = new JButton(icone); // bota o icone dentro do button
            informacao.setBounds(new Rectangle(530, 5, 40, 40));
            informacao.setToolTipText("Informações");  //Mensagem ao passar o mouse
            informacao.setContentAreaFilled(false);  // Tira o fundo do botão
            informacao.setBorderPainted(false);  // Tira a borda do botão
            informacao.setFocusable(false); // Tira o fucus do botão
            informacao.setCursor(new Cursor(Cursor.HAND_CURSOR));  //Transforma o mouse em mão
            informacao.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent e) {
                            Icon imagem = new ImageIcon(getClass().getResource("/imagens/Duke.png"));
     JOptionPane.showMessageDialog(null, "Jogo de dados em java.\n" //Mostra mensagem
                                            + "Autor: "
                                            + "\nClick no botão Lançar Dados para começar.",
                                    "Jogo de Dados Java", 0, imagem);
                        }
                    });
        }
        return informacao;
    }





    private void interfeice(){

        frame = new JFrame();
        frame.setTitle("Jogo de dados");
        frame.setSize(600, 500);
        frame.getContentPane().setLayout(null);// layoyt null
        frame.setResizable(false);// nao e possivel redimensionar
        frame.setLocationRelativeTo(null); // cria no centro do monitor
        frame.setVisible(true); // visivel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // encerra o processo ao fechar

    }

    private void rolardadoum(){
        int dado1 = 0;


    }


    public static void main(String[] args) {
        new Classe24_JogodeDados();

    }


}
