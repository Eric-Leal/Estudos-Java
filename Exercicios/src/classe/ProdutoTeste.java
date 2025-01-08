package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.99);
		//p1.nome = "Notebook";
		//p1.preco = 4356.99;
		//p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.56;
		
		
		
		System.out.println(p1.nome);
		
		//Nesse exemplo ele usa o metodo que esta com nenhum parametro, com os parenteses vazios
		double precoFinal1 = p1.precoComDesconto();
		
		//Nesse ele usa o metodo que tem o parametro de 'double descontoDoGerente'
		double precoFinal2 = p2.precoComDesconto(0.1); 
		double mediaCarrinho = ((precoFinal1 + precoFinal2) / 2);
		
		System.out.println(precoFinal1);
		System.out.println(p2.nome);
		System.out.println(precoFinal2);
		System.out.printf("Média do carrinho = %.2f", mediaCarrinho);
		
		System.out.println();
	}
}
