




/*
Border Layout
É um gerenciador de layout que organiza os componentes,
sendo a parte superior do contêiner dividida em cinco regiões:
NORTH, SOUTH, EAST, WEST, CENTER.
*/
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

    public class Classe7{

        private JFrame janela;

        public Classe7() {
            janela = new JFrame("Janela com GridLayout 8");
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JButton b1 = new JButton("A");
            JButton b2 = new JButton("B");
            JButton b3 = new JButton("C");
            JButton b4 = new JButton("D");
            JButton b5 = new JButton("E");
            JButton b6 = new JButton("F");

            JPanel p = new JPanel(new GridLayout(3,2));
            p.add(b1);
            p.add(b2);
            p.add(b3);
            p.add(b4);
            p.add(b5);
            p.add(b6);

           Container c = janela.getContentPane();
               c.add(p,BorderLayout.CENTER);
               c.add(p,BorderLayout.NORTH);
               c.add(p,BorderLayout.SOUTH);
               c.add(p,BorderLayout.WEST);
               c.add(p,BorderLayout.EAST);

            janela.setSize(400,200);
            janela.setVisible(true);
        }

        public static void main(String[] args) {
            new Classe7();
        }
    }


