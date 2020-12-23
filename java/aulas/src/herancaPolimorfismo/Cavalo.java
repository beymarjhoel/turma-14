package herancaPolimorfismo;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public String emitirSom(char estaEmitindoSom) {
		if (estaEmitindoSom == 'S') {
			return "está emitindo som";
		} else if (estaEmitindoSom == 'N'){
			return "não está emitindo som..";
		} else {
			return "indefinido..";
		}
	}
	
	public String correr(char estaCorrendo) {
		if (estaCorrendo == 'S') {
			return "está correndo";
		} else if (estaCorrendo == 'N'){
			return "não está correndo..";
		} else {
			return "indefinido..";
		}
	}
	
}
