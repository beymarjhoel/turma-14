package herancaEncapsulamento;

public class TesteFornecedor {

	public static void main(String args[]) {

		Fornecedor f1 = new Fornecedor("Fábio", "Rua Josefa Vera Garcia", "(11) 4002-8922", 8000.0, 3000.0);

		System.out.println("------ DADOS DO FORNECEDOR ------");
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Endereço: " + f1.getEndereco());
		System.out.println("Telefone: " + f1.getTelefone());
		System.out.println("Valor Crédito: R$" + f1.getValorCredito());
		System.out.println("Valor Divida: R$" + f1.getValorDivida());
		System.out.println("Saldo: R$" + f1.obterSaldo(f1.getValorCredito(), f1.getValorDivida()));

	}

}
