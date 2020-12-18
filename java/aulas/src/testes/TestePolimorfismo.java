package testes;

public class TestePolimorfismo {

	public static void main(String args[]) {
		
		PessoaFisica fisica = new PessoaFisica();
		
		fisica.setNome("Juliana");
		fisica.setCpf(12345678L);	//L pra idnicar q é tipo long
		
		PessoaJuridica juridica = new PessoaJuridica();
		
		juridica.setNome("Cristiano");
		juridica.setCnpj(1231231312L);
		
		Pessoa1[] pessoas = new Pessoa1[2];
		pessoas[0] = fisica;
		pessoas[1] = juridica;
		
		for(Pessoa1 pessoa : pessoas) {	//pessoa é variavel
			System.out.println(pessoa.getNome());
		}
		
		
		
	}
	
}
