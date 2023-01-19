package bytebank_encapsulamento;

public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(2121,5005);
		
		
		//conta está inconsistente
		conta.setAgencia(-10);
		conta.getAgencia();
		conta.setAgencia(10);
		System.out.println( conta.getAgencia());
	}
}
