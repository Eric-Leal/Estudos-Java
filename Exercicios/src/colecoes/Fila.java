package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// Offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia.
		
		fila.add("Ana"); //Lança uma exceção
		fila.offer("Carlos"); //Retorna false
		fila.offer("Pedro");
		fila.offer("Rafaela");
		fila.offer("Jorge");
		fila.offer("Lucas");
		
		// Peek e Element -> obter o proximo elemento da fila (sem remover)
		// Diferença é o comportamento quando a fila está vazia.
		
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.element()); // Lança uma exceção
		
		// Poll e Remove -> obter o peoximo elemento da fila e remove.
		// Diferença é o comportamento quando a fila está vazia.
		System.out.println(fila.poll()); // retorna falsa
		System.out.println(fila.remove()); //Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		//Alguns outros metodos
		//fila.clear();
		//fila.size();
		//fila.isEmpty();
		//fila.contains(...);
		
	}
}
