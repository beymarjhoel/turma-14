package poo_teste2;

public class Caneta {

	public String modelo;
	public String cor;
	private double ponta;
	protected int carga;
	private boolean tampada;
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
		
	}
	
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("Erro, não posso rabiscar..");
		} else {
			System.out.println("Estou rabiscando..");
		}
	}
	
	public void tampar() {
		//quase como se fosse c1.tampada = true, this é uma referencia ao objeto que o chamou
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
}
