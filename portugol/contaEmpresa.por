programa {
	
	funcao inicio() {

		inteiro numeroConta       = 1234
		real    saldo 	           = 0.0
		cadeia  numeroCPF         = "123.456.789-10"
		real    emprestimoEmpresa = 0.0
		inteiro op = 0
		inteiro opConta = 0
		inteiro op3 = 0
		inteiro movimentacao[10] 
		real limite               = 1000.00
		inteiro contador = 0
		
		escreva ("\n|-----------------------------------------------|\n")
		escreva("|    Seja Bem vindo ao seu Banco Digital G&4    |")
		escreva ("\n|-----------------------------------------------|\n")
		escreva("|-------------------- M E N U ------------------|\n")
		escreva("\n[1] - Conta Poupança\n")
		escreva("[2] - Conta Corrente\n")
		escreva("[3] - Conta Especial\n")
		escreva("[4] - Conta Empresa\n")
		escreva("[5] - Conta Universitária\n")
		escreva("[0] - Sair do Banco\n")
		escreva("\n: ")
		leia(op) 

		se(op == 4) {
			limpa()
			escreva("|-----------------------------------------------------|\n")
			escreva("|                     CONTA EMPRESA                   |\n")
			escreva("|-----------------------------------------------------|\n")
			escreva("\n[1] - Consultar Saldo\n")
			escreva("[2] - Depositar \n")
			escreva("[3] - Sacar\n")
			escreva("[4] - Sair ")
			escreva("\n: ")
			leia(op2)

				se(opConta == 1) {
					limpa()
					escreva("Seu saldo atual é: R$"+saldo)
					se(saldo < 0.0) {
						escreva("Gostaria de realizar um emprestímo?\n\n[1] - Sim\n[2]Não\n\n: ")
						leia(op3)
						se(op3 == 1) {
							escreva("Digite o valor do empréstimo desejado: R$")
							leia(movimentacao[contador])
							saldo = saldo + movimentacao[contador]
						} senao se(op3 == 2) {
							escreva("Ok, obrigado.")
						}
					}
				} 
				se(opConta == 2) {
					escreva("Digite quanto deseja depositar: R$")
					leia(movimentacao[contador])
					saldo = saldo + movimentacao[contador]
					contador++
					escreva("Seu saldo atual é: R$"+ saldo)
				}				
				
				se(opConta == 3) {
					escreva("Quanto deseja sacar do seu saldo atual? ")
					leia(movimentacao[contador])
					saldo = saldo - movimentacao[contador]
					contador--
					escreva("Seu saldo atual é: R$"+ saldo)
				}
				
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1923; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */