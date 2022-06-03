
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Classe25_Cadastro extends JFrame {
    JFrame frame;
    JLabel nome,email,sexo,ddd1,ddd2,telefone,celular,endereco,num,complemento,
            bairro,cep,cidade,estado,rg,CPF,nascimento;
    JTextField txtnome,txtemail,txtddd1,txtddd2,txtendereco,txtnum,txtcomplemento,
            txtbairro,txtcidade,txtestado,txtrg,txtCPF;
    JButton abrir,gravar,limpar;
    Container tela;
    JFormattedTextField txtcelular, txttelefone, txtnascimento, txtcep;
    JComboBox lista;
    JRadioButton masc, femi,outro;
    ButtonGroup sex;
    PrintWriter out;
    MaskFormatter mascaracel, mascaratel,mascaradatan, mascaracep;
    String[] estados ={"Rio de Janeiro","S�o Paulo","Acre",
            "Santa Catarina","Rio Grande do Sul",
            "Bahia","Bras�lia"};

    public Classe25_Cadastro(){


        try {
            inserircomponentes();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        inserirnatela();
        botoes();
        setSize(1000,300);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }


    public static void main(String[] args) {

        Classe25_Cadastro app = new Classe25_Cadastro();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

    public void inserircomponentes() throws FileNotFoundException{

        nome = new JLabel("Nome:");
        email = new JLabel("Email:");
        sexo = new JLabel("Sexo:");
        ddd1 = new JLabel("DDD:");
        ddd2 = new JLabel("DDD:");
        telefone = new JLabel("Telefone:");
        celular = new JLabel("Celular:");
        endereco = new JLabel("Endereco:");
        num = new JLabel("N:");
        complemento = new JLabel("Complemento:");
        bairro = new JLabel("Bairro:");
        cep = new JLabel("CEP:");
        cidade = new JLabel("Cidade:");
        estado = new JLabel("Estado:");
        rg = new JLabel("RG:");
        CPF = new JLabel("CPF:");
        nascimento = new JLabel("Data de Nascimento:");

        txtnome = new JTextField();
        txtemail = new JTextField();
        txtddd1 = new JTextField();
        txtddd2 = new JTextField();
        txtendereco = new JTextField();
        txtnum = new JTextField();
        txtcomplemento = new JTextField();
        txtbairro = new JTextField();
        txtcidade = new JTextField();
        txtestado = new JTextField();
        txtrg = new JTextField();
        txtCPF = new JTextField();

        masc = new JRadioButton("Masculino");
        femi = new JRadioButton("Feminino");
        outro = new JRadioButton("Outro");

        sex = new ButtonGroup();


        abrir = new JButton("Abrir");
        gravar = new JButton("Gravar");
        limpar = new JButton("Limpar");

        lista = new JComboBox(estados);



        try{
            mascaracel = new MaskFormatter("(##)#####-####");
            mascaratel = new MaskFormatter("(##)####-####");
            mascaradatan = new MaskFormatter("##/##/####");
            mascaracep = new MaskFormatter("#####-###");
            mascaracel.setPlaceholderCharacter('_');
            mascaratel.setPlaceholderCharacter('_');
            mascaradatan.setPlaceholderCharacter('_');
            mascaracep.setPlaceholderCharacter('_');

        } catch(ParseException excp){}

        txtcelular = new JFormattedTextField(mascaracel);
        txttelefone = new JFormattedTextField(mascaratel);
        txtnascimento = new JFormattedTextField(mascaradatan);
        txtcep = new JFormattedTextField(mascaracep);

    }

    public void inserirnatela(){

        Font font = new Font("Arial", Font.BOLD, 12);

        Container tela = getContentPane();
        setLayout(null);

        nome.setBounds(40,10,50,20);
        tela.add(nome);
        nome.setFont(font);
        txtnome.setBounds(80,10,350,20);
        tela.add(txtnome);

        email.setBounds(460,10,50,20);
        tela.add(email);
        txtemail.setBounds(500,10,450,20);
        tela.add(txtemail);

        sexo.setBounds(40,45,50,20);
        tela.add(sexo);

        masc.setBounds(80, 45, 90, 20);
        tela.add(masc);

        femi.setBounds(170, 45, 90, 20);
        tela.add(femi);

        outro.setBounds(260, 45, 90, 20);
        tela.add(outro);

        ddd1.setBounds(400,45,50,20);
        tela.add(ddd1);
        txtddd1.setBounds(440,45,30,20);
        tela.add(txtddd1);

        telefone.setBounds(480,45,60,20);
        tela.add(telefone);
        txttelefone.setBounds(540,45,80,20);
        tela.add(txttelefone);

        ddd2.setBounds(650,45,50,20);
        tela.add(ddd2);
        txtddd2.setBounds(690,45,30,20);
        tela.add(txtddd2);

        celular.setBounds(730,45,60,20);
        tela.add(celular);
        txtcelular.setBounds(780,45,80,20);
        tela.add(txtcelular);

        endereco.setBounds(40,80,70,20);
        tela.add(endereco);
        txtendereco.setBounds(100,80,740,20);
        tela.add(txtendereco);

        num.setBounds(850,80,30,20);
        tela.add(num);
        txtnum.setBounds(870,80,80,20);
        tela.add(txtnum);

        bairro.setBounds(180,115,50,20);
        tela.add(bairro);
        txtbairro.setBounds(230,115,300,20);
        tela.add(txtbairro);

        complemento.setBounds(560,115,100,20);
        tela.add(complemento);
        txtcomplemento.setBounds(650,115,300,20);
        tela.add(txtcomplemento);

        cep.setBounds(95,150,30,20);
        tela.add(cep);
        txtcep.setBounds(130,150,100,20);
        tela.add(txtcep);

        cidade.setBounds(240,150,50,20);
        tela.add(cidade);
        txtcidade.setBounds(290,150,300,20);
        tela.add(txtcidade);

        estado.setBounds(600,150,50,20);
        tela.add(estado);
        lista.setBounds(650,150,300,20);
        tela.add(lista);

        rg.setBounds(240,185,30,20);
        tela.add(rg);
        txtrg.setBounds(265,185,100,20);
        tela.add(txtrg);

        CPF.setBounds(375,185,30,20);
        tela.add(CPF);
        txtCPF.setBounds(405,185,100,20);
        tela.add(txtCPF);

        nascimento.setBounds(520,185,130,20);
        tela.add(nascimento);
        txtnascimento.setBounds(640,185,70,20);
        tela.add(txtnascimento);

        abrir.setBounds(325,220,80,30);
        tela.add(abrir);
        gravar.setBounds(425,220,80,30);
        tela.add(gravar);
        limpar.setBounds(525,220,80,30);
        tela.add(limpar);

        sex.add(masc);
        sex.add(femi);
        sex.add(outro);

    }

    public void botoes() {

        limpar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txtnome.setText("");
                txtemail.setText("");
                txtddd1.setText("");
                txttelefone.setText("");
                txtddd2.setText("");
                txtcelular.setText("");
                txtendereco.setText("");
                txtnum.setText("");
                txtbairro.setText("");
                txtcomplemento.setText("");
                txtcep.setText("");
                txtcidade.setText("");
                txtestado.setText("");
                txtrg.setText("");
                txtCPF.setText("");
                txtnascimento.setText("");

            }

        });

        gravar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                if(txtcep.getText().isEmpty() || txtcep.getText().equals("")) {


                    JOptionPane.showMessageDialog(null, "Digite o cep");



                }else {

                try {

                    out = new PrintWriter("Formulario " + txtcep.getText() + ".txt");



                        out.println(txtnome.getText());
                        out.println(txtemail.getText());
                        out.println(txtddd1.getText());
                        out.println(txttelefone.getText());
                        out.println(txtddd2.getText());
                        out.println(txtcelular.getText());
                        out.println(txtendereco.getText());
                        out.println(txtnum.getText());
                        out.println(txtbairro.getText());
                        out.println(txtcomplemento.getText());
                        out.println(txtcep.getText());
                        out.println(txtcidade.getText());
                        out.println(txtrg.getText());
                        out.println(txtCPF.getText());
                        out.println(txtnascimento.getText());

                        out.close();

                        JOptionPane.showMessageDialog(null, "O FORMULARIO FOI REGISTRADO");

                    } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }


            }

        }

    });
}

}
