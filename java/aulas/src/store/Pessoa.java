package store;

public abstract class Pessoa {

	private String nome;
	private char genero; 
	private int anoNascimento;
	
	public Pessoa() {
		
	}
 	//Para criar uma classe pessoa, é necessário um NOME, GENERO e ANONASCIMENTO
	public Pessoa(String nome, char genero, int anoNascimento) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
	}
	//Getters and Setters
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

	public void setDataNascimento(int anoNascimento) {
		this.anoNascimento = this.anoNascimento;
	}
	
	//Métodos
	public int voltaIdade() {
		
		if( this.anoNascimento <= 1900) {
			System.out.println("Dados inválidos..");
			return 0;
		} else {
			return 2020 - this.anoNascimento;
		}
		
	}
	//vc precisa inserir o ano atual, vc espera RECEBER O ANO ATUAL
	public int voltaIdade(int anoAtual) {
		if (anoAtual == 0 || this.anoNascimento <= 1900) {
			System.out.println("Ano atual inválido!");
			return 0;
		} else {
			return anoAtual - this.anoNascimento;
		}
	}
}
