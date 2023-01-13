package bytebank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Referência 2, valor:  " + segundaConta.saldo);
		segundaConta.saldo += 200;
		
		System.out.println(primeiraConta.saldo);
		if (primeiraConta == segundaConta) {
			System.out.println("contas iguais!!!");
		}else {
			System.out.println("Contas diferentes");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}

}
