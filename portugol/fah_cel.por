programa {

	inclua biblioteca Matematica
	
	funcao inicio() {
				
		real fahrenheit, res
		
		escreva("Digite a temperatura em Fahrenheit: ")
		leia(fahrenheit)

		res = (fahrenheit - 32) * 5/9

		escreva("A temperatura em Celsius é: " + Matematica.arredondar(res,2) + "ºC")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 96; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */