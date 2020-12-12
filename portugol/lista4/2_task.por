/*
 * Um dado é lançado 10 vezes e o valor correspondente é anotado. 
 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
 * A seguir determine e imprima a média aritmética dos lançamentos, 
 * contabilize e apresente também quantas foram as ocorrências da maior pontuação.
 */
programa {

	inclua biblioteca Util
	
	funcao inicio() {
		//Declaração das variáveis e do vetor
		inteiro dado[10], kc, media, maiorPontuacao = 0
		inteiro maior = 0, soma = 0

		//kc é o contador para rodar e atribuir 10 números no vetor dado[10] com o Método sorteia
		para(kc = 0; kc < 10; kc++) {
			dado[kc] = Util.sorteia(1, 6)	//limite de 1 até 6 por causa dos lados do dados
			soma = soma + dado[kc]		//soma dos valores
				se(dado[kc] > maior) {	//condicional para pegar o maior valor do lançamento
					maior = dado[kc]
				}
		}
		//Laço para percorrer os valores do vetor 
		para(kc = 0; kc < 10; kc++) {
			se(dado[kc] == maior) {	//condicional para pegar quantas vezes ele acha o maior valor
				maiorPontuacao = maiorPontuacao + 1
			}
		}

		//Exibição dos movimentos dos dados
		escreva("♠ Dados Lançados ♠\n\n")
		para(kc = 0; kc < 10; kc++) {
			escreva(kc+1+"º Movimento: " +dado[kc] + "\n") 
		}
		//variável que vai receber a média dos valores 
		media = soma/10
		//exibição da média, maior valor e quantas vezes ocorreu a maior pontuação
		escreva("\nA média dos lançamentos é: " + media)
		escreva("\nO maior número foi: " + maior)
		escreva("\nOcorrências de maior pontuação: " + maiorPontuacao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {dado, 13, 10, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */