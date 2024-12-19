package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		//(f -32 ) x 5/9 = c
		final double AJUSTE = 32.0;
		final double FATOR = 5.0/9.0;
		
		double fahrenheit = 130.0;
		double celsius = (fahrenheit - AJUSTE) * FATOR;;
		System.out.println("A temperatura em celsius é de :" + celsius);
		
		
		fahrenheit = 86.0;
		celsius = (fahrenheit - AJUSTE) * FATOR;;
		System.out.println("A temperatura em celsius é de :" + celsius);
		
	}
}
