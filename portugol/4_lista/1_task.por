//Vetores e Matrizes
//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e 
//o escreva em seguida. Encontre após a maior pontuação e a apresente.
programa {
	//DEclaração de váriaveis e de vetor
	funcao inicio() {
		inteiro valor[5]
		inteiro kc
		inteiro maior = 0
		//Laço para entrada de valores
		para(kc = 0; kc < 5; kc++) {
			escreva("Digite um valor: ")
			leia(valor[kc])
			//Condicional para pegar o maior valor
			se(valor[kc] > maior) {
				maior = valor[kc]
			}
		}

		limpa()
		//Laço para exibir os valores digitados
		para(kc = 0; kc < 5; kc++) {
			escreva("Valores digitados: "+ valor[kc] + "\n")
		}
		
		escreva("\nO maior valor digitado é: " + maior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 236; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */