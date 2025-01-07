package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
	
		
		var d2 = new Data(31, 12, 2025);
		
		//Sem armazenar em uma variavel e sem usar parametro
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		//Armazenamdo em uma variavel
		String dataFormatada1 = d1.obterDataFormatada();
		System.out.println(dataFormatada1);
		
	}
}
