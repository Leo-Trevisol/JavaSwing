import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Classe8{

    private JFrame janela;
    private JPanel pcima,pcentro,pbaixo;
    private JButton b;
    private JLabel l1,l2,l3,tempo;
    private JTextField t1,t2,t3;

    private Classe8(){
        janela = new JFrame("Exercício");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // PAINEL DE CIMA ===
        //Criando um panel, setando a cor dele, criando e adicionando um botao dentro do panel.
        pcima = new JPanel();
        pcima.setBackground(Color.ORANGE);
        b = new JButton("Calcular");
        pcima.add(b);

        // PAINEL DO MEIO ===
        // Criando um panel de grid layout, setando a cor dele,
        // criando 3 labels e 3 textfield e adicionando no panel.
        pcentro = new JPanel(new GridLayout(3,2));
        pcentro.setBackground(Color.WHITE);
        l1 = new JLabel(" Espaço inicial:");
        l2 = new JLabel(" Velocidade inicial:");
        l3 = new JLabel(" Aceleração:");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        pcentro.add(l1);
        pcentro.add(t1);
        pcentro.add(l2);
        pcentro.add(t2);
        pcentro.add(l3);
        pcentro.add(t3);

        // PAINEL DE BAIXO ===
        //Criando um panel, setando a cor dele, criando e adicionando um label dentro do panel.
        pbaixo = new JPanel();
        pbaixo.setBackground(Color.YELLOW);
        tempo = new JLabel("Tempo = 0");
        pbaixo.add(tempo);



        // CRIANDO UM CONTAINER OARA RECEBER OS PANELS
        // CONTAINERS BORDERLAYOUT, CADA PANEL EM UMA DIRECAO.
        Container c = janela.getContentPane();
        c.add(pcima, BorderLayout.NORTH);
        c.add(pbaixo, BorderLayout.SOUTH);
        c.add(pcentro, BorderLayout.CENTER);

        // Dimensionar e mostrar a janela
        janela.setSize(300,200);
        janela.setVisible(true);
    }

    public static void main(String[] args)
    {
        new Classe8();
    }
}