package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("Boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
	
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 1234.12;
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome +
				"\nIdade: " + idade + 
				"\nSalario: " + salario + "\n\n";
		System.out.println(maisUmaFrase);
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome +
				"\nIdade: " + idade + 
				"\nSalario: " + salario + "\n\n");
		
		System.out.printf("O %s %s tem %d e ganha %.2f", 
				nome, sobrenome, idade, salario);
		
		String frase = String.format("O %s %s tem %d e ganha %.2f", 
				nome, sobrenome, idade, salario);
		System.out.println(frase);
	
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
	
	}
}
