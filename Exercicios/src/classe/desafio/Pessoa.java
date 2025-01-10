package classe.desafio;

public class Pessoa {
	String nome = "";
	double peso = 0.0;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		this.peso += comida.peso;
	}
	
	String apresentar() {
		return "Meu nome é: " + nome + " tenho: " + peso + "Kg";
	}
}
