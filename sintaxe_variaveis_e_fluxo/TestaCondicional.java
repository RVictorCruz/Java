package sintaxe_variaveis_e_fluxo;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("-----------------------------------");
		int idade = 17;
		int pessoasAcompanhando = 3;

		if (idade >= 18) {
			System.out.println("Pode entrar!!!, você é de maior");
		} else if (pessoasAcompanhando >= 2) {
			System.out.println("Pode entrar, pois está acompanhado");
		} else {
			System.out.println("Não pode entrar, jovem!!");
		}
	}

}
