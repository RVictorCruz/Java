package sintaxe_variaveis_e_fluxo;

public class fatorial {
    public static void main(String[] args) {
        int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            fatorial = fatorial * i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
    }
}
