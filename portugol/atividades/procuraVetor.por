programa {
	
	funcao inicio() {
		//Declaração de Variáveis
		cadeia alunos[] = {"Ed","Geandro", "Jessica", "Luisa"}
		caracter sexoAlunos[] = {'M','M','F','F'}
		cadeia matriculas[4]
		cadeia aluno
		//Atribuição ddo código do grupo P1 ao vetor matriculas[]
		para(inteiro x = 0; x < 4; x++) {
			matriculas[x] = "P1-" + (x+1)
		}
		//Imprimindo Matricula 
		para(inteiro x = 0; x < 4; x++){
			escreva("Matricula: "+ matriculas[x]+" - "+ alunos[x]+"\n")
		}

		escreva("\nEscolha um aluno pela matrícula: ")
		leia(aluno)

		para(inteiro x = 0; x < 4; x++) {
			se(aluno == matriculas[x]) {	//SE EM ALGUM MOMENTO DO LOOP VC ENCONTRAR UM VALOR IGUAL PI-2
				se(sexoAlunos[x] == 'M') { //os 2 primeiros serão M, e os 2 ultimos serão F, pela ordem acima
					escreva("\nO aluno escolhido foi: " + alunos[x])
				} senao {
					escreva("\nA aluna escolhida foi: " + alunos[x])
				}
				
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 523; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {sexoAlunos, 6, 11, 10}-{matriculas, 7, 9, 10};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */