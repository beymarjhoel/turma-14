/*O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde 
 *para dar uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2 
 *Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
 *IMC em adultos Condição 
 *Abaixo de 18,5 Abaixo do peso 
 *Entre 18,5 e 25 Peso normal 
 *Entre 25 e 30 Acima do peso 
 *Acima de 30 obeso
*/
programa {

	inclua biblioteca Matematica --> mat
	
	funcao inicio() {
		
		real altura
		real peso
		real imc
		
		escreva("Digite sua altura: ")
		leia(altura)
		escreva("Digite seu peso: ")
		leia(peso)

		imc = peso/(altura*altura)

		se(imc < 18.5) {
			escreva("\nSeu IMC é: "+ mat.arredondar(imc, 2) + " abaixo de 18,5 Abaixo do peso!")
		} senao se(imc >= 18.5 e imc <= 25.5) {
			escreva("\nSeu IMC é: "+ mat.arredondar(imc, 2) + " entre 18,5 e 25 Peso normal!")
		} senao se(imc >= 25.6 e imc <= 30) {
			escreva("\nSeu IMC é: "+ mat.arredondar(imc, 2) + " entre 25 e 30 Acima do peso!")
		} senao se(imc > 30.1) {
			escreva("\nSeu IMC é " + mat.arredondar(imc, 2) + " acima de 30 obeso")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1063; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */