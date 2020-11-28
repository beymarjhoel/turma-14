programa {
	funcao inicio() {
		inteiro tempoSegundos 

		escreva("Digite o tempo em segundos: ")
		leia(tempoSegundos)
		
		escreva("Hora(s): "      + (tempoSegundos / 3600),
		        "\nMinuto(s): "  + ((tempoSegundos % 3600) / 60)+
		  	   "\nSegundo(s): " + ((tempoSegundos % 3600) % 60))		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 292; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */