
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Classe14_Triangulo extends JFrame{

    JLabel lado1,lado2,lado3,tipo;
    JTextField text1,text2,text3;
    JButton verifica;


    public Classe14_Triangulo(){

        Container cont = getContentPane();
        setLayout(null);
        cont.setBackground(Color.GRAY);


    };

    public static void main(String[] args) {
        Classe14_Triangulo app = new Classe14_Triangulo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
