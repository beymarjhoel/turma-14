package _dragon_platinum_;

public class Pessoa {
	
	private String nome;
	private char genero;
	private int anoNascimento;
					
	public Pessoa() {
		
	}
	
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
	
	public int voltaIdade(int anoAtual) {
		return anoAtual - this.anoNascimento;
	}
	
}
