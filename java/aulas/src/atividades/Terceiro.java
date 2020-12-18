package atividades;

public class Terceiro extends Funcionario {	//subclasse de funcionario 

	private double valorTerceiro;
	
	//CONSTRUTOR
	public Terceiro(String nome, int horasMensais, double valorHora, double valorTerceiro) {
		super(nome, horasMensais, valorHora);
		this.valorTerceiro = valorTerceiro;
	}

	//GETTERS AND SETTERS
	public double getValorTerceiro() {
		return valorTerceiro;
	}


	public void setValorTerceiro(double valorTerceiro) {
		this.valorTerceiro = valorTerceiro;
	}


	@Override
	public double pagamentoSalario(double pagamentoSalario) {
		pagamentoSalario = this.getHorasMensais() + this.getValorHora() + this.getValorTerceiro();
		
		return pagamentoSalario;
	}
	
	
	
}