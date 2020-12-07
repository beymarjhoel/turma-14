/*
 * 2) Elabore um sistema que leia as variáveis C e N, respectivamente código e 
 * número de horas trabalhadas de um operário. 
 * E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
 * Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, 
 * caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
 * No final do processamento imprimir o salário total e o salário excedente.
 */
programa {
	
	funcao inicio() {
		cadeia  codigo
		inteiro numero = 0 
		inteiro E = 0
		real salarioTotal = 0.0
		real salarioExcedente = 0.0
		const real VALOR_HORA_NORMAL = 10.00
		const real VALOR_HORA_EXCEDENTE = 20.00
		const inteiro LIMITE_HORAS = 50
		
		escreva("Digite o código do funcionário: ")
		leia(codigo)		

		escreva("Digite a quantidade de horas trabalhadas: ")
		leia(numero)

		se (numero <= LIMITE_HORAS) {
			salarioTotal = numero * VALOR_HORA_NORMAL	
		} senao {
			E = (numero - LIMITE_HORAS)
			salarioTotal = (numero*VALOR_HORA_NORMAL)
			salarioExcedente = E*VALOR_HORA_EXCEDENTE
			salarioTotal = salarioTotal+salarioExcedente
		}

		escreva("\nQuantidade de horas trabalhadas: "+ numero)
		escreva("\nQuantidade de horas excedentes: " + E)
		
		escreva("\nSalário Excedente: "+ salarioExcedente)
		escreva("\nSalário Total: "+ salarioTotal)
		
			

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1237; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */