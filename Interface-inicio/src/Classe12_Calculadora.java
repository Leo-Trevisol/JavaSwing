
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Classe12_Calculadora extends JFrame{

    JLabel num1, num2,result;
    JTextField text1, text2;
    JButton soma,sub,multi,divi;


    public Classe12_Calculadora() {

        Container cont = getContentPane();
        setLayout(null);
        cont.setBackground(Color.GRAY);

        //SETANDO OS ITENS E BOTANDO ELES NA TELA ===

        num1 = new JLabel("Numero 1:");
        num1.setBounds(100,20,120,20);
        cont.add(num1);

        text1 = new JTextField(5);
        text1.setBounds(180,20,120,20);
        cont.add(text1);

        num2 = new JLabel("Numero 2:");
        num2.setBounds(100,60,120,20);
        cont.add(num2);

        text2 = new JTextField(5);
        text2.setBounds(180,60,120,20);
        cont.add(text2);

        soma = new JButton("Somar");
        sub = new  JButton("Subtrair");
        multi = new JButton("Multiplicar");
        divi = new JButton("Dividir");

        soma.setBounds(30,100,100,30);
        sub.setBounds(140,100,100,30);
        multi.setBounds(250,100,100,30);
        divi.setBounds(360,100,100,30);

        result = new JLabel("");
        result.setBounds(170,150,300,20);
        cont.add(result);
        result.setVisible(false);

        cont.add(soma);
        cont.add(sub);
        cont.add(multi);
        cont.add(divi);

        //METODOS PARA FAZER OS CALCULOS ===

        //METODO DE SOMA==

        soma.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int nume1, nume2, somas;

                nume1 = Integer.parseInt(text1.getText());
                nume2 = Integer.parseInt(text2.getText());

                somas = (nume1 + nume2);
                result.setVisible(true);
                result.setText("O resultado da soma é " + somas);

            }

        });

        //METODO DE SUBTRACAO==

        sub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int nume1, nume2, subs;

                nume1 = Integer.parseInt(text1.getText());
                nume2 = Integer.parseInt(text2.getText());

                subs = (nume1 - nume2);
                result.setVisible(true);
                result.setText("O resultado da subtracao é: " + subs);

            }

        });

        //METODO DE MULTIPLICACAO==

        multi.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int nume1, nume2, multip;

                nume1 = Integer.parseInt(text1.getText());
                nume2 = Integer.parseInt(text2.getText());

                multip = (nume1 * nume2);
                result.setVisible(true);
                result.setText("O resultado da multiplicacao é: " + multip);

            }

        });

        //METODO DE DIVISAO==

        divi.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int nume1, nume2, divid;

                nume1 = Integer.parseInt(text1.getText());
                nume2 = Integer.parseInt(text2.getText());

                divid = (nume1 / nume2);
                result.setVisible(true);
                result.setText("O resultado da divisao é: " + divid);

            }

        });


        setSize(500,250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        Classe12_Calculadora app = new Classe12_Calculadora();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}