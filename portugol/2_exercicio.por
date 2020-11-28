/*Faça um sistema que leia a idade de uma pessoa expressa em dias e 
  mostre-a expressa em anos, meses e dias*/
programa {
	funcao inicio () {
		
		inteiro idade_anos
		inteiro idade_meses
		inteiro idade_dias
		inteiro total_dias
			
			escreva("Digite a quantidade em dias: ")
			leia(total_dias)
			
			idade_anos = total_dias/365
			total_dias = total_dias%365
			idade_meses = total_dias/30
			total_dias = total_dias%30
			
			idade_dias = total_dias
	
			escreva("Ano(s): "+idade_anos)
			escreva("\nMês(es): "+idade_meses)
			escreva("\nDia(s): "+idade_dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 303; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */