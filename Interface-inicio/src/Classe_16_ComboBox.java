
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public  class Classe_16_ComboBox extends JFrame implements ActionListener, ItemListener{

    static JToolBar tb;

    static JButton bt1,bt2;

    static JFrame j;

    static JComboBox x;

    static JLabel l,ll;


    public static void main(String[] args) {

        Classe_16_ComboBox to = new Classe_16_ComboBox();

        l = new JLabel ("Nothing Selected");
        ll = new JLabel ("Nothung Selected");

        j = new JFrame ("ToolBar Demo");

        j.setLayout(new BorderLayout());

        tb = new JToolBar();

        JPanel p = new JPanel();

        x= new JComboBox(new String[] { "item1", "item2", "item3"});

        x.addItemListener(to);

        bt1 = new JButton ("Botao1");
        bt2 = new JButton ("Botao2");

        bt1.addActionListener(to);
        bt2.addActionListener(to);


        p.add(bt1);
        p.add(bt2);

        p.add(x);
        tb.add(p);

        JPanel p1 = new JPanel();

        p1.add(l);
        p1.add(ll);




        j.add(tb,BorderLayout.NORTH);
        j.add(p1,BorderLayout.CENTER);
        j.setVisible(true);
        j.setSize(500,500);


    }


    @Override
    public void itemStateChanged(ItemEvent e) {

        l.setText(x.getActionCommand() + " Select.");
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        ll.setText(x.getSelectedItem() + " Selected.");
    }




}


