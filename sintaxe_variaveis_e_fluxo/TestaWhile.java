package sintaxe_variaveis_e_fluxo;

public class TestaWhile {
	public static void main(String[] args) {
		int contador = 0;
		while(contador <= 10) {
			System.out.println(contador);
			contador = contador + 1;  // Três formas diferentes de contar
			contador += 1;
			contador ++;
			++ contador;
		}
		System.out.println(contador);
	}

}
