
programa
{
	
	funcao inicio()
	{
		// DEClARAÇÃO DE VARIAVEL
		cadeia   alunos[39] = { "Allen de Lima Vieira", "André de Brito Silva da Costa","Bárbara Liboni Guerra",	
						"Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli",
						"Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva",
						"Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira",
						"Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires",
						"Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso",
						"GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
						"HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama",
						"Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André",
						"Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros",
						"Lucas Gonçalves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalhães",
						"Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva",
						"Tiago dos Santos Martins","Verônica Navarro Almenara","Vinicius Alves Miranda" }
		
		caracter sexoAlunos[39] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F',
		'F','M','F','M','F','M','M','M','M','M','F','F','M','F','M'}
		
		cadeia   matriculas[39]
		real     notas[39]
		cadeia   situacao[39]
		cadeia   aluno
		caracter opcao = 's'
		inteiro  salva = 0
		inteiro  painel
		//AJUSTE DE MATRICULA
		para (inteiro x=0; x< 39; x++)
		{
			se(x < 10){
				matriculas[x] = "G4-0"+(x+1)	
			}
			senao{
				matriculas[x] = "G4-"+(x+1)	
			}
		}
		//lOOP PRINCIPAL
		faca
		{
			//PAINEL PRINCIPAL
			linha()
			escreva("                     SISTEMA ESCOLAR")
			linha()
			escreva("              Selecione uma das opções abaixo: ")
			linha()
			escreva("1-Inserir nota de um aluno\n2-Exibir a lista de Homens\n3-Exibir a lista de Mulheres\n")
			escreva("4-Exibir a lista de Aprovados ou Aprovadas\n5-Exibir a lista de Reprovados ou Reprovadas\n")
			escreva("6-Lista por nota\n")
			escreva("Selecione 0 para sair!\n")
			leia(painel)
			
			se(painel==1)
			{
						
				faca
				{
				
					escreva("Escolha um aluno pela matricula:" )
					
					leia(aluno)
				
					para (inteiro x=0; x<39; x++) //molejão
					{
						se(aluno == matriculas[x])
						{
							se(sexoAlunos[x]=='M'){
								escreva("Nome do aluno: "+alunos[x]+"\nInforme a nota do aluno: ")
								leia(notas[x])
								salva=x
								se(notas[x]<=5)
								{
									situacao[x]="REPROVADO"
								}
								senao se(notas[x]>5 e notas[x]<8)
								{
									situacao[x]="RECUPERAÇÃO"	
								}
								senao{
									situacao[x]="APROVADO"	
								}
							}
						senao
						{
								escreva("Nome da aluna: "+alunos[x]+"\nInforme a nota do aluno: ")
								leia(notas[x])
								salva=x
								se(notas[x]<=5)
								{
									situacao[x]="REPROVADA"
								}
								senao se(notas[x]>5 e notas[x]<8)
								{
									situacao[x]="RECUPERAÇÃO"	
								}
								senao{
									situacao[x]="APROVADA"	
								}
								
						}
							
						}
					}
					escreva("Deseja continuar? (S) Sim ou (N) Não\n")
					leia(opcao)
					
				}enquanto(opcao == 'S' ou opcao == 's')
				
				se(opcao == 'N' ou opcao == 'n')
				{
					linha()
					escreva("Matricula: "+matriculas[salva]+"\tNome: "+alunos[salva]+"\tSexo: "+sexoAlunos[salva]+"\tNota:" +notas[salva]+"\tSituação:"+situacao[salva])	
				}	
				
			}//Final da Opcao 1
			
			senao se (painel==2)
			{	
				//GIDEÃO
			}//Final da Opcao 2
			
			senao se (painel==3)
			{
				
			
				//Veronica
			}//Final da Opcao 3
			
			senao se (painel==4)
			{
				//JJ
			}//Final da Opcao 4



			
			senao se (painel==5) {									//BEYMAR	
				escreva("\nLISTA DE REPROVADOS!\n\n")
				para(inteiro kc = 0; kc < 39; kc++) {
					se(situacao[kc] == "REPROVADO" e sexoAlunos[kc] == 'M' ) {
						escreva("\n Matricula" + matriculas[kc]+ "\tNome: "+alunos[kc]+"\tSexo:"+sexoAlunos[kc]+"\n")	
					}
					senao se(situacao[kc] == "REPROVADA" e sexoAlunos[kc] == 'F') {
							escreva("\n Matricula" + matriculas[kc]+ "\tNome: "+alunos[kc]+"\tSexo:"+sexoAlunos[kc]+"\n")
					}
				} 
				
			}//Final da Opcao 5



			
			senao se (painel==6)
			{
				//KELVEN
			}//Final da Opcao 6
				
		}enquanto(painel!=0)//FINAAL DO LOOP PRINCIPAL
	}//Final da funcão INICIO
	funcao linha(){
		escreva("\n----------------------------------------------------------------\n")
	}
	funcao pula(){
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4240; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */