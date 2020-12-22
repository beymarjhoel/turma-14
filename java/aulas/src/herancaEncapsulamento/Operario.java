package herancaEncapsulamento;

public class Operario extends Pessoa {
	private double valorProducao; 
	private double comissao;
	
	public Operario() {
		
	}
	
	public Operario(String nome, String endereco, String telefone, double valorProducao, double comissao) {
		super(nome, endereco, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public double calculoSalario(double valorProducao, double comissao) {
		double salarioFinal = 0;

		comissao = comissao / 100;
		salarioFinal = valorProducao + (comissao * valorProducao);   
		
		return salarioFinal;
	}
	
	public double getValorProducao() {
		return valorProducao;
	}
	
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	
	public double getComissao() {
		return comissao;
	}
	
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}