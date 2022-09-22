package transporte;

public class AtletaTO {

	private int codigo;
	private String nome;
	private int peso;
	private double altura;

	public AtletaTO(int codigo, String nome, int peso, double altura) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	public AtletaTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "AtletaTO [codigo=" + codigo + ", nome=" + nome + ", peso=" + peso + ", altura=" + altura + "]";
	}

}
