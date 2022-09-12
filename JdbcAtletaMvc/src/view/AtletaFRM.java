
package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
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
            mascaAltura = new MaskFormatter("#.##");
        }catch(Exception e) {}
        fdAltura = new JFormattedTextField(mascaAltura);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTit.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        labelTit.setText("ATLETAS IMC");

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNome.setText("NOME:");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCodigo.setText("C�DIGO:");

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
    }
    


    
	public int confirmaexclusao() {
		
		int conf = 0;
		Object[] options = {"SIM", "N�O"};
		conf = JOptionPane.showOptionDialog(null,
					"Confirma a Exclus�o?",
					"Confirma��o",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options,
					options[0]); 
		
		return conf;
		
	}
    
   
   
    	public void exibe_tabela(DataTable dadosTable){
    		
    		
    		dataModel = new DefaultTableModel(dadosTable.getDados(), dadosTable.getTitulos());
    		
    		if(dataModel != null){
    			tab = new JTable(dataModel);			
    			tab.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    			sp = new JScrollPane( tab );
    			this.getContentPane().add(sp);
    			sp.setBounds(90,50,500,300);
    			tab.addKeyListener(new KeyAdapter(){//Tabela "Escuta" o ESC e � ocultada
    				@Override
    				public void keyPressed(KeyEvent e) {  
    					if(e.getKeyCode()==27){ //tecla 27 � o ESC
    						 sp.setVisible(false);
    						 mostraComponentes(true);					
    					}
    				}
    			});
    			
    	
    			ListSelectionModel cel = tab.getSelectionModel();
    			
    			cel.addListSelectionListener(new ListSelectionListener() {
    			    public void valueChanged(ListSelectionEvent e) {
    			        //Ignore extra messages.
    			       if (e.getValueIsAdjusting()) return;
    			
    			       ListSelectionModel lsm = (ListSelectionModel) e.getSource();
    			       if (!lsm.isSelectionEmpty()) {
    			          int selectedRow = tab.getSelectedRow();
    			          int selectedCol = tab.getSelectedColumn();
    			          
    			  		  String cod = (String) ""+tab.getValueAt(selectedRow,0);
    			  		  int aux_cod = Integer.parseInt(cod);
    			  		  
    					  String nome = (String) tab.getValueAt(selectedRow,1);
    					  
    					  String peso = (String) ""+tab.getValueAt(selectedRow,2);
    			  		  int aux_peso = Integer.parseInt(peso);
    			  		  
    					
    					  double altura = (double) tab.getValueAt(selectedRow,3);
    					  
    					  setCodigo(aux_cod);
    					  setNome(nome);
    					  setPeso(aux_peso);
    					  setAltura(altura);
    					  
    					  
    					  tab.clearSelection();
      				      sp.setVisible(false);
       				      
      				      oper = 'A';
      				      mostraComponentes(true);
	    	
    	    	}
    	    	
    	    }
        });    
    	
    	
    }
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
    
    
    public char getOper() {
		return oper;
	}
    
 
    
    public void limpaTela(){
		fdCodigo.setText("");
		fdNome.setText("");
		fdPeso.setText("");
		fdAltura.setText("");
		fdNome.requestFocus();
	}
    
    public int getCodigo() {
    	
    	return  Integer.parseInt(fdCodigo.getText());
    	
    }
    
    public void setCodigo(int codigo) {
    	fdCodigo.setText(Integer.toString(codigo));
    }
    
   public String getNome() {
    	
    	return fdNome.getText().toString();
    	
    }
    
    public void setNome(String nome) {
    	fdNome.setText(nome);
    }
    
   public int getPeso() {
    	
    	return Integer.parseInt(fdPeso.getText().toString());
    	
    }
    
    public void setPeso(int peso) {
    	fdPeso.setText(Integer.toString(peso));
    }
    
   public double getAltura() {
    	
    	return Double.parseDouble(fdAltura.getText().toString());
    	
    }
    
    public void setAltura(double altura) {

    	
    	fdAltura.setText(Double.toString(altura));
    }
    
    
    public void addSalvarListener(ActionListener listenForGravarButton) {
		btSalvar.addActionListener(listenForGravarButton);
	}	
	public void addConsultarListener(ActionListener listenForConsultarButton) {
		btConsultar.addActionListener(listenForConsultarButton);
	}
	public void addNovoListener(ActionListener listenForNovoButton) {
		btNovo.addActionListener(listenForNovoButton);
		oper = 'I';
	}
	public void addDeletarListener(ActionListener listenForDeletarButton) {
		btExcluir.addActionListener(listenForDeletarButton);
	}
	public void addSairListener(ActionListener listenForSairButton) {
		btSair.addActionListener(listenForSairButton);
	}
	
	public void addLimparListener(ActionListener listenForLimparButton) {
		btLimpar.addActionListener(listenForLimparButton);
	}
	
	   public boolean confereCampos() {
	    	

			if( fdNome.getText().equals("") 
					|| fdPeso.getText().equals("") || fdAltura.getText().equals("")) {
				 
				
				return true;
			}
	    	
	    
	    return false;
	}
	   
	
}
