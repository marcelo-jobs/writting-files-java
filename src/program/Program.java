package program;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		//Vetor com 3 frases //
		String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};
		//String com caminho do arquivo
		String path = "C:\\temp\\out.txt";
		
		//try with resources, fecha os argumentos abertos com tratamento
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			//Para cada String line contido no meu vetor line faça...
			for(String line: lines ) {
				bw.write(line);
				bw.newLine();
			}
			
		} catch (IOException e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
		System.out.println("Arquivo criado com sucesso!");

	}

}
