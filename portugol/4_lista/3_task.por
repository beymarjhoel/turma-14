programa {

	inclua biblioteca Util 
	
	funcao inicio() {
		//Declaração de variáveis e contantes
		const inteiro LINHA = 4, COLUNA = 6 
		inteiro N1[LINHA][COLUNA], M1[LINHA][COLUNA]
		inteiro N2[LINHA][COLUNA], M2[LINHA][COLUNA]
		inteiro contadorLinha, contadorColuna
		
		escreva("Dados de N1: \n\n");
		//laço para percorrer as linhas da matriz
		para(contadorLinha = 0; contadorLinha < LINHA; contadorLinha++) {
			//Laço para percorrer as colunas da matriz
			para(contadorColuna = 0; contadorColuna < COLUNA; contadorColuna++) {
				//Método para preencher a matriz com números aleátorios
				N1[contadorLinha][contadorColuna] = Util.sorteia(3,4)
				//Exibição da matriz
				escreva(N1[contadorLinha][contadorColuna] + " ")
			}
			//Pular linha
			escreva("\n")
		}

		escreva("\n")
		escreva("Dados de N2: \n\n")
		//laço para percorrer as linhas da matriz
		para(contadorLinha = 0; contadorLinha < LINHA; contadorLinha++) {
			//Laço para percorrer as colunas da matriz
			para(contadorColuna = 0; contadorColuna < COLUNA; contadorColuna++) {
				//Método para preencher a matriz com números aleátorios
				N2[contadorLinha][contadorColuna] = Util.sorteia(1, 2)
				//Exibição da matriz N2
				escreva(N2[contadorLinha][contadorColuna] + " ")
			}
			//Pular linha
			escreva("\n")
		}

		escreva("\n")
		escreva("Dados de M1:\n\n")
		//Laço para percorrer as linhas da matriz
		para(contadorLinha = 0; contadorLinha < LINHA; contadorLinha++) {
			//Laço para percorrer as colunas
			para(contadorColuna = 0; contadorColuna < COLUNA; contadorColuna++) {
				//Atribuição da soma dos valores das matrizes N1 + N2 para a matriz M1
				M1[contadorLinha][contadorColuna] = N1[contadorLinha][contadorColuna] + N2[contadorLinha][contadorColuna]
				//Exibição da matriz M1
				escreva(M1[contadorLinha][contadorColuna] + " ")
			}
			//Pula linha
			escreva("\n")
		}

		escreva("\n")
		escreva("Dados de M2:\n\n")
		//Laço para percorrer as linhas da matriz
		para(contadorLinha = 0; contadorLinha < LINHA; contadorLinha++) {
			//Laço para percorrer as colunas da matriz
			para(contadorColuna = 0; contadorColuna < COLUNA; contadorColuna++) {
				//Atribuição da subtração dos valores das matrizes N1 - N2 para a matriz M2
				M2[contadorLinha][contadorColuna] = N1[contadorLinha][contadorColuna] - N2[contadorLinha][contadorColuna]
				//Exibição da matriz M2
				escreva(M2[contadorLinha][contadorColuna] + " ")
			}
			//Pular linha
			escreva("\n")
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 294; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */