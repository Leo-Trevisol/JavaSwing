import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Classe_26_JogodaVelha extends JFrame {

    JLabel placar, xis, bola;
    JButton novojogo, zerar, botaoInfo;
    JButton[] botoes = new JButton[9];
    JButton a,b,c,d,e,f,g,h,i;
    JPanel painel;
  //  boolean [] click = new boolean[9];
    boolean xo = false;
    int ptx = 0;
    int pto = 0;
    Container tela;

    public Classe_26_JogodaVelha(){

        setar();
        inserir();
        zerartudo();
        marcar();
       // botao();


        //SETANDO PROPRIEDADES DA TELA

        this.setVisible(true);
        this.setSize(600,400);
        this.setTitle("JOGO DA VELHA");
        this.getContentPane().setLayout(null);// LAYOUT NULL
        this.setResizable(false);// NAO E POSSIVEL REDIMENSIONAR A TELA
        this.setLocationRelativeTo(null); // CRIA A TELA NO CENTRO DO MONITOR
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {

        new Classe_26_JogodaVelha();

    }

    //SETANDO COMPONENTES ===

    public void setar(){

        placar = new JLabel("PLACAR:");

        xis = new JLabel("X= " + ptx);
        bola = new JLabel("O= " + pto);

        novojogo = new JButton("NOVO JOGO");
        zerar = new JButton("ZERAR PLACAR");

        painel = new JPanel();

        a = new JButton();
        b = new JButton();
        c = new JButton();
        d = new JButton();
        e = new JButton();
        f = new JButton();
        g = new JButton();
        h = new JButton();
        i = new JButton();

    }

    //METODO INSERINDO OS ITENS NO CONTAINER ===

    public void inserir(){

        tela = getContentPane();
        setLayout(null);

        placar.setBounds(425,50,50,20);
        tela.add(placar);

        xis.setBounds(425, 75,50,20);
        tela.add(xis);
        bola.setBounds(425,100,50,20);
        tela.add(bola);

        novojogo.setBounds(385,125,125,30);
        tela.add(novojogo);
        zerar.setBounds(385,175,125,30);
        tela.add(zerar);

        tela.add(buttoninformacao());

        // CRIANDO PAINEL COMO GRID LAYOUT 3X3 PARA BOTAR OS BOTOES ===

        painel.setLayout(new GridLayout(3,3));
        painel.setBounds(20,20,300,300);
        painel.setBackground(Color.BLACK);
        painel.add(a);
        painel.add(b);
        painel.add(c);
        painel.add(d);
        painel.add(e);
        painel.add(f);
        painel.add(g);
        painel.add(h);
        painel.add(i);
        tela.add(painel);


    }

    //CRIACAO BUTTON DE INFORMACAO ===

    private JButton buttoninformacao() {
        if (botaoInfo == null) {
            ImageIcon icone = new ImageIcon(getClass().getResource("/dados1/Informacao.png"));
            botaoInfo = new JButton(icone);
            botaoInfo.setBounds(new Rectangle(550, 5, 40, 40));
            botaoInfo.setToolTipText("Informações"); //MENSAGEM AO PASSAR O MOUSE
            botaoInfo.setContentAreaFilled(false); // TIRA O FUNDO DO BOTAO
            botaoInfo.setBorderPainted(false);  // TIRA A BORDA DO BOTAO
            botaoInfo.setFocusable(false);  // TIRA O FOCUS DO BOTAO
            botaoInfo.setCursor(new Cursor(Cursor.HAND_CURSOR)); //O CURSOR VIRA UMA MAO

            //ACAO BOTAO INFO ===

            botaoInfo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {

                    // BOTANDO IMAGEM DENTRO DA CAIXA DE AVISO/JOPTIONPANE ===
                    Icon duke = new ImageIcon(getClass().getResource("/dados1/Duke.png"));
                    //MENSAGEM AO CLICAR NO BOTAO INFO ===
                    JOptionPane.showMessageDialog(null, "Jogo da velha em java.\n"
                                    + "Autor: Leo Trevisol"
                                    + "\nClick no botão NOVO JOGO para começar.",
                            "Jogo da velha em Java", 0, duke);
                }
            });
        }
        return botaoInfo;
    }

    //METODO GERAR AS 9 CASAS ===

    public void botao(){
        for (int i=0; i==9;i++){
            botoes [i] = new JButton();
      //      painel.add(botoes[i]);

        }
    }

    //METODO ZERAR O PLACAR ===

    public void zerartudo(){
        zerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xis.setText("X= 0");
                bola.setText("O= 0");
            }
        });
    }

    //METODO X E O ===

    public void marcar(){
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (xo) {
                    a.setText("X");
                    xo = false;

                }
                else if{
                    a.setText("O");
                    xo = true;
                }
            }


        });


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (xo) {
                    b.setText("X");

                } else
                    b.setText("O");

            }

        });

        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (xo) {
                    c.setText("X");

                } else
                    c.setText("O");

            }



        });


    }


}

