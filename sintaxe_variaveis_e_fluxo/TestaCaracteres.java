package sintaxe_variaveis_e_fluxo;

public class TestaCaracteres {
	
	public static void main(String[] args) {
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66; //Char pode guardar numero, mas ao imrimi-lós sairam letra por casa da tabela...
		System.out.println(valor); //66 = B
		
		valor = (char) (valor + 1);
		System.out.println(valor); //67 = c
		
		String palavra = "O melhor do mundo numero ";
		palavra = palavra + 1;
		System.out.println(palavra);
	}

}
