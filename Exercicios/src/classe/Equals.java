package classe;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro";
		u1.email = "Pedro@email.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro";
		u2.email = "Pedro@email.com";
		
		//vai ser falso, o melhor é usar o '.equals'
		System.out.println(u1 == u2);
		
		//Vai ser verdadeiro por conta do equals na classe usuario
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		//Na classe usuario o if (objeto instanceof Usuario), impede de acontecer erros, e faz retornar falso
		//System.out.println(u2.equals(new Data()));
	}
}
