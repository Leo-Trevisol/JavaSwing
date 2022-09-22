package view;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import dao.AtletaDAO;
import transporte.AtletaTO;
import transporte.DataTable;

@SuppressWarnings("serial")
public class ImcFRM extends JInternalFrame {

	AtletaDAO atletadao = new AtletaDAO();
	
	private JLabel txtTit, txtIMC;
	private JComboBox comboIMC;
	private JButton btConsultar;
	private DefaultTableModel dataModel;
	private JScrollPane sp;
	private JTable tab;
	private String imcValue;
	private String imcDefault;

	public ImcFRM() {

		initComponents();
		setVisible(true);
		this.setResizable(false);

	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		txtTit = new JLabel();
		txtIMC = new JLabel();
		comboIMC = new JComboBox<>();
		tab = new JTable();
		sp = new JScrollPane();
		btConsultar = new JButton();
		setImcDefault("peso / (altura*altura)");
		imcValue = "";

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		txtTit.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
		txtTit.setText("IMC DOS ATLETAS");

		txtIMC.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		txtIMC.setText("Selecione o tipo de IMC que deseja consultar:");

		btConsultar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		btConsultar.setText("Consultar");

		comboIMC.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		comboIMC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abaixo do peso", "Peso ideal",
				"Levemente acima do peso", "Obesidade", "Obesidade severa", "Obesidade m�rbida", " " }));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(121, 121, 121).addComponent(txtTit,
								javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(144, 144, 144)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(layout.createSequentialGroup()
												.addComponent(comboIMC, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btConsultar))
										.addComponent(txtIMC))))
				.addContainerGap(129, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(txtTit, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(txtIMC)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(comboIMC, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btConsultar))
						.addContainerGap(311, Short.MAX_VALUE)));
		
		

		pack();

	}

	@SuppressWarnings("unchecked")
	public void exibe_tabelaIMC(){

		String cmdSql;
		 cmdSql = "select * from atletas where " + getImcDefault()  +  "" + getImcValue() + " order by codigo";

		//mostraComponentes(false);
		DataTable dt = atletadao.consultaTableModel(cmdSql);
		dataModel = new DefaultTableModel(dt.getDados(), dt.getTitulos());
		
		tab = new JTable(dataModel);
	   	sp = new JScrollPane(tab);//
		this.getContentPane().add(sp);
	   	sp.setBounds(15,170,600,275);
	   	sp.setVisible(true);
	 
		
	
   	DefaultTableCellRenderer tableCellRenderer = new DefaultTableCellRenderer(){
   	  

   	    public Component getTableCellRendererComponent(JTable table,
   	            Object value, boolean isSelected, boolean hasFocus, int row, int column) {
   	    	
   	        return super.getTableCellRendererComponent(table, value, isSelected,
   	                hasFocus, row, column);
   	    }
   	};

    
        
		ListSelectionModel cel = tab.getSelectionModel();
		cel.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				ListSelectionModel lsm = (ListSelectionModel) e.getSource();
			


					//sp.setVisible(false);
					tab.clearSelection();
					//mostraComponentes(true);
					
				

				}

		});
		
	tab.getColumnModel().getColumn(3).setCellRenderer(tableCellRenderer);
    	
    	

	
		
	}
	

	public void mostraComponentes(boolean mostra) {

		txtTit.setVisible(mostra);
		txtIMC.setVisible(mostra);
		comboIMC.setVisible(mostra);
		btConsultar.setVisible(mostra);

	}
	

	public void addConsultarListener(ActionListener listenForConsultarButton) {
		btConsultar.addActionListener(listenForConsultarButton);
	}

	@SuppressWarnings("rawtypes")
	public ComboBoxModel getItemSelected() {
		
		return comboIMC.getModel();
		
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void setItemSelected(ComboBoxModel item) {
		
		comboIMC.setModel(item);
		
	}
	
	public String getImcValue() {
		return imcValue;
	}

	public void setImcValue(String imc) {
		
		imcValue = imc;
	}
	
	public String getImcDefault() {
		
		return imcDefault;
		
	}
	
	public void setImcDefault(String defaultValue) {
		
		imcDefault = defaultValue;
		
	}

}
