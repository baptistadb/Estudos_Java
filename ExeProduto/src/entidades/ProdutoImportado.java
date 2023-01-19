package entidades;

public class ProdutoImportado extends Produto{
	
	private Double custo_taxa;

	public ProdutoImportado() {
		super();
	}
	
	public ProdutoImportado(String nome, Double preco, Double custo_taxa) {
		super(nome, preco);
		this.custo_taxa = custo_taxa;
	}

	public Double getCusto_taxa() {
		return custo_taxa;
	}

	public void setCusto_taxa(Double custo_taxa) {
		this.custo_taxa = custo_taxa;
	}
	
	@Override
	public String precoEtiqueta() {
		return super.getNome() + " " + "R$ " + precoTotal() + "(Custo da taxa: R$" + custo_taxa + ")";
	}
	
	public Double precoTotal() {
		return super.getPreco() + custo_taxa;
	}
	

}
