//this
package bancos;

public class ContaEmpresa extends Conta {

	private double emprestimoEmpresa;
	
	public ContaEmpresa(int numeroConta, String cpf, double emprestimoEmpresa) {
		super(numeroConta, cpf);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}	
	
	//PEDIR EMPRESTIMO
	public void pediEmprestimo(double valor) {
		super.credito(valor);
		
		this.emprestimoEmpresa = this.emprestimoEmpresa - valor; 
		
	}

}
