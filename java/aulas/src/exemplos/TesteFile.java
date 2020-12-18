package exemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteFile {

	public static void main(String args[]) {
		
		File arquivo = new File("C:\\temp\\lista.txt");
		
		Scanner ler = null;
		
		try {
			ler = new Scanner(arquivo);
			while(ler.hasNextLine()) {
				System.out.println(ler.nextLine());
			}
		} catch(FileNotFoundException e) {
			System.out.println("ERRO DE ARQUIVO " + e.getMessage());
		} finally {
			if (ler != null) {
				ler.close();
			}
		}
		
		
		
	}
	
}


