package entidade;

public class Produto {

	public String nome;
	public double preco;
	public int qntd;
	
	public double valorTotal() {
		
		return preco * qntd;
		
	}
	
	public void entrada(int qntd) {
		
		this.qntd += qntd;
		
	}
	
	public void saida(int qntd) {
		
		this.qntd -= qntd;
	}
	
	public String toString() {
		return nome
		+ ", "
		+  preco
		+ ", "
		+  qntd
		+", "
		+ valorTotal();
	}
	
}
