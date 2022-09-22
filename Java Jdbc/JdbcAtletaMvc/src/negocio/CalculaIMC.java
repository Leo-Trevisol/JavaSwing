package negocio;

import java.util.List;

import transporte.AtletaTO;

public class CalculaIMC {
	
	private List<AtletaTO> abaixo;
	private List<AtletaTO> ideal;
	private List<AtletaTO> acima;
	private List<AtletaTO> obeso;
	private List<AtletaTO> severa;
	private List<AtletaTO> morbido;
	
	public CalculaIMC() {
		
	}

	public List<AtletaTO> getAbaixo() {
		return abaixo;
	}

	public void setAbaixo(List<AtletaTO> abaixo) {
		this.abaixo = abaixo;
	}

	public List<AtletaTO> getIdeal() {
		return ideal;
	}

	public void setIdeal(List<AtletaTO> ideal) {
		this.ideal = ideal;
	}

	public List<AtletaTO> getAcima() {
		return acima;
	}

	public void setAcima(List<AtletaTO> acima) {
		this.acima = acima;
	}

	public List<AtletaTO> getObeso() {
		return obeso;
	}

	public void setObeso(List<AtletaTO> obeso) {
		this.obeso = obeso;
	}

	public List<AtletaTO> getSevera() {
		return severa;
	}

	public void setSevera(List<AtletaTO> severa) {
		this.severa = severa;
	}

	public List<AtletaTO> getMorbido() {
		return morbido;
	}

	public void setMorbido(List<AtletaTO> morbido) {
		this.morbido = morbido;
	}
	
	public double calculaIMC(double peso, double altura) {
		
		double imc = 0;
		
		imc = peso / (altura*altura);
		
		return imc;
		
	}
	
	

}
