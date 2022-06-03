
import java.awt.Container;
import java.awt.Font;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Classe25_Cadastro extends JFrame {
    JFrame frame;
    JLabel nome,email,ddd1,ddd2,telefone,celular,endereco,num,complemento,
            bairro,cep,cidade,estado,rg,CPF,nascimento;
    JTextField txtnome,txtemail,txtddd1,txtddd2,txtendereco,txtnum,txtcomplemento,
            txtbairro,txtcep,txtcidade,txtestado,txtrg,txtCPF;
    JButton abrir,gravar,limpar;
    Container tela;
    JFormattedTextField txtcelular, txttelefone, txtnascimento;
    MaskFormatter mascaracel, mascaratel,mascaradatan;

    public Classe25_Cadastro(){


        inserircomponentes();
        inserirnatela();

        setSize(1050,300);
        setVisible(true);




    }


    public static void main(String[] args) {
        Classe25_Cadastro app = new Classe25_Cadastro();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

    public void inserircomponentes(){

        nome = new JLabel("Nome:");
        email = new JLabel("Email:");
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
        txtcep = new JTextField();
        txtcidade = new JTextField();
        txtestado = new JTextField();
        txtrg = new JTextField();
        txtCPF = new JTextField();

        try{
            mascaracel = new MaskFormatter("(##)#####-####");
            mascaratel = new MaskFormatter("(##)####-####");
            mascaradatan = new MaskFormatter("##/##/####");
            mascaracel.setPlaceholderCharacter('_');
            mascaratel.setPlaceholderCharacter('_');
            mascaradatan.setPlaceholderCharacter('_');
        } catch(ParseException excp){}

        txtcelular = new JFormattedTextField(mascaracel);
        txttelefone = new JFormattedTextField(mascaratel);
        txtnascimento = new JFormattedTextField(mascaradatan);

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

        email.setBounds(480,10,50,20);
        tela.add(email);
        txtemail.setBounds(520,10,450,20);
        tela.add(txtemail);

        ddd1.setBounds(300,45,50,20);
        tela.add(ddd1);
        txtddd1.setBounds(340,45,30,20);
        tela.add(txtddd1);

        telefone.setBounds(380,45,60,20);
        tela.add(telefone);
        txttelefone.setBounds(440,45,90,20);
        tela.add(txttelefone);

        ddd2.setBounds(550,45,50,20);
        tela.add(ddd2);
        txtddd2.setBounds(590,45,30,20);
        tela.add(txtddd2);

        celular.setBounds(630,45,60,20);
        tela.add(celular);
        txtcelular.setBounds(680,45,95,20);
        tela.add(txtcelular);

        endereco.setBounds(40,80,70,20);
        tela.add(endereco);
        txtendereco.setBounds(100,80,700,20);
        tela.add(txtendereco);

        num.setBounds(850,80,30,20);
        tela.add(num);
        txtnum.setBounds(870,80,80,20);
        tela.add(txtnum);

        bairro.setBounds(40,115,50,20);
        tela.add(bairro);
        txtbairro.setBounds(80,115,300,20);
        tela.add(txtbairro);

        complemento.setBounds(400,115,100,20);
        tela.add(complemento);
        txtcomplemento.setBounds(500,115,300,20);
        tela.add(txtcomplemento);

        cep.setBounds(40,150,30,20);
        tela.add(cep);
        txtcep.setBounds(70,150,100,20);
        tela.add(txtcep);

        cidade.setBounds(185,150,50,20);
        tela.add(cidade);
        txtcidade.setBounds(230,150,300,20);
        tela.add(txtcidade);

        estado.setBounds(550,150,50,20);
        tela.add(estado);
        txtestado.setBounds(595,150,300,20);
        tela.add(txtestado);

        rg.setBounds(40,185,30,20);
        tela.add(rg);
        txtrg.setBounds(70,185,100,20);
        tela.add(txtrg);

        CPF.setBounds(180,185,30,20);
        tela.add(CPF);
        txtCPF.setBounds(220,185,100,20);
        tela.add(txtCPF);

        CPF.setBounds(180,185,30,20);
        tela.add(CPF);
        txtCPF.setBounds(220,185,100,20);
        tela.add(txtCPF);

        nascimento.setBounds(340,185,130,20);
        tela.add(nascimento);
        txtnascimento.setBounds(460,185,70,20);
        tela.add(txtnascimento);








    }
}
