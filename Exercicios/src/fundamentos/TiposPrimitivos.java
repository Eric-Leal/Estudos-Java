package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//Informações do funcionario
		
		//Tipos numéricos inteiros 
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		/*O '_' pode ser usado para separar os 
		 * numeros para melhorar a visualização
		 */
		
		//Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.91;
		
		//Tipos booleano
		boolean estaDeFerias = false;
		
		//Tipo caractere
		char status = 'a'; //ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de vaigens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
