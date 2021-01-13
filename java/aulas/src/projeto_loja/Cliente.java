package projeto_loja;

public class Cliente extends Pessoa {
	private String cpf;
	
	public Cliente(String nome, char genero, int anoNascimento, String cpf) {
		super(nome, genero, anoNascimento);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
	
	public String corrigeCpf(String novoCpf) {
		this.cpf = novoCpf;
		return cpf;
	}

}
