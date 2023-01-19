package entidades;

import java.util.Date;

public class ProdutoUsado extends Produto {
	
	private Date data_fabri;

	public ProdutoUsado() {
		
	}
	
	public ProdutoUsado(String nome, Double preco, Date data_fabri) {
		super(nome, preco);
		this.data_fabri = data_fabri;
	}

	public Date getData_fabri() {
		return data_fabri;
	}

	public void setData_fabri(Date data_fabri) {
		this.data_fabri = data_fabri;
	}
	
	@Override
	public String precoEtiqueta() {
		return super.precoEtiqueta() + "Data de fabricacao: ";
	}
	

}
