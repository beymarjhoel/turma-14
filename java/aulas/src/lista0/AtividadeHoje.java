package exemplos;

import java.util.Scanner;

public class AtividadeHoje {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		//Declara��o de vetores
		int matricula;
		int pesquisa = 0;	
		
		String alunos[] = { "Allen de Lima Vieira", "Andr� de Brito Silva da Costa","B�rbara Liboni Guerra",	
							"Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli",
							"Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva",
							"Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira",
							"Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco Jos� Pires",
							"Gabriel S�rgio Nascimento Santos Gon�alves", "Gide�o da Silva Idelfonso",
							"GILSON AMORIM DE MATOS","Guilherme Gon�alves da Silva","Gustavo Rabelo Teles",
							"HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama",
							"Jackeline Akemi de Moura","Jos� Jorge Hauck J�nior","Juliana Santos Andr�",
							"K�lven Cleiton de Ara�jo Brand�o","La�s Lima Santos","Lucas anseloni barros",
							"Lucas Gon�alves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalh�es",
							"Marcos Eduardo Gomes Gon�alves","Micaely da Silva Lima","Rafaela Oliveira Silva",
							"Tiago dos Santos Martins","Ver�nica Navarro Almenara","Vinicius Alves Miranda", "Gabriel Enrique Cabral Silva"};

		char sexoAlunos[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F',
							 'F','M','F','M','F','M','M','M','M','M','F','F','M','F','M','M'};
		
		double notas[] = new double[40];
		
		int matriculas[] = new int[40];
		//Vari�vel para pegar Aluno ou Aluna
		String auxiliar;
		//La�o para matricula come�ar com 1
		for(int contador = 0; contador < 40; contador++) {
			matriculas[contador] = contador + 1;
		}
		inseriLinha(80,"=");
		System.out.println("MAT\tTIPO\tNOME");
		inseriLinha(80,"=");
		//La�o para exibir os dados a cima
		for(int kc = 0; kc < 40; kc++) {
			//Condicional para auxiliar receber aluno ou aluna
			if(sexoAlunos[kc] == 'M') {
				auxiliar = "Aluno";
			} else {
				auxiliar = "Aluna";
			}
			
			System.out.printf("%d \t%s \t%s\n",matriculas[kc],auxiliar,alunos[kc]);	
		}
	
		inseriLinha(60,"=");
		System.out.print("Digite a matricula do aluno para incluir nota: ");
		matricula = scan.nextInt();
		for (int indice = 0; indice < 40; indice++) {	//varrer o vetor
			if(matriculas[indice] == matricula) {
				pesquisa = indice;
			}
		}
		
		System.out.println("Foi escolhido:");
		System.out.printf("%d \t%s \n",matriculas[pesquisa],alunos[pesquisa]);	
		System.out.print("Digite notas: ");
		notas[pesquisa] = scan.nextDouble();
		
		inseriLinha(80,"=");
		System.out.println("MAT\tTIPO\tNOME");
		inseriLinha(80,"=");
		//La�o para exibir os dados a cima
		for(int kc = 0; kc < 40; kc++) {
			//Condicional para auxiliar receber aluno ou aluna
			if(sexoAlunos[kc] == 'M') {
				auxiliar = "Aluno";
			} else {
				auxiliar = "Aluna";
			}
			
			System.out.printf("%d \t%s \t%.2f \t%s \n",matriculas[kc],auxiliar,notas[kc],alunos[kc]);	
		}
	
		
	}
	
	public static void inseriLinha(int tamanho, String simbolo) {
		for (int i = 0; i < tamanho; i++) {
			System.out.print(simbolo);
		}
		System.out.println();
	}
	
}
