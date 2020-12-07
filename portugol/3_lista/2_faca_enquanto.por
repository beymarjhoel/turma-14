programa {
	
	funcao inicio() {

		inteiro numero
		inteiro soma = 0
		inteiro contador = 0

		escreva("Digite um número: ")
		leia(numero)

		faca {
			soma = soma + contador
			contador = contador + 1
		} enquanto (contador <= numero)

		limpa()
		escreva("A soma de todos os números até [" + numero + "] é: " + soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 35; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */