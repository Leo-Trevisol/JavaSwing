package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import model.AtletaModel;
import transporte.AtletaTO;
import transporte.DataTable;
import view.AtletaFRM;



public class AtletaController {
	
	private AtletaFRM atletafrm;
	private AtletaModel atletamodel;
	private AtletaTO atletato;
	
	
	public AtletaController(AtletaFRM atletafrm, AtletaModel atletamodel) {
		super();
		this.atletafrm = atletafrm;
		this.atletamodel = atletamodel;
		
		this.atletafrm.addSalvarListener(new AtletaSalvarListener());
		this.atletafrm.addConsultarListener(new AtletaConsultarListener());
		this.atletafrm.addNovoListener(new AtletaNovoListener());
		this.atletafrm.addDeletarListener(new AtletaDeletarListener());
		this.atletafrm.addLimparListener(new AtletaLimparListener());
		this.atletafrm.addSairListener(new AtletaSairListener());
		
	}


	public AtletaController() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	 class AtletaSalvarListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int codigo = 0 ;
			String nome = "";
			int peso = 0;
			double altura = 0.0;
			char op;
			
			try {
				codigo = atletafrm.getCodigo();
				nome = atletafrm.getNome();
				peso = atletafrm.getPeso();
				altura = atletafrm.getAltura();
				
				atletato = new AtletaTO();
				
				
				
				atletato.setCodigo(codigo);
				atletato.setNome(nome);
				atletato.setPeso(peso);
				atletato.setAltura(altura);
				
				op = atletafrm.getOper();
				
				if(op == 'I') {
					atletamodel.insere(atletato);
				}else {
					atletamodel.atualiza(atletato);
				}
				
				atletafrm.limpaTela();
			
			}catch(Exception ex ) {
				ex.printStackTrace();
			}
			
		}

			
		}
	 
class AtletaNovoListener implements ActionListener {
		 
		 @Override
			public void actionPerformed(ActionEvent e) {
			 
			 atletafrm.setCodigo(0);
			 atletafrm.setNome("");
			 atletafrm.setPeso(0);
			 atletafrm.setAltura(0);
			 
			 
		 }
		 
		 
	 }


class AtletaConsultarListener implements ActionListener{
	 
	 @Override
		public void actionPerformed(ActionEvent e) {
		 
		 DataTable atletasTable = null;
		 
		 String consultaSql = "select * from atletas order by nome";
		 
		 try {
			 atletafrm.mostraComponentes(false);
			 atletasTable = atletamodel.consulta(consultaSql);
			 atletafrm.exibe_tabela(atletasTable);
		 }catch(Exception ex ) {
			 ex.printStackTrace();
		 }
		 
		 
		 
	 }
}


class AtletaDeletarListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int codigo = 0;
		try {
			if(atletafrm.confirmaexclusao() ==0) {
				codigo = atletafrm.getCodigo();
				atletamodel.deleta(codigo);
				atletafrm.limpaTela();
				
			}
		}catch(Exception ex ) {
			ex.printStackTrace();
		}
		
		
	}
	 
	 
}

class AtletaLimparListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		atletafrm.limpaTela();
	}
	}

class AtletaSairListener implements ActionListener{

@Override
public void actionPerformed(ActionEvent e) {
	
	System.exit(0);
	
}
}
	
	
}
