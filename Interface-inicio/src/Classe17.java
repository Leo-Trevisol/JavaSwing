
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class Classe17 extends JFrame {

    static JMenuBar mb;

    static JMenu x;

    static JMenuItem m1,m2,m3;

    static JFrame f;

    public static void main(String[] args) {

        f = new JFrame("Menu Demo");

        mb = new JMenuBar();

        x = new JMenu ("Menu");

        m1 = new JMenuItem ("Menu1");
        m2 = new JMenuItem ("Menu2");
        m3 = new JMenuItem ("Menu3");

        x.add(m1);
        x.add(m2);
        x.add(m3);

        mb.add(x);

        f.setJMenuBar(mb);

        f.setSize(500,500);
        f.setVisible(true);

        Classe17 app = new Classe17();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

