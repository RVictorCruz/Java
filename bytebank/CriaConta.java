package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.agencia = 21;
		System.out.println("Numero da agência: " + primeiraConta.agencia + "\nsaldo: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.agencia = 21;
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.saldo);
		System.out.println(primeiraConta.titular);
		
		
	}

}
