import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Classe_19_AlterarCorBotao extends JFrame {

    private JButton botao_1;
    private JTextField caixa;

    public Classe_19_AlterarCorBotao() {

        super("Formul�rio");
        this.setSize(400, 200);
        this.setLocation(50, 100);

        Container ct = this.getContentPane();
        ct.setLayout(null);

        botao_1 = new JButton("Clique aqui");
        botao_1.setBounds(50, 10, 150, 25);
        ct.add(botao_1);

        caixa = new JTextField("");
        caixa.setBounds(50, 50, 300, 20);
        caixa.setEditable(false);
        ct.add(caixa);

        Image Icone = Toolkit.getDefaultToolkit().getImage("giphy.gif");

        setIconImage(Icone);

        this.setVisible(true);


        botao_1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Color bgColor = JColorChooser.showDialog(Classe_19_AlterarCorBotao.this,
                        "Alternando a cor do botao", botao_1.getBackground());

                if(bgColor != null) {

                    botao_1.setBackground(bgColor);

                    String x_bgColor = ""+bgColor;
                    caixa.setText(x_bgColor);

                }

            }
        });

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });




    }

    public static void main(String args[]) {

        new Classe_19_AlterarCorBotao();

    }



}
