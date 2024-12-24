package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print("dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
	
		System.out.printf("Numeros: %d %d %d %d %d", 1, 2, 3, 4, 5);
		
		System.out.printf("Salario: %.1f%n", 1234.567);
		System.out.printf("Salario: %s%n", "João");
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Digite seu nome:");
		String nome = scanner.nextLine();
		
		System.out.println("Digite seu sobrenome:");
		String sobrenome = scanner.nextLine();
		
		System.out.println("Digite sua idade:");
		int idade = scanner.nextInt();
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade);
		System.out.printf("%s %s tem %d anos", nome, sobrenome, idade);
		scanner.close();
	}
}
