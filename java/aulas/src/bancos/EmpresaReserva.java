package bancos;

public class EmpresaReserva extends Conta {

	private double emprestimoEmpresa;

	/*public ContaEmpresa(int numeroConta, double emprestimoEmpresa) {
		super(numeroConta);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}*/
	//ContaEmpresa no lugar de EmpresaReserva, construtor
	public EmpresaReserva(int numeroConta, String cpf, double emprestimoEmpresa) {
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
		
		this.emprestimoEmpresa = this.emprestimoEmpresa - valor; //vc ta tirando o debito do valor emprestimo
		
	}
	/*
	@Override
	public boolean testarSaldo(double valor) {
		
		boolean teste;
		
		if (valor <= super.getSaldo()) {							
			teste = true;	
		} else if(valor <= (this.emprestimoEmpresa + super.getSaldo())) {		
			double valorCredito = valor - super.getSaldo();
			super.credito(valorCredito);
			this.emprestimoEmpresa = this.emprestimoEmpresa - valorCredito;										//testar limite		
			teste = true;											
		} else {
			teste = false;
		}
		
		return teste;	
	}
	*/
}
