package apresentacao;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
public class imcFRM extends JInternalFrame {

	AtletaDAO atletadao = new AtletaDAO();
	private JLabel txtTit, txtIMC;
	private JComboBox comboIMC;
	private JButton btConsultar;
	private DefaultTableModel dataModel;
	private JScrollPane sp;
	private JTable tab;
	private String imcValue;
	private String imcDefault;

	public imcFRM() {

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
		imcDefault = "peso / (altura*altura)";
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
				"Levemente acima do peso", "Obesidade", "Obesidade severa", "Obesidade mórbida", " " }));

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

		btConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AtletaFRM atleta = new AtletaFRM();

			

				switch (consultaAtletas()) {

				case 1:
						imcValue = "< 18.5";
						
					break;

				case 2:

					imcValue = "> 18.5 and " + imcDefault + "<24.9";
				
					break;
				case 3:
					
					imcValue = "> 25.0 and " + imcDefault + "<29.9";

					
					break;
				case 4:
					imcValue = "> 30.0 and " + imcDefault + "<34.9";

				
					break;
				case 5:
					imcValue = ">35.0 and " + imcDefault + "<39.9";
				
					break;
					
				case 6:
					imcValue = "> 40";
				
					break;
				}
				
				exibe_tabelaIMC();

			}
		});

	}

	public int consultaAtletas() {
		if (comboIMC.getModel().getSelectedItem().equals("Abaixo do peso")) {

			return 1;

		} else if (comboIMC.getModel().getSelectedItem().equals("Peso ideal")) {
			return 2;

		} else if (comboIMC.getModel().getSelectedItem().equals("Levemente acima do peso")) {

			return 3;

		} else if (comboIMC.getModel().getSelectedItem().equals("Obesidade")) {

			return 4;

		} else if (comboIMC.getModel().getSelectedItem().equals("Obesidade severa")) {

			return 5;

		} else if (comboIMC.getModel().getSelectedItem().equals("Obesidade mórbida")) {

			return 6;

		}
		
		return 0;
		
		
	}

	public void exibe_tabelaIMC() {

		
		String cmdSql;
		 cmdSql = "select * from atletasbd where " + imcDefault  +  "" + imcValue + " order by codigo";

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

    
        
		ListSelectionModel cel = tab.getSelectionModel();
		cel.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				ListSelectionModel lsm = (ListSelectionModel) e.getSource();
			


					sp.setVisible(false);
					tab.clearSelection();
					mostraComponentes(true);
					
				

				}

		});
		
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
	

	}

	public void mostraComponentes(boolean mostra) {

		txtTit.setVisible(mostra);
		txtIMC.setVisible(mostra);
		comboIMC.setVisible(mostra);
		btConsultar.setVisible(mostra);

	}
	
	public void apaga() {
		
	}





}
