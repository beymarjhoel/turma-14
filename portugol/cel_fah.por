programa {

	inclua biblioteca Matematica
	
	funcao inicio() {
		real celsius, res
		
		escreva("Digite a temperatura em Celsius: ")
		leia(celsius)
		
		res = (celsius * 9/5) + 32
		
		escreva("A temperatura em Fahrenheit é: " + Matematica.arredondar(res,2) + "ºF")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 183; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */