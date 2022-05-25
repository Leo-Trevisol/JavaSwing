
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;


public class Classe15 extends JFrame{

    static JToolBar tb;

    static JButton bt1,bt2;

    static JFrame j;

    static JComboBox x;


    public static void main(String[] args) {

        j = new JFrame ("ToolBar Demo");

        j.setLayout(new BorderLayout());

        tb = new JToolBar();

        JPanel p = new JPanel();

        x= new JComboBox(new String[] { "item1", "item2", "item3"});

        bt1 = new JButton ("Botao1");
        bt2 = new JButton ("Botao2");

        p.add(bt1);
        p.add(bt2);

        p.add(x);
        tb.add(p);

        j.add(tb,BorderLayout.NORTH);
        j.setVisible(true);
        j.setSize(500,500);


        Classe15 app = new Classe15();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }






}


