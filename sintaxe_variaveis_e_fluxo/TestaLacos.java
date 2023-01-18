package sintaxe_variaveis_e_fluxo;

public class TestaLacos {
	public static void main(String[] args) {
		for(int numerador = 1; numerador <=10; numerador ++) {
			for(int numero = 0; numero <= 10; numero++) {
				System.out.print(numerador * numero + " ");
			}
			System.out.println("");
		}
	}

}
