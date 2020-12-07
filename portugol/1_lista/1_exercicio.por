/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
	meses e dias e mostre-a expressa apenas em dias.*/ 
programa {
	funcao inicio() {
		
		inteiro anos
		inteiro mes
		inteiro dias
		inteiro tot_dias = 0

			escreva("Digite a sua idade(somente em anos): ")
			leia(anos)
			escreva("Digite a sua idade(somente em meses): ")
			leia(mes)
			escreva("Digite a sua idade(somente em dias): ")
			leia(dias)

			tot_dias = tot_dias + (anos*365)
			tot_dias = tot_dias + (mes*30)
			tot_dias = tot_dias + dias

			escreva("O total expresso em dias é: "+tot_dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 156; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */