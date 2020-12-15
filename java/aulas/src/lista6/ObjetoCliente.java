package lista6;

public class ObjetoCliente {

	public static void main(String args[]) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.nomeCompleto = "Beymar Jhoel Acapa Lima";
		cliente1.bairro = "Serra da Prata";
		cliente1.dataNascimento = 1999;
		cliente1.endereco = "Vila Granada";
		cliente1.genero = 'M';
		cliente1.telefone = "40028922";

		System.out.println("Dados do cliente: \n");
		cliente1.falar();
		System.out.print("Nome completo: " + cliente1.nomeCompleto + "\n");
		System.out.print("Idade: " + (2020 - cliente1.dataNascimento) + "\n");
		System.out.print("Bairro: " + cliente1.bairro + "\n");
		System.out.print("Endereço: " + cliente1.endereco + "\n");
		System.out.print("Gênero: " + cliente1.genero + "\n");
		System.out.print("Número de telefone: " + cliente1.telefone);
		
		
		
	}
	
}
