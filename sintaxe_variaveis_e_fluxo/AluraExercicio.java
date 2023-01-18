package sintaxe_variaveis_e_fluxo;

public class AluraExercicio {
	public static void main(String[] args) {
		System.out.println("----------------- Alura ------------");
		
		double salario = 3300.0;
		
		if(salario >= 1900 && salario <= 2800) {
			System.out.println("O valor que pode ser deduzido será de : R$142 ");
		}else if(salario >= 2800.1 && salario <= 3751) {
			System.out.println("O valor que pode ser deduzido será de : R$350 ");
		}else if(salario >= 3751.01 && salario <= 4664) {
			System.out.println("O valor que pode ser deduzido será de : R$636 ");
		}else {
			System.out.println("O valor do seu salario não foi especificado!!!");
		}
	}

}
