package arrays;

import java.util.Scanner;

public class ExercicioForeach {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int QtdNotas;
		double soma = 0;
		double media;

		System.out.println("Escreva quantas notas deseja adicionar.");
		QtdNotas = scanner.nextInt();

		double notas[] = new double[QtdNotas];

		for (int i = 0; i < QtdNotas; i++) {
			System.out.print("Digite a " + (i + 1) + "ª" + " nota: ");
			notas[i] = scanner.nextDouble();

		}

		for (double nota : notas) {
			soma += nota;
			System.out.println(nota);
		}
		media = soma / QtdNotas;
		System.out.println(media);
		
		scanner.close();
	}
}
