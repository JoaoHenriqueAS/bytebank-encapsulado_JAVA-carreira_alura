
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		//conta.numero = 1337; não compila pq a variavel numero é privada, atualmente fica:
		//conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente joao = new Cliente();
		//conta.titular = joao
		//joao.nome = "joao santos" --não compila pq nome é privado na classe cliente
		
		joao.setNome("Joao Santos");
		
		conta.setTitular(joao);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		//agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		//As 3 ref. abaixos possuem o mesmo endereço || sao a mesma coisa
		System.out.println(titularDaConta);
		System.out.println(joao);
		System.out.println(conta.getTitular());
		
	}

}
