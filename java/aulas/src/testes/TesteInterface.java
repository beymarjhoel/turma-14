package testes;

public class TesteInterface {

	public static void main(String args[]) {
		
		ParticipanteForum participante = new ParticipanteForum();
		
		Leitor leitor = participante;
		 
		System.out.println("O participando está lendo: " + leitor.lendo());
		
		Programador programador = participante;
		String java = "JAVA";
		programador.pensando(java.toCharArray());
		System.out.println(" e programando: " + programador.digitando());
		
	}
	
}
