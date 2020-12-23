package herancaPolimorfismo;

public abstract class Animal {

	private String nome;
	private int idade;
	
	public Animal() {
		
	}
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String emitirSom(char estaEmitindoSom) {
		if (estaEmitindoSom == 'S') {
			return "est� emitindo som";
		} else if (estaEmitindoSom == 'N'){
			return "n�o est� emitindo som..";
		} else {
			return "indefinido..";
		}
	}

	public String correr(char estaCorrendo) {
		if (estaCorrendo == 'S') {
			return "est� correndo";
		} else if (estaCorrendo == 'N'){
			return "n�o est� correndo..";
		} else {
			return "indefinido..";
		}
	}
}
