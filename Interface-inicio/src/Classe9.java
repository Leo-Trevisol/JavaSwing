import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Classe9 {
    private JFrame janela;

    public Classe9(){
        janela = new JFrame("Calcular IMC");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn1;
        JLabel p1, p2, p3, p4, p5,p6;
        JTextField t1,t2,t3;


        Container cont = janela.getContentPane();
        cont.setLayout(null); //SETLAYOUT = NULL, DEIXA CENTRALIZADO
        cont.setBackground(Color.black);

        p1 = new JLabel ("Calculo de IMC");
        p2 = new JLabel ("Peso");
        p3 = new JLabel ("Altura em Metros");
        p4 = new JLabel ("IMC:");
        p5 = new JLabel ("");

        t1 = new JTextField(5);
        t2 = new JTextField(5);
        t3 = new JTextField(5);

        btn1 = new JButton ("Calcular IMC");

        p2.setBounds(250,30,50,50);
        janela.add(p2);

        t1.setBounds(250,20,120,20);
        janela.add(t1);



        t2.setBounds(250, 60,120,20);
        janela.add(t2);








        janela.setSize(500,400);
        janela.setVisible(true);



    }

    public static void main(String[] args){
        new Classe9();
    }
}