
package apresentacao;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.Component;
import java.awt.Component.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.text.MaskFormatter;

import dao.AtletaDAO;

import transporte.AtletaTO;
import transporte.DataTable;



@SuppressWarnings("serial")
public class AtletaFRM extends JInternalFrame {
	
	private AtletaDAO atletadao;
	private char oper = 'I';
	private JScrollPane sp;
	private JTable tab;
	private DefaultTableModel dataModel;
	

    private JButton btConsultar, btExcluir, btNovo, btSair, btSalvar, btLimpar;
   
    private JLabel  txtCodigo, txtPeso, txtNome, txtAltura, labelTit;
    private JTextField fdPeso, fdCodigo,  fdNome;
    
    JFormattedTextField fdAltura;
    MaskFormatter mascaAltura;
   
    private List<Double> peso = new ArrayList<>();
    private List<Double> altura = new ArrayList<>();
    
   

    public AtletaFRM() {
    	
    	
    	
    	
    	initComponents();
      
        //setLayout(null);
        setVisible(true);
       this.setResizable(false);
     
       
    }
    
   

    @SuppressWarnings("unchecked")
    private void initComponents() {
    	
    	atletadao = new AtletaDAO();
    	
    	

        labelTit = new JLabel();
        txtNome = new JLabel();
        txtCodigo = new JLabel();
        txtPeso = new JLabel();
        txtAltura = new JLabel();
        fdCodigo = new JTextField();
        fdNome = new JTextField();
       
        fdPeso = new JTextField();
      
        btSair = new JButton();
        btNovo = new JButton();
        btConsultar = new JButton();
        btExcluir = new JButton();
        btLimpar = new JButton();
        btSalvar = new JButton();
       
    
        try{
            mascaAltura = new MaskFormatter("#.#");
        }catch(Exception e) {}
        fdAltura = new JFormattedTextField(mascaAltura);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTit.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        labelTit.setText("ATLETAS IMC");

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNome.setText("NOME:");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCodigo.setText("CÓDIGO:");

        txtPeso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPeso.setText("PESO:");

        txtAltura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAltura.setText("ALTURA:");

      
        btSair.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btSair.setText("SAIR");

        btNovo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btNovo.setText("NOVO");

        btConsultar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btConsultar.setText("CONSULTAR");

        btExcluir.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btExcluir.setText("EXCLUIR");

        btLimpar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btLimpar.setText("LIMPAR");

        btSalvar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btSalvar.setText("SALVAR");
       fdCodigo.setEditable(false);
    	

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(labelTit, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fdPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fdAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSair)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

      

        pack();
    

       
        btSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.exit(0);
            }
        });
        
        btNovo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	limpaTela();
            }

	
        });
        
        btConsultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	exibe_tabela();
            }
        });
        
        btSalvar.addActionListener(new ActionListener()  {
            public void actionPerformed(ActionEvent e) {
            	
            	if(confereCampos()) {
            	
            		JOptionPane.showInternalMessageDialog(null,"CAMPOS VAZIOS "
        					+ "TENTE NOVAMENTE");
            
            	
            }else {
            	
            	try {
            		
            	
            	
            	AtletaTO atleta = getDadosTela();
            	if(oper == 'I') {
            		atletadao.insere(atleta);  
            		
            	}
            	else {
            		atletadao.atualiza(atleta);
            	}
            	
            	limpaTela();
            }catch(NumberFormatException a ) {
            	if(fdCodigo !=null || !fdCodigo.equals("")) {
                	JOptionPane.showInternalMessageDialog(null,"O PESO DEVE SER INTEIRO");

            	}
            }
            	
           
            } 	
            }
        });
        
        btExcluir.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		
        		
        		int conf = 0;
        		
        		if(confereCampos()) {
        			
        			JOptionPane.showInternalMessageDialog(null,"CAMPOS VAZIOS "
        					+ "TENTE NOVAMENTE");
        			fdNome.requestFocus();
        	
        		}else {
        			Object[] options = {"SIM", "NÃO"};
            		conf = JOptionPane.showOptionDialog(null, "Confirmar a exclusão", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            		if(conf == 0) {
            			AtletaTO atleta = getDadosTela();
            			atletadao.excluir(atleta.getCodigo());
            			limpaTela();
            		}
        			
        			
        		}
        		
        	}
        	
        	
        });;
        
        btLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	limpaTela();
            }
        });
        
    }
    public void limpaTela() {    	
    	fdCodigo.setText("");
    	fdNome.setText("");
    	fdPeso.setText("");
    	fdAltura.setText("");    	
    	fdNome.requestFocus();
    	oper = 'I';
    }

 
    public AtletaTO getDadosTela() {
    	AtletaTO atletato = new AtletaTO();
    	
    	int codigo;
    	String nome;
    	int peso;
    	double altura;
    	
    	
    

    	// codigo = Integer.parseInt(fdCodigo.getText());
    
    	nome = fdNome.getText();
    	peso = Integer.parseInt(fdPeso.getText());
    	altura = Double.parseDouble(fdAltura.getText() );
    	
    	
    	atletato.setCodigo(atletato.getCodigo());
    	atletato.setNome(nome);
    	atletato.setPeso(peso);
    	atletato.setAltura(altura);
    	
    	return atletato;
    }
    
   
    public void exibe_tabela() {

    	String cmdSql;
    	cmdSql= "select * from atletasbd order by codigo";    	
    	   	
    	mostraComponentes(false);
    	 DataTable dt = atletadao.consultaTableModel(cmdSql);   
    	 dataModel = new DefaultTableModel(dt.getDados(), dt.getTitulos());
    	 
    	
    	tab = new JTable(dataModel);
    	sp = new JScrollPane(tab);//
    	this.getContentPane().add(sp);
    	sp.setBounds(15,15,600,350);
    	
    	DefaultTableCellRenderer tableCellRenderer = new DefaultTableCellRenderer(){
    	  

    	    public Component getTableCellRendererComponent(JTable table,
    	            Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    	    	
    	        return super.getTableCellRendererComponent(table, value, isSelected,
    	                hasFocus, row, column);
    	    }
    	};

    	tab.getColumnModel().getColumn(3).setCellRenderer(tableCellRenderer);
    	
    	
    	tab.addKeyListener(new KeyListener() {
    		@Override
    		public void keyPressed(KeyEvent e) {
    			if(e.getKeyCode()==27) {
    				sp.setVisible(false);
    				mostraComponentes(true);
    			}
    		}

			@Override
			public void keyTyped(KeyEvent e) {			
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}
    	});
    	
    	ListSelectionModel cel = tab.getSelectionModel(); 
    	cel.addListSelectionListener(new ListSelectionListener() {       
    		public void valueChanged(ListSelectionEvent e) {
    	    	ListSelectionModel lsm = (ListSelectionModel) e.getSource();
    	    	if (!lsm.isSelectionEmpty()) {
    	    		int linha = tab.getSelectedRow();
    	    		int col = tab.getSelectedColumn();
    	    		
    	    		int cod = Integer.parseInt(""+tab.getValueAt(linha, 0));
    	    		
    	    		String consulta = ("Select * from atletasbd where codigo = " + cod +";");
    	    		AtletaTO atleta = atletadao.consulta(consulta).get(0);
    	    		
    	    		oper = 'A';
    	    		setFieldsAtletas(atleta);   
    	    		sp.setVisible(false);
	    	        tab.clearSelection();
	    	        mostraComponentes(true);
	    	       
	    	
    	    	}
    	    	
    	    }
        });    
    	
    	
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
   	public DefaultTableModel consultaDados(String cmdSql) {
       	DefaultTableModel dataModel = null;
       	

       	Vector titulos = new Vector();
       	titulos.add("Codigo");
       	titulos.add("Nome");
       	titulos.add("Peso");
       	titulos.add("Altura");
       	
       	Vector dados = new Vector();    	
       	
   		Vector linha;
   		
   		try {
   			atletadao = new AtletaDAO();
   			
   			List<AtletaTO> retorno = atletadao.consulta(cmdSql);
   			AtletaTO atleta;

   			for( int i = 0; i < retorno.size(); i++ ) {
   				linha = new Vector();
   				
   				atleta = retorno.get(i);
   				linha.add(atleta.getCodigo());
   				linha.add(atleta.getNome());
   				linha.add(atleta.getPeso());
   				linha.add(atleta.getAltura());
   				
   				dados.add(linha);

   			}
   			
   			
 
   		}catch(Exception e) {
   			e.printStackTrace();
   		}

       	dataModel = new DefaultTableModel(dados, titulos);    	
       	
       	return dataModel;    	
       }
    
    
    
    
    public void mostraComponentes(boolean mostra) {
    	
    	btConsultar.setVisible(mostra); 
    	btExcluir.setVisible(mostra);
    	btNovo.setVisible(mostra);
    	btSair.setVisible(mostra); 
    	btSalvar.setVisible(mostra);
    	btLimpar.setVisible(mostra);
    	
    
    	
    	fdCodigo.setVisible(mostra);
    	fdNome.setVisible(mostra);
    	fdPeso.setVisible(mostra);
    	fdAltura.setVisible(mostra);
    	
        txtCodigo.setVisible(mostra);
        txtNome.setVisible(mostra);
        txtPeso.setVisible(mostra);
        txtAltura.setVisible(mostra);
        
        labelTit.setVisible(mostra);
        
        
    	
    }
    
    
    public void setFieldsAtletas(AtletaTO atleta) {
    	
        fdCodigo.setText(String.valueOf(atleta.getCodigo()));
        fdPeso.setText(String.valueOf(atleta.getPeso()));
        fdNome.setText(atleta.getNome());
        fdAltura.setText(String.valueOf(atleta.getAltura()));
     
    }
    
    public boolean confereCampos() {
    	

		if( fdNome.getText().equals("") 
				|| fdPeso.getText().equals("") || fdAltura.getText().equals("")) {
			 
			
			return true;
		}
    	
    
    return false;
   
  
}
}
