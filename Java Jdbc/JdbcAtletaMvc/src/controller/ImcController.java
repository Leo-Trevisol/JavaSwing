package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.AtletaModel;
import transporte.DataTable;
import view.ImcFRM;

public class ImcController {
	
	private ImcFRM imcfrm;
	private AtletaModel atletamodel;
	
	
	public ImcController(ImcFRM imcfrm) {
		super();
		this.imcfrm = imcfrm;
	
		this.imcfrm.addConsultarListener(new ImcConsultarListener());
	}
	

	public ImcController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int consultaAtletas() {
		if (imcfrm.getItemSelected().getSelectedItem().equals("Abaixo do peso")) {

			return 1;

		} else if (imcfrm.getItemSelected().getSelectedItem().equals("Peso ideal")) {
			return 2;

		} else if (imcfrm.getItemSelected().getSelectedItem().equals("Levemente acima do peso")) {

			return 3;

		} else if (imcfrm.getItemSelected().getSelectedItem().equals("Obesidade")) {

			return 4;

		} else if (imcfrm.getItemSelected().getSelectedItem().equals("Obesidade severa")) {

			return 5;

		} else if (imcfrm.getItemSelected().getSelectedItem().equals("Obesidade m�rbida")) {

			return 6;

		}
		
		return 0;
		
		
	}
	
	
	class ImcConsultarListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			switch (consultaAtletas()) {
			case 1:
					imcfrm.setImcValue("< 18.5");
				break;
			case 2:
				imcfrm.setImcValue("> 18.5 and " + imcfrm.getImcDefault() + "<24.9");
				break;
			case 3:
				imcfrm.setImcValue("> 25.0 and " + imcfrm.getImcDefault() + "<29.9");
				break;
			case 4:
				imcfrm.setImcValue("> 30.0 and " + imcfrm.getImcDefault() + "<34.9");
				break;
			case 5:
				imcfrm.setImcValue(">35.0 and " + imcfrm.getImcDefault() + "<39.9");
				break;
			case 6:
				imcfrm.setImcValue("> 40");
				break;
			}
		
			
			 
				 imcfrm.exibe_tabelaIMC();
		
			 
			
		}

		
					
	}

}
