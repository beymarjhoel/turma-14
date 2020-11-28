/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.*/
programa {
	inclua biblioteca Matematica
	funcao inicio() {
		
		cadeia nome
		real nota1, nota2, nota3, media
		
			escreva("Digite o nome do aluno: ")
			leia(nome)
			escreva("Digite a primeira nota: ")
			leia(nota1)
			escreva("Digite a segunda nota: ")
			leia(nota2)
			escreva("Digite a terceira nota: ")
			leia(nota3)
			
			media = (nota1 + nota2 + nota3)/3
			
			escreva("A média final do aluno "+nome+" é: "+(Matematica.arredondar(media, 1)))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 555; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */