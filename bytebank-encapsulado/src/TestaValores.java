
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226); //o que esta entre () depois de Conta, é a execução do construtor
		
		//conta incosistente em relaçao a regra de negocio 
		/*conta.setAgencia(-50);
		  conta.setNumero(-330);
		*/
		
		System.out.println(conta.getAgencia());
		
	}

}
