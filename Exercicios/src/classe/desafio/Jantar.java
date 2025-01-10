package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Pizza", 0.8);
		Comida c2 = new Comida("Pão", 0.2);
		
		Pessoa p1 = new Pessoa("Jorge", 60.0);
		
		System.out.println(p1.apresentar());
		
		p1.comer(c1);
		System.out.println(p1.apresentar());
		
		p1.comer(c2);
		System.out.println(p1.apresentar());
	}
}
