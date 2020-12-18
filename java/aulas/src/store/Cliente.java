package store;

public class Cliente extends Pessoa {
	
	private String cpf;

	//Construtor
	public Cliente(String cpf) {
		super();
		this.cpf = cpf;
	}
	
	//Getters and Setters
	public String getCpf() {
		return cpf;
	}

	//Método
	public void corrigeCpf(String novoCpf) {
		this.cpf = novoCpf;
	}
	
	
}