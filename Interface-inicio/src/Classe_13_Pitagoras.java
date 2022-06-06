
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Classe_13_Pitagoras extends JFrame {

    JLabel cateto1, cateto2, hipotenusa, teorema,formula;
    JTextField texto1, texto2, texto3;
    JButton calcular;
    ImageIcon icone1;

    public Classe_13_Pitagoras(){
        super("Teorema de Pitagoras");

        Container cont = getContentPane();
        setLayout(null);
        cont.setBackground(Color.GRAY);

        cateto1 = new JLabel("Valor do cateto 1:");
        cateto2 = new JLabel("Valor do cateto 2:");
        hipotenusa = new JLabel ("Valor da Hipotenusa:");
        teorema = new JLabel ("Teorema de Pitagoras");
        formula = new JLabel ("C2 = A2 + B2");

        texto1 = new JTextField (5);
        texto2 = new JTextField (5);
        texto3 = new JTextField (5);


        icone1 = new ImageIcon("raiz.png");
        calcular = new JButton("Calcular", icone1);

        teorema.setBounds(150,10,200,30);
        teorema.setFont(new Font("Serif", Font.BOLD, 20));
        cont.add(teorema);

        formula.setBounds(200,30,200,30);
        formula.setFont(new Font("Serif", Font.BOLD, 15));
        cont.add(formula);

        cateto1.setBounds(120, 60,120,20);
        cont.add(cateto1);
        cateto1.setFont(new Font("Serif", Font.BOLD, 14));
        texto1.setBounds(250,60,120,20);
        cont.add(texto1);

        cateto2.setBounds(120, 90,120,20);
        cont.add(cateto2);
        cateto2.setFont(new Font("Serif", Font.BOLD, 14));
        texto2.setBounds(250,90,120,20);
        cont.add(texto2);


        calcular.setBounds(170,140,150,30);
        cont.add(calcular);

        hipotenusa.setBounds(120, 190,150,20);
        texto3.setEditable(false);
        cont.add(hipotenusa);
        hipotenusa.setFont(new Font("Serif", Font.BOLD, 14));
        texto3.setBounds(260,190,120,20);
        cont.add(texto3);

        calcular.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                float cata, catb, hipo;
                cata = Float.parseFloat(texto1.getText());
                catb = Float.parseFloat(texto2.getText());
                hipo = (cata * cata) + (catb * catb);
                hipo = (float) Math. sqrt(hipo);
                texto3.setVisible(true);
                texto3.setText(""+hipo);

            }
        });



        setSize(500,300);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        Classe_13_Pitagoras app = new Classe_13_Pitagoras();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }






}
