package entidade;

//import java.util.Random;
	
	
public class Operador {
	
	private String nome;
	private int numConta;
	private double saldo;
	
	public Operador(int numConta, String nome, double deposito) {
		this.numConta = numConta;
		this.nome = nome;
		
	}
	
	public Operador(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double Deposito(double deposito) {
		return this.saldo += deposito;
	}

	public double Saque(double saque) {
		return this.saldo -= saque;
	}
	
	public String toString() {
		return "Nome: "
				+ nome
				+", Numero da Conta: "
				+ numConta
				+ ", Saldo da Conta: "
				+ saldo;
				
	}

	
	


}






//public class Operador {
	
//	public int geradorConta () {
//				
//		Random gerador = new Random();
//		int numConta = gerador.nextInt(9999);
//		return numConta;
//	}
		
//}
