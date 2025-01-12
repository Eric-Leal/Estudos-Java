package arrays;

import java.util.Arrays;


public class Exercicio {

	public static void main(String[] args) {
		
		double notasAlunoA[] = new double[4];
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		//Mostrar todas as notas, precisa usar 'import java.util.Arrays;'
		System.out.println(Arrays.toString(notasAlunoA));
		
		//Pegar primeira nota
		System.out.println(notasAlunoA[0]);
		//Pegar ultima nota
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
		
		// System.out.println(notasAlunoA[4]); ERRO! porque o 4 esta fora dos limites do array/vetor
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println("media: " + totalAlunoA / notasAlunoA.length);
		
		//'final' antes do double é = cosntante
		final double notaArmazenada = 5.9;
		double notasAlunoB [] = { 6.9, 8.9, notaArmazenada, 10 };
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println("media: " + totalAlunoB / notasAlunoB.length);
	}
}
