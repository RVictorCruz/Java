 package sintaxe_variaveis_e_fluxo;

public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		primeiro = segundo;
		
		segundo = 10;
		
		System.out.println(primeiro); //qual será o valor do primeiro nesse println
		
	}
}
