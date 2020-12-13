package exemplos;

import java.util.Scanner;

public class AtividadeHoje {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		//Declaração de vetores
		int matricula;
		int pesquisa = 0;	
		
		String alunos[] = { "Allen de Lima Vieira", "André de Brito Silva da Costa","Bárbara Liboni Guerra",	
							"Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli",
							"Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva",
							"Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira",
							"Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires",
							"Gabriel Sérgio Nascimento Santos Gonçalves", "Gideão da Silva Idelfonso",
							"GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
							"HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama",
							"Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André",
							"Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros",
							"Lucas Gonçalves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalhães",
							"Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva",
							"Tiago dos Santos Martins","Verônica Navarro Almenara","Vinicius Alves Miranda", "Gabriel Enrique Cabral Silva"};

		char sexoAlunos[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F',
							 'F','M','F','M','F','M','M','M','M','M','F','F','M','F','M','M'};
		
		double notas[] = new double[40];
		
		int matriculas[] = new int[40];
		//Variável para pegar Aluno ou Aluna
		String auxiliar;
		//Laço para matricula começar com 1
		for(int contador = 0; contador < 40; contador++) {
			matriculas[contador] = contador + 1;
		}
		inseriLinha(80,"=");
		System.out.println("MAT\tTIPO\tNOME");
		inseriLinha(80,"=");
		//Laço para exibir os dados a cima
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
		//Laço para exibir os dados a cima
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
