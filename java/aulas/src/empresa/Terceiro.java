package empresa;

public class Terceiro extends Funcionario {	//subclasse de funcionario 

	private double valorTerceiro;
	
	//CONSTRUTOR	COMO SABER QUAL É UM CONSTRUTOR? CONSTRUTOR USA O MESMO NOME DA CLASSE
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

	//MÉTODO
	@Override
	public double pagamentoSalario() {		
		return ((super.getHorasMensais() + super.getValorHora())) + this.getValorTerceiro();
	}
	
}