package sintaxe_variaveis_e_fluxo;

public class TestaLacos2 {
	public static void main(String[] args) {
		for(int linha = 1; linha <= 10; linha++) {
			for(int coluna =10; coluna>= linha; coluna--) { //1,1 1,2 1,3 ou 10,1 10,2 10,3 10,4
				
				System.out.print(coluna + " ");
			}
			System.out.println(" ");
	}

	}
	}
