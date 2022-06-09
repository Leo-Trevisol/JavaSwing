import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Classe_26_MeuJogodaVelha extends JFrame {

    JLabel placar, xis, bola, vencedor, ganhador;
    JButton novojogo, zerar, botaoInfo;
    JButton a, b, c, d, e, f, g, h, i;
    JButton empate[] = new JButton[9];
    JPanel painel;
    boolean xo = false;
    boolean conf = true;
    int ptx = 0;
    int pto = 0;
    Container tela;
    Font font = new Font("Verdana", Font.BOLD, 24);
    Font font2 = new Font("Verdana", Font.BOLD, 16);

    // CONSTRUTOR PUXANDO OS METODOS ===

    public Classe_26_MeuJogodaVelha() {

        setar();
        inserir();
        zerartudo();
        marcar();
        buttoninformacao();
        newgame();

        //SETANDO PROPRIEDADES DA TELA

        this.setVisible(true);
        this.setSize(600, 400);
        this.setTitle("JOGO DA VELHA");
        this.getContentPane().setLayout(null);// LAYOUT NULL
        this.setResizable(false);// NAO E POSSIVEL REDIMENSIONAR A TELA
        this.setLocationRelativeTo(null); // CRIA A TELA NO CENTRO DO MONITOR
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //SETANDO COMPONENTES ===

    public void setar() {

        placar = new JLabel("PLACAR:");

        xis = new JLabel("X = " + ptx);
        bola = new JLabel("O = " + pto);
        vencedor = new JLabel();
        ganhador = new JLabel();

        novojogo = new JButton("NOVO JOGO");
        zerar = new JButton("ZERAR PLACAR");


        painel = new JPanel();



        a = new JButton();
        a.setFont(font);
        b = new JButton();
        b.setFont(font);
        c = new JButton();
        c.setFont(font);
        d = new JButton();
        d.setFont(font);
        e = new JButton();
        e.setFont(font);
        f = new JButton();
        f.setFont(font);
        g = new JButton();
        g.setFont(font);
        h = new JButton();
        h.setFont(font);
        i = new JButton();
        i.setFont(font);

    }

    //METODO INSERINDO OS ITENS NO CONTAINER ===

    public void inserir() {

        tela = getContentPane();
        setLayout(null);

        placar.setBounds(400, 20, 200, 50);
        placar.setFont(font);
        tela.add(placar);


        xis.setBounds(425, 65, 50, 20);
        xis.setFont(font2);
        tela.add(xis);
        bola.setBounds(425, 90, 50, 20);
        bola.setFont(font2);
        tela.add(bola);

        ganhador.setBounds(375,225,200,20);
        tela.add(ganhador);
        ganhador.setVisible(false);

        vencedor.setBounds(400,250,200,20);
        tela.add(vencedor);
        vencedor.setForeground(Color.red);



        novojogo.setBounds(385, 125, 125, 30);
        tela.add(novojogo);
        zerar.setBounds(385, 175, 125, 30);
        tela.add(zerar);

          tela.add(buttoninformacao());



        // CRIANDO PAINEL COMO GRID LAYOUT 3X3 PARA BOTAR OS BOTOES ===

        painel.setLayout(new GridLayout(3, 3));
        painel.setBounds(20, 20, 300, 300);
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

    // METODO NOVO JOGO ===

    public void newgame() {
        novojogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent u) {
                xo = false;
                conf = true;
                a.setText("");
                b.setText("");
                c.setText("");
                d.setText("");
                e.setText("");
                f.setText("");
                g.setText("");
                h.setText("");
                i.setText("");
                verificarx();
                ganhador.setText("");
                vencedor.setText("");
            }
        });
    }

    //METODO ZERAR O PLACAR ===

    public void zerartudo() {
        zerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ptx = 0;
                pto = 0;
                xis.setText("X= 0");
                bola.setText("O= 0");
                ganhador.setText("");
                vencedor.setText("");
            }
        });
    }

    //METODO X E O ===

    public void marcar() {
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificatudo(a);
                empate[0] = a;
            }
        });
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificatudo(b);
                empate[1] = b;
            }
        });
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificatudo(c);
                empate[2] = c;
            }
        });

        d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificatudo(d);
                empate[3] = d;
            }
        });
        e.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent u) {
                verificatudo(e);
                empate[4] = e;
            }
        });
        f.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificatudo(f);
                empate[5] = f;
            }
        });
        g.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificatudo(g);
                empate[6] = g;
            }
        });
        h.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent u) {
                verificatudo(h);
                empate[7] = h;
            }
        });

        i.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificatudo(i);
                empate[8] = i;
            }
        });
    }

    //METODO QUE VERIFICA SE A CASA JA FOI PREENCHIDA ===

    public void verificatudo(JButton x) {

        if (conf){

        if (xo) {
                if (x.getText().isEmpty()) {
                    x.setText("O");
                    xo = false;
                    empate();
                    verificarx();
                } else {
                    JOptionPane.showMessageDialog(null, "Essa casa ja foi preenchida!");

                }

            } else {
                if (x.getText().isEmpty()) {
                    x.setText("X");
                    xo = true;
                    empate();
                    verificarx();
                } else {
                    JOptionPane.showMessageDialog(null, "Essa casa ja foi preenchida!");
                }
            }

        }else{
            JOptionPane.showMessageDialog(null, "O JOGO ACABOU.\n"
            + "CLIQUE EM NOVO JOGO PARA\n"
            + "JOGAR NOVAMENTE!!");

        }
    }



    //METODO DE VERIFICAR SE ALGUEM GANHOU OU SE DEU VELHA ===

    public void verificarx() {

        if (a.getText().equals("X") && b.getText().equals("X") && c.getText().equals("X")
                || a.getText().equals("X") && d.getText().equals("X") && g.getText().equals("X")
                || a.getText().equals("X") && e.getText().equals("X") && i.getText().equals("X")
                || a.getText().equals("X") && b.getText().equals("X") && c.getText().equals("X")
                || b.getText().equals("X") && e.getText().equals("X") && h.getText().equals("X")
                || c.getText().equals("X") && f.getText().equals("X") && i.getText().equals("X")
                || d.getText().equals("X") && e.getText().equals("X") && f.getText().equals("X")
                || g.getText().equals("X") && h.getText().equals("X") && i.getText().equals("X")
                || g.getText().equals("X") && e.getText().equals("X") && c.getText().equals("X")
                || a.getText().equals("O") && b.getText().equals("O") && c.getText().equals("O")
                || a.getText().equals("O") && d.getText().equals("O") && g.getText().equals("O")
                || a.getText().equals("O") && e.getText().equals("O") && i.getText().equals("O")
                || a.getText().equals("O") && b.getText().equals("O") && c.getText().equals("O")
                || b.getText().equals("O") && e.getText().equals("O") && h.getText().equals("O")
                || c.getText().equals("O") && f.getText().equals("O") && i.getText().equals("O")
                || d.getText().equals("O") && e.getText().equals("O") && f.getText().equals("O")
                || g.getText().equals("O") && h.getText().equals("O") && i.getText().equals("O")
                || g.getText().equals("O") && e.getText().equals("O") && c.getText().equals("O")) {

            if (xo) {

                JOptionPane.showMessageDialog(null, "ACABOU! = X VENCEU");
                ganhador.setText("VENCEDOR DA RODADA:");
                ganhador.setVisible(true);
                vencedor.setText("JOGADOR X");
                ptx++;
                xis.setText("X= " + ptx);
                conf = false;

            } else {
                JOptionPane.showMessageDialog(null, "ACABOU! = O VENCEU");
                ganhador.setText("VENCEDOR DA RODADA:");
                ganhador.setVisible(true);
                vencedor.setText("JOGADOR O");
                pto++;
                bola.setText("O= " + pto);
                conf = false;
            }

        }

    }
    public void empate(){
        int cont = 0;
        for(int i=0;i<9;i++){
            try {


            if (empate[i].getText() != null) {
                cont++;
            }
            }catch (Exception e){}
        }
        if(cont==9){
            JOptionPane.showMessageDialog(null, "O JOGO EMPATOU.\n"
                    + "CLIQUE EM NOVO JOGO PARA\n"
                    + "JOGAR NOVAMENTE!!");
        }

    }
    //CRIACAO BUTTON DE INFORMACAO ===

    private JButton buttoninformacao() {
        if (botaoInfo == null) {
            ImageIcon icone = new ImageIcon(getClass().getResource("/dados1/Informacao.png"));
            botaoInfo = new JButton(icone);
            botaoInfo.setBounds(new Rectangle(550, 5, 40, 40));
            botaoInfo.setToolTipText("Informacoes"); //MENSAGEM AO PASSAR O MOUSE
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
                                    + "\nClick no botao NOVO JOGO para comecar.",
                            "Jogo da velha em Java", 0, duke);
                }
            });
        }
        return botaoInfo;
    }
    public static void main(String[] args) {

        new Classe_26_MeuJogodaVelha();

    }
}


