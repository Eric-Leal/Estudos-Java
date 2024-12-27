package fundamentos.exercicios;

public class DesafioOperadoresAritmeticos {
	
	public static void main(String[] args) {
		
//		int a = 3 * 4 -10;
//		int b = (int) Math.pow(a, 3);
//		double c = Math.pow(a, 3);
//		
//		System.out.println(b);
//		System.out.println(c);
		
		
		//Faça a operação abaixo.
		//                             )³
		//[6*(3+2)]²     ((1-5)*(2-7))²)
		//---------   -  (-----------) )
		//   3*2         (     2     ) )
		//-----------------------------)
		//            10³
		
		int a = 3+2;
		int b = 6 * a;
		int c = (int) Math.pow(b, 2);
		int d = 3*2;
		int primeiraDiv = c/d;
		int primeiroRes = primeiraDiv;
		
		int e = 2-7;
		int f = 1-5;
		int g = e*f;
		int segundaDiv = g/2;
		int segundoRes = (int) Math.pow(segundaDiv, 2);
		
		int terceiroRes = primeiroRes - segundoRes;
		int quartoRes = (int)Math.pow(terceiroRes, 3);
		
		int h = (int)Math.pow(10, 3);
		
		int resultadoFinal = quartoRes / h;
		
		System.out.println(resultadoFinal);
	}
}
