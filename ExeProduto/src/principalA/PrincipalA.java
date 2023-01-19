package principalA;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class PrincipalA {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		List<Produto> lista = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Quanto produtos serao cadastrados?");
		int resp = sc.nextInt();
		
		for(int i=1; i<=resp; i++) {
			System.out.println("Dados do Produto # "+ i);
			System.out.print("Produto comum(c), usado(u), importado(i) ?");
			char dado_prod = sc.next().charAt(0);
			if (dado_prod =='c') {
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Preco: ");
				Double preco = sc.nextDouble();
				Produto pc = new Produto(nome, preco);
				lista.add(pc);
			}
			else if(dado_prod == 'u') {
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Preco: ");
				Double preco = sc.nextDouble();
				System.out.print("Data de fabricação(DD/MM/AAAA): ");
				sc.nextLine();
				Date data_fabri = sdf.parse(sc.next());
				Produto pu = new ProdutoUsado(nome, preco, data_fabri);
				lista.add(pu);
			}
			else if(dado_prod == 'i') {
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Preco: ");
				Double preco = sc.nextDouble();
				System.out.print("Custo da taxa: ");
				sc.nextLine();
				Double custo_taxa = sc.nextDouble();
				Produto pi = new ProdutoImportado(nome, preco, custo_taxa);
				lista.add(pi);
				}
			
		}
		System.out.println("Dados de Produtos");
		for(Produto pr : lista) {
			System.out.print(pr.precoEtiqueta() + "\n");
		}	
		sc.close();

	}

}
