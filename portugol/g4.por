programa {
	funcao inicio() {
		cadeia alunos[] = {"Beymar Jhoel Acapa Lima",
					    "Gideão da Silva Idelfonso",
					    "José Jorge Hauck Junior",
					    "Kelven Cleiton de Araujo Brandão",
					    "Verônica Navarro Almenara"}

		inteiro codigo[] = {5,18,26,28,38}
		caracter sexoAlunos[] = {'M','M','M','M','F'}
		cadeia matriculas[5]
		cadeia aluno
		
		para(inteiro x = 0; x < 5; x++) {
			se(codigo[x] == 5) {	//quando o codigo[x] ter um valor 5
				matriculas[x] = "G4-0"+ codigo[x]	
			} senao {
				matriculas[x] = "G4-"+ codigo[x]	
			}
		}

		para(inteiro x = 0; x < 5; x++) {
			escreva("Matricula "+ matriculas[x]+" - "+alunos[x]+"\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 552; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */