package bytebank_encapsulamento;

public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(2125,6060);
		conta.setNumero(2121);
		System.out.println(conta.getNumero());
		
		Cliente mestre = new Cliente();
		
		conta.setTitular(mestre);
		mestre.setNome("Victor");
		System.out.println(conta.getTitular().getNome());
		
		Cliente titularConta = conta.getTitular();
		titularConta.setProfissao("Programador");
	}

}
