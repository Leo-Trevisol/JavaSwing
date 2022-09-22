
// imports
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import operation.Operation;
import javax.swing.JLabel;

public class Classe_23_CalculadoraFoda extends JFrame {

    // ADICIONANDO VARIAVEIS ===

    JFrame frame;
    JLabel visor = new JLabel();
    JTextField view = new JTextField();
    JButton button9 = new JButton("9");
    JButton button8 = new JButton("8");
    JButton button7 = new JButton("7");
    JButton button6 = new JButton("6");
    JButton button5 = new JButton("5");
    JButton button4 = new JButton("4");
    JButton button3 = new JButton("3");
    JButton button2 = new JButton("2");
    JButton button1 = new JButton("1");
    JButton button0 = new JButton("0");
    JButton buttonCE = new JButton("CE");
    JButton buttonC = new JButton("C");
    JButton buttonDelete = new JButton("x");
    JButton buttonPorcentagem = new JButton("%");
    JButton buttonX = new JButton("X");
    JButton buttonMenos = new JButton("-");
    JButton buttonMais = new JButton("+");
    JButton buttonDiv = new JButton("/");
    JButton buttonIgual = new JButton("=");
    JButton buttonVirgula = new JButton(",");
    JButton buttonPonto = new JButton(".");
    JButton buttonFra = new JButton("/x");
    JButton buttonBack = new JButton("<-");
    JButton buttonMaME = new JButton("+-");
    JButton buttonRaiz = new JButton("Rz");

    double number1; // PRIMEIRO NUMERO DA CALCULADORA
    double number2; // SEGUNDO NUMERO DA CALCULADORA
    String sin = null; // USADO PARA IDENTIFICAR O SINAL DO CALCULO

    Operation operacao = new Operation(); // ESTANCIA A CLASSE OPERACAO, QUE E USADA PARA FAZER OS CALCULOS

    Classe_23_CalculadoraFoda() { // CONSTRUTOR DA CLASSE
        preparaInterface();
        adicionaComponentes();
    }

    // METODO QUE CRIA A TELA

    public void preparaInterface() {
        frame = new JFrame();
        frame.setTitle("Calculadora");
        frame.setSize(300, 440);
        frame.getContentPane().setLayout(null);// LAYOUT NULL
        frame.setResizable(false);// NAO E POSSIVEL REDIMENSIONAR A TELA
        frame.setLocationRelativeTo(null); // CRIA A TELA NO CENTRO DO MONITOR
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    // ADICIONA TODOS OS BOTOES E SUAS FUNCOES

    public void adicionaComponentes() {
        // VISOR DAS OPERACOES === VIEW

        view.setBounds(8, 40, 270, 100);
        view.setFont(new Font("Arial", Font.BOLD, 20));
        view.setEditable(false); //NAO PODE EDITAR
        view.setHorizontalAlignment(SwingConstants.RIGHT);// ALINHA NA ESQUERDA
        view.setBackground(new Color(255, 255, 255));
        frame.add(view);

        // PRIMEIRA LINHA ===

        //  BUTTON BACK ===

        buttonBack.setBounds(10, 155, 50, 40);
        buttonBack.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonBack);
        buttonBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO DO BOTAO BACK ===

                String remover = view.getText();
                view.setText(remover.substring(0,remover.length()-1));
            }
        });

        // BUTTON CE ===

        buttonCE.setBounds(65, 155, 50, 40);
        buttonCE.setFont(new Font("Arial", Font.BOLD, 12));
        frame.add(buttonCE);
        buttonCE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO BOTAO CE

                view.setText("");
            }
        });

        //  BUTTON C

        buttonC.setBounds(120, 155, 50, 40);
        buttonC.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonC);
        buttonC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO BUTTON C

                view.setText("");
            }
        });



         //BUTTON MAISMENOS ===

        buttonMaME.setBounds(175, 155, 50, 40);
        buttonMaME.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonMaME);
        buttonMaME.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO BUTTON MAISMENOS ===

                sin = "+-";
                number1 = Double.parseDouble(view.getText()); //NUMBER1 = TEXTO DO VIEW
                view.setText("0"); // DEPOIS QUE O NUMBER1 PEGA O TEXTO, O VIEW E ZERADO

            }
        });

              // BUTTON RAIZ ===

        buttonRaiz.setBounds(230, 155, 50, 40);
        buttonRaiz.setFont(new Font("Arial", Font.BOLD, 12));
        frame.add(buttonRaiz);
        buttonRaiz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO BUTTON RAIZ ===

                sin = "Rz";
                number1 = Double.parseDouble(view.getText());
                view.setText("0");

            }
        });
            // SEGUNDA LINHA ===

           // BUTTON 7 ===

        button7.setBounds(10, 200, 50, 40);
        button7.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button7);
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO BUTTON 7 ===

                if(view.getText().equals("0")){ //SE O VIEW ESTIVER VAZIO
                    view.setText("7");          //ADICIONA O 7
                }else{
                    view.setText(view.getText()+ "7"); //SE O VIEW NAO ESTIVER VAZIO, ADICIONA O TEXTO + 7
                }
            }
        });

        // BUTTON 8 ===

        button8.setBounds(65, 200, 50, 40);
        button8.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button8);
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO BUTTON 8 ===

                if(view.getText().equals("0")){
                    view.setText("8");
                }else{
                    view.setText(view.getText()+ "8");
                }
            }
        });


           // BUTTON 9 ===

        button9.setBounds(120, 200, 50, 40);
        button9.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button9);
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO BUTTON 9 ===

                if(view.getText().equals("0")){
                    view.setText("9");
                }else{
                    view.setText(view.getText()+ "9");
                }
            }
        });

             // BUTTON DIV ===

        buttonDiv.setBounds(175, 200, 50, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonDiv);
        buttonDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO BUTTON DIV ===

                sin = "div";
                number1 = Double.parseDouble(view.getText());
                view.setText("0");
            }
        });


             // BUTTON PORCENTAGEM ===

        buttonPorcentagem.setBounds(230, 200, 50, 40);
        buttonPorcentagem.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonPorcentagem);
        buttonPorcentagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                sin = "%";

                //ACAO BUTTON PORCENTAGEM ===

                number1 = Double.parseDouble(view.getText());
                view.setText("0");
            }
        });

        //	LINHA 3 ===

            // BUTTON 4 ===

        button4.setBounds(10, 245, 50, 40);
        button4.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button4);
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO BUTTON 4 ===

                if(view.getText().equals("0")){
                    view.setText("4");
                }else{
                    view.setText(view.getText()+ "4");
                }
            }
        });


        // BUTTON 5 ===

        button5.setBounds(65, 245, 50, 40);
        button5.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button5);
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO BUTTON 5 ===

                if(view.getText().equals("5")){
                    view.setText("-");
                }else{
                    view.setText(view.getText()+ "5");
                }
            }
        });

        // BUTTON 6 ===

        button6.setBounds(120, 245, 50, 40);
        button6.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button6);
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO BUTTON 6 ===

                if(view.getText().equals("0")){
                    view.setText("6");
                }else{
                    view.setText(view.getText()+ "6");
                }
            }
        });

        // BUTTON  X ===

        buttonX.setBounds(175, 245, 50, 40);
        buttonX.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonX);
        buttonX.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO BUTTON X ===

                sin = "multi";
                number1 = Double.parseDouble(view.getText());
                view.setText("0");
            }
        });

        // BUTTON  FRACAO ===

        buttonFra.setBounds(230, 245, 50, 40);
        buttonFra.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonFra);
        buttonFra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO BUTTON FRA ===

                sin = "/x";
                number1 = Double.parseDouble(view.getText());
                view.setText("0");
            }
        });


        // LINHA 4 ===

        // BUTTON 1 ===

        button1.setBounds(10, 290, 50, 40);
        button1.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button1);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO BUTTON 1 ===

                if(view.getText().equals("0")){
                    view.setText("1");
                }else{
                    view.setText(view.getText()+ "1");
                }
            }
        });

        // BUTTON 2 ===

        button2.setBounds(65, 290, 50, 40);
        button2.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button2);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO BUTTON 2 ===

                if(view.getText().equals("0")){
                    view.setText("2");
                }else{
                    view.setText(view.getText()+ "2");
                }
            }
        });

        //BUTTON 3 ===

        button3.setBounds(120, 290, 50, 40);
        button3.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button3);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO BUTTON 3 ===

                if(view.getText().equals("0")){
                    view.setText("3");
                }else{
                    view.setText(view.getText()+ "3");
                }
            }
        });

        //BUTTON MENOS ===

        buttonMenos.setBounds(175, 290, 50, 40);
        buttonMenos.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonMenos);
        buttonMenos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO BUTTON MENOS ===

                sin = "sub";
                number1 = Double.parseDouble(view.getText());
                view.setText("0");
            }
        });


        //LINHA 5 ===

        //BUTTON 0 ===

        button0.setBounds(10, 335, 105, 40);
        button0.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button0);
        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO BUTTON 0 ===

                if(view.getText().equals("0")){
                    view.setText("0");
                }else{
                    view.setText(view.getText()+ "0");
                }
            }
        });

        //BUTTON PONTO ===

        buttonPonto.setBounds(120, 335, 50, 40);
        buttonPonto.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonPonto);
        buttonPonto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO BUTTON PONTO ===

                if(view.getText().equals("0")){
                    view.setText(".");
                }else{
                    view.setText(view.getText()+ ".");
                }
            }
        });

         //BUTTON MAIS ===

        buttonMais.setBounds(175, 335, 50, 40);
        buttonMais.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonMais);
        buttonMais.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //ACAO BUTTON MAIS ===

                sin = "soma";
                number1 = Double.parseDouble(view.getText());
                view.setText("0");
            }
        });

        //BUTTON IGUAL ===

        buttonIgual.setBounds(230, 290, 50, 85);
        buttonIgual.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonIgual);
        buttonIgual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                number2 = Double.parseDouble(view.getText()); //NUMBER2 PEGA O TEXTO DO VIEW

                //ACAO BOTAO IGUAL ===

                //NUMBER1 PEGA O TEXTVIEW ANTES DE UM CLICK NUM BOTAO DE SINAL
                //NUMBER2 PEGA O TEXTVIEW DEPOIS DE UM CLICK NUM BOTAO DE SINAL

                //BOTAO IGUAL FAZ A CONTA DE ACORDO COM O SIN QUE FICOU SALVO ===

                if (sin.equals("soma")) {
                    view.setText(operacao.soma(number1,number2) + "");
                } else if (sin.equals("sub")) {
                    view.setText(operacao.sub(number1,number2) + "");
                } else if (sin.equals("mult")) {
                    view.setText(operacao.mult(number1,number2) + "");
                } else if (sin.equals("div")) {
                    view.setText(operacao.div(number1,number2) + "");
                } else if (sin.equals("Rz")) {
                    view.setText(operacao.raiz(number1) + "");
                }else if (sin.equals("%")) {
                    view.setText(operacao.porcentagem(number1, number2) + "");
                }else if (sin.equals("+-")) {
                    view.setText(operacao.trocaSinal(number1) + "");
                }else if (sin.equals("/x")) {
                    view.setText(operacao.fracao(number1) + "");
                }
            }
        });



    } //FIM DO METODO DE ADICIONAR COMPONENTES

    public static void main(String[] args) {
        new Classe_23_CalculadoraFoda();

    }

}
