
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Classe_26_ProfJogodaVelha extends JFrame {

    JButton[] bt = new JButton[9]; //criando um vetor de botoes
    boolean xo = false;
    boolean[] click = new boolean[9];
    JLabel placar = new JLabel("Placar");
    JLabel pontX = new JLabel("X = 0");
    JLabel pontO = new JLabel("O = 0");
    JLabel autor = new JLabel("Desenvolvido por: Professor");
    JLabel data = new JLabel("Em: 26/04/2022");
    JButton novoJogo = new JButton("Novo Jogo");
    JButton zerarPlacar = new JButton("Zerar Placar");
    int ptX = 0;
    int ptO = 0;

    public Classe_26_ProfJogodaVelha() { //criando uma janela para o jogo
        setVisible(true); //indica que essa janela estara visivel
        setTitle("Jogo da Velha"); //titulo da janela
        setDefaultCloseOperation(3); //indica que o processo deve parar ao clicar no "X" de fechar a janela
        setLayout(null); // vamos definir o layout da janela futuramente.
        setBounds(450, 150, 700, 500); //tamanho da janela (posicao horizontal e vertical, largura e altura
        add(placar);
        add(pontX);
        add(pontO);
        add(novoJogo);
        add(zerarPlacar);
        add(autor);
        add(data);
        placar.setBounds(505, 100, 100, 30);
        pontX.setBounds(510, 125, 100, 30);
        pontO.setBounds(510, 145, 100, 30);
        novoJogo.setBounds(410, 185, 110, 30);
        zerarPlacar.setBounds(525, 185, 110, 30);
        autor.setBounds(200, 400, 310, 30);
        data.setBounds(300, 420, 100, 30);
        setResizable(false); //proibe a janela de ser redimensionada

        novoJogo.addActionListener(new java.awt.event.ActionListener() { //setando o que o botao deve fazer

            @Override
            public void actionPerformed(ActionEvent e) {
                limpar();
            }

        });

        zerarPlacar.addActionListener(new java.awt.event.ActionListener() { //setando o que o botao deve fazer

            @Override
            public void actionPerformed(ActionEvent e) {
                ptX = 0;
                ptO = 0;
                atualizarPlacar();
            }

        });

        int cont = 0; //variavel contadora
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                bt[cont] = new JButton();
                add(bt[cont]); //estamos adicionando o elemento do botao
                bt[cont].setBounds((100 * i) + 100,(100 * j) + 50, 95, 95);
                //o 100*i/j esta criando um bt em uma nova posicao, por exemplo,
                // 100*1 = inicia um bt na posicao 100.
                //o +50 e a margem de cima
                //o 95, 95 indica a largura e a altura do botao
                bt[cont].setFont(new Font("Times", Font.BOLD, 40)); //mudando a fonte
                cont++;
            }
        }


        for(int i = 0; i < 9; i++) { //todas as posicoes recebem false
            click[i] = false;
        }

        bt[0].addActionListener(new java.awt.event.ActionListener() { //setando o que o botao deve fazer

            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[0] == false) { //se onde eu clico for false, ele executa, se for true, nao.
                    click[0] = true; //click nessa posicao agora recebe true.
                    trocarSimbolo(bt[0]);
                }
            }

        });
        bt[1].addActionListener(new java.awt.event.ActionListener() { //setando o que o botao deve fazer

            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[1] == false) { //se onde eu clico for false, ele executa, se for true, nao.
                    click[1] = true; //click nessa posicao agora recebe true.
                    trocarSimbolo(bt[1]);
                }
            }

        });
        bt[2].addActionListener(new java.awt.event.ActionListener() { //setando o que o bot�o deve fazer

            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[2] == false) { //se onde eu clico for false, ele executa, se for true, n�o.
                    click[2] = true; //click nessa posi��o agora recebe true.
                    trocarSimbolo(bt[2]);
                }
            }

        });
        bt[3].addActionListener(new java.awt.event.ActionListener() { //setando o que o bot�o deve fazer

            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[3] == false) { //se onde eu clico for false, ele executa, se for true, n�o.
                    click[3] = true; //click nessa posi��o agora recebe true.
                    trocarSimbolo(bt[3]);
                }
            }

        });
        bt[4].addActionListener(new java.awt.event.ActionListener() { //setando o que o bot�o deve fazer

            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[4] == false) { //se onde eu clico for false, ele executa, se for true, n�o.
                    click[4] = true; //click nessa posi��o agora recebe true.
                    trocarSimbolo(bt[4]);
                }
            }

        });
        bt[5].addActionListener(new java.awt.event.ActionListener() { //setando o que o bot�o deve fazer

            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[5] == false) { //se onde eu clico for false, ele executa, se for true, n�o.
                    click[5] = true; //click nessa posi��o agora recebe true.
                    trocarSimbolo(bt[5]);
                }
            }

        });
        bt[6].addActionListener(new java.awt.event.ActionListener() { //setando o que o bot�o deve fazer

            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[6] == false) { //se onde eu clico for false, ele executa, se for true, n�o.
                    click[6] = true; //click nessa posi��o agora recebe true.
                    trocarSimbolo(bt[6]);
                }
            }

        });
        bt[7].addActionListener(new java.awt.event.ActionListener() { //setando o que o bot�o deve fazer

            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[7] == false) { //se onde eu clico for false, ele executa, se for true, n�o.
                    click[7] = true; //click nessa posi��o agora recebe true.
                    trocarSimbolo(bt[7]);
                }
            }

        });
        bt[8].addActionListener(new java.awt.event.ActionListener() { //setando o que o bot�o deve fazer

            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[8] == false) { //se onde eu clico for false, ele executa, se for true, n�o.
                    click[8] = true; //click nessa posi��o agora recebe true.
                    trocarSimbolo(bt[8]);
                }
            }

        });
    }//fim JogoDaVelha - construtor

    public void trocarSimbolo(JButton btn) {
        if(xo) {
            btn.setText("O");
            xo = false;
        } else {
            btn.setText("X");
            xo = true;
        }
        verificarVitoria();
    }

    public void atualizarPlacar() {
        pontX.setText("X = " + ptX);
        pontO.setText("O = " + ptO);
    }

    public void verificarVitoria() {

        int cont = 0;
        for (int i = 0; i < 9; i++) {
            if(click[i] == true) {
                cont++;
            }
        }

        if((bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X")
                ||(bt[0].getText() == "X" && bt[3].getText() == "X" && bt[6].getText() == "X")
                ||(bt[3].getText() == "X" && bt[4].getText() == "X" && bt[5].getText() == "X")
                ||(bt[6].getText() == "X" && bt[7].getText() == "X" && bt[8].getText() == "X")
                ||(bt[1].getText() == "X" && bt[4].getText() == "X" && bt[7].getText() == "X")
                ||(bt[2].getText() == "X" && bt[5].getText() == "X" && bt[8].getText() == "X")
                ||(bt[0].getText() == "X" && bt[4].getText() == "X" && bt[8].getText() == "X")
                ||(bt[6].getText() == "X" && bt[4].getText() == "X" && bt[2].getText() == "X")) {

            JOptionPane.showMessageDialog(null, "X Ganhou!!");
            ptX++;
            atualizarPlacar();
            limpar();

        } else if((bt[0].getText() == "O" && bt[1].getText() == "O" && bt[2].getText() == "O")
                ||(bt[0].getText() == "O" && bt[3].getText() == "O" && bt[6].getText() == "O")
                ||(bt[3].getText() == "O" && bt[4].getText() == "O" && bt[5].getText() == "O")
                ||(bt[6].getText() == "O" && bt[7].getText() == "O" && bt[8].getText() == "O")
                ||(bt[1].getText() == "O" && bt[4].getText() == "O" && bt[7].getText() == "O")
                ||(bt[2].getText() == "O" && bt[5].getText() == "O" && bt[8].getText() == "O")
                ||(bt[0].getText() == "O" && bt[4].getText() == "O" && bt[8].getText() == "O")
                ||(bt[6].getText() == "O" && bt[4].getText() == "O" && bt[2].getText() == "O")) {

            JOptionPane.showMessageDialog(null, "O Ganhou!!");
            ptO++;
            atualizarPlacar();
            limpar();

        } else if(cont == 9){
            JOptionPane.showMessageDialog(null, "Empate");
            limpar();
        }
    }

    public void limpar() {
        for(int i = 0; i < 9; i++) {
            bt[i].setText(" ");
            click[i] = false;
            xo = false;
        }
    }

    public static void main(String[] args) {

        new Classe_26_ProfJogodaVelha(); //iniciamos o jogo.
    }
}
