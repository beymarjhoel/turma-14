package poo_teste;

public class Caneta {

	String modelo;
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
		
	}
	
	void rabiscar() {
		if(this.tampada == true) {
			System.out.println("Erro, não posso rabiscar..");
		} else {
			System.out.println("Estou rabiscando..");
		}
	}
	
	void tampar() {
		//quase como se fosse c1.tampada = true, this é uma referencia ao objeto que o chamou
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}
	
}
