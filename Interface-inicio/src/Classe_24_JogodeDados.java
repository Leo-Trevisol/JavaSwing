
import javax.swing.SwingUtilities;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.JLabel;

public class Classe_24_JogodeDados extends JFrame implements ActionListener {

    //    DECLARANDO VARIAVEIS ===;
    private JPanel painel = null;
    private JLabel titulo = null;
    private JLabel dado1 = null;
    private JLabel dado2 = null;
    private JLabel sinalIgaul = null;
    private JLabel sinalMais = null;
    private JButton botaoLancar = null;
    private JButton botaoInfo = null;


    private JButton buttonlancar() {
        if (botaoLancar == null) {
            botaoLancar = new JButton();
            botaoLancar.setBounds(new Rectangle(220, 292, 150, 36));
            botaoLancar.setText("Lançar Dados");
            botaoLancar.setToolTipText("Play"); //MENSAGEM AO PASSAR O MOUSE
            botaoLancar.setCursor(new Cursor(Cursor.HAND_CURSOR));  //O CURSOR VIRA UMA MAO
            botaoLancar.addActionListener(this);
        }
        return botaoLancar;
    }

    private JButton buttoninformacao() {
        if (botaoInfo == null) {
            ImageIcon icone = new ImageIcon(getClass().getResource("/dados1/Informacao.png"));
            botaoInfo = new JButton(icone);
            botaoInfo.setBounds(new Rectangle(530, 5, 40, 40));
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
                            JOptionPane.showMessageDialog(null, "Jogo de dados em java.\n"
                                            + "Autor: Leo Trevisol"
                                            + "\nClick no botão Lançar Dados para começar.",
                                    "Jogo de Dados Java", 0, duke);
                        }
                    });
        }
        return botaoInfo;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Classe_24_JogodeDados app = new Classe_24_JogodeDados();
                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                app.setVisible(true);
            }
        });
    }

    public Classe_24_JogodeDados() {
        super();
        initialize();
    }

    //METODO DE INICAR A TELA ===

    private void initialize() {
        this.setSize(581, 379);
        this.setContentPane(getJContentPane());
        this.setTitle("Jogo de Dados Java");
        this.setResizable(false);   // TAMANHO FIXO DA TELA
        this.setLocationRelativeTo(null);   // DEIXA A TELA CENTRALIZADA NO MONITOR
        URL url = this.getClass().getResource("/dados1/Duke.png"); // URL DA IMAGEM 16X16
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(url)); // PASSANDO URL COMO PARAMETRO
    }

    //CRIANDO CONTAINER E BOTANDO OS ICONES DENTRO ===

    private JPanel getJContentPane() {
        if (painel == null) {

            //LABEL SINAL DE MAIS ===

            sinalMais = new JLabel();
            sinalMais.setBounds(new Rectangle(274, 166, 40, 29));
            sinalMais.setHorizontalAlignment(SwingConstants.CENTER); //CENTRALIZA O TEXTO
            sinalMais.setFont(new Font("Arial", Font.BOLD, 38));

            //LABEL DADO 1 ===

            dado1 = new JLabel();
            dado1.setBounds(new Rectangle(154, 119, 114, 108));

            //LABEL DO LADO 2 ===

            dado2 = new JLabel();
            dado2.setBounds(new Rectangle(324, 119, 114, 108));
            dado2.setHorizontalAlignment(SwingConstants.CENTER); //CENTRALIZA O TEXTO
            dado2.setFont(new Font("Arial", Font.BOLD, 28));

            //LABEL SINAL IGUAL ===

            sinalIgaul = new JLabel();
            sinalIgaul.setBounds(new Rectangle(448, 163, 64, 32));
            sinalIgaul.setHorizontalAlignment(SwingConstants.CENTER); //CENTRALIZA O TEXTO
            sinalIgaul.setFont(new Font("Arial", Font.BOLD, 28));

            //LABEL TITULO ===

            titulo = new JLabel();
            titulo.setBounds(new Rectangle(124, 5, 329, 40));
            titulo.setHorizontalAlignment(SwingConstants.CENTER); //CENTRALIZA O TEXTO
            titulo.setFont(new Font("Arial", Font.BOLD, 28));
            titulo.setText("Jogo de Dados");

          // ADICIONANDO NO CONTAINER ===

            painel = new JPanel();
            painel.setLayout(null);
            painel.add(buttonlancar(), null);
            painel.add(buttoninformacao(), null);
            painel.add(titulo, null);
            painel.add(dado1, null);
            painel.add(dado2, null);
            painel.add(sinalIgaul, null);
            painel.add(sinalMais, null);

        }
        return painel;
    }

    public void actionPerformed(ActionEvent e) {

       // LANCAR O PRIMEIRO DADO ===

        int dadoum = (int) (6 * Math.random() + 1); //NUMEROS ALEATORIOS DE 1A6

        //MUDA A IMAGEM DO DADO DE ACORDO COM O NUMERO ALEATORIO GERADO ===

        if (dadoum == 1) {

            dado1.setIcon(new ImageIcon(getClass().getResource(("/dados1/dice-1.png"))));
            dado1.setToolTipText("Nº1"); //MENSAGEM AO PASSAR O MOUSE

        } else if (dadoum == 2) {

            dado1.setIcon(new ImageIcon(getClass().getResource(("/dados1/dice-2.png"))));
            dado1.setToolTipText("Nº2"); //MENSAGEM AO PASSAR O MOUSE

        } else if (dadoum == 3) {

            dado1.setIcon(new ImageIcon(getClass().getResource(("/dados1/dice-3.png"))));
            dado1.setToolTipText("Nº3"); //MENSAGEM AO PASSAR O MOUSE

        } else if (dadoum == 4) {

            dado1.setIcon(new ImageIcon(getClass().getResource(("/dados1/dice-4.png"))));
            dado1.setToolTipText("Nº4"); //MENSAGEM AO PASSAR O MOUSE

        } else if (dadoum == 5) {

            dado1.setIcon(new ImageIcon(getClass().getResource(("/dados1/dice-5.png"))));
            dado1.setToolTipText("Nº5"); //MENSAGEM AO PASSAR O MOUSE

        } else if (dadoum == 6) {

            dado1.setIcon(new ImageIcon(getClass().getResource(("/dados1/dice-6.png"))));
            dado1.setToolTipText("Nº6"); //MENSAGEM AO PASSAR O MOUSE
        }

        // LANCAR O PRIMEIRO DADO ===

        int dadodois = (int) (6 * Math.random() + 1); //NUMEROS ALEATORIOS DE 1A6

        //MUDA A IMAGEM DO DADO DE ACORDO COM O NUMERO ALEATORIO GERADO ===

        // Dados verde DENTRO do pacote imagens
        if (dadodois == 1) {

            dado2.setIcon(new ImageIcon(getClass().getResource(("/dados2/dice-1.png"))));
            dado2.setToolTipText("Nº1"); //MENSAGEM AO PASSAR O MOUSE

        } else if (dadodois == 2) {

            dado2.setIcon(new ImageIcon(getClass().getResource(("/dados2/dice-2.png"))));
            dado2.setToolTipText("Nº2"); //MENSAGEM AO PASSAR O MOUSE

        } else if (dadodois == 3) {

            dado2.setIcon(new ImageIcon(getClass().getResource(("/dados2/dice-3.png"))));
            dado2.setToolTipText("Nº3"); //MENSAGEM AO PASSAR O MOUSE

        } else if (dadodois == 4) {

            dado2.setIcon(new ImageIcon(getClass().getResource(("/dados2/dice-4.png"))));
            dado2.setToolTipText("Nº4"); //MENSAGEM AO PASSAR O MOUSE

        } else if (dadodois == 5) {

            dado2.setIcon(new ImageIcon(getClass().getResource(("/dados2/dice-5.png"))));
            dado2.setToolTipText("Nº5"); //MENSAGEM AO PASSAR O MOUSE

        } else if (dadodois == 6) {

            dado2.setIcon(new ImageIcon(getClass().getResource(("/dados2/dice-6.png"))));
            dado2.setToolTipText("Nº6"); //MENSAGEM AO PASSAR O MOUSE
        }

        //SOMA OS DOIS DADOS ===

        int soma = dadoum + dadodois;

        sinalMais.setText("+");

        sinalIgaul.setText("= " + soma);

    }
}
