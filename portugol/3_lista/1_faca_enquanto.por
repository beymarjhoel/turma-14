programa {
	
	funcao inicio() {

		inteiro contador = 233
		
		faca {
			escreva(contador + " ")
			contador = contador + 5
		} enquanto(contador <= 300)

		
		escreva("\n---------------------------\n")

		faca {
			escreva(contador + " ")
			contador = contador + 3
			se(contador == 345 ou contador == 387) {
				escreva("\n")
			}
		} enquanto(contador <= 399)

		escreva("\n---------------------------\n")
		
		faca {
			escreva(contador + " ")
			contador = contador + 5
		} enquanto(contador <= 456)
	} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 212; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */