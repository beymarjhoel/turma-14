/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e 
 * dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e 
 * os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.
 */
programa {
	
	funcao inicio() {
		real custoConsumidorCarro = 0
		real custoFabricaCarro
		real percentagemDistribuidor = 0
		real impostosPrecoFabrica = 0

		
		const real VALORDISTRIBUIDOR = 0.28	//28%
		const real VALORIMPOSTOS = 0.45		//45%% 
		
		escreva("Digite o preço do de fábrica do carro: ");
		leia(custoFabricaCarro)

		impostosPrecoFabrica = (custoFabricaCarro * VALORIMPOSTOS)
		percentagemDistribuidor = (custoFabricaCarro * VALORDISTRIBUIDOR)
		custoConsumidorCarro = custoFabricaCarro + impostosPrecoFabrica + percentagemDistribuidor)

		escreva("Custo final do carro novo é: "+custoConsumidorCarro)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 582; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */