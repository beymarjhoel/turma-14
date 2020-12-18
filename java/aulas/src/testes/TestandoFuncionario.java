package testes;

public class TestandoFuncionario {

	public static void main(String args[]) {
		
		Funcionario func = new Funcionario();
		
		func.setNome("Antônia");	//set atribui as informações
		func.setSalario(2500);
									//get para mostrar
		System.out.println(func.getNome());
		System.out.println(func.getSalario());
	
	
	
	}
	
}
