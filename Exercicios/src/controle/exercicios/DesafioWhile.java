package controle.exercicios;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double total = 0, nota = 0, media = 0;
		int notaValida = 0;
		 
		while(nota != -1) {
			System.out.println("Digite a nota do aluno : ");
			nota = scanner.nextDouble();
			if(nota <= 10 && nota >= 0) {
				total += nota;
				notaValida++;
			}else if(nota != -1) {
				System.out.println("Nota invalida");
			}
		}
		media = total/notaValida;
		System.out.println("Total de notas = " + notaValida);
		System.out.println("Média = " + media);
				
	}
}
