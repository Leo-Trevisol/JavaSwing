package view;

import java.awt.*;
import java.awt.event.*;  
import java.awt.Container;
import java.awt.event.ActionEvent;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


import controller.AtletaController;
import controller.ImcController;
import model.AtletaModel;


public class MenuPrincipalFRM extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JMenuBar menuBar;
	
	private JMenu menuCadastros = new JMenu("Cadastro");
	
	private JMenuItem menuItemAtletas = new JMenuItem("Atletas");
	
	private JMenuItem sairItem = new JMenuItem("Sair");
	
	private JMenuItem imc = new JMenuItem("IMC");
	
	private JDesktopPane desktop;
	
	AtletaFRM atletafrm = new AtletaFRM();
	ImcFRM imcfrm = new ImcFRM();
	
	public MenuPrincipalFRM() {
		super("SENAC-RS");
		Container conteudo = getContentPane();
		conteudo.setLayout(null);
		
		//CRIANDO A BARRA DE MENUS
		
		menuBar = new JMenuBar(); // CRIA A BARRA DE MENU
		
		setJMenuBar(menuBar); //POSICIONA A BARRA DE MENU
		
		menuCadastros.add(menuItemAtletas);
		
		menuCadastros.addSeparator();
		
		menuCadastros.add(sairItem);
		
		
		menuCadastros.add(imc);
		
		
		menuBar.add(menuCadastros);
		
		menuBar.add(sairItem);
		
		menuItemAtletas.addActionListener(this); // 
		sairItem.addActionListener(this);
		imc.addActionListener(this);
		
		int inset = 50;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		desktop = new JDesktopPane();
		setContentPane(desktop);
		desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
		desktop.setBackground(Color.BLACK);
		
		setSize(screenSize.width, screenSize.height);
		setVisible(true);
		desktop.add(atletafrm);
		desktop.add(imcfrm);
		atletafrm.setVisible(false);
		imcfrm.setVisible(false);
		
	}
	
	@Override
	public void actionPerformed (ActionEvent evt) {
		Object src = evt.getSource();
		
		if(src == menuItemAtletas) {
			createFrame(1);
			
		}
		
		if(src == imc) {
			createFrame(2);
		}
		
		if(src == sairItem) {
			System.exit(0);
		}
	}
	
	protected void createFrame(int opcao) {
		
		Dimension desktopSize;
		Dimension jInternalFrameSize;
		
		switch(opcao) {
		
		case 1:
			atletafrm.setVisible(true);
			AtletaModel atletamodel = new AtletaModel();
			AtletaController atletaController = new AtletaController(atletafrm, atletamodel);
			imcfrm.setVisible(false);
			
			
			desktopSize = desktop.getSize();
			jInternalFrameSize = atletafrm.getSize();
			atletafrm.setLocation((desktopSize.width - jInternalFrameSize.width) /2,
			(desktopSize.height - jInternalFrameSize.height) /2-50);
			
			try {
				atletafrm.setSelected(true);
				
			}catch(java.beans.PropertyVetoException e) {
				e.printStackTrace();
				
			}
			break;
			
		case 2 :
			imcfrm.setVisible(true);
			atletafrm.setVisible(false);
			ImcController imcControler = new ImcController(imcfrm);
			desktopSize = desktop.getSize();
			jInternalFrameSize = imcfrm.getSize();
			imcfrm.setLocation((desktopSize.width - jInternalFrameSize.width) /2,
			(desktopSize.height - jInternalFrameSize.height) /2-50);
			
			try {
				imcfrm.setSelected(true);
				
			}catch(java.beans.PropertyVetoException e) {
				e.printStackTrace();
				
			}
			break;
			
			
			
			
			
			
			
			
			
			}
		
	}
	
	
	
	

}
