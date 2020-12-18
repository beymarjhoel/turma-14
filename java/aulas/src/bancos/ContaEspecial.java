package bancos;

public class ContaEspecial extends ContaCorrente {
	
	private double valorLimite;
	private double valorCadastroLimite;	//vc n mexe nele, fica fixo.

	//ENCAPSULAMENTO
	public ContaEspecial(int numeroConta, double valorLimite) {
		super(numeroConta);
		this.valorLimite = valorLimite;
		this.valorCadastroLimite = valorCadastroLimite;
	}
	
	public ContaEspecial(int numeroConta, double valorLimite, double valorCadastroLimite) {
		super(numeroConta);
		this.valorLimite = valorLimite;
		this.valorCadastroLimite = valorCadastroLimite;
	}

	public double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	
	@Override
	public boolean testarSaldo(double valor) {
		
		boolean teste;
		
		if (valor <= super.getSaldo()) {							//conta especial tem o fator limite
			teste = true;	//é possivel							//faz isso para puxar o limite
		} else if(valor <= valorLimite + super.getSaldo()) {		//"LIMITE DÁ"
			
			//novoValor = 0.00;
			
			double valorCredito = valor - super.getSaldo();
			super.credito(valorCredito);
			this.valorLimite = this.valorLimite - valorCredito;										//testar limite		
			teste = true;											//valor menor, false
		} else {
			teste = false;
		}
		
		return teste;	//retorna o teste com true ou false, pode fazer retornar texto
	}
	
	public void registrarLimite() {
		
		if (valorLimite <= 0) {
			System.out.println("VALOR ZERADO, IMPOSSÍVEL REALIZAR..");
		} else {	//se for menor, realiza
			this.valorCadastroLimite = this.valorLimite;
		}
		
	}
	
	public void devolverLimite() {
		if (this.valorLimite < this.valorCadastroLimite) {
			
			double diferenca;
			diferenca = this.valorCadastroLimite - this.valorLimite;
			super.debito(diferenca);
			this.valorLimite += diferenca;
		}
	}
	
}
