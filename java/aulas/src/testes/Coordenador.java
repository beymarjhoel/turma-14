package testes;

public class Coordenador extends Pessoa {
	private String cursoCoordenado;	//atributo exclusivo 


	public Coordenador(String nome, int matricula, String cursoCoordenado) {
		super(nome, matricula);
		this.cursoCoordenado = cursoCoordenado;
	}


	public String getCursoCoordenado() {
		return cursoCoordenado;
	}


	public void setCursoCoordenado(String cursoCoordenado) {
		this.cursoCoordenado = cursoCoordenado;
	}
	
	
}
