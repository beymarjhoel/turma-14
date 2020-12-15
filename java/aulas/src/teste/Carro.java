package teste;

public class Carro {

	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	void liga() {
		System.out.println("O CARRO ESTÁ LIGADO");
	}
	//THIS SIGNIFICA ATRIBUTO DA CLASSE PRINCIPAL
	void acelera(double quantidade) {
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	
	int pegaMarcha() {
		if(this.velocidadeAtual < 0) {
			return -1;
		} 
		
		if(this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
			return 1;
		}
		
		if(this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			return 2;
		}
		//CASO N SEJA NENHUM DESSES IF RETORNE 3
		return 3;
	}
	
}
