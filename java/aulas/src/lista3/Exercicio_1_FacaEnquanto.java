package lista3;

public class Exercicio_1_FacaEnquanto {

	public static void main(String args[]) {
	
		int contador = 233;
		
		do {
			System.out.print(contador + " ");
			contador = contador + 5;
			
		} while (contador < 303);
		
		System.out.print("\n-------------------------------------------------------\n");
		
		contador = contador - 3;
		
		do {
			contador = contador + 3;
			System.out.print(contador + " ");
			if ( contador == 342 || contador == 384 ) {
				System.out.print("\n");
			}
		} while (contador < 396);
		
		System.out.print("\n-------------------------------------------------------\n");
		
		do {
			contador = contador + 5;
			System.out.print(contador + " ");
		} while( contador < 456);
		
		
		
	}	
}
