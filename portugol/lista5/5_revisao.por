/*
 * Faça um programa que leia um vetor de 5 posições para números reais e, depois, 
 * um código inteiro. Se o código for zero, finalize o programa; 
 * se for 1, mostre o vetor na ordem direta; 
 * se for 2, mostre o vetor na ordem inversa. 
 * Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código inválido.
 */
programa {
	
	funcao inicio() {

		real vetor[5]
		inteiro kc
		inteiro op
		
		para(kc = 0; kc < 5; kc++) {
			escreva("Digite um valor real: ")
			leia(vetor[kc])
		}
		limpa()

		faca {
			escreva("\n\nEscolha uma opção:\n")
			escreva("\n[1] Vetor na ordem direita")
			escreva("\n[2] Vetor na ordem inversa")
			escreva("\n[0] Fechar programa.")
			escreva("\n\n: ")
			leia(op)
			
			se(op == 0) {
				limpa()
				escreva("\nFim do Programa")
			} senao se (op == 1) {
				limpa()
				escreva("Ordem Direita: ")
				para(kc = 0; kc < 5; kc++) {
					escreva("["+vetor[kc] + "] ")
				}
			} senao se (op == 2) {
				escreva("Ordem Inversa: ")
				para(kc = 4; kc >= 0; kc--) {
					escreva("["+vetor[kc] + "] ")
				}
			} senao se(op != 1 e op != 2) {
				escreva("Código Inválido!")
			}
		} enquanto(op != 0)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1018; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 12, 7, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */