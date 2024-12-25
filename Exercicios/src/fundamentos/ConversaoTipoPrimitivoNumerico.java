package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // Conversao implicita
		System.out.println(a);
		
		float b = (float) 1.12345678888; // Conversão explicita (CAST)
		System.out.println(b);
		
		int c = 130;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		System.out.println(f);
	}
}
