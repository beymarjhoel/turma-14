/*
 * 3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 */
programa {
	
	funcao inicio() {

		inteiro numero1, numero2, numero3, numero4
		inteiro numeroQuadrado1, numeroQuadrado2, numeroQuadrado3, numeroQuadrado4
		
		escreva("Digite o primeiro número: ")
		leia(numero1)
		escreva("Digite o segundo número: ")
		leia(numero2) 
		escreva("Digite o terceiro número: ")
		leia(numero3)
		escreva("Digite o quarto número: ")
		leia(numero4)		
		
		limpa()
		
		numeroQuadrado1 = numero1*numero1
		numeroQuadrado2 = numero2*numero2
		numeroQuadrado3 = numero3*numero3
		numeroQuadrado4 = numero4*numero4	

		se (numeroQuadrado3 >= 1000) {
			escreva("Resultado ao quadrado do terceiro número: "+numeroQuadrado3)	
		} senao {
			escreva("Resultado ao quadrado do 1º número: "+numeroQuadrado1+"\n")
			escreva("Resultado ao quadrado do 2º número: "+numeroQuadrado2+"\n")
			escreva("Resultado ao quadrado do 3º número: "+numeroQuadrado3+"\n")
			escreva("Resultado ao quadrado do 4º número: "+numeroQuadrado4+"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 913; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */