
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

public class Classe23_CalculadoraFoda extends JFrame {

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

    double number1;
    double number2;
    String sin = null;

    Operation operacao = new Operation();

    Classe23_CalculadoraFoda() {
        preparaInterface();
        adicionaComponentes();
    }

    // prepara a interface no metodo contructor
    public void preparaInterface() {
        frame = new JFrame();
        frame.setTitle("Calculadora");
        frame.setSize(300, 440);
        frame.getContentPane().setLayout(null);// layoyt null
        frame.setResizable(false);// nao e possivel redimensionar
        frame.setLocationRelativeTo(null); // cria no centro do monitor
        frame.setVisible(true); // visivel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // encerra o processo ao fechar

    }

    public void adicionaComponentes() {
        // visor de operacoes

        view.setBounds(8, 40, 270, 100);
        view.setFont(new Font("Arial", Font.BOLD, 20)); // verificar outra forma de fazer fonts
        view.setEditable(false);
        view.setHorizontalAlignment(SwingConstants.RIGHT);// alinha a letra no canto esquerdo do visor
        view.setBackground(new Color(255, 255, 255));
        frame.add(view);

        // cria button - 1 linha

        //        buttonBack DESENVOLVER O CÓDIGO

        buttonBack.setBounds(10, 155, 50, 40);
        buttonBack.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonBack);
        buttonBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //DESENVOLVER O CÓDIGO
                String remover = view.getText();
                view.setText(remover.substring(0,remover.length()-1));
            }
        });

        //        buttonCE DESENVOLVER O CÓDIGO

        buttonCE.setBounds(65, 155, 50, 40);
        buttonCE.setFont(new Font("Arial", Font.BOLD, 12));
        frame.add(buttonCE);
        buttonCE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //DESENVOLVER O CÓDIGO

                view.setText("");
            }
        });

        //        buttonC DESENVOLVER O CÓDIGO

        buttonC.setBounds(120, 155, 50, 40);
        buttonC.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonC);
        buttonC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //DESENVOLVER O CÓDIGO

                view.setText("");
            }
        });


//        buttonMaME DESENVOLVER O CÓDIGO


        buttonMaME.setBounds(175, 155, 50, 40);
        buttonMaME.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonMaME);
        buttonMaME.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                sin = "+-";

                //DESENVOLVER O CÓDIGO
                if(view.getText().equals("0")){
                    view.setText("+-");
                }else{
                    view.setText(view.getText()+ "+-");
                }

            }
        });

        //        buttonRaiz DESENVOLVER O CÓDIGO

        buttonRaiz.setBounds(230, 155, 50, 40);
        buttonRaiz.setFont(new Font("Arial", Font.BOLD, 12));
        frame.add(buttonRaiz);
        buttonRaiz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                sin = "Rz";

                //DESENVOLVER O CÓDIGO
                if(view.getText().equals("0")){
                    view.setText("√");
                }else{
                    view.setText(view.getText()+ "√");
                }

            }
        });


        // cria button - 2 linha
        button7.setBounds(10, 200, 50, 40);
        button7.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button7);
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //DESENVOLVER O CÓDIGO

                if(view.getText().equals("0")){
                    view.setText("7");
                }else{
                    view.setText(view.getText()+ "7");
                }
            }
        });

        button8.setBounds(65, 200, 50, 40);
        button8.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button8);
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //DESENVOLVER O CÓDIGO


                if(view.getText().equals("0")){
                    view.setText("8");
                }else{
                    view.setText(view.getText()+ "8");
                }
            }
        });


//        button9 DESENVOLVER O CÓDIGO

        button9.setBounds(120, 200, 50, 40);
        button9.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button9);
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //DESENVOLVER O CÓDIGO

                if(view.getText().equals("0")){
                    view.setText("9");
                }else{
                    view.setText(view.getText()+ "9");
                }
            }
        });

        //        buttonDiv DESENVOLVER O CÓDIGO

        buttonDiv.setBounds(175, 200, 50, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonDiv);
        buttonDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                sin = "div";


                //DESENVOLVER O CÓDIGO


                if(view.getText().equals("0")){
                    view.setText("-");
                }else{
                    view.setText(view.getText()+ "-");
                }
            }
        });



//        buttonPorcentagem DESENVOLVER O CÓDIGO


        buttonPorcentagem.setBounds(230, 200, 50, 40);
        buttonPorcentagem.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonPorcentagem);
        buttonPorcentagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                sin = "%";

                //DESENVOLVER O CÓDIGO

                if(view.getText().equals("%")){
                    view.setText("-");
                }else{
                    view.setText(view.getText()+ "%");
                }
            }
        });

        //	cria button - 3 linha

