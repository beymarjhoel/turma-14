package lista6;

public class ObjetoProdutoEletronico {

	public static void main(String args[]) {
		
		ProdutoEletronico produto1 = new ProdutoEletronico();
		
		produto1.capacidadeMb = 32;
		produto1.linha = "Playstation";
		produto1.marca = "Sony Computer Entertainment";
		produto1.modelo = "Playstation 2";
		produto1.preco = 300.00;
		
		System.out.print("Modelo: " + produto1.modelo + "\n");
		System.out.print("Marca: " + produto1.marca + "\n");
		System.out.print("Linha: " + produto1.linha + "\n");
		System.out.print("Memória: " + produto1.capacidadeMb + "\n");
		
		produto1.ligar();
		
	}
	
}
