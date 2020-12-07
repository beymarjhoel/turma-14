programa {

	inclua biblioteca Matematica --> mat	
	
	funcao inicio() {
		caracter tipoTemperatura
		caracter op
		real temperatura
		
		linha()
		pula()
		escreva("Calculo temperaturas: ")
		pula()
		linha()
		pula()

		escreva("[1] Fahrenheit para Celsius\n")
		escreva("[2] Celsius para Fahrenheit\n")
		escreva(": ")
		leia(op)

		limpa()
		
		se(op == '1') {
			escreva("Digite a temperatura em Farenheit: ")
			leia(temperatura)
			escreva("Temperatura em Celsius: "+ deFarenParaCelsius(temperatura)+"ºC")
		} senao se(op == '2') {
			escreva("Digite a temperatura em Celsius: ")
			leia(temperatura)
			escreva("Temperatura em Farenheit: " + deCelsiusParaFaren(temperatura)+"ºF")
		}
	}

	funcao linha() {
		escreva("-----------------------")
	}

	funcao pula(){
		escreva("\n")
	}

	funcao real deFarenParaCelsius(real tempFaren) {
		real tempCelsius = 0.0
		tempCelsius = mat.arredondar(((tempFaren - 32)/1.8),2)
		retorne tempCelsius
	}

	funcao real deCelsiusParaFaren(real tempCelsius) {
		real tempFaren = 0.0
		tempFaren = mat.arredondar(((tempCelsius * 1.8) + 32),2)
		retorne tempFaren
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */