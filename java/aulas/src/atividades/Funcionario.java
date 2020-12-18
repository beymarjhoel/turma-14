package atividades;

public class Funcionario {

	private String nome;
	private int horasMensais;
	private double valorHora;
	
	//MÉTODO
	public Funcionario(String nome, int horasMensais, double valorHora) {
		super();
		this.nome = nome;
		this.horasMensais = horasMensais;
		this.valorHora = valorHora;
	}
	
	//GETTERS AND SETTERS
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
	public double pagamentoSalario(double pagamentoSalario) {
		pagamentoSalario = this.horasMensais + this.valorHora;
		
		return pagamentoSalario;
	}
	
}
