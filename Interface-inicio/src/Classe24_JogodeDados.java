
import java.awt.Cursor;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Classe24_JogodeDados extends JFrame {

    JFrame frame;
    JLabel titulo = null, jogada1 = null ,jogada2= null ,
            mais= null, igual= null;
    JPanel JContentpane;
    JButton informacao, jogardados;

    Classe24_JogodeDados(){

        interfeice();

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

    /*    private JButton jogar(){

            if(jogardados == null){

            }

        });

        private JButton getInformacao(){
            if(informacao == null){
                ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/informacao.png"));
                informacao = new JButton(icon);
                informacao.setBounds(new Rectangle(590,5,40,40));

                // mensagem quando passar o mouse por cima
                informacao.setToolTipText("Informaçoes");
                // tira o fundo do botao
                informacao.setContentAreaFilled(false);
                // tira a borda do botao
                informacao.setBorderPainted(false);
                // tira o foco do botao
                informacao.setFocusable(false);
                // muda o cursor
                informacao.setCursor(new Cursor(Cursor.HAND_CURSOR));


            }
            return informacao;
        }

        informacao.addActionListener(

        new java.awt.event.ActionListener(){
            public void ActionPerformed(java.awt.event.ActionEvent e){
                Icon imagem = new ImageIcon(getClass().getResource("/imagens/Duke.png"));



            }
        }
});



*/

    private void rolardadoum(){
        int dado1 = 0;


    }


    public static void main(String[] args) {
        new Classe24_JogodeDados();

    }



}
