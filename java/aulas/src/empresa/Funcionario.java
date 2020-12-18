package empresa;

public class Funcionario {

	private String nome;
	private int horasMensais;
	private double valorHora;
	
	//CONSTRUTORES
	public Funcionario(String nome, int horasMensais, double valorHora) {
		super();	//super é a classe anterior
		this.nome = nome;
		this.horasMensais = horasMensais;
		this.valorHora = valorHora;
	}
	
	//GETTERS AND SETTERS	ENCAPSULAMENTO
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasMensais() {
		return horasMensais;
	}

	public void setHorasMensais(int horasMensais) {
		this.horasMensais = horasMensais;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	//MÉTODO
	public double pagamentoSalario() {		
		return (this.horasMensais + this.valorHora);
	}
	
}
