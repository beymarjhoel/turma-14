package herancaPolimorfismo;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
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
