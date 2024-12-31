package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String texto = "sair";

		do {
			System.out.println("Dizer algo");
			System.out.println("Quer sair?");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("sair"));

		System.out.println("Saiu");

		entrada.close();
	}
}
