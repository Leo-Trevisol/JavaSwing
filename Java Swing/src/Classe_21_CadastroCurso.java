import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public  class Classe_21_CadastroCurso extends JFrame {


    private JLabel   	 lblTituloDados, lblTituloCurso, lblNome, lblCpf, lblSexo, lblDataNasc, lblEstadoCivil, lblEndereco, lblBairro, lblCidade, lblTelefone,lblNomeFeito, lblTurno, lblFezCurso, lblQuantFeito, lblAno, lblQualCurso;
    private JTextField tfNome, tfCpf, tfDataNasc, tfEndereco, tfBairro, tfCidade, tfTelefone, tfCursoFeito, tfQuantFeito, tfQualCurso;
    private JComboBox     cbSexo, cbEstadoCivil, cbTurno, cbFezCurso, cbAno;
    private JButton   	 btnAbrir, btnGravar, btnLimpar;

    public static void main(String args[]) {

        JFrame frame = new Classe_21_CadastroCurso();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        frame.setVisible(true);
    }

    public Classe_21_CadastroCurso() {

        iniciarComponentes();
        layoutTela();
        addComponentes();
        acoes();
    }
    public void iniciarComponentes() {
        lblTituloDados  = new JLabel("Dados Pessoais");
        lblTituloCurso  = new JLabel("Dados do Curso");

        lblCpf  = new JLabel("Cpf");
        lblNome  = new JLabel("Nome");
        lblSexo    	 = new JLabel("Sexo");
        lblDataNasc     = new JLabel("Data Nascimento");
        lblEstadoCivil     = new JLabel("Estado Civil");
        lblEndereco     = new JLabel("Endereco");
        lblBairro    	 = new JLabel("Bairro");
        lblCidade    	 = new JLabel("Cidade");
        lblTelefone     = new JLabel("Telefone");
        lblNomeFeito    = new JLabel("Nome");
        lblTurno    	 = new JLabel("Turno");
        lblFezCurso     = new JLabel("Ja fez curso na UTD ?");
        lblQuantFeito     = new JLabel("Quantos fez");
        lblAno   		 = new JLabel("Em que Ano fez");
        lblQualCurso     = new JLabel("Qual o curso ?");

        tfCpf    		 = new JTextField();
        tfNome    		 = new JTextField();
        tfDataNasc    	 = new JTextField();
        tfEndereco    	 = new JTextField();
        tfBairro    	 = new JTextField();
        tfCidade    	 = new JTextField();
        tfTelefone    	 = new JTextField();
        tfCursoFeito     = new JTextField();
        tfQuantFeito    = new JTextField();
        tfQualCurso     = new JTextField();

        btnAbrir    	 = new JButton("Abrir");
        btnGravar    	 = new JButton("Gravar");
        btnLimpar    	 = new JButton("Limpar");

        cbSexo = new JComboBox();
        cbSexo.addItem("Masculino");
        cbSexo.addItem("Feminino");
        cbSexo.setEditable(false);
        cbSexo.setSelectedIndex(0);

        cbEstadoCivil = new JComboBox();
        cbEstadoCivil.addItem("Solteiro");
        cbEstadoCivil.addItem("Casado");
        cbEstadoCivil.addItem("Viuvo");
        cbEstadoCivil.setEditable(false);
        cbEstadoCivil.setSelectedIndex(0);

        cbTurno = new JComboBox();
        cbTurno.addItem("Manha");
        cbTurno.addItem("Tarde");
        cbTurno.addItem("Noite");
        cbTurno.setEditable(false);
        cbTurno.setSelectedIndex(0);

        cbFezCurso = new JComboBox();
        cbFezCurso.addItem("Sim");
        cbFezCurso.addItem("Nao");
        cbFezCurso.setEditable(false);
        cbFezCurso.setSelectedIndex(0);

        cbAno = new JComboBox();
        cbAno.addItem("2017");
        cbAno.addItem("2016");
        cbAno.addItem("2015");
        cbAno.addItem("2014");
        cbAno.addItem("2013");
        cbAno.setEditable(false);
        cbAno.setSelectedIndex(0);

    }//fim iniciarComponentes

    public void layoutTela() {
        setTitle("Cadastro de Alunos");
        setBounds(250, 50, 700, 400);

        lblTituloDados.setFont(new Font("Arial", Font.BOLD, 40));
        lblTituloDados.setForeground(Color.blue);
        lblTituloDados.setBounds(10, 10, 300, 20);

        lblCpf.setBounds(20, 35, 50, 20);
        tfCpf.setBounds(80, 35, 90, 20);

        lblNome.setBounds(20, 60, 45, 20);
        tfNome.setBounds(80, 60, 400, 20);

        lblSexo.setBounds(20, 85, 45, 20);
        cbSexo.setBounds(80, 85, 100, 20);

        lblDataNasc.setBounds(240, 85, 140, 20);
        tfDataNasc.setBounds(380, 85, 70, 20);

        lblEstadoCivil.setBounds(470, 85, 100, 20);
        cbEstadoCivil.setBounds(560, 85, 100, 20);

        lblEndereco.setBounds(20, 110, 60, 20);
        tfEndereco.setBounds(80, 110, 400, 20);

        lblBairro.setBounds(20, 135, 60, 20);
        tfBairro.setBounds(80, 135, 400, 20);

        lblCidade.setBounds(20, 160, 60, 20);
        tfCidade.setBounds(80, 160, 200, 20);

        lblTelefone.setBounds(330, 160, 140, 20);
        tfTelefone.setBounds(400, 160, 100, 20);

        lblTituloCurso.setFont(new Font("Arial", Font.BOLD, 20));
        lblTituloCurso.setForeground(Color.blue);
        lblTituloCurso.setBounds(15, 200, 300, 20);

        lblNomeFeito.setBounds(20, 225, 60, 20);
        tfCursoFeito.setBounds(80, 225, 245, 20);

        lblTurno.setBounds(345, 225, 60, 20);
        cbTurno.setBounds(390, 225, 90, 20);

        lblFezCurso.setBounds(20, 250, 150, 20);
        cbFezCurso.setBounds(170, 250, 70, 20);

        lblQuantFeito.setBounds(300, 250, 140, 20);
        tfQuantFeito.setBounds(390, 250, 30, 20);

        lblAno.setBounds(470, 250, 140, 20);
        cbAno.setBounds(585, 250, 70, 20);

        lblQualCurso.setBounds(20, 275, 140, 20);
        tfQualCurso.setBounds(160, 275, 300, 20);

        btnAbrir.setBounds(170, 330, 85, 30);
        btnGravar.setBounds(270, 330, 85, 30);
        btnLimpar.setBounds(370, 330, 85, 30);

    }// fim layoutTela

    public void addComponentes() {

        add(lblTituloCurso);
        add(lblTituloCurso);
        add(lblCpf);
        add(lblNome);
        add(lblSexo);
        add(lblDataNasc);
        add(lblEstadoCivil);
        add(lblEndereco);
        add(lblBairro);
        add(lblCidade);
        add(lblTelefone);
        add(lblNomeFeito);
        add(lblTurno);
        add(lblFezCurso);
        add(lblQuantFeito);
        add(lblAno);
        add(lblQualCurso);


        add(tfCpf);
        add(tfNome);
        add(tfDataNasc);
        add(tfEndereco);
        add(tfBairro);
        add(tfCidade);
        add(tfTelefone);
        add(tfCursoFeito);
        add(tfQuantFeito);
        add(tfQualCurso);

        add(cbSexo);
        add(cbEstadoCivil);
        add(cbTurno);
        add(cbFezCurso);
        add(cbAno);

        add(btnAbrir);
        add(btnGravar);
        add(btnLimpar);
    }// fim addComponentes

    public void acoes() {
        btnGravar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (tfCpf.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "O CPF nao pode esta vazio!");
                    tfCpf.requestFocus();

                } else if (tfNome.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "O Nome nao pode esta vazio!");
                    tfNome.requestFocus();

                } else if (tfDataNasc.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencher a Data de Nascimento");
                    tfNome.requestFocus();

                } else {

                    try {

                        PrintWriter out = new PrintWriter("Ficha_" + tfCpf.getText() + ".txt");


                        out.println(tfCpf.getText());
                        out.println(tfNome.getText());
                        out.println(tfDataNasc.getText());
                        out.println(tfEndereco.getText());
                        out.println(tfBairro.getText());
                        out.println(tfCidade.getText());
                        out.println(tfTelefone.getText());
                        out.println(tfCursoFeito.getText());
                        out.println(tfQuantFeito.getText());
                        out.println(tfQualCurso.getText());

                        out.println(cbSexo.getSelectedItem());
                        out.println(cbEstadoCivil.getSelectedItem());
                        out.println(cbTurno.getSelectedItem());
                        out.println(cbFezCurso.getSelectedItem());
                        out.println(cbAno.getSelectedItem());

                        out.close();
                        JOptionPane.showMessageDialog(null, "Arquivo Gravado com Sucesso!");

                    } catch (IOException Erro) {
                        JOptionPane.showMessageDialog(null, "Erro ao Gravar no Arquivo" + Erro);
                    }
                }
            }
        });

        btnAbrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                try {
                    String arquivo = JOptionPane.showInputDialog(null, "Infome o Cpf para abrir:");

                    BufferedReader br = new BufferedReader(new FileReader("Ficha_" + arquivo + ".txt"));

                    tfCpf.setText(br.readLine());
                    tfNome.setText(br.readLine());
                    tfDataNasc.setText(br.readLine());
                    tfEndereco.setText(br.readLine());
                    tfBairro.setText(br.readLine());
                    tfCidade.setText(br.readLine());
                    tfTelefone.setText(br.readLine());
                    tfCursoFeito.setText(br.readLine());
                    tfQuantFeito.setText(br.readLine());
                    tfQualCurso.setText(br.readLine());

                    cbSexo.setSelectedItem(br.readLine());
                    cbEstadoCivil.setSelectedItem(br.readLine());
                    cbTurno.setSelectedItem(br.readLine());
                    cbFezCurso.setSelectedItem(br.readLine());
                    cbAno.setSelectedItem(br.readLine());

                } catch (IOException Erro) {
                    JOptionPane.showMessageDialog(null, Erro);

                }
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                tfCpf.setText("");
                tfNome.setText("");
                tfDataNasc.setText("");
                tfEndereco.setText("");
                tfBairro.setText("");
                tfCidade.setText("");
                tfTelefone.setText("");
                tfCursoFeito.setText("");
                tfQuantFeito.setText("");
                tfQualCurso.setText("");

                cbSexo.setSelectedIndex(0);
                cbEstadoCivil.setSelectedIndex(0);
                cbTurno.setSelectedIndex(0);
                cbFezCurso.setSelectedIndex(0);
                cbAno.setSelectedIndex(0);

            }
        });
    }

}






