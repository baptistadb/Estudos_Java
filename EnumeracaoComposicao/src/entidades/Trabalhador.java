package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidadeEnums.NivelCargo;

public class Trabalhador {
	
	private String nome;
	private NivelCargo cargo;
	private Double SalarioBase;
	private Departamento departamento;
	private List<ContratoHora> contratos = new ArrayList<>();
	
	public Trabalhador() {	
	}

	

	public Trabalhador(String nome, NivelCargo cargo, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.cargo = cargo;
		SalarioBase = salarioBase;
		this.departamento = departamento;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public NivelCargo getCargo() {
		return cargo;
	}



	public void setCargo(NivelCargo cargo) {
		this.cargo = cargo;
	}



	public Double getSalarioBase() {
		return SalarioBase;
	}



	public void setSalarioBase(Double salarioBase) {
		SalarioBase = salarioBase;
	}



	public Departamento getDepartamento() {
		return departamento;
	}



	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}



	public List<ContratoHora> getContratos() {
		return contratos;
	}

	
	public void addContrato(ContratoHora contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(ContratoHora contrato) {
		contratos.remove(contrato);
	}
	
	public double recebidos(int ano, int mes) {
		double soma = SalarioBase;
		 Calendar cal = Calendar.getInstance();
		for(ContratoHora c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}	
}
