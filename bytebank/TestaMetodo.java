package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaEmpresa = new Conta();
		contaEmpresa.saldo = 100;
		contaEmpresa.deposita(450);
		System.out.println("Saldo da empresa apois adicionar 450 reias,\n somando aos 100 reias que já existiam: " + contaEmpresa.saldo);
		
		contaEmpresa.saca(130);
		System.out.println("Saldo da empresa ao sacar 130 reias: " + contaEmpresa.saldo);
		
		Conta contaVictor = new Conta();
		contaVictor.deposita(1000);
		System.out.println("Saldo de Victor ao iniciar a conta: " + contaVictor.saldo);
		
		boolean transferencia = contaVictor.transfere(300, contaEmpresa);
		if(transferencia) {
			System.out.println("Transferência executada com sucess0!");
		}else {
			System.out.println("Saldo insuficiente ");
		}
		
		
		System.out.println("Saldo de victor após transferência: "+ contaVictor.saldo);
		System.out.println("Saldo da empresa: " + contaEmpresa.saldo);
		
		
	}

}
