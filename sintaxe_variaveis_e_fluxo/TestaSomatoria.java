package sintaxe_variaveis_e_fluxo;

public class TestaSomatoria {
	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		
		while(contador < 10) {
			total += contador; //novo modo de contar 
			System.out.println(total);
			contador++;
		}
	
	}

}
