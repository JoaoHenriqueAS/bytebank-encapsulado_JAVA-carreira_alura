
public class Conta {
	private double saldo; //atributo de instacia
	private int agencia; //atributo de instacia
	private int numero; //atributo de instacia
	private Cliente titular; //atributo de instacia
	
	private static int total; //static é um atributo da clase (ex: cada conta tem uma agencia, mas toda conta tem um total compartilhado)
	
	/*Isso é um construtor || construtor é uma rotina de inicialização, diferente do metodo, ele não retorna nada
	Constutor só é executado uma unica vez, quando a classe é criada (quando vc constroe o objeto).
	O construtor só é executado quando tem um 'new', ou seja, ele vai criar outra Conta no caso */
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas é = " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.numero);
	}
	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return total;
	}

}
