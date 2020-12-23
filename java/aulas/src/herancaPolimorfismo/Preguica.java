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
			return "está emitindo som";
		} else if (estaEmitindoSom == 'N'){
			return "não está emitindo som..";
		} else {
			return "indefinido..";
		}
	}
	
	public String subirArvores(char estaSubindo) {
		if (estaSubindo == 'S') {
			return "está subindo em árvores";
		} else if (estaSubindo == 'N'){
			return "não está em nenhuma árvore";
		} else {
			return "indenifido..";
		}
	}
	
}
