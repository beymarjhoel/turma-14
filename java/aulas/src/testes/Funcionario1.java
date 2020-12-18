package testes;

public class Funcionario1 extends Pessoa {

	private String departamento;
	
	public Funcionario1(String nome, int matricula, String departamento) {
		super(nome, matricula); 	//traz da superclasse
		this.departamento = departamento;	//já estava aqui
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
}
