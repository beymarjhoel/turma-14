package bancos;

public class Conta {
	
	public int numeroConta;
	public double saldo;
	public String cpf;

	//CONSTRUTOR QUE PEDE APENAS O NUMERO DA CONTA
	public Conta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	//CONSTRUTOR QUE PEDE NUMERO DA CONTA E CPF
	public Conta(int numeroConta, String cpf) {
		this.numeroConta = numeroConta;
		this.cpf = cpf;
	}
}
