package bancos;
//EXTENDEU A CLASSE CONTA PARA CONTAPOUPANCA COM TUDO Q A CLASSE CONTA TEM 
public class ContaPoupanca extends Conta {
	
	private int dataAniversarioConta;

	
	//CONSTRUTOR
	public ContaPoupanca(int numeroConta, String cpf, int dataAniversarioConta) {
		super(numeroConta, cpf);
		this.dataAniversarioConta = dataAniversarioConta;
	}

	//GETTERS AND SETTERS
	public int getDataAniversarioConta() {
		return dataAniversarioConta;
	}


	public void setDataAniversarioConta(int dataAniversarioConta) {
		this.dataAniversarioConta = dataAniversarioConta;
	}
	
}
