/*
 * 8) Construa um sistema para ler uma variável numérica N e 
 * imprimi-la somente se a mesma for maior que 100, caso contrário imprimi-la com o valor zero.
*/
programa {
	
	funcao inicio() {

		inteiro num;
		
		escreva("Digite um valor numérico: ")
		leia(num)
		
		limpa()
		
		se (num > 100) {
			escreva(num+" é maior que 100!")
		} senao {
			escreva("0")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 210; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */