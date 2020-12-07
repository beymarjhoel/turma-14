/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
 * exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
 */

programa {
	
	funcao inicio() {

		const inteiro TAMANHO = 3	//Valor da matriz
		inteiro matriz[TAMANHO][TAMANHO]	//1ª Dimensão Linha 2ª Dimensão Coluna
		inteiro linha, coluna	//Caso var declarada antes, você pode usa-la em qualquer lugar do programa
		inteiro totalNumeros = 0
		inteiro totalDiagonal = 0//Acumulador para diagonal principal
		
		para(linha = 0; linha < TAMANHO; linha++) {	//giro de linhas
			para(coluna = 0; coluna < TAMANHO; coluna++) { //giro de colunas
				//Aqui é onde vocÊ grava, apaga e mexe nos DADOS
				escreva("Digite o valor da posição: ["+linha+"]["+coluna+"]: ")
				leia(matriz[linha][coluna])
				//matriz[linha][coluna] = Util.sorteia(1,5)
				totalNumeros = totalNumeros + matriz[linha][coluna]
				//matriz[linha][coluna] = Util.sorteia(1,5)
				se(linha == coluna) {
					totalDiagonal = totalDiagonal + matriz[linha][coluna]
					//totalDiagonal += matriz[linha][coluna]
				}
			}
			escreva("\n")	
		}

		//escrever a matriz
		escreva("\nMATRIZ ATUAL\n")
		para(linha =0; linha< TAMANHO;linha++) {
			para(coluna = 0; coluna < TAMANHO; coluna++) {
				escreva(matriz[linha][coluna]+ " ")		
			}
			escreva("\n")
		}
		
		escreva("\nO total de valores é: " + totalNumeros)
		escreva("\nTotal da diagonal é: " + totalDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 554; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */