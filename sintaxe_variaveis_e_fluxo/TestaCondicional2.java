package sintaxe_variaveis_e_fluxo;

public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando Condicional2");

		int idade = 16;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;

		if (idade >= 18 && acompanhado) {
			System.out.println("Pode entrar!!!");
		} else {
			System.out.println("Infelizmente você não pode entrar!!!");
		}
	}

}
