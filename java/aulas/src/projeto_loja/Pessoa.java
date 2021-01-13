package projeto_loja;

public abstract class Pessoa {
	private String nome;
	private char genero;
	private int anoNascimento;

	public Pessoa(String nome, char genero, int anoNascimento) {
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public int voltaIdade() {
		if (this.anoNascimento <= 1900) {
			System.out.println("Dados inválidos..");
			return 0;
		} else {
			return 2020 - this.anoNascimento;
		}
	}
	
}
