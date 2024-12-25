package Exercicios;

import java.util.Scanner;

public class DesafioConversaoCorrecao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String salario1, salario2, salario3;
		double soma, media;
		
		System.out.print("Digite o primeiro salario: ");
		//O .replace esta substituindo 'virgula' por 'ponto'
		//para caso o usuario digite o valor flutuante com virgula.
		salario1 = scanner.nextLine().replace(",", "."); 
		
		System.out.print("Digite o segundo salario: ");
		salario2 = scanner.nextLine().replace(",", "."); 
		
		System.out.print("Digite o terceiro psalario: ");
		salario3 = scanner.nextLine().replace(",", "."); 
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		soma = valor1 + valor2 + valor3;
		media = soma / 3;
		
		System.out.println("A soma dos salarios é: " + soma);
		System.out.println("A média dos salarios é: " + media);
		
		scanner.close();
	}
}
