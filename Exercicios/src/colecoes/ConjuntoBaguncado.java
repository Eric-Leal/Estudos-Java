package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {


	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // booblean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Character
		
		System.out.println("Tamanho é " + conjunto.size());
		
		//Conjunto set não aceita repetição, por isso o tamanho permaneceu o mesmo
		conjunto.add("Teste");
		System.out.println("Tamanho é " + conjunto.size());
		
		//Mostra um resultado verdadeiro ou falso, verdadeiro quando existe no conjunto, falso quando não possui o valor no conjunto
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove('x'));
		
		//Após remover os elementos do conjunto o valor atualiza
		System.out.println("Tamanho é " + conjunto.size());
		
		//Contains mostra se existe ou não o valor dentro do conjunto
		System.out.println(conjunto.contains('x')); //Como o x foi removido esse resultado será falso
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//Tudo que esta em nums foi adicionado para conjunto
		//conjunto.addAll(nums); // União entre dois conjuntos
		//System.out.println(conjunto);
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}
