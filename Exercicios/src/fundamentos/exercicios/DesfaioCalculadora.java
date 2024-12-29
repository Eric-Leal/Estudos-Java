package fundamentos.exercicios;

import java.util.Scanner;

public class DesfaioCalculadora {

	public static void main(String[] args) {
		
		double num1, num2;
		String operador;
		double resultado;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		num1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo numero");
		num2 = scanner.nextDouble();
		
		System.out.println("Digite o metodo de operação ");
		operador = scanner.next();
		
		resultado = "+".equals(operador) ? num1 + num2 : 0;
		resultado = "-".equals(operador) ? num1 - num2 : resultado;
		resultado = "*".equals(operador) ? num1 * num2 : resultado;
		resultado = "/".equals(operador) ? num1 / num2 : resultado;
		resultado = "%".equals(operador) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, resultado);
		scanner.close();
	}
}
