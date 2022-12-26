package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidades.Funcionario;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("Quantos funcionarios serao registrados?");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		for (int i=0; i<a;i++) {
			
			System.out.println("Funcionario " + (i+1) + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Salario: ");
			double salario = sc.nextDouble();
			System.out.println();
			
			Funcionario fun = new Funcionario(id, nome, salario);
			
			lista.add(fun);
		}
		
		System.out.println();
		System.out.println("Digite o ID do funcionario que recebera o aumento: ");
		int idAumento = sc.nextInt();
		sc.nextLine();
		
		Funcionario fun = lista.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
		
		if(fun == null) {
			System.out.println("ID incorreto");
			System.out.println();
		}
		else {
			System.out.print("Digite a porcentagem de aumento: ");
			int aumento = sc.nextInt();
			fun.aumentoSalario(aumento);
		}	
		
		System.out.println("Lista de Funcionarios: ");
		for (Funcionario fun1 : lista) {
			System.out.println(fun1);
	}		
		
		sc.close();
  }

}