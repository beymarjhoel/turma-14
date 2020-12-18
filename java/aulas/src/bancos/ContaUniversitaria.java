package bancos;

public class ContaUniversitaria extends ContaEspecial {

	private double emprestimoUniversitario;

	public ContaUniversitaria(int numeroConta, double valorLimite, double emprestimoUniversitario) {
		super(numeroConta, valorLimite);
		this.emprestimoUniversitario = emprestimoUniversitario;
	}

	public double getEmprestimoUniversitario() {
		return emprestimoUniversitario;
	}

	public void setEmprestimoUniversitario(double emprestimoUniversitario) {
		this.emprestimoUniversitario = emprestimoUniversitario;
	}	
	
}