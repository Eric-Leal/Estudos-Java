package Exercicios;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String salario1;
		String salario2;
		String salario3;
		double media;
		double soma;
		
		System.out.println("Digite o primeiro salario");
		salario1 = scanner.nextLine(); 
		
		System.out.println("Digite o segundo salario");
		salario2 = scanner.nextLine(); 
		
		System.out.println("Digite o terceiro salario");
		salario3 = scanner.nextLine(); 
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		soma = valor1 + valor2 + valor3;
		media = soma / 3;
		
		System.out.println("Soma dos salarios: " + soma);
		System.out.println("Média = " + media);
		scanner.close();
	}
}
