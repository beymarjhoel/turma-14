package lista6;

public class ObjetoAviao {
	
	public static void main(String args[]) {
		
		Aviao aviao1 = new Aviao();
		
		aviao1.qtdPassageiros = 215;
		aviao1.paisOrigem = "Estados Unidos";
		aviao1.fabricante = "Boeing";
		aviao1.cor = "Branco";
		aviao1.peso = 65.990;
		aviao1.modelo = "737";
		aviao1.nome = "Boeing 737";
		aviao1.velocidadeMaxima = 840;
		
		
		
		System.out.print("Nome: " + aviao1.nome + "\n");
		System.out.print("Modelo: " + aviao1.modelo + "\n");
		System.out.print("Fabricante: " + aviao1.fabricante + "\n");
		System.out.print("Cor: " + aviao1.cor + "\n");
		System.out.print("Peso: " + aviao1.peso + "\n");
		System.out.print("País de origem: " + aviao1.paisOrigem + "\n");
		System.out.print("Quantidade de passageiros: " + aviao1.qtdPassageiros + "\n");
		System.out.print("Velocidade máxima: " + aviao1.velocidadeMaxima);
		
		aviao1.decolar();
	}
	
}
