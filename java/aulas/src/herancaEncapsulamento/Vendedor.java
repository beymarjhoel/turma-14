package herancaEncapsulamento;

public class Vendedor extends Pessoa {

	private double valorVendas;
	private double comissao;
	
	public Vendedor() {
		
	}
	
	public Vendedor(String nome, String endereco, String telefone, double valorVendas, double comissao) {
		super(nome, endereco, telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	public double calculoSalario(double valorVendas, double comissao) {
		double salarioFinal = 0;

		comissao = comissao / 100;
		salarioFinal = valorVendas + (comissao * valorVendas);   
		
		return salarioFinal;
	}
	
	public double getValorVendas() {
		return valorVendas;
	}
	
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	public double getComissao() {
		return comissao;
	}
	
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
