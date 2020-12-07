programa
{
	
	funcao inicio() //aqui que a magia acontece
	{
		inteiro numero
		linha()
		
		escreva("digite o numero numero:")
		leia(numero)
		parimpar(numero)
		pula()
		
		escreva(voltaparouimpar(113))
		pula()
		se (voltaparouimpar(numero) =="IMPAR")
		{
			escreva("vc digitou um numero impar")
			pula()
			linha()
			
		} senao
		{
			linha()
			pula()
			escreva("Se par, é par!!")
		}
		
		
	}
	//funcoes fora do principal
	funcao cadeia voltaparouimpar(inteiro numero)
	{
		cadeia tipo
		se ((numero%2) ==0)
		{
			tipo = "PAR")
		}
		senao
		{
			tipo = "IMPAR"
		}
		retorne tipo
	}
	
	funcao parimpar(inteiro numero) //void
	{
		se ((numero%2) ==0)
		{
			escreva("VALOR PAR")
		}
		senao
		{
			escreva("VALOR IMPAR")
		}
	}
	
	funcao linha() //modularização - metodo - void
	{
		escreva("-----------------------------")
		pula()	
	}
	funcao pula(){
		escreva("\n")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 739; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */