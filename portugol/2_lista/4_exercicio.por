/*
 * 4) Faça um sistema que leia um número inteiro 
 * e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.
 */
programa {
	
	funcao inicio() {

		inteiro numero

		escreva("Digite um número inteiro: ")
		leia(numero)

		limpa()
		
		se (numero < 0) {
			escreva("Tipo: Negativo!")
			escreva("\nO número é ímpar!")	
		} senao se (numero %2 == 0) {
			escreva("Tipo: Positivo!")
			escreva("\nO número é par !")
		} senao {
			escreva("Tipo: Positivo!")
			escreva("\nO número é ímpar!")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 355; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */