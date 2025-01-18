package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<String>();

		livros.add("O Pequeno Principe");
		livros.push("Don Quixote");
		livros.push("O hobbit");

		// Em pilhas o ultimo a entrar é o primeiro a sair
		System.out.println(livros.peek());
		System.out.println(livros.element());

		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		// System.out.println(livros.remove());

		// livros.size();
		// livros.clear();
		// livros.contains();
		// livros.isEmpty();
	}
}