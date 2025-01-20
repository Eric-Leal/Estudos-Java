package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<Integer, String>();

		usuarios.put(1, "Roberto");
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");

		System.out.println("Tamanho: " + usuarios.size());
		System.out.println("Esta vazio? " + usuarios.isEmpty());

		System.out.println("Chave/identificador do usuario: " + usuarios.keySet());
		System.out.println("Valores do ussuario/nome: " + usuarios.values());
		System.out.println("Todos os valores, chave e nome : " + usuarios.entrySet());

		System.out.println("Existe usuario com a chave 20? " + usuarios.containsKey(20));
		System.out.println("Existe usuarios com o nome Rebeca² " + usuarios.containsValue("Rebeca"));

		System.out.println("Achar usuario com a chave 4: " + usuarios.get(4));
		System.out.println(
				"Remover usuario do indice 4, resutlado falso caso ele não exista. " + usuarios.remove(4, "Gui"));

		System.out.println();
		System.out.println("Precorrendo todas as cahves");
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}

		System.out.println();
		System.out.println("Percorrendo todos os valores");
		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}
		System.out.println();
		System.out.println("Percorrendo chaves e valores");
		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ==> ");
			System.out.println(registro.getValue());
		}
	}
}
