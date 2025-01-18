package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Pedro"));
		lista.add(new Usuario("Jorge"));
		
		System.out.println("Usuario do indice 3: " + lista.get(3).nome); //Acessar pelo indice
		
		lista.remove(1);
		lista.remove(new Usuario("Jorge"));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Pedro")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
