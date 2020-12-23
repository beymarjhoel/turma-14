package herancaPolimorfismo;

public class Preguica extends Animal {

	public Preguica() {
		
	}
	
	public Preguica(String nome, int idade) {
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
	
	public String subirArvores(char estaSubindo) {
		if (estaSubindo == 'S') {
			return "est� subindo em �rvores";
		} else if (estaSubindo == 'N'){
			return "n�o est� em nenhuma �rvore";
		} else {
			return "indenifido..";
		}
	}
	
}
