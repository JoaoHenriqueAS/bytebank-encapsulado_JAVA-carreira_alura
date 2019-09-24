
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		//conta.numero = 1337; n�o compila pq a variavel numero � privada, atualmente fica:
		//conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente joao = new Cliente();
		//conta.titular = joao
		//joao.nome = "joao santos" --n�o compila pq nome � privado na classe cliente
		
		joao.setNome("Joao Santos");
		
		conta.setTitular(joao);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		//agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		//As 3 ref. abaixos possuem o mesmo endere�o || sao a mesma coisa
		System.out.println(titularDaConta);
		System.out.println(joao);
		System.out.println(conta.getTitular());
		
	}

}