//        button4 DESENVOLVER O CÓDIGO

        button4.setBounds(10, 245, 50, 40);
        button4.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button4);
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //DESENVOLVER O CÓDIGO

                if(view.getText().equals("0")){
                    view.setText("4");
                }else{
                    view.setText(view.getText()+ "4");
                }
            }
        });


//        button5 DESENVOLVER O CÓDIGO

        button5.setBounds(65, 245, 50, 40);
        button5.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button5);
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //DESENVOLVER O CÓDIGO

                if(view.getText().equals("5")){
                    view.setText("-");
                }else{
                    view.setText(view.getText()+ "5");
                }
            }
        });


//        button6 DESENVOLVER O CÓDIGO

        button6.setBounds(120, 245, 50, 40);
        button6.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button6);
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //DESENVOLVER O CÓDIGO

                if(view.getText().equals("0")){
                    view.setText("6");
                }else{
                    view.setText(view.getText()+ "6");
                }
            }
        });

        //  buttonX DESENVOLVER O CÓDIGO

        buttonX.setBounds(175, 245, 50, 40);
        buttonX.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonX);
        buttonX.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                sin = "multi";


                //DESENVOLVER O CÓDIGO

                if(view.getText().equals("*")){
                    view.setText("-");
                }else{
                    view.setText(view.getText()+ "*");
                }
            }
        });

        //buttonFra

        buttonFra.setBounds(230, 245, 50, 40);
        buttonFra.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonFra);
        buttonFra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                sin = "/x";

                //DESENVOLVER O CÓDIGO

                if(view.getText().equals("0")){
                    view.setText("/x");
                }else{
                    view.setText(view.getText()+ "/x");
                }
            }
        });


        // cria button - 4 linha

//        button1

        button1.setBounds(10, 290, 50, 40);
        button1.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button1);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //DESENVOLVER O CÓDIGO

                if(view.getText().equals("0")){
                    view.setText("1");
                }else{
                    view.setText(view.getText()+ "1");
                }
            }
        });

//        button2 DESENVOLVER O CÓDIGO

        button2.setBounds(65, 290, 50, 40);
        button2.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button2);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //DESENVOLVER O CÓDIGO

                if(view.getText().equals("0")){
                    view.setText("2");
                }else{
                    view.setText(view.getText()+ "2");
                }
            }
        });

//        button3

        button3.setBounds(120, 290, 50, 40);
        button3.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button3);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //DESENVOLVER O CÓDIGO

                if(view.getText().equals("0")){
                    view.setText("3");
                }else{
                    view.setText(view.getText()+ "3");
                }
            }
        });

        //buttonMenosDESENVOLVER O CÓDIGO

        buttonMenos.setBounds(175, 290, 50, 40);
        buttonMenos.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonMenos);
        buttonMenos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                sin = "sub";


                //DESENVOLVER O CÓDIGO

                if(view.getText().equals("0")){
                    view.setText("-");
                }else{
                    view.setText(view.getText()+ "-");
                }
            }
        });


        //Cria linha 5

//        button0

        button0.setBounds(10, 335, 105, 40);
        button0.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(button0);
        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //DESENVOLVER O CÓDIGO

                if(view.getText().equals("0")){
                    view.setText("0");
                }else{
                    view.setText(view.getText()+ "0");
                }
            }
        });

//        buttonPonto DESENVOLVER O CÓDIGO

        buttonPonto.setBounds(120, 335, 50, 40);
        buttonPonto.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonPonto);
        buttonPonto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //DESENVOLVER O CÓDIGO

                if(view.getText().equals("0")){
                    view.setText(".");
                }else{
                    view.setText(view.getText()+ ".");
                }
            }
        });

//        buttonMais DESENVOLVER O CÓDIGO

        buttonMais.setBounds(175, 335, 50, 40);
        buttonMais.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonMais);
        buttonMais.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                sin = "soma";

                //DESENVOLVER O CÓDIGO

                if(view.getText().equals("0")){
                    view.setText("+");
                }else{
                    view.setText(view.getText()+ "+");
                }
            }
        });


        buttonIgual.setBounds(230, 290, 50, 85);
        buttonIgual.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonIgual);
        buttonIgual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                number2 = Double.parseDouble(view.getText());

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
                    view.setText(operacao.porcentagem(number1) + "");
                }else if (sin.equals("+-")) {
                    view.setText(operacao.trocaSinal(number1) + "");
                }else if (sin.equals("/x")) {
                    view.setText(operacao.fracao(number1) + "");
                }
            }
        });



    }//fim adicionaComponentes

    public static void main(String[] args) {
        new Classe23_CalculadoraFoda();

    }

}//fim Calculadora extends JFrame
