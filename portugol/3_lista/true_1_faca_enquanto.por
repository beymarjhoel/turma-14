programa {
	
	funcao inicio() {

		inteiro contador = 233
		
		faca {
			escreva(contador + " ")
			contador = contador + 1
			
			se (contador == 245 ou contador == 257 ou contador == 269 ou contador == 281 ou contador == 293) {
				escreva("\n")
			}
		} enquanto(contador < 301)
		
		escreva("\n---------------------------\n")

		contador = contador-1
		
		faca {
			contador = contador + 3
			escreva(contador + " ")
			se (contador == 336 ou contador == 372) {
				escreva("\n")
			}
			
		} enquanto(contador <= 393)

		escreva("\n---------------------------\n")
		
		faca {
			
			contador = contador + 5
			escreva(contador + " ")
		} enquanto(contador < 456)
	} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 669; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */