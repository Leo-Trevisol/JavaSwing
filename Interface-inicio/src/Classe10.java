
import java.awt.*;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class Classe10 extends JFrame {

    JLabel rotulo1, rotulo2, rotulo3,
            rotulo4, rotulo5, rotulo6,
            rotulo8, rotulo7,rotulo9,
            rotulo10, rotulo11, rotulo12;

    JTextField  texto1, texto2, texto3,
            texto4, texto5, texto6,texto7, texto8;

    JRadioButton botao1, botao2;
    JComboBox lista;

    String estados[] = {"RJ", "RS", "SP", "SC", "BH", "AC"};
    JFormattedTextField cel, tel, datac, datan;
    MaskFormatter mascaracel, mascaratel, mascaradatac, mascaradatan;

    JButton botaoi, botaol, botaos, botaoct, botaoc;
    ImageIcon icone, icone1, icone2, icone3, icone4, icone5;


    public Classe10() {
        super("Cadastro de Cliente");
        icone = new ImageIcon("forms.png");
        setIconImage(icone.getImage());
        setSize(500, 400);
        setVisible(true);

        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel("C�digo de Cliente:");
        rotulo2 = new JLabel ("Nome Completo:");
        rotulo3 = new JLabel ("Endere�o:");
        rotulo4 = new JLabel ("Bairro:");
        rotulo5 = new JLabel ("Cidade:");
        rotulo6 = new JLabel ("Estado:");
        rotulo7 = new JLabel ("CEP");
        rotulo8 = new JLabel ("Sexo:");
        rotulo9 = new JLabel ("Celular:");
        rotulo10 = new JLabel ("Telefone");
        rotulo11 = new JLabel ("Data de Nascimento");
        rotulo12 = new JLabel ("Data de Cadastro");

        texto1 = new JTextField();
        texto2 = new JTextField();
        texto3 = new JTextField();
        texto4 = new JTextField();
        texto5 = new JTextField();
        texto6 = new JTextField();
        texto7 = new JTextField();



        try {
            mascaracel = new MaskFormatter("(##)####-####");
            mascaratel = new MaskFormatter("(##)####-####");
            mascaradatan = new MaskFormatter("##/##/####");
            mascaradatac = new MaskFormatter("##/##/####");
            mascaracel.setPlaceholderCharacter('_');
            mascaratel.setPlaceholderCharacter('_');
            mascaradatan.setPlaceholderCharacter('_');
            mascaradatac.setPlaceholderCharacter('_');
        }catch(ParseException excp) { }

        cel = new JFormattedTextField(mascaracel);
        tel = new JFormattedTextField(mascaratel);
        datan = new JFormattedTextField(mascaradatan);
        datac = new JFormattedTextField(mascaradatac);

        lista = new JComboBox(estados);
        lista.setMaximumRowCount(5);
        lista.setBounds(150, 220, 200, 25);
        texto6.setText(lista.getSelectedItem().toString());

        botao1 = new JRadioButton("Feminino");
        botao2 = new JRadioButton("Masculino");

        botao1.setBounds(150,300, 120, 20);
        botao2.setBounds(260,300, 120,20);

        icone1 = new ImageIcon("pesq.png");
        botaoi = new JButton ("Incluir", icone1);
        botaoi.setBounds(190,500, 160,25);

        tela.add(botaoi);

        icone2 = new ImageIcon("pesq.png");
        botaol = new JButton ("Limpar", icone2);
        botaol.setBounds(250,500, 160,25);

        tela.add(botaol);

        icone3 = new ImageIcon("pesq.png");
        botaos = new JButton ("Sair", icone3);
        botaos.setBounds(360,500, 160,25);
        tela.add(botaos);

        tela.add(botaos);

        icone4 = new ImageIcon("pesq.png");
        botaoc = new JButton ("Consultar", icone4);
        botaoc.setBounds(20,530, 160,25);
        tela.add(botaoc);

        tela.add(botaoc);

        icone5 = new ImageIcon("pesq.png");
        botaoct = new JButton ("Consultar Todos", icone5);
        botaoct.setBounds(20,530, 160,25);

        tela.add(botaoct);






        rotulo1.setBounds(20,20,120,25);
        rotulo2.setBounds(20,60,120,25);
        rotulo3.setBounds(20,100,120,25);
        rotulo4.setBounds(20,140,120,25);
        rotulo5.setBounds(20,180,120,25);
        rotulo6.setBounds(20,220,120,25);
        rotulo7.setBounds(20,260,120,25);
        rotulo8.setBounds(20,300,120,25);
        rotulo9.setBounds(20,340,120,25);
        rotulo10.setBounds(20,380,120,25);
        rotulo11.setBounds(20,420,120,25);
        rotulo12.setBounds(20,460,120,25);

        texto1.setBounds(150,20,200,25);
        texto2.setBounds(150,60,200,25);
        texto3.setBounds(150,100,200,25);
        texto4.setBounds(150,140,200,25);
        texto5.setBounds(150,180,200,25);
        texto6.setBounds(150,220,200,25);
        texto7.setBounds(150,260,200,25);

        cel.setBounds(150,340,200,25);
        tel.setBounds(150,380,200,25);
        datan.setBounds(150,420,200,25);
        datac.setBounds(150,460,200,25);

        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);
        tela.add(rotulo8);
        tela.add(rotulo9);
        tela.add(rotulo10);
        tela.add(rotulo11);
        tela.add(rotulo12);

        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(texto7);
        tela.add(texto8);

        texto1.requestFocus();
        setSize(550,620);
        setVisible(true);
        setLocationRelativeTo(null);

    }


    public static void main(String args[]) {
        Classe10 app = new Classe10();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}