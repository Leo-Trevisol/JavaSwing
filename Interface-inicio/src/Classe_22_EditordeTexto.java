import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Classe_22_EditordeTexto extends JFrame {

    private JTextArea textoEdit;
    private JButton verTexto;
    private JEditorPane paginaURL;

    public String enderecoURL;

    public Classe_22_EditordeTexto() {

        super("JEditorPane");
        this.setSize(510,500);
        this.setLocation(0,0);

        Container ct = this.getContentPane();
        ct.setLayout(null);

        paginaURL = new JEditorPane();

        paginaURL.setEditable(true);
        paginaURL.setContentType("text/html");

        JScrollPane barraDeRolagem = new JScrollPane(paginaURL);

        barraDeRolagem.setBounds(1,1,488,250);

        ct.add(barraDeRolagem);

        verTexto = new JButton("Texto");

        verTexto.setBounds(401,251,90,20);

        ct.add(verTexto);

        textoEdit = new JTextArea("<b><font color='#FF0000'>Testando JTextPane</font></b>");
        textoEdit.setLineWrap(true);

        JScrollPane barraEdit = new JScrollPane(textoEdit);

        barraEdit.setBounds(1,271,488,190);

        ct.add(barraEdit);

        Image Icone = Toolkit.getDefaultToolkit().getImage("ghiphy.png");
        setIconImage(Icone);

        this.setVisible(true);

        JOptionPane.showMessageDialog(null, "Toda vez que digitar \"vermelho\" aparecer� uma mensagem dizendo:\nTestando JTextPane");
        verTexto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                paginaURL.setText(textoEdit.getText());
            }
        });

        paginaURL.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                String Texto = paginaURL.getText();
                if(Texto.indexOf("vermelho")>0){
                    paginaURL.setText(Texto.replace( "vermelho", "<b> <font color='#FF0000'> Testando JTextPane </font> </b>"));
                }
            }
        });

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
    public static void main(String[] args) {
        new Classe_22_EditordeTexto();
    }
}
