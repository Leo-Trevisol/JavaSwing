
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Classe14_Triangulo extends JFrame{

    JLabel lado1,lado2,lado3,tipo,exp;
    JTextField text1,text2,text3;
    JButton verifica;


    public Classe14_Triangulo(){

        Container cont = getContentPane();
        setLayout(null);
        cont.setBackground(Color.GRAY);
        exp = new JLabel("Digite o tamanho de cada lado para saber qual o tipo do triangulo:");
        lado1 = new JLabel("Lado 1:");
        lado2 = new JLabel("Lado 2:");
        lado3 = new JLabel("Lado 3:");
        tipo = new JLabel("");
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();


        exp.setBounds(10,10,400,20);
        cont.add(exp);

        lado1.setBounds(20,60,50,20);
        lado2.setBounds(20,100,50,20);
        lado3.setBounds(20,140,50,20);
        cont.add(lado1);
        cont.add(lado2);
        cont.add(lado3);

        text1.setBounds(80,60,50,20);
        text2.setBounds(80,100,50,20);
        text3.setBounds(80,140,50,20);
        cont.add(text1);
        cont.add(text2);
        cont.add(text3);

        verifica = new JButton("Consultar");
        verifica.setBounds(20,180,100,20);
        cont.add(verifica);

        tipo.setVisible(false);
        tipo.setBounds(200,50,100,20);

        verifica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String l1,l2,l3;
                int conta = 0;
                l1 = text1.getText().toString();
                l2 = text1.getText().toString();
                l3 = text1.getText().toString();



                if (l1 == l2 && l1 == l3 && l2 == l3){

                    tipo = new JLabel("Triangulo Equilatero");
                }
                if(l1 != l2 && l1 != l3 && l2 != l3 ){
                    tipo = new JLabel("Triangulo Escaleno");
                }
                if (l1==l2){
                    conta++;
                }
                if(l1==l3){
                    conta++;
                }
                if (l2==l3){
                    conta++;
                }
                if (conta==2){
                    tipo = new JLabel("Triangulo Isosceles");
                }
                cont.setVisible(true);
                cont.add(tipo);



            }

        });

        setSize(400,300);
        setVisible(true);


    }



    public static void main(String[] args) {
        Classe14_Triangulo app = new Classe14_Triangulo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
