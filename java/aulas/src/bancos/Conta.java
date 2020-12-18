package bancos;

public abstract class Conta {
	//ATRIBUTOS
	private int numeroConta;	//tem
	private double saldo;	//tem
	private String cpf;		//tem

	//CONSTRUTORES - REGRA DE CRIA��O DA CLASSE
	//PEDREIRO E M�O DE OBRA
	//public Conta() {	//CONSTRUTOR PADR�O - B�SICO - MINIMO//CONSTRUTOR TEM O MESMO NOME DA CLASSE
		
	//}
	
	//CONSTRUTOR QUE PEDE APENAS O NUMERO DA CONTA
	public Conta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	//CONSTRUTOR QUE PEDE NUMERO DA CONTA E CPF
	public Conta(int numeroConta, String cpf) {
		this.numeroConta = numeroConta;
		this.cpf = cpf;
	}
	
	//ENCAPSULAMENTO
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	//M�TODOS - A��ES
	public void debito(double valorDebito) {
		
		if (testarSaldo(valorDebito)) {	//s� faz quando � true, se o valor q quer debitar � menor doq tem TRUE
			this.saldo = this.saldo - valorDebito;	
		} else {						//SE VC QUER TIRAR MAIS DOQ TEM, DA FALSE
			System.out.println("SALDO INDISPON�VEL");
		}
		
	}

	public void credito(double valorCredito) {
		this.saldo = this.saldo + valorCredito;
	}
	
	public void pixDebito(double valorDebitoPix) {
		this.saldo = this.saldo - valorDebitoPix;
	}
	
	public void pixCredito(double valorCreditoPix) {
		this.saldo = this.saldo + valorCreditoPix;
	}
	
	public void trocaNumero(int novoNumero) {
		this.numeroConta = novoNumero;
	}
	//maybe this, because the 'valor'
	public boolean testarSaldo(double valor) {
		
		boolean teste;	//cria variavel de teste
		
		if (valor <= this.saldo) {	//o valor q esta digitando � menor ou igual ao seu saldo?
			teste = true;	//� possivel
		} else {
			teste = false;	//valor menor, false
		}
		
		return teste;	//retorna o teste com true ou false, pode fazer retornar texto
	}
	
}
