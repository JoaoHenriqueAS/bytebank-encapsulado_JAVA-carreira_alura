
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226); //o que esta entre () depois de Conta, � a execu��o do construtor
		
		//conta incosistente em rela�ao a regra de negocio 
		/*conta.setAgencia(-50);
		  conta.setNumero(-330);
		*/
		
		System.out.println(conta.getAgencia());
		
	}

}
