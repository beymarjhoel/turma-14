package herancaEncapsulamento;

public class Fornecedor extends Pessoa {

	private double valorCredito; 
	private double valorDivida;  

	public Fornecedor() {
		
	}
	
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public double obterSaldo(double valorCredito, double valorDivida) {

		if (this.getValorCredito() > this.getValorDivida()) {
			return this.getValorCredito() - this.getValorDivida();
		} else {
			return this.getValorDivida() - this.getValorCredito();
		}

	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

}
