/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
 * exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
 */
programa {

	inclua biblioteca Util
	
	funcao inicio() {
		//Declaração de variáveis e constante
		const inteiro TAMANHO = 3
		inteiro matriz[TAMANHO][TAMANHO]
		inteiro contadorLinha, contadorColuna
		inteiro totalNumeros = 0, totalDiagonal = 0
		//Laço para percorrer as linhas da matriz 
		para(contadorLinha = 0; contadorLinha < TAMANHO; contadorLinha++) {
			//Laço para percorrer as colunas da matriz
			para(contadorColuna = 0; contadorColuna < TAMANHO; contadorColuna++) {
				//Entrada de dados da matriz de acordo com suas posições
				escreva("Digite o valor da posição [" + contadorLinha + "][" + contadorColuna + "]: ")
				leia(matriz[contadorLinha][contadorColuna])
				//Variável que pega a soma dos valores da matriz
				totalNumeros = totalNumeros + matriz[contadorLinha][contadorColuna]
				//Condição para pegar a soma das diagonais da matriz
				se(contadorLinha == contadorColuna) {
					totalDiagonal = totalDiagonal + matriz[contadorLinha][contadorColuna]
				}
			}
			//Pular linha
			escreva("\n")
		}

		escreva("Matriz Atual: \n")
		//Laço para percorrer as linhas da matriz 
		para(contadorLinha = 0; contadorLinha < TAMANHO; contadorLinha++) {
			//Laço para percorrer as colunas da matriz
			para(contadorColuna = 0; contadorColuna < TAMANHO; contadorColuna++) {
				//Exibição da matriz atual
				escreva(matriz[contadorLinha][contadorColuna] + " ")
			}
			//Pular linha
			escreva("\n")
		}
		//Exibição da saída da soma de valores e a soma da diagonal principal diagonal
		escreva("\nTotal de valores é: " + totalNumeros)
		escreva("\nTotal da diagonal é: " + totalDiagonal)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1714; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */