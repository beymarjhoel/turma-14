/*
*	Objetivo: ler numero inteiro positivo e diga se é par ou impar, 0 numero neutro
*/
programa {
	
	funcao inicio() {
		inteiro numero

		escreva("Digite um número: ")
		leia(numero)

		se (numero < 0) {
			escreva("Número negativo, sem chance!")
		} senao se (numero == 0) {
			escreva("Você digitou 0!")
		} senao se (numero >= 0 e numero %2 == 0) {  
			escreva("É um número par, válido! ")
		} senao {
			escreva("É um número ímpar, inválido!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 462; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */